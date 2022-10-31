package org.apache.jsp.view.managers;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dang_002dky_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_url_value_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\" />\r\n");
      out.write("    <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width,initial-scale=1.0,user-scalable=0\">\r\n");
      out.write("    <title>Đăng ký tài khoản</title>\r\n");
      out.write("    \r\n");
      out.write("    <link rel=\"icon\" href=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\" />\r\n");
      out.write("    <link href=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\" rel='stylesheet' type='text/css'/>\r\n");
      out.write("    <link href=\"");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("\" rel='stylesheet' type='text/css'/>\r\n");
      out.write("    <link href=\"");
      if (_jspx_meth_c_url_3(_jspx_page_context))
        return;
      out.write("\" rel='stylesheet' type='text/css'/>\r\n");
      out.write("    <link href=\"");
      if (_jspx_meth_c_url_4(_jspx_page_context))
        return;
      out.write("\" rel='stylesheet' type='text/css'/>\r\n");
      out.write("    <link href=\"");
      if (_jspx_meth_c_url_5(_jspx_page_context))
        return;
      out.write("\" rel='stylesheet' type='text/css'/>\r\n");
      out.write("    <link href=\"");
      if (_jspx_meth_c_url_6(_jspx_page_context))
        return;
      out.write("\" rel='stylesheet' type='text/css'/>\r\n");
      out.write("    <link href=\"");
      if (_jspx_meth_c_url_7(_jspx_page_context))
        return;
      out.write("\" rel='stylesheet' type='text/css'/>\r\n");
      out.write("    <link href=\"");
      if (_jspx_meth_c_url_8(_jspx_page_context))
        return;
      out.write("\" rel='stylesheet' type='text/css'/>\r\n");
      out.write("\t<link href=\"");
      if (_jspx_meth_c_url_9(_jspx_page_context))
        return;
      out.write("\" rel='stylesheet' type='text/css'/>\r\n");
      out.write("\t<link href=\"");
      if (_jspx_meth_c_url_10(_jspx_page_context))
        return;
      out.write("\" rel='stylesheet' type='text/css'/>\r\n");
      out.write("\t<link href=\"");
      if (_jspx_meth_c_url_11(_jspx_page_context))
        return;
      out.write("\" rel='stylesheet' type='text/css'/>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <header class=\"header\">     \r\n");
      out.write("        <div class=\"navbarTop hidden-xs\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"pull-left\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"pull-right\">                \r\n");
      out.write("\t\t\t\t\t<div class=\"user_welcome\">\r\n");
      out.write("\t\t\t\t\t        <a class=\"btn btn-login\" href=\"../dang-ky.jsp\" rel=\"nofollow\"><i class=\"fa fa-user-plus\"></i> Đăng ký</a>\r\n");
      out.write("\t\t\t\t\t        <a class=\"btn btn-login\" href=\"../dang-nhap.jsp\" rel=\"nofollow\"><i class=\"fa fa-sign-in\"></i> Đăng nhập</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"header-banner\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-xs-12 col-sm-12 col-md-4\">\r\n");
      out.write("                        <div class=\"logo\">\r\n");
      out.write("                            <div class=\"pull-left\">\r\n");
      out.write("                                <a href=\"home.htm\" rel=\"home\">\r\n");
      out.write("                                    <img src=\"");
      if (_jspx_meth_c_url_12(_jspx_page_context))
        return;
      out.write("\" alt=\"\">\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"navbar navbar-default pull-right\">\r\n");
      out.write("                                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"modal\" data-target=\"#mobile_menu\">\r\n");
      out.write("                                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                                </button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"clearfix\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- thanh bảng chọn -->\r\n");
      out.write("        <div class=\"header-menu hidden-xs\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <nav class=\"navbar\">                 \r\n");
      out.write("\t\t\t\t\t<ul class=\"navbar-nav\">\r\n");
      out.write("\t\t\t\t\t    <li class=\"menu-item-has-children\">\r\n");
      out.write("\t\t\t\t\t        <a href=\"home.htm\" rel=\"nofollow\">Trang chủ</a>\r\n");
      out.write("\t\t\t\t\t    </li>\r\n");
      out.write("\t\t\t\t\t    <li class=\"menu-item-has-children\">\r\n");
      out.write("\t\t\t\t\t        <a href=\"cho-thue-phong-tro.htm\" rel=\"nofollow\">Cho thuê phòng trọ</a>\r\n");
      out.write("\t\t\t\t\t    </li>\r\n");
      out.write("\t\t\t\t\t    <li class=\"menu-item-has-children\">\r\n");
      out.write("\t\t\t\t\t        <a href=\"cho-thue-can-ho.htm\" rel=\"nofollow\">Cho thuê căn hộ</a>\r\n");
      out.write("\t\t\t\t\t    </li>\r\n");
      out.write("\t\t\t\t\t    <li class=\"menu-item-has-children\">\r\n");
      out.write("\t\t\t\t\t        <a href=\"cho-thue-nha-nguyen-can.htm\" rel=\"nofollow\">Nhà nguyên căn</a>\r\n");
      out.write("\t\t\t\t\t    </li>\r\n");
      out.write("\t\t\t\t\t    <li class=\"menu-item-has-children\">\r\n");
      out.write("\t\t\t\t\t        <a href=\"tim-nguoi-o-ghep.htm\" rel=\"nofollow\">Tìm người ở ghép</a>\r\n");
      out.write("\t\t\t\t\t    </li>\r\n");
      out.write("\t\t\t\t\t    <li class=\"menu-item-has-children\">\r\n");
      out.write("\t\t\t\t\t        <a href=\"#\" rel=\"nofollow\">Hướng dẫn</a>\r\n");
      out.write("\t\t\t\t\t    </li>\r\n");
      out.write("\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t    <li>\r\n");
      out.write("\t\t\t\t\t        <a href=\"dang-tin.htm\" title=\"Đăng tin\"><i class=\"fa fa-pencil-square-o\"></i>Đăng tin</a>\r\n");
      out.write("\t\t\t\t\t    </li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("    <!-- trang hiển thị chính -->\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("\t\t<div class=\"access_page\">\r\n");
      out.write("    \t\t<div class=\"page_header\">\r\n");
      out.write("        \t\t<h1 class=\"page_title\">Đăng ký tài khoản</h1>\r\n");
      out.write("        \t\t<hr />\r\n");
      out.write("    \t\t</div>\r\n");
      out.write("    \t\t<div class=\"page_content register_page\">\r\n");
      out.write("\t        \t<div class=\"row\">\r\n");
      out.write("\t\t            \t<div class=\"col-xs-12 col-sm-6 col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<form:form action=\"dang-ky.htm\" modelAttribute=\"user\">                   \r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t                        <label class=\"control-label\" for=\"FullName\">Tên tài khoản</label> \r\n");
      out.write("\t\t\t                        <span class=\"red_require\">*</span>\r\n");
      out.write("\t\t\t                        <form:errors style=\"color: red\" path= \"userName\"/>\r\n");
      out.write("\t\t\t                        <form:input class=\"form-control\" path=\"userName\"/>\r\n");
      out.write("\t\t\t                    </div>\r\n");
      out.write("\t\t\t                    <div class=\"form-group\">\r\n");
      out.write("\t\t\t                        <label class=\"control-label\" for=\"Mobile\">Số điện thoại</label> <span class=\"red_require\">*</span>\r\n");
      out.write("\t\t\t                        <form:errors style=\"color: red\" path=\"std\"/>\r\n");
      out.write("\t\t\t                        <form:input class=\"form-control\" path=\"std\"/>\r\n");
      out.write("\t\t\t                    </div>\r\n");
      out.write("\t\t\t                    <div class=\"form-group\">\r\n");
      out.write("\t\t\t                        <label class=\"control-label\" for=\"Password\">Tạo mật khẩu</label> <span class=\"red_require\">*</span>\r\n");
      out.write("\t\t\t                        <form:errors style=\"color: red\" path=\"passWord\"/>\r\n");
      out.write("\t\t\t                        <form:password class=\"form-control\" path=\"passWord\"/>\r\n");
      out.write("\t\t\t                    </div>\r\n");
      out.write("\t\t\t                    <div class=\"form-group\">\r\n");
      out.write("\t\t\t                    \t<label class=\"control-label\" for=\"Password\">Xác nhận mật khẩu</label> <span class=\"red_require\">*</span>\r\n");
      out.write("\t\t\t                        <form:errors style=\"color: red\" path=\"confirmPass\"/>\r\n");
      out.write("\t\t\t                        <form:password class=\"form-control\" path=\"confirmPass\"/>\r\n");
      out.write("\t\t\t                    </div>\r\n");
      out.write("\t\t\t                    <div class=\"btn_wrapper\">\r\n");
      out.write("\t\t\t                        <button type=\"submit\" class=\"btn btn-success btn-block\"><i class=\"fa fa-user-plus\"></i> Đăng ký tài khoản</button>\r\n");
      out.write("\t\t\t                    \t<p class=\" mgt-20\" style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("\t\t\t                    </div>\r\n");
      out.write("\t\t\t                    \r\n");
      out.write("\t\t\t\t\t\t\t</form:form>            \r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t            <div class=\"col-xs-12 col-sm-1 col-md-1 hidden-xs\">\r\n");
      out.write("\t\t            </div>\r\n");
      out.write("\t\t            <div class=\"col-xs-12 col-sm-5 col-md-5\">\r\n");
      out.write("\t\t                <div class=\"right\">\r\n");
      out.write("\t\t                    <p class=\"mgb-20\">Đăng nhập bằng Facebook hoặc Google</p>\r\n");
      out.write("\t\t                    <section id=\"socialLoginForm\">\r\n");
      out.write("\t\t                        <div id=\"socialLoginList\">\r\n");
      out.write("\t\t\t                        <p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<form action=\"#\" method=\"post\">            \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-social btn-bg-facebook btn-block\" title=\"Đăng nhập bằng Facebook\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-facebook\"></i> Đăng nhập bằng Facebook</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</form>    \r\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t    \t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<form action=\"#\" method=\"post\">            \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-social btn-bg-google btn-block\" title=\"Đăng nhập bằng Google\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-google\"></i> Đăng nhập bằng Google</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</form>    \r\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t                    </section>\r\n");
      out.write("\t\t                    <div class=\"mgt-25\">\r\n");
      out.write("\t\t                        <p>Bạn đã có tài khoản? <a href=\"dang-nhap.htm\">Đăng nhập ngay</a></p>\r\n");
      out.write("\t\t                    </div>\r\n");
      out.write("\t\t                </div>\r\n");
      out.write("\t\t            </div>\r\n");
      out.write("\t        \t</div>\r\n");
      out.write("    \t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("        \r\n");
      out.write("    <script src=\"");
      if (_jspx_meth_c_url_13(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"");
      if (_jspx_meth_c_url_14(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"");
      if (_jspx_meth_c_url_15(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"");
      if (_jspx_meth_c_url_16(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"");
      if (_jspx_meth_c_url_17(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"");
      if (_jspx_meth_c_url_18(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"");
      if (_jspx_meth_c_url_19(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"");
      if (_jspx_meth_c_url_20(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!-- Global site tag (gtag.js) - Google Analytics -->\r\n");
      out.write("<script async src=\"https://www.googletagmanager.com/gtag/js?id=UA-42682349-1\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("  window.dataLayer = window.dataLayer || [];\r\n");
      out.write("  function gtag(){dataLayer.push(arguments);}\r\n");
      out.write("  gtag('js', new Date());\r\n");
      out.write("\r\n");
      out.write("  gtag('config', 'UA-42682349-1');\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/resources/images/favicon.ico");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent(null);
    _jspx_th_c_url_1.setValue("/resources/css/site.min.css");
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
    return false;
  }

  private boolean _jspx_meth_c_url_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_2.setPageContext(_jspx_page_context);
    _jspx_th_c_url_2.setParent(null);
    _jspx_th_c_url_2.setValue("/resources/css/select2.min.css");
    int _jspx_eval_c_url_2 = _jspx_th_c_url_2.doStartTag();
    if (_jspx_th_c_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
    return false;
  }

  private boolean _jspx_meth_c_url_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_3.setPageContext(_jspx_page_context);
    _jspx_th_c_url_3.setParent(null);
    _jspx_th_c_url_3.setValue("/resources/css/select.min.css");
    int _jspx_eval_c_url_3 = _jspx_th_c_url_3.doStartTag();
    if (_jspx_th_c_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
    return false;
  }

  private boolean _jspx_meth_c_url_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_4.setPageContext(_jspx_page_context);
    _jspx_th_c_url_4.setParent(null);
    _jspx_th_c_url_4.setValue("/resources/css/font-awesome.min.css");
    int _jspx_eval_c_url_4 = _jspx_th_c_url_4.doStartTag();
    if (_jspx_th_c_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
    return false;
  }

  private boolean _jspx_meth_c_url_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_5.setPageContext(_jspx_page_context);
    _jspx_th_c_url_5.setParent(null);
    _jspx_th_c_url_5.setValue("/resources/css/bootstrap.min.css");
    int _jspx_eval_c_url_5 = _jspx_th_c_url_5.doStartTag();
    if (_jspx_th_c_url_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_5);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_5);
    return false;
  }

  private boolean _jspx_meth_c_url_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_6 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_6.setPageContext(_jspx_page_context);
    _jspx_th_c_url_6.setParent(null);
    _jspx_th_c_url_6.setValue("/resources/css/jquery-ui.min.css");
    int _jspx_eval_c_url_6 = _jspx_th_c_url_6.doStartTag();
    if (_jspx_th_c_url_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_6);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_6);
    return false;
  }

  private boolean _jspx_meth_c_url_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_7 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_7.setPageContext(_jspx_page_context);
    _jspx_th_c_url_7.setParent(null);
    _jspx_th_c_url_7.setValue("/resources/css/upload.min.css");
    int _jspx_eval_c_url_7 = _jspx_th_c_url_7.doStartTag();
    if (_jspx_th_c_url_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_7);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_7);
    return false;
  }

  private boolean _jspx_meth_c_url_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_8 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_8.setPageContext(_jspx_page_context);
    _jspx_th_c_url_8.setParent(null);
    _jspx_th_c_url_8.setValue("/resources/css/style_detail.css");
    int _jspx_eval_c_url_8 = _jspx_th_c_url_8.doStartTag();
    if (_jspx_th_c_url_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_8);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_8);
    return false;
  }

  private boolean _jspx_meth_c_url_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_9 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_9.setPageContext(_jspx_page_context);
    _jspx_th_c_url_9.setParent(null);
    _jspx_th_c_url_9.setValue("/resources/css/select2.css");
    int _jspx_eval_c_url_9 = _jspx_th_c_url_9.doStartTag();
    if (_jspx_th_c_url_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_9);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_9);
    return false;
  }

  private boolean _jspx_meth_c_url_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_10 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_10.setPageContext(_jspx_page_context);
    _jspx_th_c_url_10.setParent(null);
    _jspx_th_c_url_10.setValue("/resources/css/lightslider.css");
    int _jspx_eval_c_url_10 = _jspx_th_c_url_10.doStartTag();
    if (_jspx_th_c_url_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_10);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_10);
    return false;
  }

  private boolean _jspx_meth_c_url_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_11 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_11.setPageContext(_jspx_page_context);
    _jspx_th_c_url_11.setParent(null);
    _jspx_th_c_url_11.setValue("/resources/css/lightgallery.css");
    int _jspx_eval_c_url_11 = _jspx_th_c_url_11.doStartTag();
    if (_jspx_th_c_url_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_11);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_11);
    return false;
  }

  private boolean _jspx_meth_c_url_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_12 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_12.setPageContext(_jspx_page_context);
    _jspx_th_c_url_12.setParent(null);
    _jspx_th_c_url_12.setValue("/resources/images/logo.png?v=20200501");
    int _jspx_eval_c_url_12 = _jspx_th_c_url_12.doStartTag();
    if (_jspx_th_c_url_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_12);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_12);
    return false;
  }

  private boolean _jspx_meth_c_url_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_13 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_13.setPageContext(_jspx_page_context);
    _jspx_th_c_url_13.setParent(null);
    _jspx_th_c_url_13.setValue("/resources/js/jquery.min.js");
    int _jspx_eval_c_url_13 = _jspx_th_c_url_13.doStartTag();
    if (_jspx_th_c_url_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_13);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_13);
    return false;
  }

  private boolean _jspx_meth_c_url_14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_14 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_14.setPageContext(_jspx_page_context);
    _jspx_th_c_url_14.setParent(null);
    _jspx_th_c_url_14.setValue("/resources/js/bootstrap.min.js");
    int _jspx_eval_c_url_14 = _jspx_th_c_url_14.doStartTag();
    if (_jspx_th_c_url_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_14);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_14);
    return false;
  }

  private boolean _jspx_meth_c_url_15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_15 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_15.setPageContext(_jspx_page_context);
    _jspx_th_c_url_15.setParent(null);
    _jspx_th_c_url_15.setValue("/resources/js/bootstrap-growl.min.js");
    int _jspx_eval_c_url_15 = _jspx_th_c_url_15.doStartTag();
    if (_jspx_th_c_url_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_15);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_15);
    return false;
  }

  private boolean _jspx_meth_c_url_16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_16 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_16.setPageContext(_jspx_page_context);
    _jspx_th_c_url_16.setParent(null);
    _jspx_th_c_url_16.setValue("/resources/js/jqueryval.min.js");
    int _jspx_eval_c_url_16 = _jspx_th_c_url_16.doStartTag();
    if (_jspx_th_c_url_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_16);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_16);
    return false;
  }

  private boolean _jspx_meth_c_url_17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_17 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_17.setPageContext(_jspx_page_context);
    _jspx_th_c_url_17.setParent(null);
    _jspx_th_c_url_17.setValue("/resources/js/lazyload.min.js");
    int _jspx_eval_c_url_17 = _jspx_th_c_url_17.doStartTag();
    if (_jspx_th_c_url_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_17);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_17);
    return false;
  }

  private boolean _jspx_meth_c_url_18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_18 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_18.setPageContext(_jspx_page_context);
    _jspx_th_c_url_18.setParent(null);
    _jspx_th_c_url_18.setValue("/resources/js/main.min.js?v=20200305");
    int _jspx_eval_c_url_18 = _jspx_th_c_url_18.doStartTag();
    if (_jspx_th_c_url_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_18);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_18);
    return false;
  }

  private boolean _jspx_meth_c_url_19(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_19 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_19.setPageContext(_jspx_page_context);
    _jspx_th_c_url_19.setParent(null);
    _jspx_th_c_url_19.setValue("/resources/js/common.min.js?v=20200305");
    int _jspx_eval_c_url_19 = _jspx_th_c_url_19.doStartTag();
    if (_jspx_th_c_url_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_19);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_19);
    return false;
  }

  private boolean _jspx_meth_c_url_20(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_20 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_20.setPageContext(_jspx_page_context);
    _jspx_th_c_url_20.setParent(null);
    _jspx_th_c_url_20.setValue("/resources/js/account.min.js?v=20200305");
    int _jspx_eval_c_url_20 = _jspx_th_c_url_20.doStartTag();
    if (_jspx_th_c_url_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_20);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_20);
    return false;
  }
}
