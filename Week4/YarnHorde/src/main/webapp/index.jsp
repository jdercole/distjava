<%-- 
    Document   : index
    Created on : Feb 19, 2018, 11:42:00 AM
    Author     : Jenna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>YarnHorde</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" crossorigin="anonymous">
    <link rel="stylesheet" href="edu.wctc.dj.week4.view/custom.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" crossorigin="anonymous"></script>
</head>
<body>
<nav class="navbar navbar-toggleable-md navbar-dark bg-dark" style="background-color: #e3f2fd;">
    <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <a class="navbar-brand" href="#">YarnHorde</a>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a class="nav-link" href="index">Home</a>
            
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="product">Products</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="cart">Shopping Cart</a>
            </li>
        </ul>
        <form class="form-inline" action="product.jsp?" method="get">
            <input class="form-control mr-sm-2" type="search" name="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
    </div>
</nav>
<div class="jumbotron">
    <h1 class="display-4">Welcome to YarnHorde!</h1>
    <p class="lead">The best yarn vendor on the Internet. We deliver!</p>
    <hr class="my-4">
    <p>Come explore our extensive inventory of any and all ethically-sourced material under the sun.</p>
    <p class="lead">
        <a class="btn btn-primary btn-lg" href="product" role="button">Explore</a>
    </p>
</div>
</body>
</html>