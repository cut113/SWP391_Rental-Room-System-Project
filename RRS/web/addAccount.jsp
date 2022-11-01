
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
        <div class="row">
            <form action="AddAccountServlet" method="POST">
                <% System.out.println("da vo toi jsp");%>
                <div class="col-8 offset-2">
                    <input type="text" class="fadeIn second" name="username" placeholder="Username">
                    <input type="text"  class="fadeIn third" name="password" placeholder="Password"><br> 
                    <input type="text" class="fadeIn second" name="fullname" placeholder="Fullname">
                    <input type="text"  class="fadeIn third" name="SDT" placeholder="SDT"><br> 
                    <input type="text" class="fadeIn second" name="email" placeholder="Email">
                    <input type="text"  class="fadeIn third" name="diaChi" placeholder="Địa Chỉ"><br>
                    <input type="text" class="fadeIn second" name="phanQuyen" placeholder="Phân Quyền">
                    <input type="text"  class="fadeIn third" name="trangThai" placeholder="Trạng Thái"><br> 
                    <input type="reset" value="Reset" />
                    <input type="submit" class="fadeIn fourth" value="Add"> 
                </div>
        </div>
    </form>    
</body>
</html>
