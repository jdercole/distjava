<%-- 
    Document   : productDetail
    Created on : Feb 19, 2018, 10:00:39 AM
    Author     : Jenna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>
<%@page import="edu.wctc.dj.week4.model.Yarn"%>
<%@page import="edu.wctc.dj.week4.model.YarnService"%>

<% 
    String yarnId = (String)request.getAttribute("id");
    String name = (String)request.getAttribute("name");
    double price = (Double)request.getAttribute("price");
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product Detail</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" crossorigin="anonymous"></script>
    </head>
        <nav class="navbar navbar-toggleable-md navbar-dark bg-dark" style="background-color: #e3f2fd;">
    <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <a class="navbar-brand" href="#">YarnHorde</a>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a class="nav-link" href="index">Home<span class="sr-only"></span></a>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="product">Products</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="cart">Shopping Cart</a>
            </li>
        </ul>
        <form class="form-inline">
            <input class="form-control mr-sm-2" name= "search" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
    </div>
</nav>
    <body>
        <h1>Product Detail</h1>
        <table>
            <tr>
                <td>Product ID: </td>
                <td><c:out value="${yarn.ID}" /></td>
            </tr>
             <tr>
                <td>Name: </td>
                <td><c:out value="${yarn.name}" /></td>
            </tr>
             <tr>
                <td>Skein Length: </td>
                <td><c:out value="${yarn.skeinLength}" /></td>
            </tr>
            <tr>
                <td>Color: </td>
                <td><c:out value="${yarn.color}" /></td>
            </tr>
            <tr>
                <td>Price: </td>
                <td><c:out value="${yarn.price}" /></td>
            </tr>
        </table>
    </body>
</html>
