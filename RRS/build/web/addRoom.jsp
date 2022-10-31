<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.*,java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Product Page</title>
        <link rel="stylesheet" href="css/style.css"/>
    </head>
    <body>
        <form action="AddRoomServlet" method="post" enctype="multipart/form-data">
            <c:set var="errors" value="${requestScope.INSERTERR}"/>
            <c:set var="result" value="${requestScope.RESULT}"/>

            Product Name* <input type="text" name="Productname" value="" /> <br><br>
            Quantity*  <input type="text" name="Quantity" value="" /> <br><br>
            Price  <input type="text" name="Price" value="" /> <br><br>
            <label for="Photo">Photo</label> <br/><br/>
            <input class="photo" type="file" name="Image"> <br/><br/>
            <c:if test="${not empty requestScope.INSERTERR}">
                <font color="red">${INSERTERR}</font><br><br>
            </c:if>
            <input type="submit" value="Add"  />
            <c:url var="Return" value="ShowServletAdmin">
            </c:url>
            <a href="${Return}"><input type="button" value="Return"/></a>

        </form> <br>
    </body>
</html>