<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Thông tin tài khoản</title>
        <base href="${pageContext.servletContext.contextPath}/">
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
            <div class="container">
                <div class="access_page">
                    <div class="page_content intro_page clearfix">
                        <ul class="nav nav-tabs tab_huongdan" role="tablist">
                        <c:if test="${sessionScope.ACCOUNT.phanQuyen == 2}">
                            <li><a href="quan-ly-tin.htm"><i class="fa fa-list-alt"></i> Quản lý tin</a></li>
                        </c:if>
                            
                            <li class="active"><a href="tai-khoan.jsp"><i class="fa fa-user"></i> Thông tin tài khoản</a></li>
                        </ul>
                        <div class="tab-content">
                            <h4>TH&#212;NG TIN T&#192;I KHOẢN</h4>
                            <hr />
                            <div class="row user_profile_wrapper">
                                <div class="user_profile_left col-xs-12 col-md-8">
                                    <form action="UpdateAccountServlet" method="POST" class="form-horizontal" modelAttribute="userInfo">
                                        <div class="form-group">
                                            <div class="form-group">
                                                <label class="control-label col-md-3">Mã tài khoản</label>
                                                <div class="col-md-9">
                                                    <div class="input-group">
                                                        <span class="input-group-addon">#</span>
                                                        <input class="form-control text-box single-line" value="${a.userID}" name="userID" disabled="true" placeholder="${sessionScope.ACCOUNT.userID}"/>
                                                </div>
                                            </div>
                                        </div>                            
                                        <div class="form-group">
                                            <label class="control-label col-md-3">Tên đăng nhập</label>

                                            <div class="col-md-9">
                                                <errors style="color: red" path= "userName"/>
                                                <div class="input-group">
                                                    <span class="input-group-addon"><i class="fa fa-user" aria-hidden="true"></i></span>
                                                    <input class="form-control text-box single-line" type="text" name="username" value="${a.username}" name="username" placeholder="${sessionScope.ACCOUNT.username}" readonly/>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-md-3">Mật Khẩu</label>
                                            <div class="col-md-9">
                                                <div class="input-group">
                                                    <span class="input-group-addon"><i class="fa fa-user" aria-hidden="true"></i></span>
                                                    <input class="form-control text-box single-line" name="password" value="${a.password}" placeholder="${sessionScope.ACCOUNT.password}"/>
                                                </div>
                                            </div>
                                        </div>          
                                        <div class="form-group">
                                            <label class="control-label col-md-3">Số điện thoại</label> 
                                            <div class="col-md-9">
                                                <errors style="color: red" path= "sdt"/>
                                                <div class="input-group">
                                                    <span class="input-group-addon"><i class="fa fa-phone" aria-hidden="true"></i></span>
                                                    <input class="form-control text-box single-line" name="sdt" value="${a.SDT}" placeholder="${sessionScope.ACCOUNT.SDT}"/>  
                                                    <span class="input-group-addon"><span class="text text-success" title="Đã xác minh"><i class="fa fa-check" aria-hidden="true"></i></span></span>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-md-3">Họ và tên</label>

                                            <errors style="color: red" path= "fullName"/>		                                   
                                            <div class="col-md-9">
                                                <div class="input-group">
                                                    <span class="input-group-addon"><i class="fa fa-user" aria-hidden="true"></i></span>
                                                    <input class="form-control text-box single-line" name="fullname" value="${a.fullname}" placeholder="${sessionScope.ACCOUNT.fullname}"/>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-md-3">Email</label>
                                            <div class="col-md-9">
                                                <errors style="color: red" path= "emailLienHe"/>
                                                <div class="input-group">
                                                    <span class="input-group-addon"><i class="fa fa-envelope" aria-hidden="true"></i></span>
                                                    <input class="form-control text-box single-line" name="email" value="${a.email}" placeholder="${sessionScope.ACCOUNT.email}"/>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-md-3">Địa chỉ</label>
                                            <div class="col-md-9">
                                                <div class="input-group">
                                                    <span class="input-group-addon"><i class="fa fa-address-book" aria-hidden="true"></i></span>
                                                    <input class="form-control text-box single-line" name="diachi" value="${a.diaChi}" placeholder="${sessionScope.ACCOUNT.diaChi}"/>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-md-offset-3 col-md-9">
                                                <button type="submit" class="btn btn-primary btn-block btn_save_profile"><i class="fa fa-check-circle" aria-hidden="true"></i> Cập nhật</button>
                                                <p class=" mgt-20" style="color: red">${message}</p>
                                            </div>
                                        </div>
                                </form>           
                            </div>
                        </div>
                        <div class="user_profile_right col-xs-12 col-md-4">
                            <div class="user_profile_account">
                                <div class="user_profile_account_header">
                                </div>
                                <div class="user_profile_account_body">
                                    <ul>
                                        
                                        <li><a href="LogoutServlet" title="Thoát"><i class="fa fa-sign-out"></i> Thoát</a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <jsp:include page="footer.jsp"></jsp:include>
    <script>
        $(document).on("keydown", "input", function (e) {
            if (e.which == 13) {
                event.preventDefault();
                return false;
            }
        });
        $(function () {
            $('#modal_change_mobile').on('hidden.bs.modal', function () {
                $(this).find('#MobileNew').val('');
                $(this).find('#btn_verify_mobile').attr("disabled", false);
            });
            $('#modal_verify_mobile').on('hidden.bs.modal', function () {
                $(this).find('#Code').val('');
            })

            $("#btn_change_mobile").click(function () {
                $("#modal_change_mobile").modal().show();
            });
            $("#MobileNew").keypress(function (e) {
                return isNumberKey(e);
            });
            $("#btn_verify_mobile").click(function () {
                var btn = $(this);
                var mobile = $("#MobileNew");
                if (mobile.val() == "") {
                    mobile.focus();
                    return;
                }
                if (!check_mobile(mobile.val())) {
                    showNotify("Số điện thoại không hợp lệ", "danger");
                    mobile.val("");
                    return;
                }
                loading(btn);
                $.post("/Account/VerifyMobileNew", {mobile: mobile.val()}, function (d) {
                    if (d.success) {
                        btn.text(btn.text());
                        $("#lblMobileNew").html(mobile.val());
                        $("#modal_change_mobile").modal('hide');
                        $("#modal_verify_mobile").modal().show();
                    } else {
                        endLoading(btn, btn.text());
                        showNotify(d.message, "danger");
                    }
                }).fail(function (error) {
                    alert("Error");
                    location = location
                });
                return false;
            });
            $("#btnVerifyCode").click(function () {
                var btn = $(this);
                var code = $("#Code").val();
                if (code == "") {
                    $("#Code").focus();
                    return;
                }
                loading(btn);
                $.post("/Account/VerifyMobileNewCode", {mobile: $("#lblMobileNew").text(), code: code}, function (d) {
                    if (d.success) {
                        btn.text(btn.text());
                        showNotify(d.message, "success");
                        redirect(location);
                    } else {
                        endLoading(btn, btn.text());
                        showNotify(d.message, "danger");
                    }
                }).fail(function (error) {
                    alert("Error");
                    location = location
                });
                return false;
            });
        });
        function check_mobile(a) {
            if (!/(09|03|07|08|05)[0-9]{8}/.test(a)) {
                return false;
            }
            return true;
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