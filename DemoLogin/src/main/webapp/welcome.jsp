<%@page import="com.cybersoft.pojo.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link href="./css/login.css" rel="stylesheet" />
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<% List<Product> list = (List<Product>)request.getAttribute("products"); %>	
	
	<div class="container">
		<h1>Quản Lý Sản Phẩm</h1>
		<form class="row" action="./welcome" method="POST">
			<div class="col-md-6">
				<label for="exampleFormControlInput1" class="form-label">Tên sản phẩm</label>
  				<input class="form-control" name="tensp" id="tensp" placeholder="">
  				
  				<label for="exampleFormControlInput1" class="form-label">Số lượng</label>
  				<input class="form-control" name="sl" id="soluong" placeholder="">
  				
  				<label for="exampleFormControlInput1" class="form-label">Giá</label>
  				<input class="form-control" name="gia" id="gia" placeholder="">
  				
  				<button class="btn btn-primary">Submit</button>
			</div>
			
			<div class="col-md-6">
				<table class="table">
					<thead>
						<tr>
							<th>Tên sản phẩm</th>
							<th>Số lượng</th>
							<th>Giá</th>
						</tr>
					</thead>
					
					<tbody>
						<% if(list != null) { %>
							<% for(int i=0; i<list.size(); i++) {%>
					
							<tr>
								<td><%= list.get(i).getName() %></td>
								<td><%= list.get(i).getSoluong() %></td>
								<td><%= list.get(i).getGia() %></td>
								
							</tr>
							
							<% } %>
						<% } %>
					
						
					</tbody>
				</table>
			</div>
		</form>
	</div>

	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>