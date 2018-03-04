<%-- 
    Document   : productDetail
    Created on : Feb 19, 2018, 10:00:39 AM
    Author     : Jenna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="edu.wctc.dj.model.Yarn"%>
<%@page import="edu.wctc.dj.model.ProductService"%>

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
    <body>
        <h1>Product Detail</h1>
         <table>
            <tr>
                <td>Product ID: </td>
                <td><%= yarnId %></td>
            </tr>
             <tr>
                <td>Name: </td>
                <td><%= name %></td>
            </tr>
            <tr>
                <td>Price: </td>
                <td><%= price %></td>
            </tr>
        </table>
    </body>
</html>
