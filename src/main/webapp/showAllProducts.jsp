<%@page import="java.math.BigDecimal"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fn" 
       uri="http://java.sun.com/jsp/jstl/functions" %>
       <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page import="com.eproducts.controller.EProductsController" %>
<%@page import="com.eproducts.utils.*, java.math.BigDecimal, java.math.RoundingMode" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
table, th, td {
  border: 1px solid black;
}
</style>

<body>

	<!-- ${allProducts} -->	
	
	
	
	<h2>All Fetched Products Details :</h2>
	
		<hr>
     
     
     

	 
	
	
	<table style="width:100%">
	
	
	<tr>
		<th>Product ID</th>
		<th>Brand</th>
		<th>Product Name</th>
		<th>Product Price</th>
		<th>Created Date</th>
	</tr>
	
	 <c:forEach items="${allProducts}" var="product">
	
	
		<tr>
			<td align="center">${product.productId}</td>
			<td align="center">${product.productBrand}
			<td align="center">${product.productName}</td>
			<td align="center">
			<c:set var="product_price" value="${product.productPrice}"></c:set>
	   		<% 
	   			out.print(DecimalFormatter.myDecimalFormat((BigDecimal)pageContext.getAttribute("product_price")));
	   		%>
			
			</td>
			
			<td align="center">
			
			<c:set var="product_createdDate" value="${product.createdDate}"></c:set>
    	     <%
        	 	String product_createdDate = String.valueOf(pageContext.getAttribute("product_createdDate"));
         		//out.println(product_createdDate);
				String returnedFormattedDate = DateFormatter.dateFormatter3(product_createdDate, "yyyy-MM-dd HH:mm:ss");
         		out.print(returnedFormattedDate);
			%>
	
			</td>
		
		</tr>
		</c:forEach>
	
	</table>
	

	
		
		

</body>
</html>