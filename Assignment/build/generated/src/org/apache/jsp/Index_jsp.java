package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_submit_value_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_form_method_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_submit_value_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_form_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_submit_value_cssClass_nobody.release();
    _jspx_tagPool_s_form_method_action.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <title>Login Page</title>\n");
      out.write("       \t<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <!--Fontawesome CDN-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.3.1/css/all.css\" integrity=\"sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <!--Custom styles-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        html,body{\n");
      out.write("            /*            background-image: url('http://getwallpapers.com/wallpaper/full/a/5/d/544750.jpg');*/\n");
      out.write("            background-image: url(k.jpg);\n");
      out.write("            background-size: cover;\n");
      out.write("            background-repeat: no-repeat;\n");
      out.write("            height: 100%;\n");
      out.write("            font-family: 'Numans', sans-serif;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container{\n");
      out.write("            height: 100%;\n");
      out.write("            align-content: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .card{\n");
      out.write("            height: 370px;\n");
      out.write("            margin-top: auto;\n");
      out.write("            margin-bottom: auto;\n");
      out.write("            width: 400px;\n");
      out.write("            background-color: rgba(0,0,0,0.5) !important;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .social_icon span{\n");
      out.write("            font-size: 60px;\n");
      out.write("            margin-left: 10px;\n");
      out.write("            color: #FFC312;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .social_icon span:hover{\n");
      out.write("            color: white;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .card-header h3{\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .social_icon{\n");
      out.write("            position: absolute;\n");
      out.write("            right: 20px;\n");
      out.write("            top: -45px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .input-group-prepend span{\n");
      out.write("            width: 50px;\n");
      out.write("            background-color: #FFC312;\n");
      out.write("            color: black;\n");
      out.write("            border:0 !important;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input:focus{\n");
      out.write("            outline: 0 0 0 0  !important;\n");
      out.write("            box-shadow: 0 0 0 0 !important;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .remember{\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .remember input\n");
      out.write("        {\n");
      out.write("            width: 20px;\n");
      out.write("            height: 20px;\n");
      out.write("            margin-left: 15px;\n");
      out.write("            margin-right: 5px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .login_btn{\n");
      out.write("            color: black;\n");
      out.write("            background-color: #FFC312;\n");
      out.write("            width: 355px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .login_btn:hover{\n");
      out.write("            color: black;\n");
      out.write("            background-color: white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .links{\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .links a{\n");
      out.write("            margin-left: 4px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"d-flex justify-content-center h-100\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <div class=\"card-header\">\n");
      out.write("                        <h3>Sign In</h3>                        \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        ");
      if (_jspx_meth_s_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card-footer\">\n");
      out.write("                        <div class=\"d-flex justify-content-center\">\n");
      out.write("                            <a href=\"Password.jsp\">Forgot your password?</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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

  private boolean _jspx_meth_s_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_0 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_method_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_0.setPageContext(_jspx_page_context);
    _jspx_th_s_form_0.setParent(null);
    _jspx_th_s_form_0.setAction("login");
    _jspx_th_s_form_0.setMethod("POST");
    int _jspx_eval_s_form_0 = _jspx_th_s_form_0.doStartTag();
    if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                            <div class=\"input-group form-group\">\n");
        out.write("                                <div class=\"input-group-prepend\">\n");
        out.write("                                    <span class=\"input-group-text\"><i class=\"fas fa-user\"></i></span>\n");
        out.write("                                </div>\n");
        out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"username\" name=\"user\">\n");
        out.write("                            </div>\n");
        out.write("                            <div class=\"input-group form-group\">\n");
        out.write("                                <div class=\"input-group-prepend\">\n");
        out.write("                                    <span class=\"input-group-text\"><i class=\"fas fa-key\"></i></span>\n");
        out.write("                                </div>\n");
        out.write("                                <input type=\"password\" class=\"form-control\" placeholder=\"password\" name=\"pass\">\n");
        out.write("                            </div>\n");
        out.write("                            <div class=\"row align-items-center remember\">\n");
        out.write("                                <input type=\"checkbox\">Remember Me\n");
        out.write("                            </div>\n");
        out.write("                            <div class=\"form-group\">\n");
        out.write("                                ");
        if (_jspx_meth_s_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            </div>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_s_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_form_method_action.reuse(_jspx_th_s_form_0);
      return true;
    }
    _jspx_tagPool_s_form_method_action.reuse(_jspx_th_s_form_0);
    return false;
  }

  private boolean _jspx_meth_s_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_submit_0 = (org.apache.struts2.views.jsp.ui.SubmitTag) _jspx_tagPool_s_submit_value_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_s_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_submit_0.setCssClass("btn float-right login_btn");
    _jspx_th_s_submit_0.setValue("Login");
    int _jspx_eval_s_submit_0 = _jspx_th_s_submit_0.doStartTag();
    if (_jspx_th_s_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_submit_value_cssClass_nobody.reuse(_jspx_th_s_submit_0);
      return true;
    }
    _jspx_tagPool_s_submit_value_cssClass_nobody.reuse(_jspx_th_s_submit_0);
    return false;
  }
}
