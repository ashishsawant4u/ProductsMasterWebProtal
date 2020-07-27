<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<h2>${title}</h2>

	<table  class="table table-bordered table-hover">
		<c:forEach var="prod" items="${products}">
		<thead>
			<th>Article Number</th>
			<th>Name</th>
			<th>Desc</th>
			<th>Offline Stock</th>
			<th>Online Stock</th>
			<th>UnitPrice</th>
			<th>UOM</th>
		</thead>
		<tbody>
		<tr>
			<td>${prod.code}</td>
			<td>${prod.name}</td>
			<td>${prod.desc}</td>
			<td>${prod.stockAndPrice.offlineStock}</td>
			<td>${prod.stockAndPrice.onlineStock}</td>
			<td>${prod.stockAndPrice.unitPrice}</td>
			<td>${prod.stockAndPrice.uom}</td>
		</tr>
		</c:forEach>
		</tbody>
	</table>

