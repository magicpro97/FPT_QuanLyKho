<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet"
		href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script
		src="sources/bootstrap.min.js"></script>

	<link rel="stylesheet" href="sources/jquery.dataTables.min.css">
	<script src="sources/jquery.dataTables.min.js"></script>
	<title>Khuyến Mãi</title>
</head>
<body>
	<div class="col-xs-8">
		<div class="col-xs-9">
			<h2>Danh Sách Mặt Hàng</h2>
		</div>
		<div style="padding-top: 20px; text-align: right;" >
				<button class="btn btn-success btn-sx " onclick="them()" ><span class="glyphicon glyphicon-plus" ></span> Thêm Mới</button>
		</div>
	</div>
	
	<div class="col-xs-8" style="border-top-style: solid;border-top-color: green;
								 border-top-width: 0.2em;padding-top: 8px"></div>
	<html:form action="/danh-sach-mat-hang" styleId="form">
 	<div class="col-xs-8 ">
	 	<div class="col-xs-3">
		    <h4>Tên danh mục:</h4>
	 	</div>
	 	<div class="col-xs-3">
			<html:select styleClass="form-control" property="tenTH" >
				<html:option value="" disabled="true">Chọn danh mục</html:option>
				<html:optionsCollection name="dSMHForm"  property="danhSachDanhMuc" label="tenDM" value="maDM"/>
			</html:select>
	  	</div>
	 	<div class="col-xs-3">
	 		<h4>Tên thương hiệu:</h4>
	 	</div>	 
	 	<div class="col-xs-3">
			<html:select styleClass="form-control" property="tenTH" value="Chon thuong hieu">
				<html:option value="" disabled="true">Chon thuong hieu</html:option>
				<html:optionsCollection name="dSMHForm"  property="danhSachThuongHieu" label="tenTH" value="maTH"/>
			</html:select>
	  	</div>	
 	</div>
	<div class="col-xs-8" style="border-top-style: solid;border-top-color: green;
								 border-top-width: 0.1em;padding-top: 8px;margin-top: 5px"></div>
	<div class="col-xs-8 ">
		<table id="example" class="table table-striped table-bordered"   cellspacing="0" width="100%">
	        <thead>
	            <tr class="success">
	                <th >MaMH</th>
	                <th >Tên Mặt Hàng</th>
	                <th >Tên DM</th>
	                <th >Tên TH</th>
	                <th >Giá Nhập Vào</th>
	                <th >Giá Bán Ra  </th>
	                <th >HSD</th>
	                <th style="display:none;"></th>
	                <th style="display:none;"></th>
	                <th style="display:none;"></th>
	                <th style="display:none;"></th>
	                <th style="display:none;"></th>
	                <th ></th>
	                
	            </tr>
	        </thead>
	        <tbody>
	        	<logic:iterate id="row" name="dSMHForm" property="danhSachMatHang">
	        		<tr>
	        			<td><bean:write name="row" property="maMH"/> </td>
	        			<td><bean:write name="row" property="tenMH"/> </td>
	        			<td><bean:write name="row" property="tenDM"/> </td>
	        			<td><bean:write name="row" property="tenTH"/> </td>
	        			<td><bean:write name="row" property="giaNhap"/> </td>
	        			<td><bean:write name="row" property="giaBan"/> </td>
	        			<td><bean:write name="row" property="hSD"/> </td>
	        			<td style="display:none"><bean:write name="row" property="maDM"/></td>
	        			<td style="display:none"><bean:write name="row" property="maTH"/></td>
	        			<td style="display:none"><bean:write name="row" property="moTa"/></td>
	        			<td style="display:none"><bean:write name="row" property="dVT"/></td>
	        			<td style="display:none"><bean:write name="row" property="anhDaiDien"/></td>
	        			<td><a onclick="suaMatHang(this)" class="glyphicon glyphicon-edit"></a>
	        				<a onclick="xoaMatHang(this)" class="glyphicon glyphicon-trash"></a>
        				</td>
	        		</tr>
	        	
	        	</logic:iterate>
	        </tbody>
	    </table>
	</div>



		<div id="myModal" class="modal fade" role="dialog">
		  	<div class="modal-dialog">
	
			    <!-- Modal content-->
			    <div class="modal-content">
			      	
					      <div class="modal-header">
					        <button type="button" class="close" data-dismiss="modal">&times;</button>
					        <div class="text-center">
					        	<h3 class="modal-title">Thêm Mới Mặt Hàng</h3>
					        </div>
					      </div>
					      <div class="modal-body">
					        <div class="row">
									<div>
										<div class="col-sm-6 form-horizontal">
											<div>
												<div class="form-group">
														<label class="control-label col-sm-4">MaMH:</label>
														<div class=" col-sm-8">
															<html:text styleId="maMH" styleClass="form-control"  property="maMH"></html:text>
														</div>
													</div>
												<div class="form-group">
														<label class="control-label col-sm-4">Tên MH:</label>
														<div class=" col-sm-8">
															<html:text styleId="tenMH" styleClass="form-control"  property="tenMH"></html:text>
														</div>
													</div>
												<div class="form-group">
														<label class="control-label col-sm-4">Giá Nhập:</label>
														<div class=" col-sm-8">
															<html:text styleId="giaNhap" styleClass="form-control"  property="giaNhap"></html:text>
														</div>
													</div>
											</div>
									</div>
										<div class="col-sm-6 form-horizontal">
											<div>
												<div class="form-group">
														<label class="control-label col-sm-4">Tên DM:</label>
														<div class=" col-sm-8">
															<html:select styleId="danhSachDanhMuc" styleClass="form-control" property="tenDM" value="Select">
																<html:option value="ok">Chọn danh mục</html:option>
																<html:optionsCollection name="dSMHForm"  property="danhSachDanhMuc" label="tenDM" value="maDM"/>
															</html:select>
														</div>
												</div>
												<div class="form-group">
														<label class="control-label col-sm-4">Tên TH:</label>
														<div class=" col-sm-8">
															<html:select styleId="danhSachThuongHieu" styleClass="form-control" property="tenTH">
																<html:option value="ok" >Chọn thương hiệu</html:option>
																<html:optionsCollection name="dSMHForm"  property="danhSachThuongHieu" label="tenTH" value="maTH"/>
															</html:select>
														</div>
												</div>
												<div class="form-group">
														<label class="control-label col-sm-4">Giá Bán:</label>
														<div class=" col-sm-8">
															<html:text styleId="giaBan" styleClass="form-control"  property="giaBan"></html:text>
														</div>
												</div>
											</div>
										</div>
									</div>
									<div>
										<div class="col-sm-8 form-horizontal">
											<div class="form-group">
												<label class="control-label col-sm-3">Mô Tả:</label>
												<div class=" col-sm-9">
													<html:textarea styleId="moTa" styleClass="form-control" rows="3"  property="moTa"></html:textarea>
												</div>
											</div>
										</div>
										<div class="col-sm-4">
											<div class="form-group">
												<label class="control-label ">Đơn Vị:</label>
													<html:text styleId="dVT" styleClass="form-control"  property="dVT"></html:text>	
											</div>				
										</div>
									</div>
								</div>
					        </div>
					      <div class="modal-footer">
								<div class="col-sm-12 text-center">
											<input id ="btnX" type="submit" class="btn btn-success" value="Thêm"></input>
											<input id="reset" type="reset" class="btn btn-success" value="Xóa"></input>
								</div>
					      </div>
				    
			    </div>
		    		
		  	</div>
	  	</div>

