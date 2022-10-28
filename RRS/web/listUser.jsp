<%-- 
    Document   : index
    Created on : Oct 25, 2022, 6:28:52 PM
    Author     : ADMIN
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="resources/css/style.css"/>
    </head>
    <body>
        <h1>User List!</h1>
        <table border="1px solid black">
            <tr>
                <td>ID</td>
                <td>Username</td>
                <td>Password</td>
                <td>Fullname</td>
                <td>SDT</td>
                <td>Email</td>
                <td>DiaChi</td>
                <td>PhanQuyen</td>
                <td>TrangThai</td>

            </tr>
            <c:forEach items="${requestScope.RESULT1}" var="user">
                <tr>
                    <td>
                        ${user.userID}
                    </td>
                    <td>${user.username}
                    </td>
                    <td>
                        ${user.password}
                    </td>
                    <td>
                        ${user.fullname}
                    </td>
                    <td>
                        ${user.SDT}
                    </td>
                    <td>
                        ${user.email}
                    </td>
                    <td>
                        ${user.diaChi}
                    </td>
                    <td>
                        ${user.phanQuyen}
                    </td>
                    <td>
                        ${user.trangThai}
                    </td>
                </tr>
                
            </c:forEach>
                
        </table>
        <c:url value="LogoutServlet" var="Logout">
        </c:url>
        <a href="${Logout}"><input type="button" value="Logout"></a>
    </body>
</html>
