<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width,initial-scale=1.0,user-scalable=0">
        <title>Cho thuê phòng trọ, cho thuê nhà trọ, tìm phòng trọ</title>
        <base href="${pageContext.servletContext.contextPath}/">
        <!-- css -->
        <link rel="icon" href="<c:url value ="/resources/images/favicon.ico"/>" />
        <link href="<c:url value="/resources/css/site.min.css"/>" rel='stylesheet' type='text/css'/>
        <link href="<c:url value="/resources/css/select2.min.css"/>" rel='stylesheet' type='text/css'/>
        <link href="<c:url value="/resources/css/select.min.css"/>" rel='stylesheet' type='text/css'/>
        <link href="<c:url value="/resources/css/font-awesome.min.css"/>" rel='stylesheet' type='text/css'/>
        <link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel='stylesheet' type='text/css'/>
        <link href="<c:url value="/resources/css/jquery-ui.min.css"/>" rel='stylesheet' type='text/css'/>
        <link href="<c:url value="/resources/css/upload.min.css"/>" rel='stylesheet' type='text/css'/>

        <!-- css -->
        <script src="<c:url value="/resources/js/jquery.min.js"/>" ></script>
        <script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
        <script src="<c:url value="/resources/js/bootstrap-growl.min.js"/>"></script>
        <script src="<c:url value="/resources/js/jqueryval.min.js"/>"></script>
        <script src="<c:url value="/resources/js/lazyload.min.js"/>"></script>
        <script src="<c:url value="/resources/js/main.min.js?v=20200305"/>"></script>
        <script src="<c:url value="/resources/js/common.min.js?v=20200305"/>"></script>
        <script src="<c:url value="/resources/js/account.min.js?v=20200305"/>"></script>

        <script src="<c:url value="/resources/js/cityList1.min.js"/>"></script>
        <script src="<c:url value="/resources/js/cityList2.min.js"/>"></script>
        <script src="<c:url value="/resources/js/cityList3.min.js"/>"></script>
        <script src="<c:url value="/resources/js/cityList4.min.js"/>"></script>
        <script src="<c:url value="/resources/js/data.min.js?v=20200305"/>"></script>
        <script src="<c:url value="/resources/js/search_h.min.js?v=20200305"/>"></script>

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

    </head>
    <body>
        <header class="header">
            <div class="navbarTop hidden-xs">
                <div class="container">
                    <div class="pull-left">
                    </div>
                    <div class="pull-right">   
                        <div class="user_welcome">
                            <c:if test="${sessionScope.ACCOUNT == null}">
                                <a class="btn btn-login" href="dang-ky.jsp" rel="nofollow"><i class="fa fa-user-plus"></i> Đăng ký</a>
                                <a class="btn btn-login" href="dang-nhap.jsp" rel="nofollow"><i class="fa fa-sign-in"></i> Đăng nhập</a>
                            </c:if>  
                            <c:if test="${sessionScope.ACCOUNT !=null}">
                                <a class="btn btn-login" href="UpdateAccountServlet?userName=${sessionScope.ACCOUNT.username}" rel="nofollow"><i class="fa fa-user" aria-hidden="true"></i>Chào ${sessionScope.ACCOUNT.username}</a>
                                <c:if test="${sessionScope.ACCOUNT.phanQuyen == 0}">
                                   <a class="btn btn-login" href="ListUserServlet" rel="nofollow"><i class="fa fa-user-circle" aria-hidden="true"></i>Quản lý </a> 
                                </c:if>
                                
                                <a href="LogoutServlet"><input type="button" value="Logout"><i class="fa fa-sign-out" aria-hidden="true"></i></a>
                            </c:if>
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
            <div class="header-menu hidden-xs">
                <div class="container">
                    <nav class="navbar">
                        <ul class="navbar-nav">
                            <li class="menu-item-has-children current-menu-item">
                                <a href="DefaultServlet" rel="nofollow">Trang chủ</a>
                            </li>
                            
                            <li class="menu-item-has-children">
                                <a href="https://thuephongtro.com/huong-dan.html" rel="nofollow">Hướng dẫn</a>
                            </li>
                            <c:if test="${sessionScope.ACCOUNT.phanQuyen == 2}">
                               <li>
                                <a href="dang-tin.jsp" title="Đăng tin"><i class="fa fa-pencil-square-o"></i>Đăng tin</a>
                            </li> 
                            </c:if>
                            
                        </ul>
                    </nav>
                </div>
            </div>
        </header>
    </body>
</html>