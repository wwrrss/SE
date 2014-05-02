<%-- 
    Document   : lista
    Created on : 01/05/2014, 10:51:00 PM
    Author     : Willian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="resources/css/bootstrap.min.css"/>
    </head>
    <body style="text-align: center;">
        
        <h1><span class="label label-info">Productos</span></h1>
        <div class="container">
            <table class="table table-striped">
                <thead>
                    <tr>
                        <td>Id</td>
                        <td>Descripcion</td>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${productos}" var="producto">
                        
                    
                    <tr>
                        <td>${producto.id}</td>
                        <td>${producto.descripcion}</td>
                    </tr>
                    </c:forEach>
                </tbody>
            </table>
         
        </div>
    </body>
</html>
