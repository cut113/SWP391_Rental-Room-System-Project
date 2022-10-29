<%-- 
    Document   : updateRoom
    Created on : Oct 29, 2022, 8:10:34 PM
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
        <form action="UpdateRoomServlet" method="POST">
            Ma Phong <input type="text" name="maphong" value="${u.maPhong}" readonly/> <br><br>
            Tieu De <input type="text" name="tieude" value="${u.tieude}" /> <br><br>
            Loai Phong <input type="text" name="loai" value="${u.loai}" /> <br><br>
            Lien He <input type="text" name="lienhe" value="${u.lienHe}" /> <br><br>
            SDT <input type="text" name="sdt" value="${u.SDT}" /> <br><br>
            Dien Tich <input type="text" name="dientich" value="${u.dienTich}" /> <br><br>
            Gia Thue <input type="text" name="giathue" value="${u.giaThue}" /> <br><br>
            Dia Chi <input type="text" name="diachi" value="${u.diaChi}" /> <br><br>
            Ghi Chu <input type="text" name="ghichu" value="${u.ghiChu}" /> <br><br>
            Ma Duong <input type="text" name="maduong" value="${u.maDuong}" readonly /> <br><br>
           <br><br>

            <input type="submit" value="Update" name="btAction" />
            <input type="reset" value="Reset" />

        </form>    </body>
</html>
