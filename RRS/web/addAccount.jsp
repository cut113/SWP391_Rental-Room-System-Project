<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="resources/css/style.css"/>
    </head>
    <body>
        <form action="AddAccountServlet" method="POST">
            <% System.out.println("da vo toi jsp");%>
            <input type="text" class="fadeIn second" name="username" placeholder="Username">
            <input type="text"  class="fadeIn third" name="password" placeholder="Password"><br>
            <input type="text" class="fadeIn second" name="fullname" placeholder="Fullname">
            <input type="text"  class="fadeIn third" name="SDT" placeholder="SDT"><br>
            <input type="text" class="fadeIn second" name="email" placeholder="Email">
            <input type="text"  class="fadeIn third" name="diaChi" placeholder="Dia Chi"><br>
            Phan Quyen <select name="phanQuyen"> 
                    <option value="0" ${role == 'true' ?"selected":""}>Admin</option>
                    <option value="1" ${role == 'false' ?"selected":""}>Customer</option>
                    <option value="2" ${role == 'true' ?"selected":""}>House Lord</option>
                </select><br><br>
            Trang Thai <select name="trangThai"> 
                    <option value="true" ${status == 'true' ?"selected":""}>true</option>
                    <option value="false" ${status == 'false' ?"selected":""}>false</option>
                </select><br><br>
            <input type="reset" value="reset" placeholder="Reset"/>
            <input type="submit" class="fadeIn fourth" value="Add"> 
        </form>
    </body>
</html>