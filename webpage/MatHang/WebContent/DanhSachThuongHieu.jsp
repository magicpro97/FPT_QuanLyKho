<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="sources/bootstrap.min.js"></script>

          <title>Danh Sách Thương Hiệu</title>

          <style type="text/css">
            .smaller {
              height: 28px;
            }
            .top {
              margin-top: 10px;
              border-bottom-width: 0.2em;
            }
            .hiddens{
              display: none;
            }
          </style>
        </head>
        <body>
          <div class="col-xs-8">
            <div class="col-sm-6">
              <h2 >Danh Sách Thương Hiệu</h2>
            </div>
            <div class="col-sm-6" style="padding-top: 20px">
              <button class="btn btn-success form-control" onclick="them()">
                <span class="glyphicon glyphicon-plus"></span>Thêm Mới</button>
            </div>
          </div>
          <div class="col-xs-8" style="border-top-style:solid; border-top-color: green; border-top-width:0.2em"></div>
          <html:form action="/danh-sach-thuong-hieu" enctype="multipart/form-data">
            <logic:iterate id="row" name="dSTHForm" property="danhSachThuongHieu">

              <div class="col-xs-8 top">
                <div class="col-xs-3">
                  <bean:define id="anh" name="row" property="anhDaiDien"/>
                  <html:img src="${anh}" styleClass="img-thumbnail" alt="Cinque Terre"></html:img>
                </div>
                <div class="col-xs-7">
                  <div class="col-xs-5 ">
                    <label>Mã thương hiêu:</label>
                    <label>Tên thương hiêu:</label>
                    <div>
                      <label>Trụ sở:</label>
                    </div>
                    <label>Website:</label>
                  </div>
                  <div class="col-xs-7">
                    <div>
                      <label><bean:write name="row" property="maTH"/></label>
                    </div>
                    <div>
                      <label><bean:write name="row" property="tenTH"/></label>
                    </div>
                    <div>
                      <label><bean:write name="row" property="truSo"/></label>
                    </div>
                    <label><bean:write name="row" property="website"/></label>
                  </div>

                </div>
                <div class="col-xs-2 text-center" style="padding-top: 20px">
                  <a onclick="sua(this)" class="glyphicon glyphicon-edit text-center" style="font-size:2em"></a>
                  <a onclick="xoa(this)" class="glyphicon glyphicon-trash" style="font-size:2em"></a>
                </div>
              </div>
              <div class="col-xs-8 top" style="border-top-style:solid; border-top-color: green; border-top-width:1px"></div>
            </logic:iterate>

            <div class="modal fade" id="myModal" role="dialog">
              <div class="modal-dialog">
                <div class="modal-content">
                  <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 id="title" class="modal-title">Thêm Mới Thương Hiệu</h4>
                  </div>
                  <div class="modal-body">
                    <div class="row" >
                      <div class="col-xs-4">
                        <html:file property="file" onchange="showImage(event)" styleId="file" style="display:none"></html:file>
                        
                        <bean:define id="src" property="img" name="dSTHForm"></bean:define>
                        <html:img styleId="img" src="${src}" styleClass="img-thumbnail" alt="Cinque Terre"></html:img>
                        <div class="text-center" style="margin-top:10px">
                          <label for="file" id="themAnh" class="btn btn-success btn-xs" onclick="document.getElementById('file').click()">Thêm ảnh</label>
                        </div>
                      </div>

                      <div class="col-xs-8">
                        <div class="form-group col-xs-12">
                          <div class="col-xs-5">
                            <lable>Mã thương hiệu:</lable>
                          </div>
                          <div class="col-xs-7" style="float:right;">
                            <html:text property="maTH" styleClass="form-control smaller" styleId="maTH"></html:text>
                            <label class="hiddens"></label>
                          </div>
                        </div>
                        <div class="form-group col-xs-12">
                          <div class="col-xs-5">
                            <lable>Tên thương hiệu:</lable>
                          </div>
                          <div class="col-xs-7" style="float:right;">
                            <label class="hiddens"></label>
                            <html:text property="tenTH" styleClass="form-control smaller" styleId="tenTH"></html:text>
                          </div>
                        </div>
                        <div class="form-group col-xs-12">
                          <div class="col-xs-5">
                            <lable>Trụ sở:</lable>
                          </div>
                          <div class="col-xs-7" style="float:right;">
                            <html:text property="truSo" styleClass="form-control smaller" styleId="truSo"></html:text>
                            <label class="hiddens"></label>
                          </div>
                        </div>
                        <div class="form-group col-xs-12">
                          <div class="col-xs-5">
                            <lable>Website:</lable>
                          </div>
                          <div class="col-xs-7" style="float:right;">
                            <html:text property="website" styleClass="form-control smaller" styleId="website"></html:text>
                            <label class="hiddens"></label>
                          </div>
                        </div>

                      </div>
                    </div>
                    <div class="text-center" id="hienThongBao" style="color:red"></div>
                  </div>
                  <div class="modal-footer">
                    <div class="text-center">
                      <html:submit property="request" styleClass="btn btn-success" value="" styleId="submit" onclick="xacNhan()" ></html:submit>
                      <!-- <button id="submit" class="btn btn-success" onclick="xacNhan()"></button> -->
                      <input type="reset" name="" class="btn btn-success" value="Xóa" id="reset"></div>
                    </div>
                  </div>
                </div>
              </div>
              <html:hidden styleId="thongBao" property="thongBao"/>
              <html:hidden styleId="keeper" property="img"/>
              <html:hidden styleId="forEditDelete" property="src"/>
            </html:form>
            <script src="sources/mat-hang.js"></script>
          </body>
        </html>