</html:form>

	<script type="text/javascript">
		$(document).ready(function(){
	    	$('#example').DataTable();
		});



		function suaMatHang(a){
    		var arr=a.parentNode.parentNode.getElementsByTagName("td");
    		document.getElementById("maMH").value=arr[0].innerHTML.trim();
    		document.getElementById("tenMH").value=arr[1].innerHTML.trim();
    		var tenDM =arr[2].innerHTML.trim();
    		var tenTH =arr[3].innerHTML.trim();
    		document.getElementById("giaNhap").value=arr[4].innerHTML.trim();
    		document.getElementById("giaBan").value=arr[5].innerHTML.trim();
    		document.getElementById("dVT").value=arr[8].innerHTML.trim();
    		document.getElementById("moTa").value=arr[9].innerHTML.trim();
    		var dSTH= document.getElementById("danhSachThuongHieu").options;
    		var dSDM= document.getElementById("danhSachDanhMuc").options;
    		
    		for(var i=0;i<dSTH.length;i++)
    			if(dSTH[i].innerHTML==tenTH){
    				dSTH[i].selected=true;
    				break; 
    			}
			for(var i=0;i<dSDM.length;i++)
    			if(dSDM[i].innerHTML==tenDM){
    				dSDM[i].selected=true;
    				break;
    			}
    		//document.getElementById("myModal").show();
    		document.getElementById("btnX").value="Sửa";
    		document.getElementById("reset").value="Hủy";
    		$('#myModal').modal();
    	}
		function xoaMatHang(a){
 
    		document.getElementById("btnX").value="Xóa";
    		//document.getElementById("reset").style.display="none";
		    $('#myModal').modal();
    	}
		function them(){
			document.getElementById("form").reset();
		    $('#myModal').modal();
    	}

	</script>	
</body>
</html>