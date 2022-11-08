<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.*,java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Room</title>
        <link rel="stylesheet" href="resources/css/style.css"/>
        <link rel="icon" href="<c:url value ="/resources/images/favicon.ico"/>" />
    </head>
    <body>
        <form action="AddRoomServlet" method="post">
            <c:set var="error" value="${requestScope.ERROR}"/>
            <input type="text"  class="fadeIn third" name="TieuDe" placeholder="Tiêu Đề"><br> 
            <input type="text" class="fadeIn second" name="Loai" placeholder="Loại">
            <input type="text"  class="fadeIn third" name="LienHe" placeholder="Liên Hệ"><br> 
            <input type="text" class="fadeIn second" name="SDT" placeholder="SDT">
            <input type="text"  class="fadeIn third" name="DienTich" placeholder="Diện Tích"><br>
            <input type="text" class="fadeIn second" name="GiaThue" placeholder="Giá Thuê">
            <input type="text"  class="fadeIn third" name="DiaChi" placeholder="Địa Chỉ"><br> 
            <input type="text" class="fadeIn second" name="GhiChu" placeholder="Ghi Chú">
            <input type="text"  class="fadeIn third" name="MaDuong" placeholder="Mã Đường"><br>           
            <c:if test="${not empty error}">
                <font color="red" size="2" face="verdana">${error}</font><br><br>
            </c:if>
            <input type="reset" value="Reset" />
            <input type="submit" class="fadeIn fourth" value="Add New Room"> 
        </form>
    </body>
</html>