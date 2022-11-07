<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Quản lý tin</title>
        <base href="${pageContext.servletContext.contextPath}/">
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
            <div class="container">
                <div class="access_page">
                    <div class="page_content intro_page clearfix">
                        <ul class="nav nav-tabs tab_huongdan" role="tablist">
                            <c:if test="${sessionScope.ACCOUNT.phanQuyen == 2}">
                            <li class="active"><a href="quan-ly-tin.jsp"><i class="fa fa-list-alt"></i> Quản lý tin</a></li>
                            </c:if>
                            <li><a href="UpdateAccountServlet?userName=${sessionScope.ACCOUNT.username}"><i class="fa fa-user"></i> Thông tin tài khoản</a></li>
                        </ul>
                        <div class="tab-content">
                            <h4>QUẢN LÝ TIN</h4>
                            <hr />
                            <div class="dataTables_wrapper form-inline">
                                <table class="table table-bordered table-striped table-vcenter dataTable no-footer table_banggia" role="grid">
                                    <thead>
                                        <tr>
                                            <td class="text-center">Tiêu đề</td>
                                            <td class="text-center">Thao tác</td>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach var="item" varStatus="loop" items="${listR}">
                                        <tr>

                                            <td>
                                                <div class="list-all-new">
                                                    <div class="news-item item-vip5" style="border-bottom:0;margin-bottom:0;padding-bottom:0">
                                                        <div class="news-thumb">
                                                            <a href='RoomDetailServlet?maphong=${item.maPhong}'>
                                                            <c:choose>
                                                                <c:when test="${ empty item.url}">
                                                                    <img src= "<c:url value = "/resources/images/default.jpg"/>" alt="${item.tieude}" class="lazyload">
                                                                </c:when>
                                                                <c:when test="${ not empty item.url}">
                                                                   <img src= "<c:url value = "/resources/anh/${item.url}"/>" alt="${item.tieude}" class="lazyload">
                                                                </c:when>
                                                            </c:choose>
                                                           

                                                        </a>
                                                        </div>
                                                        <div class="news-info">
                                                            <h4 class="news-title">
                                                                <a href='RoomDetailServlet?maphong=${item.maPhong}' title="detail" target="_blank">${item.tieude}</a>
                                                            </h4>
                                                            <div class="help-block">
                                                                <div class="pdt-5">
                                                                    <span class="mgr-15">Mã tin: <b>${item.maPhong}</b></span>
                                                                </div>
                                                                <div class="pdt-5 clearfix">
                                                                    <span class="mgr-15">Diện tích: 
                                                                        <span class="text text-primary">
                                                                            ${item.dienTich} m2
                                                                        </span>
                                                                    </span>
                                                                </div>
                                                                        <div class="pdt-5 clearfix">
                                                                    <span class="mgr-15">Giá thuê: 
                                                                        <span class="text text-primary">
                                                                            ${item.giaThue} triệu đồng
                                                                        </span>
                                                                    </span>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>                                  
                                                </div>
                                            </td>
                                            <td>
                                                <p class="text-center"><a href="UpdateRoomServlet?maphong=${item.maPhong}" title="Sửa tin" class="label label-info"><i class="fa fa-edit"></i> Sửa tin</a></p>
                                                <p class="text-center"><a href="DeleteRoomServlet?maphong=${item.maPhong}"  title="Xóa tin" class="label label-info"><i class="fa fa-remove"></i> Xóa tin</a></p>
                                            </td>

                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div> 
        </div>
        <jsp:include page="footer.jsp"></jsp:include>
        <script src="/scripts/jquery.min.js"></script>

        <script src="/scripts/bootstrap.min.js"></script>

        <script src="/scripts/bootstrap-growl.min.js"></script>

        <script src="/scripts/jqueryval.min.js"></script>

        <script src="/scripts/lazyload.min.js"></script>

        <script src="/scripts/main.min.js?v=20200305"></script>

        <script src="/scripts/common.min.js?v=20200305"></script>

        <script src="/scripts/account.min.js?v=20200305"></script>


        <script src="/post/priceList?v=20200305"></script>
        <script src="/scripts/data.min.js?v=20200305"></script>
        <script src="/scripts/post_index.min.js?v=20200305"></script>
        <script>
            $(function () {
                $("input[name=search]").keydown(function () {
                    if (event.keyCode === 13 && $(this).val() !== "") {
                        window.location = "?q=" + encodeURIComponent($(this).val());
                    }
                });
                $("span#btnSearch").click(function () {
                    var q = $("input[name=search]").val();
                    if (q !== "") {
                        window.location = "?q=" + encodeURIComponent(q);
                    }
                });
            });
            function search(value) {
                if (value != "") {
                    window.location = "?cid=" + value;
                } else {
                    window.location = "quan-ly-tin.htm";
                }
            }
        </script>

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