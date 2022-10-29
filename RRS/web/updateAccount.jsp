<%-- 
    Document   : updateAccount
    Created on : Oct 29, 2022, 4:39:04 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="UpdateUserServlet" method="POST">
            Username <input type="text" name="username" value="${u.username}" readonly/> <br><br>
            Password <input type="text" name="password" value="${u.password}" /> <br><br>
            Fullname <input type="text" name="fullname" value="${u.fullname}" /> <br><br>
            SDT <input type="text" name="sdt" value="${u.SDT}" /> <br><br>
            Email <input type="text" name="email" value="${u.email}" /> <br><br>
            Dia Chi <input type="text" name="diachi" value="${u.diaChi}" /> <br><br>
            Phan Quyen <select name="phanquyen"> 
                <option value="0" ${u.phanQuyen == '0' ?"selected":""}>Admin</option>
                <option value="1" ${u.phanQuyen == '1' ?"selected":""}>Customer</option>
                <option value="2" ${u.phanQuyen == '2' ?"selected":""}>HouseLord</option>
            </select><br><br>
            Status <select name="trangthai"> 
                <option value="true" ${u.trangThai == 'true' ?"selected":""}>true</option>
                <option value="false" ${u.trangThai == 'false' ?"selected":""}>false</option>
            </select><br><br>

            <input type="submit" value="Update" name="btAction" />
            <input type="reset" value="Reset" />

        </form> <br>    </body>
</html>
