<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Đăng tin mới</title>

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
        <link href="<c:url value="/resources/css/lightgallery.css"/>" rel='stylesheet' type='text/css'/>

        <!-- scale lại preview img -->
        <style type="text/css">.thumb-image{float:left;width:100px;position:relative;padding:5px;}.selectedItem{border:2px solid blue;}</style>
    </head>

    <body>
        <jsp:include page="header.jsp"></jsp:include>
            <div class="container">
                <div class="access_page">
                    <h1 class="page_title">Đăng tin cho thuê phòng trọ</h1>
                    <div class="page-post">
                        <div class="row">
                            <div class="col-xs-12 col-md-4 block-right sidebar_huongdan">
                                <div class="hidden-xs">
                                    <div class="block_huongdandangtin">
                                        <div class="block_huongdandangtin_header">
                                            Hướng dẫn đăng tin
                                        </div>
                                        <div class="block_huongdandangtin_body">
                                            <ul>
                                                <li><strong>Thông tin có dấu <span class="red_require">*</span> là bắt buộc.</strong></li>
                                                <li><strong>Nội dung phải viết bằng tiếng Việt có dấu</strong></li>
                                                <li><strong>Tiêu đề tin không dài quá 100 kí tự</strong></li>
                                                <li>Các bạn nên điền đầy đủ thông tin vào các mục để tin đăng có hiệu quả hơn.</li>
                                                <li>Tin đăng có hình ảnh rõ ràng sẽ được xem và gọi gấp nhiều lần so với tin rao không có ảnh. Hãy đăng ảnh để được giao dịch nhanh chóng!</li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xs-12 col-md-8 block-left dang_tin">
                                <form action="AddNewRoomServlet" method="post" enctype='multipart/form-data'>   
                                    <div class="form_step step1">
                                        <div class="group_fields">
                                            <h3 class="form_title">Thông tin cơ bản</h3>
                                            <div class="group_fields_body">
                                                <div class="form-group">
                                                    <div class="row">
                                                        <div class="col-sm-12">
                                                            <label class="control-label">Tiêu đề tin <span class="red_require">*</span></label>
                                                            <input class="form-control text-box single-line" name="tieuDe"/>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <div class="row">
                                                        <div class="col-sm-12">
                                                            <label class="control-label">Loại <span class="red_require">*</span></label>
                                                            <input class="form-control text-box single-line" name="loai"/>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <div class="row">

                                                        <div class="col-sm-12 col-xs-12">
                                                            <label class="control-label">Diện tích <span class="red_require">*</span></label>
                                                            <div class="input-group">
                                                                <input class="form-control text-box single-line" name="dienTich"/>
                                                                <span class="input-group-addon" id="basic-addon2">m²</span>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <div class="row">
                                                        <div class="col-sm-6">
                                                            <div class="clearfix">
                                                                <div class="pull-left"><label class="control-label">Giá cho thuê <span class="red_require">*</span></label></div>
                                                            </div>
                                                            <input class="form-control text-box single-line" placeholder="VD: 2 triệu 500 nghìn thì nhập 2.5" name="giaThue"/>
                                                        </div>
                                                        <div class="col-sm-6">
                                                            <label class="control-label">Đơn vị giá <span class="red_require">*</span></label>
                                                            <input class="form-control" value="Triệu/tháng" placeholder="Triệu/tháng" disabled>
                                                        </div>
                                                    </div>
                                                </div>

                                                <div class="form-group">

                                                </div>
                                                <div class="form-group">
                                                    <label class="control-label">Địa chỉ <span class="red_require">*</span></label>
                                                    <input class="form-control text-box single-line" name="diaChi"/>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="group_fields">
                                            <h3 class="form_title">Thông tin mô tả</h3>
                                            <div class="group_fields_body">
                                                <div class="form-group">
                                                    <div class="row">
                                                        <div class="col-sm-12">
                                                            <label class="control-label">Nội dung <span class="red_require">*</span></label>
                                                            <textarea class="form-control edtior-noidung" cols="20" rows="8" name="ghiChu"></textarea>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="group_fields">
                                            <h3 class="form_title">Thông tin liên hệ</h3>
                                            <div class="group_fields_body">
                                                <div class="form-group">
                                                    <div class="row">
                                                        <div class="col-sm-6 col-xs-12">
                                                            <label class="control-label">Tên liên hệ <span class="red_require">*</span></label>
                                                            <input value="${sessionScope.userInfo.fullName}" class="form-control text-box single-line" name="lienHe"/>
                                                    </div>
                                                    <div class="col-sm-6 col-xs-12">
                                                        <label class="control-label">Điện thoại <span class="red_require">*</span></label>
                                                        <input value="${sessionScope.userInfo.sdt}" class="form-control text-box single-line" name="sdt"/>                                            
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="group_fields">
                                        <h3 class="form_title">Hình ảnh</h3>
                                        <div class="group_fields_body">
                                            <div class="form-group">
                                                <div class="row">
                                                    <div class="col-sm-12">
                                                        <div class="clearfix ui-sortable default-theme">

                                                            <input class="photo" type="file" name="Image">                                                        </div>		                                            	
                                                        <p class="help-block">
                                                            Tối đa 3 ảnh. Dung lượng không quá 6MB<br />
                                                        </p>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-sm-12 text-center">
                                            <button type="submit" class="btn btn-primary">ĐĂNG TIN</button>
                                        </div>
                                        <p class=" mgt-20" style="color: red">${message}</p>
                                    </div>
                                </div>
                            </form>            
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
        <script src="scripts/jquery-ui.min.js"></script>
        <script src="<c:url value="/resources/js/select2.full.min.js"/>"></script>
        <script>$('.select2').select2()</script>
        <script src="<c:url value="/resources/js/cityList1.min.js"/>"></script>
        <script src="<c:url value="/resources/js/cityList2.min.js"/>"></script>
        <script src="<c:url value="/resources/js/cityList3.min.js"/>"></script>
        <script src="<c:url value="/resources/js/cityList4.min.js"/>"></script>
        <script src="<c:url value="/resources/js/data.min.js?v=20200305"/>"></script>
        <script src="<c:url value="/resources/js/priceList.js?v=20200305"/>"></script>
        <script src="<c:url value="/resources/js/post.min.js?v=20200305"/>"></script>
        <script src="<c:url value="/resources/js/post_create.min.js?v=20200305"/>"></script>
        <script src="<c:url value="/resources/js/upload.min.js?v=20200305"/>"></script>
        <script>$(function () {
                $('#pop-login').modal('show');
            });
            $('#btnPostCreate').attr('disabled', true)</script>
        <script>
            $(function () {
                $("#ddlUnit").val(2);
            });
        </script>
        <!-- script để upload và prviewfile https://stackoverflow.com/questions/37262498/upload-images-in-spring-mvc-using-javascript-for-preview -->



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