/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.62
 * Generated at: 2015-10-30 01:19:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("\t\t<title>Projektledelse</title>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t<link type=\"text/css\" rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\"/>\n");
      out.write("    \t<link type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\" href=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\"/>\n");
      out.write("    \t\n");
      out.write("    \t\n");
      out.write("    \t<script src=\"");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("    \t<script src=\"");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("    \t<script src=\"");
      if (_jspx_meth_c_005furl_005f4(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("    \n");
      out.write("    \t<!-- Icon font -->\n");
      out.write("    \t<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("    \t<link href='https://fonts.googleapis.com/css?family=Roboto|Montserrat' rel='stylesheet' type='text/css'>\n");
      out.write("    \t\n");
      out.write("    \t<script type=\"text/javascript\">\n");
      out.write("        \t$( document ).ready(function(){\n");
      out.write("            \t$(\".button-collapse\").sideNav();\n");
      out.write("            \t\n");
      out.write("        \t\n");
      out.write("            \tif (location.search != '' ||  location.hash != '') {\n");
      out.write("            \t\t$( \"#welcomeLogin\" ).show();\n");
      out.write("            \t\t$(\"#background\").addClass(\"darker\");\n");
      out.write("            \t\t$( \"#welcomeText\" ).hide();\n");
      out.write("            \t}\n");
      out.write("            \t\n");
      out.write("            \t//Permite que a tela de login apareça ao recarregar a página em tamanho mobile\n");
      out.write("                if  ($(window).width() < 993) {\n");
      out.write("                   $(\"#background\").addClass(\"darker\");\n");
      out.write("                   $( \"#welcomeLogin\" ).show();\n");
      out.write("                }\n");
      out.write("            \t\n");
      out.write("            \t$(\"#getStarted\").click(function(){\n");
      out.write("                    $( \"#welcomeLogin\" ).show();\n");
      out.write("                    $( \"#welcomeText\" ).hide();\n");
      out.write("                    $(\"#background\").addClass(\"darker\");\n");
      out.write("                    $(this).data('clicked', true);\n");
      out.write("                });\n");
      out.write("            \t\n");
      out.write("            \t//Responsavel pela mudança de brightness no background e\n");
      out.write("                //do texto que deve aparecer na tela\n");
      out.write("                $(window).resize(function() {\n");
      out.write("                  if ($(window).width() < 993) {\n");
      out.write("                    $(\"#background\").addClass(\"darker\");\n");
      out.write("                    $( \"#welcomeLogin\" ).show();\n");
      out.write("                  }\n");
      out.write("                  else {\n");
      out.write("                    \tif ($('#welcomeLogin').is(':visible') && $(\"#getStarted\").data('clicked')){\n");
      out.write("                       \t\t$( \"#welcomeText\" ).hide();\n");
      out.write("                     \t}\n");
      out.write("                    \telse {\n");
      out.write("                    \t\tif (location.search != '' ||  location.hash != '') {\n");
      out.write("           \n");
      out.write("                    \t\t}\n");
      out.write("                    \t\telse {\n");
      out.write("                    \t\t\t$( \"#welcomeLogin\" ).hide();\n");
      out.write("                            \t$(\"#background\").removeClass(\"darker\");\n");
      out.write("                            \t$( \"#welcomeText\" ).show();\n");
      out.write("                    \t\t}  \n");
      out.write("                   \t\t}\n");
      out.write("                  \t}\n");
      out.write("                });\n");
      out.write("            \t\n");
      out.write("        \t});\n");
      out.write("    \t</script>\n");
      out.write(" \n");
      out.write("\t</head>\n");
      out.write("\n");
      out.write("\t<body>\n");
      out.write("\t\n");
      out.write("\t");
      if (_jspx_meth_c_005furl_005f5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    <div class=\"login-layout-transparent\">\n");
      out.write("      <!-- background -->\n");
      out.write("      <div class=\"bg\" id=\"background\"></div>\n");
      out.write("      \n");
      out.write("      <!-- Navigation Menu-->\n");
      out.write("      <nav>\n");
      out.write("        <div class=\"nav-wrapper\">\n");
      out.write("          <a href=\"#\" data-activates=\"mobile-demo\" class=\"button-collapse\"><i class=\"material-icons\">menu</i></a>\n");
      out.write("          <ul class=\"right hide-on-med-and-down\">\n");
      out.write("            <li><a href=\"#\">Home</a></li>\n");
      out.write("            <li><a href=\"#\">About us</a></li>\n");
      out.write("            <li><a href=\"#\">Portfolio</a></li>\n");
      out.write("            <li><a href=\"#\">Contact</a></li>\n");
      out.write("          </ul>\n");
      out.write("          <ul class=\"side-nav\" id=\"mobile-demo\">\n");
      out.write("            <li><a href=\"sass.html\">Home</a></li>\n");
      out.write("            <li><a href=\"badges.html\">About us</a></li>\n");
      out.write("            <li><a href=\"collapsible.html\">Portfolio</a></li>\n");
      out.write("            <li><a href=\"mobile.html\">Contact</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("      \n");
      out.write("      <!-- Middle page -->\n");
      out.write("      <div class=\"container\">\n");
      out.write("\n");
      out.write("        <!-- Icon/form Section -->\n");
      out.write("        <div class=\"section\">\n");
      out.write("        \t\n");
      out.write("        \t<!-- Icon -->\n");
      out.write("          \t<div class=\"row center\">\n");
      out.write("            \t<div class=\"col s12\">\n");
      out.write("              \t\t<div class=\"valign-wrapper\">\n");
      out.write("                \t\t<div class=\"intro_bg\"></div>\n");
      out.write("              \t\t</div>\n");
      out.write("            \t</div>\n");
      out.write("          \t</div>\n");
      out.write("          \t\n");
      out.write("          \t<!-- Welcome Text -->\n");
      out.write("          \t<div class=\"hide-on-med-and-down\" id=\"welcomeText\">\n");
      out.write("            \t<div class=\"row center\">\n");
      out.write("              \t\t<div class=\"col s12\">\n");
      out.write("                  \t\t<div class=\"valign-wrapper\">\n");
      out.write("                    \t\t<div class=\"form_welcome\">\n");
      out.write("                      \t\t\t<h3 id=\"text_welcome\" >\n");
      out.write("                        \t\tSpread the word about <br>\n");
      out.write("                        \t\t<span> Projektledelse Live! </span>\n");
      out.write("                      \t\t\t</h3>\n");
      out.write("                    \t\t</div>\n");
      out.write("                  \t\t</div>\n");
      out.write("                \t</div>\n");
      out.write("              \t</div>\n");
      out.write("         \t\n");
      out.write("              \t<div class=\"row center\">\n");
      out.write("                \t<div class=\"col s12\">\n");
      out.write("                \t\t<div class=\"absolute\">\n");
      out.write("                  \t\t<a href=\"#\" id=\"getStarted\" class=\"btn-large larger waves-effect waves-light blue\">Get Started</a>\n");
      out.write("                  \t\t</div>\n");
      out.write("                \t</div>\n");
      out.write("              \t</div>\n");
      out.write("              \t<!-- Fake Form -->\n");
      out.write("              \t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" method=\"post\">\n");
      out.write("              \t\t<input type=\"hidden\"  id=\"username\" name=\"ssoId\" placeholder=\"Enter Username\" required>\n");
      out.write("\t\t\t\t\t<input type=\"hidden\"  id=\"password\" name=\"password\" placeholder=\"Enter Password\" required>\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.parameterName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.token}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" />\n");
      out.write("              \t</form>\n");
      out.write("          \t</div>\n");
      out.write("          \t\n");
      out.write("          \t<!-- Login -->\n");
      out.write("          \t<div class=\"welcomeLogin\" id=\"welcomeLogin\">\n");
      out.write("          \t\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" method=\"post\">\n");
      out.write("\t            \t<div class=\"row center\">\n");
      out.write("\t                \t\t<div class=\"valign-wrapper\">\n");
      out.write("\t                  \t\t\t<div class=\"form_welcome\">\n");
      out.write("\t                    \t\t\t<div class=\"input-field invalid white-text col s12\">\n");
      out.write("\t                    \t\t\t\t<div class=\"material-icons prefix_login\">account_circle</div>\n");
      out.write("\t                      \t\t\t\t");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t                    \t\t\t</div>\n");
      out.write("\t                    \t\t\t<div class=\"input-field white-text col s12\">\n");
      out.write("\t                      \t\t\t\t<i class=\"material-icons prefix_login\">lock_outline</i>\n");
      out.write("\t   \t\t\t\t\t\t\t\t\t\t\t<input type=\"password\" id=\"password\" name=\"password\" placeholder=\"Password\" class=\"validate\">\n");
      out.write("\t  \t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.parameterName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.token}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" />\n");
      out.write("\t                    \t\t\t</div>\n");
      out.write("\t                  \t\t\t</div>\n");
      out.write("\t                \t\t</div>\n");
      out.write("\t            \t</div>\n");
      out.write("\n");
      out.write("\t            \t<div class=\"row center\">\n");
      out.write("\t              \t\t<div class=\"col s12\">\n");
      out.write("\t              \t\t\t<div class=\"absolute\">\n");
      out.write("\t              \t\t\t\t<button id=\"login\" type=\"submit\" class=\"btn-large larger waves-effect waves-light blue\"  name=\"action\">\n");
      out.write("\t                \t\t\tLogin\n");
      out.write("\t                \t\t\t</button>\n");
      out.write("\t              \t\t\t</div>\n");
      out.write("\t                \t\t\n");
      out.write("\t              \t\t</div>\n");
      out.write("\t            \t</div>\n");
      out.write("            \t</form>\n");
      out.write("        \t</div>\n");
      out.write("        \t\n");
      out.write("\t  <!-- Fim da Section -->\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    <!-- Fim do Container -->\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <!-- Fim da página  -->\n");
      out.write("    </div>\n");
      out.write("      \n");
      out.write("\t</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/views/login.jsp(9,47) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/static/css/material.css");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent(null);
    // /WEB-INF/views/login.jsp(10,76) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("/static/css/materialize.css");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f2.setParent(null);
    // /WEB-INF/views/login.jsp(13,18) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f2.setValue("/static/js/jquery-2.1.4.min.js");
    int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
    if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f3.setParent(null);
    // /WEB-INF/views/login.jsp(14,18) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f3.setValue("/static/js/materialize.min.js");
    int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
    if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f4.setParent(null);
    // /WEB-INF/views/login.jsp(15,18) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f4.setValue("/static/js/material.min.js");
    int _jspx_eval_c_005furl_005f4 = _jspx_th_c_005furl_005f4.doStartTag();
    if (_jspx_th_c_005furl_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f5(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f5.setParent(null);
    // /WEB-INF/views/login.jsp(76,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f5.setVar("loginUrl");
    // /WEB-INF/views/login.jsp(76,1) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f5.setValue("/login");
    int _jspx_eval_c_005furl_005f5 = _jspx_th_c_005furl_005f5.doStartTag();
    if (_jspx_th_c_005furl_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent(null);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t  \t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t  \t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /WEB-INF/views/login.jsp(154,13) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.error != null}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t  \t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"username\" name=\"ssoId\" placeholder=\"Wrong Username or Password\" \n");
        out.write("\t  \t\t\t\t\t\t\t\t\t\t\tclass=\"invalid\">\n");
        out.write("\t  \t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t   \t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"username\" name=\"ssoId\" placeholder=\"Username\" class=\"validate\">\n");
        out.write("\t  \t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }
}
