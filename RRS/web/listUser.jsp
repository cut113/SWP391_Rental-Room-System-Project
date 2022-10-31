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
        <title>List Page</title>
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
                <td>Update</td>
                <td>Delete</td>


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
                    <td>
                        <a href="UpdateUserServlet?userName=${user.username}">Update</a>
                    </td>
                    <td>
                        <a href="DeleteUserServlet?userName=${user.username}">Deactivate</a>
                    </td>
                </tr>
                

            </c:forEach>
                
        </table>
<c:url value="AddAccountServlet" var="AddAccount">
        </c:url>
        <a href="${AddAccount}"><input type="button" value="Add new account"></a><br><br>
        <h1>Room List</h1>
        <table border="1px solid black">
            <tr>
                <td>MaPhong</td>
                <td>TieuDe</td>
                <td>Loai</td>
                <td>LienHe</td>
                <td>SDT</td>
                <td>DienTich</td>
                <td>GiaThue</td>
                <td>DiaChi</td>
                <td>GhiChu</td>
                <td>MaDuong</td>
                <td>MaUser</td>
                <td>Update</td>
                <td>Delete</td>


            </tr>
            <c:forEach items="${requestScope.RESULT2}" var="room">
                <tr>
                    <td><c:out value="${room.maPhong}"/></td>
                    <td><c:out value="${room.tieude}"/></td>
                    <td><c:out value="${room.loai}"/></td>
                    </td>
                    <td>
                        <c:out value="${room.lienHe}"/>
                    </td>
                    <td><c:out value="${room.SDT}"/></td>
                    <td><c:out value="${room.dienTich}"/></td>
                    <td><c:out value="${room.giaThue}"/></td>
                    <td><c:out value="${room.diaChi}"/></td>
                    <td><c:out value="${room.ghiChu}"/></td>
                    <td><c:out value="${room.maDuong}"/></td>
                    <td><c:out value="${room.maUser}"/></td>
                    <td>
                        <a href="UpdateRoomServlet?maphong=${room.maPhong}">Update</a>
                    </td>
                    <td>
                        <a href="DeleteRoomServlet?maphong=${room.maPhong}">Delete</a>
                    </td>
                </tr>


            </c:forEach>
        </table>
        <c:url value="LogoutServlet" var="Logout">
        </c:url>
        <a href="${Logout}"><input type="button" value="Logout"></a>
    </body>
</html>
