<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="x-ua-compatible" content="ie=edge" />
        <meta name="viewport" content="width=device-width,initial-scale=1.0,user-scalable=0">
        <title>Đăng ký tài khoản</title>

        <link rel="icon" href="<c:url value ="/resources/images/favicon.ico"/>" />
        <link href="<c:url value="/resources/css/site.min.css"/>" rel='stylesheet' type='text/css'/>
        <link href="<c:url value="/resources/css/select2.min.css"/>" rel='stylesheet' type='text/css'/>
        <link href="<c:url value="/resources/css/select.min.css"/>" rel='stylesheet' type='text/css'/>
        <link href="<c:url value="/resources/css/font-awesome.min.css"/>" rel='stylesheet' type='text/css'/>
        <link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel='stylesheet' type='text/css'/>
        <link href="<c:url value="/resources/css/jquery-ui.min.css"/>" rel='stylesheet' type='text/css'/>
        <link href="<c:url value="/resources/css/upload.min.css"/>" rel='stylesheet' type='text/css'/>
        <link href="<c:url value="/resources/css/style_detail.css"/>" rel='stylesheet' type='text/css'/>
        <link href="<c:url value="/resources/css/select2.css"/>" rel='stylesheet' type='text/css'/>
        <link href="<c:url value="/resources/css/lightslider.css" />" rel='stylesheet' type='text/css'/>
        <link href="<c:url value="/resources/css/lightgallery.css"/>" rel='stylesheet' type='text/css'/>
    </head>
    <body>
        <header class="header">     
            <div class="navbarTop hidden-xs">
                <div class="container">
                    <div class="pull-left">
                    </div>
                    <div class="pull-right">                
                        <div class="user_welcome">
                            <a class="btn btn-login" href="<c:url value="dang-ky.jsp"/>"><i class="fa fa-user-plus"></i> Đăng ký</a>
                            <a class="btn btn-login" href="<c:url value="dang-nhap.jsp"/>"><i class="fa fa-sign-in"></i> Đăng nhập</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="header-banner">
                <div class="container">
                    <div class="row">
                        <div class="col-xs-12 col-sm-12 col-md-4">
                            <div class="logo">
                                <div class="pull-left">
                                    <a href="DefaultServlet" rel="home">
                                        <img src="<c:url value ="/resources/images/logo.png?v=20200501"/>" alt="">
                                    </a>
                                </div>
                                <div class="navbar navbar-default pull-right">
                                    <button type="button" class="navbar-toggle" data-toggle="modal" data-target="#mobile_menu">
                                        <span class="sr-only">Toggle navigation</span>
                                        <span class="icon-bar"></span>
                                        <span class="icon-bar"></span>
                                        <span class="icon-bar"></span>
                                    </button>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- thanh bảng chọn -->
            <div class="header-menu hidden-xs">
                <div class="container">
                    <nav class="navbar">                 
                        <ul class="navbar-nav">
                            <li class="menu-item-has-children">
                                <a href="DefaultServlet" rel="nofollow">Trang chủ</a>
                            </li>
                            
                            <li class="menu-item-has-children">
                                <a href="https://thuephongtro.com/huong-dan.html" rel="nofollow">Hướng dẫn</a>
                            </li>

                            <c:if test="${sessionScope.ACCOUNT != null}">
                                <li>
                                    <a href="dang-tin.jsp" title="Đăng tin"><i class="fa fa-pencil-square-o"></i>Đăng tin</a>
                                </li> 
                            </c:if>
                        </ul>
                    </nav>
                </div>
            </div>
        </header>
        <!-- trang hiển thị chính -->
        <div class="container">
            <div class="access_page">
                <div class="page_header">
                    <h1 class="page_title">Đăng ký tài khoản</h1>
                    <hr />
                </div>
                <div class="page_content register_page">
                    <div class="row">
                        <div class="col-xs-12 col-sm-6 col-md-6">
                            <section id="registerForm">
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
                                    
                                    <input class="form-control" type="password" name="Password"/>
                                </div>
                  
                                <div class="btn_wrapper">
                                    <input type="submit" class="btn btn-success btn-block" value="Đăng kí tài khoản">
                                </div>

                            </form>     
                            </section>
                                   
                        </div>
                        
                        
                    </div>
                </div>
            </div>
        </div>

        <jsp:include page="footer.jsp"></jsp:include>

            <script src="<c:url value="/resources/js/jquery.min.js"/>"></script>

        <script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>

        <script src="<c:url value="/resources/js/bootstrap-growl.min.js"/>"></script>

        <script src="<c:url value="/resources/js/jqueryval.min.js"/>"></script>

        <script src="<c:url value="/resources/js/lazyload.min.js"/>"></script>

        <script src="<c:url value="/resources/js/main.min.js?v=20200305"/>"></script>

        <script src="<c:url value="/resources/js/common.min.js?v=20200305"/>"></script>

        <script src="<c:url value="/resources/js/account.min.js?v=20200305"/>"></script>



        <!-- Global site tag (gtag.js) - Google Analytics -->
        <script async src="https://www.googletagmanager.com/gtag/js?id=UA-42682349-1"></script>
        <script>
            window.dataLayer = window.dataLayer || [];
            function gtag() {
                dataLayer.push(arguments);
            }
            gtag('js', new Date());

            gtag('config', 'UA-42682349-1');
        </script>
    </body>
</html>