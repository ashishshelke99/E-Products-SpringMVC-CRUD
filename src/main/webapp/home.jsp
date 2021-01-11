<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h2>Welcome to E-Products Web Application</h2>
	
	<hr>

	<form action="addProduct">
		<input type="text" name="productBrand"  required placeholder="Enter a brand">
		<input type="text" name = "productName" required placeholder="Enter a product name">
		<input type="text" name = "productPrice" required placeholder="Enter price" >
		<input type="submit" value="add">
	</form>
	
	<hr>
	
	<br>
	<br>
	
	<hr>
	
	<form action="findById">
		<input type="number" name="productId" required placeholder="Enter ID">
		<input type="submit" value="findById">
	</form>
	
	<hr>
	
	<br>
	<br>
	
	<hr>
	
	<form action="getAllProducts" method="get">
	Fetch all available products here:  <input type="submit" value="getAllProducts">
	</form>
	
	<hr>
	
	<br>
	<br>
	
	<hr>
	
	<form action="updateProduct" method="POST">
		<input type="number" name="productId" required placeholder="Enter ID">
		<input type="text" name="productBrand" required placeholder="Enter a brand">
		<input type="text"  name="productName" required placeholder="Enter a product name">
		<input type="text" name="productPrice" required placeholder="Enter price" >
		<input type="submit" value="updateProduct">
	</form>
	
	<hr>
	
	<br>
	<br>
	
	<hr>
	
	<form action="deleteProduct">
		<input type="number" name="productId"  required placeholder="Enter ID to delete">
		<input type="submit" value="deleteProduct">
	</form>
	
	<hr>
	
</body>
</html>