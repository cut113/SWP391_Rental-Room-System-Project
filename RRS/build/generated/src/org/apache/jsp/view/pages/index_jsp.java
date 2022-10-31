package org.apache.jsp.view.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items_end_begin;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_var_items_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
    _jspx_tagPool_c_forEach_varStatus_var_items_end_begin.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_url_value_nobody.release();
    _jspx_tagPool_c_when_test.release();
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
      out.write("    <meta charset= \"UTF-8\">\r\n");
      out.write("    <title>Tìm Phòng Trọ</title>\r\n");
      out.write("    <base href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.servletContext.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    \r\n");
      out.write("   \t<div class=\"container\">\r\n");
      out.write("   \t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "searchbar.jsp", out, false);
      out.write("\r\n");
      out.write("\t    <div class=\"access_page\">\r\n");
      out.write("\t\t    <div class=\"page_header\">\r\n");
      out.write("\t\t        <h1 class=\"page_title font20\">Cho thuê phòng trọ, tìm nhà trọ nhanh chóng</h1>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t    <div class=\"row\">\r\n");
      out.write("\t\t    \t<div class=\"col-xs-12 col-md-8 pdr-0\">\r\n");
      out.write("\t                <div class=\"row\">\r\n");
      out.write("\t                    <div class=\"col-xs-12 col-md-3\">\r\n");
      out.write("\t                        <h2 class=\"titleVip\">\r\n");
      out.write("\t                            TOP TÌM KIẾM NỔI BẬT\r\n");
      out.write("\t                        </h2>\r\n");
      out.write("\t                    </div>\r\n");
      out.write("\t                </div>\r\n");
      out.write("\t    \t\t\t<div class=\"panel panel-default post-list\">\r\n");
      out.write("\t        \t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t            \t\t<div class=\"list-all-new\">\r\n");
      out.write("\t\t\t                \t<div class=\"row\" style=\"margin-top:-15px\">\r\n");
      out.write("\t\t\t                \t\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t                    </div>\r\n");
      out.write("\t                    </div>\r\n");
      out.write("\t                </div>\r\n");
      out.write("\t\t    \t</div>\r\n");
      out.write("\t        \t<div class=\"col-xs-12 col-md-4\">\r\n");
      out.write("\t                <div class=\"sidebar-box\">\r\n");
      out.write("\t                    <h3 class=\"sidebarbox-title\">\r\n");
      out.write("\t                        <span>Danh mục cho thuê</span>\r\n");
      out.write("\t                    </h3>\r\n");
      out.write("\t                    <div class=\"sidebarbox-body\">\r\n");
      out.write("\t                        <ul class=\"box-lastnews\">\r\n");
      out.write("\t                           <li><a title=\"Cho thuê phòng trọ Hồ Chí Minh\" href=\"#\">Cho thuê phòng trọ Hồ Chí Minh</a></li>\r\n");
      out.write("\t                           <li><a title=\"Cho thuê phòng trọ Hà Nội\" href=\"#\">Cho thuê phòng trọ Hà Nội</a></li>\r\n");
      out.write("\t                           <li><a title=\"Cho thuê phòng trọ Đà Nẵng\" href=\"#\">Cho thuê phòng trọ Đà Nẵng</a></li>\r\n");
      out.write("\t                           <li><a title=\"Cho thuê phòng trọ Đồng Nai\" href=\"#\">Cho thuê phòng trọ Đồng Nai</a></li>\r\n");
      out.write("\t                           <li><a title=\"Cho thuê phòng trọ Bình Dương\" href=\"#\">Cho thuê phòng trọ Bình Dương</a></li>\r\n");
      out.write("\t                           <li><a title=\"Cho thuê phòng trọ Bà Rịa Vũng Tàu\" href=\"#\">Cho thuê phòng trọ Bà Rịa Vũng Tàu</a></li>\r\n");
      out.write("\t                           <li><a title=\"Cho thuê phòng trọ Cần Thơ\" href=\"#\">Cho thuê phòng trọ Cần Thơ</a></li>\r\n");
      out.write("\t                           <li><a title=\"Cho thuê phòng trọ Hải Phòng\" href=\"#\">Cho thuê phòng trọ Hải Phòng</a></li>\r\n");
      out.write("\t                           <li><a title=\"Cho thuê phòng trọ Thừa Thiên Huế\" href=\"#\">Cho thuê phòng trọ Thừa Thiên Huế</a></li>\r\n");
      out.write("\t                        </ul>\r\n");
      out.write("\t                    </div>\r\n");
      out.write("\t                </div>\r\n");
      out.write("\t                <div class=\"sidebar-box\">\r\n");
      out.write("\t\t\t\t        <h3 class=\"sidebarbox-title\">\r\n");
      out.write("\t\t\t\t            <span>Tin tức mới</span>\r\n");
      out.write("\t\t\t\t        </h3>  \r\n");
      out.write("\t    \t\t\t</div>\r\n");
      out.write("\t                <div class=\"sidebar-box\">\r\n");
      out.write("\t\t\t\t        <h3 class=\"sidebarbox-title\">\r\n");
      out.write("\t\t\t\t            <span>Có thể bạn quan tâm</span>\r\n");
      out.write("\t\t\t\t        </h3>\r\n");
      out.write("\t\t\t\t        <div class=\"sidebarbox-body\">\r\n");
      out.write("\t\t\t\t            <ul class=\"box-lastnews\">\r\n");
      out.write("\t\t\t\t                    <li><a href=\"#\" title=\"{Chia sẻ} Kinh doanh cho thuê phòng trọ có phải đóng thuế gì hay không?\">{Chia sẻ} Kinh doanh cho thuê phòng trọ có phải đóng thuế gì hay không?</a></li>\r\n");
      out.write("\t\t\t\t                    <li><a href=\"#\" title=\"Những điều cần lưu ý trong việc quản lý nhà trọ\">Những điều cần lưu ý trong việc quản lý nhà trọ</a></li>\r\n");
      out.write("\t\t\t\t                    <li><a href=\"#\" title=\"Cẩn thận khi đi tìm thuê phòng trọ, nhà trọ với sinh viên mới\">Cẩn thận khi đi tìm thuê phòng trọ, nhà trọ với sinh viên mới</a></li>\r\n");
      out.write("\t\t\t\t                    <li><a href=\"#\" title=\"Những điều bạn nên biết để bảo đảm quyền lợi khi đi thuê phòng trọ\">Những điều bạn nên biết để bảo đảm quyền lợi khi đi thuê phòng trọ</a></li>\r\n");
      out.write("\t\t\t\t                    <li><a href=\"#\" title=\"Lưu ý 3 chiêu trò lừa đảo cho thuê phòng trọ, nhà trọ giá rẻ\">Lưu ý 3 chiêu trò lừa đảo cho thuê phòng trọ, nhà trọ giá rẻ</a></li>\r\n");
      out.write("\t\t\t\t            </ul>\r\n");
      out.write("\t        \t\t\t</div>\r\n");
      out.write("\t    \t\t\t</div>\r\n");
      out.write("        \t\t</div>\r\n");
      out.write("    \t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"key-word\">\r\n");
      out.write("\t\t    <div class=\"keyword-wrapper\">\r\n");
      out.write("\t\t        <div class=\"row\">\r\n");
      out.write("\t\t            <div class=\"col-xs-12 col-sm-6 col-md-3\">\r\n");
      out.write("\t\t                <div class=\"keyword_item\">\r\n");
      out.write("\t\t                    <h2><a href=\"#\" title=\"Cho thuê phòng trọ\">Cho thuê phòng trọ</a></h2>\r\n");
      out.write("\t\t                    <ul>\r\n");
      out.write("\t\t                        <li>\r\n");
      out.write("\t\t                            <a href=\"#\" title=\"Cho thuê phòng trọ Hồ Chí Minh\">Cho thuê phòng trọ Hồ Chí Minh</a>\r\n");
      out.write("\t\t                        </li>\r\n");
      out.write("\t\t                        <li>\r\n");
      out.write("\t\t                            <a href=\"#\" title=\"Cho thuê phòng trọ Hà Nội\">Cho thuê phòng trọ Hà Nội</a>\r\n");
      out.write("\t\t                        </li>\r\n");
      out.write("\t\t                        <li>\r\n");
      out.write("\t\t                            <a href=\"#\" title=\"Cho thuê phòng trọ Đà Nẵng\">Cho thuê phòng trọ Đà Nẵng</a>\r\n");
      out.write("\t\t                        </li>\r\n");
      out.write("\t\t                        <li>\r\n");
      out.write("\t\t                            <a href=\"#\" title=\"Cho thuê phòng trọ Đồng Nai\">Cho thuê phòng trọ Đồng Nai</a>\r\n");
      out.write("\t\t                        </li>\r\n");
      out.write("\t\t                        <li>\r\n");
      out.write("\t\t                            <a href=\"#\" title=\"Cho thuê phòng trọ Bình Dương\">Cho thuê phòng trọ Bình Dương</a>\r\n");
      out.write("\t\t                        </li>\r\n");
      out.write("\t\t                        <li>\r\n");
      out.write("\t\t                            <a href=\"#\" title=\"Cho thuê phòng trọ Bà Rịa Vũng Tàu\">Cho thuê phòng trọ Bà Rịa Vũng Tàu</a>\r\n");
      out.write("\t\t                        </li>\r\n");
      out.write("\t\t                    </ul>\r\n");
      out.write("\t\t                </div>\r\n");
      out.write("\t\t            </div>\r\n");
      out.write("\t\t            <div class=\"col-xs-12 col-sm-6 col-md-3\">\r\n");
      out.write("\t\t                <div class=\"keyword_item\">\r\n");
      out.write("\t\t                    <h2><a href=\"#\" title=\"Nhà nguyên căn\">Nhà nguyên căn</a></h2>\r\n");
      out.write("\t\t                    <ul>\r\n");
      out.write("\t\t                        <li>\r\n");
      out.write("\t\t                            <a href=\"#\" title=\"Cho thuê nhà Hồ Chí Minh\">Cho thuê nhà Hồ Chí Minh</a>\r\n");
      out.write("\t\t                        </li>\r\n");
      out.write("\t\t                        <li>\r\n");
      out.write("\t\t                            <a href=\"#\" title=\"Cho thuê nhà Hà Nội\">Cho thuê nhà Hà Nội</a>\r\n");
      out.write("\t\t                        </li>\r\n");
      out.write("\t\t                        <li>\r\n");
      out.write("\t\t                            <a href=\"#\" title=\"Cho thuê nhà Đà Nẵng\">Cho thuê nhà Đà Nẵng</a>\r\n");
      out.write("\t\t                        </li>\r\n");
      out.write("\t\t                        <li>\r\n");
      out.write("\t\t                            <a href=\"#\" title=\"Cho thuê nhà Đồng Nai\">Cho thuê nhà Đồng Nai</a>\r\n");
      out.write("\t\t                        </li>\r\n");
      out.write("\t\t                        <li>\r\n");
      out.write("\t\t                            <a href=\"#\" title=\"Cho thuê nhà Bình Dương\">Cho thuê nhà Bình Dương</a>\r\n");
      out.write("\t\t                        </li>\r\n");
      out.write("\t\t                        <li>\r\n");
      out.write("\t\t                            <a href=\"#\" title=\"Cho thuê nhà Bà Rịa Vũng Tàu\">Cho thuê nhà Bà Rịa Vũng Tàu</a>\r\n");
      out.write("\t\t                        </li>\r\n");
      out.write("\t\t                    </ul>\r\n");
      out.write("\t\t                </div>\r\n");
      out.write("\t\t            </div>\r\n");
      out.write("\t\t            <div class=\"col-xs-12 col-sm-6 col-md-3\">\r\n");
      out.write("\t\t                <div class=\"keyword_item\">\r\n");
      out.write("\t\t                    <h2><a href=\"#\" title=\"Cho thuê căn hộ\">Cho thuê căn hộ</a></h2>\r\n");
      out.write("\t\t                    <ul>\r\n");
      out.write("\t\t                        <li>\r\n");
      out.write("\t\t                            <a href=\"#\" title=\"Cho thuê căn hộ Hồ Chí Minh\">Cho thuê căn hộ Hồ Chí Minh</a>\r\n");
      out.write("\t\t                        </li>\r\n");
      out.write("\t\t                        <li>\r\n");
      out.write("\t\t                            <a href=\"#\" title=\"Cho thuê căn hộ Hà Nội\">Cho thuê căn hộ Hà Nội</a>\r\n");
      out.write("\t\t                        </li>\r\n");
      out.write("\t\t                        <li>\r\n");
      out.write("\t\t                            <a href=\"#\" title=\"Cho thuê căn hộ Đà Nẵng\">Cho thuê căn hộ Đà Nẵng</a>\r\n");
      out.write("\t\t                        </li>\r\n");
      out.write("\t\t                        <li>\r\n");
      out.write("\t\t                            <a href=\"#\" title=\"Cho thuê căn hộ Đồng Nai\">Cho thuê căn hộ Đồng Nai</a>\r\n");
      out.write("\t\t                        </li>\r\n");
      out.write("\t\t                        <li>\r\n");
      out.write("\t\t                            <a href=\"#\" title=\"Cho thuê căn hộ Bình Dương\">Cho thuê căn hộ Bình Dương</a>\r\n");
      out.write("\t\t                        </li>\r\n");
      out.write("\t\t                        <li>\r\n");
      out.write("\t\t                            <a href=\"#\" title=\"Cho thuê căn hộ Bà Rịa Vũng Tàu\">Cho thuê căn hộ Bà Rịa Vũng Tàu</a>\r\n");
      out.write("\t\t                        </li>\r\n");
      out.write("\t\t                    </ul>\r\n");
      out.write("\t\t                </div>\r\n");
      out.write("\t\t            </div>\r\n");
      out.write("\t\t            <div class=\"col-xs-12 col-sm-6 col-md-3\">\r\n");
      out.write("\t\t                <div class=\"keyword_item\">\r\n");
      out.write("\t\t                    <h2><a href=\"#\" title=\"Tìm người ở ghép\">Tìm người ở ghép</a></h2>\r\n");
      out.write("\t\t                    <ul>\r\n");
      out.write("\t\t                        <li>\r\n");
      out.write("\t\t                            <a href=\"#\" title=\"Tìm người ở ghép Hồ Chí Minh\">Tìm người ở ghép Hồ Chí Minh</a>\r\n");
      out.write("\t\t                        </li>\r\n");
      out.write("\t\t                        <li>\r\n");
      out.write("\t\t                            <a href=\"#\" title=\"Tìm người ở ghép Hà Nội\">Tìm người ở ghép Hà Nội</a>\r\n");
      out.write("\t\t                        </li>\r\n");
      out.write("\t\t                        <li>\r\n");
      out.write("\t\t                            <a href=\"#\" title=\"Tìm người ở ghép Đà Nẵng\">Tìm người ở ghép Đà Nẵng</a>\r\n");
      out.write("\t\t                        </li>\r\n");
      out.write("\t\t                        <li>\r\n");
      out.write("\t\t                            <a href=\"#\" title=\"Tìm người ở ghép Đồng Nai\">Tìm người ở ghép Đồng Nai</a>\r\n");
      out.write("\t\t                        </li>\r\n");
      out.write("\t\t                        <li>\r\n");
      out.write("\t\t                            <a href=\"#\" title=\"Tìm người ở ghép Bình Dương\">Tìm người ở ghép Bình Dương</a>\r\n");
      out.write("\t\t                        </li>\r\n");
      out.write("\t\t                        <li>\r\n");
      out.write("\t\t                            <a href=\"#\" title=\"Tìm người ở ghép Bà Rịa Vũng Tàu\">Tìm người ở ghép Bà Rịa Vũng Tàu</a>\r\n");
      out.write("\t\t                        </li>\r\n");
      out.write("\t\t                    </ul>\r\n");
      out.write("\t\t                </div>\r\n");
      out.write("\t\t            </div>\r\n");
      out.write("        \t\t</div>\r\n");
      out.write("    \t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
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

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty sessionScope.userInfo.userName}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t");
        org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../pages/header.jsp", out, false);
        out.write("\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty sessionScope.userInfo.userName}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t");
        org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../managers/header.jsp", out, false);
        out.write("\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("item");
    _jspx_th_c_forEach_0.setVarStatus("loop");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listP}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t                        <div class=\"col-xs-12 col-md-6\">\r\n");
          out.write("\t\t\t\t                            <div class=\"news-item item-vip5\">\r\n");
          out.write("\t\t\t\t                                <div class=\"news-thumb\"> <!-- tiêu đề -->\r\n");
          out.write("\t\t\t\t                                    <a href=\"detail-id-");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.maPhong}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(".htm\">\r\n");
          out.write("\t\t\t\t                                    \t");
          if (_jspx_meth_c_choose_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t                                    </a>\r\n");
          out.write("\t\t\t\t                                </div>\r\n");
          out.write("\t\t\t\t                                <div class=\"news-info\">\r\n");
          out.write("\t\t\t\t                                    <h3 class=\"news-title\">\r\n");
          out.write("\t\t\t\t                                        <a href=\"detail-id-");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.maPhong}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(".htm\" title=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.tieuDe}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></a>\r\n");
          out.write("\t\t\t\t                                    </h3>\r\n");
          out.write("\t\t\t\t                                    <div class=\"area mgt-5\">\r\n");
          out.write("\t\t\t\t                                        <span><i class=\"fa fa-area-chart\"></i> <b>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.dienTich}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" m&#178;</b></span> <span class=\"rating\" style=\"color: #fc0\">\r\n");
          out.write("\t\t\t\t                                                <i class=\"fa fa-star\"></i>\r\n");
          out.write("\t\t\t\t                                                <i class=\"fa fa-star\"></i>\r\n");
          out.write("\t\t\t\t                                                <i class=\"fa fa-star\"></i>\r\n");
          out.write("\t\t\t\t                                                <i class=\"fa fa-star\"></i>\r\n");
          out.write("\t\t\t\t                                                <i class=\"fa fa-star\"></i>\r\n");
          out.write("\t\t\t\t                                        </span>\r\n");
          out.write("\t\t\t\t                                    </div>\r\n");
          out.write("\t\t\t\t                                    <div class=\"localtion\">\r\n");
          out.write("\t\t\t\t                                        <span><i class=\"fa fa-map-marker\"></i> <b><a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.diaChi}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></b></span>\r\n");
          out.write("\t\t\t\t                                    </div>\r\n");
          out.write("\t\t\t\t                                    <div class=\"price mgt-5\">\r\n");
          out.write("\t\t\t\t                                        <span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.giaThue}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" Triệu/tháng</span>\r\n");
          out.write("\t\t\t\t                                    </div>\r\n");
          out.write("\t\t\t\t                                </div>\r\n");
          out.write("\t\t\t\t                            </div>\r\n");
          out.write("\t\t\t\t                        </div>\r\n");
          out.write("\t\t\t                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
    if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t                                \t");
        if (_jspx_meth_c_when_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t                                \t");
        if (_jspx_meth_c_when_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t                                ");
        int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
    return false;
  }

  private boolean _jspx_meth_c_when_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_2.setPageContext(_jspx_page_context);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ empty item.ctHinhAnh}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t                                    \t<img src= \"");
        if (_jspx_meth_c_url_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_2, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\" alt=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.tieuDe}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"lazyload\">\r\n");
        out.write("\t\t\t\t\t\t                                    ");
        int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
    return false;
  }

  private boolean _jspx_meth_c_url_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_2);
    _jspx_th_c_url_0.setValue("/resources/images/default.jpg");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_when_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_3.setPageContext(_jspx_page_context);
    _jspx_th_c_when_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ not empty item.ctHinhAnh}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
    if (_jspx_eval_c_when_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t                                \t\t");
        if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_3, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("  \r\n");
        out.write("\t\t\t\t\t\t                                \t");
        int evalDoAfterBody = _jspx_th_c_when_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_3);
    _jspx_th_c_forEach_1.setVar("itemimg");
    _jspx_th_c_forEach_1.setBegin(0);
    _jspx_th_c_forEach_1.setEnd(0);
    _jspx_th_c_forEach_1.setVarStatus("loop");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.ctHinhAnh}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("                             \r\n");
          out.write("\t\t\t\t\t\t\t                                      <img src= \"");
          if (_jspx_meth_c_url_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\" alt=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.tieuDe}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"lazyload\">\r\n");
          out.write("\t\t\t\t\t\t                                  \t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items_end_begin.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_url_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_url_1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/files/${itemimg.urlHinhAnh}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
    return false;
  }
}
