<%-- 
    Document   : Register
    Created on : Oct 28, 2022, 4:54:34 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="RegisterServlet" method="post">                   
                                <div class="form-group">
                                    <label class="control-label" for="FullName">Tên tài khoản</label> 
                                    <span class="red_require">*</span>
                                    
                                    <input class="form-control" name="Username"/>
                                </div>
                                <div class="form-group">
                                    <label class="control-label" for="FullName">Họ tên đầy đủ</label> 
                                    <span class="red_require">*</span>
                                    
                                    <input class="form-control" name="Fullname"/>
                                </div>
                                <div class="form-group">
                                    <label class="control-label" for="Mobile">Số điện thoại</label> <span class="red_require">*</span>
                                    
                                    <input class="form-control" name="SDT"/>
                                </div>
                                <div class="form-group">
                                    <label class="control-label" for="Email">Email</label> <span class="red_require">*</span>
                                    
                                    <input class="form-control" name="Email"/>
                                </div>
                                <div class="form-group">
                                    <label class="control-label" for="Address">Địa chỉ</label> <span class="red_require">*</span>
                                    
                                    <input class="form-control" name="DiaChi"/>
                                </div>
                                <div class="form-group">
                                    <label class="control-label" for="Password">Tạo mật khẩu</label> <span class="red_require">*</span>
                                    
                                    <input class="form-control" name="Password"/>
                                </div>
                  
                                <div class="btn_wrapper">
                                    <input type="submit" class="btn btn-success btn-block" value="Đăng kí tài khoản">
                                </div>

                            </form>     
    </body>
</html>
