<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet"
		href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

	<link rel="stylesheet" href="https://cdn.datatables.net/1.10.15/css/jquery.dataTables.min.css">
	<script src="https://cdn.datatables.net/1.10.15/js/jquery.dataTables.min.js"></script>
	<title>Khuyến Mãi</title>
<title>Insert title here</title>
</head>
<body>
	<html:form action="/danh-sach-mat-hang">
	<div class="col-xs-8">
		<div class="col-xs-9">
			<h2>Thêm mặt hàng khuyến mãi</h2>
		</div>
		<div style="padding-top: 20px; text-align: right;" >
				<button class="btn btn-success btn-sx " data-toggle="modal" data-target="#myModal" ><span class="glyphicon glyphicon-plus" ></span> Thêm Mới</button>
		</div>
	</div>
	<div class="col-xs-8" style="border-top-style: solid;border-top-color: green;
								 border-top-width: 0.2em;padding-top: 8px"></div>
 	<div class="col-sm-8 form-inline" style="margin-bottom: 5px">
 		<div class="form-group col-xs-6">
		    <label >Tên danh mục:</label>
	    	<select  class="form-control" style="width: 50%">
			    <option value="">B</option>
	    	</select>	  	</div>
	 	<div class="form-group col-xs-6">
	 		<label for="email">Tên thương hiệu:</label>
			    <select  class="form-control" style="width: 50%" ></select>
	  	</div>
  	</div>
 	<div class="col-sm-8 form-inline">
 		<div class="form-group col-xs-3">
		    <label for="email">Giới hạn HSD:</label>
	    	<input class="form-control" style="width: 30%">
	  	</div>
	 	<div class="form-group col-xs-3">
	 		<label for="email">Giới hạn số lượng:</label>
		    <input class="form-control" style="width: 25%">
	  	</div>
	  	<div class="form-group col-xs-6 ">
	  		<input type="button" name="" class="btn btn-success form-control" style="width: 100%" value="Lọc">
	  	</div>
  	</div>
	<div class="col-xs-8" style="border-top-style: solid;border-top-color: green;
								 border-top-width: 0.1em;padding-top: 8px;margin-top: 5px"></div>	
	<div class="col-xs-8">
		<table id="example" class="display dataTable" role="grid" aria-describedby="example_info" style="width: 100%;" cellspacing="0" width="100%">
	        <thead>
	            <tr role="role">
	                <th>MaMH</th>
	                <th>Tên Mặt Hàng</th>
	                <th>Tên DM</th>
	                <th>Tên TH</th>
	                <th>Giá Nhập Vào</th>
	                <th>Giá Bán Ra  </th>
	                <th>HSD</th>
	                <th>Số Lượng</th>
	                <th></th>
	            </tr>
	        </thead>
	        <tbody>
	        	<tr >

		        	<td ></td>
		        	<td >Gloria</td>
		        	<td>Little</td>

		        	<td>estems Administrator</td>
		        	<td>New York</td>
		        	<td>Gloria</td>
		        	<td>Little</td>

		        	<td>ystems Administrator</td>
		        	<td></td>
	        	</tr>
	        	<tr >

		        	<td class=" details-control"></td>
		        	<td class="sorting_1">Gloria</td>
		        	<td>Little</td>

		        	<td>ystems Administrator</td>
		        	<td>New York</td>
		        	<td class="sorting_1">Gloria</td>
		        	<td>Little</td>

		        	<td>ystems Administrator</td>
		        	<td><a>Thêm</a></td>
	        	</tr>

	        </tbody>
	    </table>
	</div>
	<div class="col-xs-8" style="margin-top: 5px;margin-bottom: 5px">
		<button class="form-control btn-success">Thêm tất cả các mặt hàng</button>
	</div>
	<div class="col-xs-8 table-responsive">
	  <table class="table">
	        <thead>
	            <tr role="role">
	                <th>MaMH</th>
	                <th>Tên Mặt Hàng</th>
	                <th>Tên DM</th>
	                <th>Tên TH</th>
	                <th>Ngày bắt đầu</th>
	                <th>Ngày kết thúc</th>
	                <th>Giảm giá(%)</th>
	                <th></th>
	            </tr>
	        </thead>
	        <tbody>
	        	<tr>
	                <td>M2103</td>
	                <td>Tên Mặt Hàng</td>
	                <td>Tên DM</td>
	                <td>Tên TH</td>
	                <td>Ngày bắt đầu</td>
	                <td>Ngày kết thúc</td>
	                <td>3</td>
	                <td><a class="glyphicon glyphicon-edit"></a><a class="glyphicon glyphicon-trash"></a></td>
                </tr>
	        </tbody>
	  </table>
	</div> 
	
	</html:form>
	<script type="text/javascript">
		$(document).ready(function(){
	    	$('#example').DataTable();
		});
	</script>

</body>
</html>