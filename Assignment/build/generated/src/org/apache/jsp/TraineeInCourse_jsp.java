package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TraineeInCourse_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Header.jsp");
    _jspx_dependants.add("/Footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_form_method_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_property_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_form_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_property_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_s_form_method_action.release();
    _jspx_tagPool_s_property_value_nobody.release();
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

      out.write('\n');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Lato:300,400,700,900\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.2.0/css/all.css\" integrity=\"sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ\"\r\n");
      out.write("              crossorigin=\"anonymous\">\r\n");
      out.write("        <title>TRAINING MANAGEMENT SYSTEM</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <script>\r\n");
      out.write("        function confirmDel() {\r\n");
      out.write("            var x = confirm(\"Are you sure to delete this item?\");\r\n");
      out.write("            if (x) {\r\n");
      out.write("                return true;\r\n");
      out.write("            }\r\n");
      out.write("            else\r\n");
      out.write("                return false;\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("    <style>\r\n");
      out.write("        body{\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            background-color: white;\r\n");
      out.write("            background-size: contain;\r\n");
      out.write("            background-position: center;\r\n");
      out.write("            font-family: sans-serif;\r\n");
      out.write("            overflow-x: hidden;\r\n");
      out.write("            overflow-y: scroll;\r\n");
      out.write("            color: white;\r\n");
      out.write("            /*background-image: url('http://getwallpapers.com/wallpaper/full/a/5/d/544750.jpg');*/\r\n");
      out.write("        }\r\n");
      out.write("        ::-webkit-scrollbar { \r\n");
      out.write("            display: none; \r\n");
      out.write("        }\r\n");
      out.write("        header, footer {\r\n");
      out.write("            padding: 1em;\r\n");
      out.write("            color: white;\r\n");
      out.write("            background-color: black;\r\n");
      out.write("            clear: left;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("        ul#menu, ul#menu ul#sub{\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        ul#menu li{\r\n");
      out.write("            list-style-type: none;\r\n");
      out.write("            float: left;\r\n");
      out.write("            margin-right: 10px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        ul#menu li a{\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            background-color: transparent;\r\n");
      out.write("            padding: 5px;\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        ul#menu li a:hover{\r\n");
      out.write("            background-color: transparent;\r\n");
      out.write("            color: aqua;\r\n");
      out.write("            font-size: 15px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        ul#menu li ul#sub li a:hover{\r\n");
      out.write("            background-color: transparent;\r\n");
      out.write("            color: aqua;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .logo{\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            background-position: center;\r\n");
      out.write("            font-family: sans-serif;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        ul#prof, ul#prof ul#subP{\r\n");
      out.write("            padding: 17px 0 0 0;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        ul#prof li{\r\n");
      out.write("            list-style-type: none;\r\n");
      out.write("            float: right;\r\n");
      out.write("            margin-right: 10px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        ul#prof li a{\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            background-color: transparent;\r\n");
      out.write("            padding: 5px;\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        ul#prof li a:hover{\r\n");
      out.write("            background-color: transparent;\r\n");
      out.write("            color: aquamarine;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        ul#prof li{\r\n");
      out.write("            position: relative;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        ul#prof li ul#subP{\r\n");
      out.write("            display: none;\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            width: 150px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        ul#prof li ul#subP li{\r\n");
      out.write("            margin-top: 10px;\r\n");
      out.write("            margin-bottom: 5px;            \r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        ul#prof li:hover ul#subP{\r\n");
      out.write("            display: block;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        ul#prof li ul#subP li a:hover {\r\n");
      out.write("            background-color: gray;            \r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        ul#prof li ul#subP li{\r\n");
      out.write("            float: left;\r\n");
      out.write("        }\r\n");
      out.write("        ul#prof li ul#subP a{\r\n");
      out.write("            color: black;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .Cdetails{\r\n");
      out.write("            width: 60%; \r\n");
      out.write("            height: auto; \r\n");
      out.write("            margin: auto;\r\n");
      out.write("            padding:15px;\r\n");
      out.write("            color: black;\r\n");
      out.write("            border: solid black 1px;\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .Cdetails .courDetails{\r\n");
      out.write("            text-align: left;\r\n");
      out.write("            color: black;\r\n");
      out.write("        }\r\n");
      out.write("        .Cdetails .courDetails tr td{\r\n");
      out.write("            padding: 5px;\r\n");
      out.write("        }\r\n");
      out.write("        #btnAdd{\r\n");
      out.write("            width: 70px;\r\n");
      out.write("            float: right;\r\n");
      out.write("            height: 40px;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            color: black;\r\n");
      out.write("            background-color: greenyellow;\r\n");
      out.write("            padding: 5px;\r\n");
      out.write("            border: 0;\r\n");
      out.write("            margin: 5px;\r\n");
      out.write("        }\r\n");
      out.write("        #btnUpdate{\r\n");
      out.write("            width: 70px;\r\n");
      out.write("            float: right;\r\n");
      out.write("            height: 40px;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            color: black;\r\n");
      out.write("            background-color: #ffc107;\r\n");
      out.write("            padding: 5px;\r\n");
      out.write("            border: 0;\r\n");
      out.write("            margin: 5px;\r\n");
      out.write("        }\r\n");
      out.write("        #btnDel{\r\n");
      out.write("            width: 70px;\r\n");
      out.write("            float: right;\r\n");
      out.write("            height: 40px;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            color: black;\r\n");
      out.write("            background-color: #ff3366;\r\n");
      out.write("            padding: 5px;\r\n");
      out.write("            border: 0;\r\n");
      out.write("            margin: 5px;\r\n");
      out.write("        }\r\n");
      out.write("        #btnAssign{\r\n");
      out.write("            width: 70px;\r\n");
      out.write("            float: right;\r\n");
      out.write("            height: 40px;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            color: black;\r\n");
      out.write("            background-color: #3366ff;\r\n");
      out.write("            padding: 5px;\r\n");
      out.write("            border: 0;\r\n");
      out.write("            margin: 5px;\r\n");
      out.write("        }\r\n");
      out.write("        table{\r\n");
      out.write("            width: 65%;\r\n");
      out.write("            margin: auto;\r\n");
      out.write("            color: black;\r\n");
      out.write("            /*background-color: teal;*/\r\n");
      out.write("            /*opacity: 0.7;*/\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("        table .search_input, input[type=\"submit\"]{\r\n");
      out.write("            float: right;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .addCourse{\r\n");
      out.write("            padding-left: 20px;\r\n");
      out.write("            padding-right: 15px;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: auto;\r\n");
      out.write("            margin: auto;\r\n");
      out.write("            color: black;\r\n");
      out.write("            text-align: left;\r\n");
      out.write("        }\r\n");
      out.write("        .addCourse select{\r\n");
      out.write("            width: 99.5%;\r\n");
      out.write("        }\r\n");
      out.write("        .addCourse input[type=text], select, textarea, input[type=date]{\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            padding: 12px 20px;\r\n");
      out.write("            margin: 8px 0;\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("            border: 1px solid #e9d8f4;\r\n");
      out.write("            -webkit-transition: 0.5s;\r\n");
      out.write("            transition: 0.5s;\r\n");
      out.write("            outline: none;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .addCourse input[type=text]:focus {\r\n");
      out.write("            border: 1px solid #58257b;\r\n");
      out.write("        }\r\n");
      out.write("        h1{\r\n");
      out.write("            color: black;\r\n");
      out.write("            font-family: Aria;\r\n");
      out.write("        }\r\n");
      out.write("        .search_input{\r\n");
      out.write("            width: 30%;\r\n");
      out.write("            padding: 10px; \r\n");
      out.write("            margin: 5px\r\n");
      out.write("        }\r\n");
      out.write("        button{\r\n");
      out.write("            float: right; margin: 5px; padding: 10px; margin-right: -5.5px;\r\n");
      out.write("        }\r\n");
      out.write("    </style>   \r\n");
      out.write("    <style>\r\n");
      out.write("        #add{\r\n");
      out.write("            color: blue;\r\n");
      out.write("            font-size: 20px;\r\n");
      out.write("            width: auto;\r\n");
      out.write("            height: auto;\r\n");
      out.write("            margin: 5px;\r\n");
      out.write("        }\r\n");
      out.write("        #delete{\r\n");
      out.write("            color: #ff3366;\r\n");
      out.write("            font-size: 20px;\r\n");
      out.write("            width: auto;\r\n");
      out.write("            height: auto;\r\n");
      out.write("            margin: 5px;\r\n");
      out.write("        }\r\n");
      out.write("        #edit{\r\n");
      out.write("            color: #fd7522;\r\n");
      out.write("            font-size: 20px;\r\n");
      out.write("            width: auto;\r\n");
      out.write("            height: auto;\r\n");
      out.write("            margin: 5px;\r\n");
      out.write("        }\r\n");
      out.write("        #view{\r\n");
      out.write("            color: #ff00ff;\r\n");
      out.write("            font-size: 20px;\r\n");
      out.write("            width: auto;\r\n");
      out.write("            height: auto;\r\n");
      out.write("            margin: 5px;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("    <style>\r\n");
      out.write("        .content a i{\r\n");
      out.write("            font-size: 20px;\r\n");
      out.write("        }\r\n");
      out.write("        .content a i:hover{\r\n");
      out.write("            color: aqua;\r\n");
      out.write("            font-size: 19px;\r\n");
      out.write("        }\r\n");
      out.write("        .content{\r\n");
      out.write("            float: right;\r\n");
      out.write("            width: 30%;\r\n");
      out.write("            height: 50%;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("        }\r\n");
      out.write("        .content ul{\r\n");
      out.write("            list-style: none;\r\n");
      out.write("        }\r\n");
      out.write("        .content ul li{\r\n");
      out.write("            float: left;\r\n");
      out.write("            margin-right: 20px;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("    <body>    \r\n");
      out.write("        <div style=\"width: 100%; height: 50px; background-color: #fd7522\" class=\"bar-head\">\r\n");
      out.write("            <div class=\"content\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"#\" style=\"color: white\"><i class=\"far fa-comments\"> Chat</i></a></li>\r\n");
      out.write("                    <li><a href=\"mailto:%20btec.hn@fpt.edu.vn\" style=\"color: white\"><i class=\"far fa-envelope\"> Email:</i>&nbsp;btec.hn@fpt.edu.vn</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div style=\"width: 100%; height: 120px; background-color: white;\" class=\"logo\">\r\n");
      out.write("            <div style=\"width: 50%; height: 50px; float: left; padding-left: 100px\"><img src=\"btec.png\" style=\"width: 200px;\"/></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div style=\"width: 100%; height: 50px; background-color: #fd7522\">\r\n");
      out.write("            <div class=\"left-menu\" style=\"width: 40%; float: left; background-color:transparent; padding-left: 100px\">\r\n");
      out.write("                <ul id=\"menu\" style=\"color: black\">\r\n");
      out.write("                    <li><p><a href=\"IndexCourse.jsp\">Course</a>|</p></li>\r\n");
      out.write("                    <li><p><a href=\"IndexTopic.jsp\">Topic</a>|</p></li>\r\n");
      out.write("                    <li><p><a href=\"IndexCate.jsp\">Category</a>|</p></li>\r\n");
      out.write("                    <li><p><a href=\"IndexAccount.jsp\">Account</a>|</p></li>                    \r\n");
      out.write("                    <li><p><a href=\"IndexTrainer.jsp\">Trainer</a>|</p></li>                    \r\n");
      out.write("                    <li><p><a href=\"IndexTrainee.jsp\">Trainee</a></p></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"right-menu\" style=\"width: 30%; height: 100%; float: right; padding-right: 50px\">\r\n");
      out.write("                <ul id=\"prof\">\r\n");
      out.write("                    <li><a href=\"\">Hello, Admin");
      if (_jspx_meth_s_property_0(_jspx_page_context))
        return;
      out.write("</a>\r\n");
      out.write("                        <ul id=\"subP\" style=\"width: auto\">\r\n");
      out.write("                            <li><a href=\"\">Profile</a></li>\r\n");
      out.write("                            <li><a href=\"Index.jsp\">Sign out</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div style=\"width: 100%; height: auto\">\r\n");
      out.write("\n");
      out.write("<div class=\"Cdetails\" style=\"margin-top: 50px; margin-bottom: 100px\">\n");
      out.write("    <h1 style=\"text-align: center\">Assign Trainee</h1>\n");
      out.write("    ");
      if (_jspx_meth_s_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<div class=\"footer\">\n");
      out.write("    <div class=\"content-footer\">\n");
      out.write("        <div class=\"hanoi\">\n");
      out.write("            <div class=\"left-col span3\"><h3>HA NOI</h3><p></p><p>2 Floor, Detech Tower II, 107 Nguyen Phong Sac, Cau Giay, Hanoi</p><p>Phone:&nbsp;<a>0981 090 513</a></p><p>Email:&nbsp;<a href=\"mailto:%20btec.hn@fpt.edu.vn\">btec.hn@fpt.edu.vn</a></p><p>Hotline:&nbsp;<a>0981 090 513</a></p><br></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"danang\">\n");
      out.write("            <div class=\"left-col span3\" id=\"yui_3_17_2_1_15906062732100_56\"><h3>DA NANG</h3><p></p><p>66B Vo Van Tan, Thanh Khe District, Da Nang City (Savico Building)</p><p id=\"yui_3_17_2_1_15906062732100_60\">Phone:&nbsp;<a id=\"yui_3_17_2_1_15906062732100_61\">0236 730 9268</a></p><p>Email:&nbsp;<a href=\"mailto:%20btec.dn@fpt.edu.vn\">btec.dn@fpt.edu.vn</a></p><p>Hotline:&nbsp;<a>0905 888 535</a></p><br></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"HCM\">\n");
      out.write("            <div class=\"left-col span3\"><h3>TP. HO CHI MINH</h3><p></p><p>275 Nguyen Van Dau - Binh Thanh District - Ho Chi Minh City</p><p>Phone:&nbsp;<a>028 7300 9268</a></p><p>Email:&nbsp;<a href=\"mailto:%20btec.hcm@fpt.edu.vn\">btec.hcm@fpt.edu.vn</a></p><p>Hotline:&nbsp;<a>028 7300 9268</a>&nbsp;/&nbsp;<a>0942 25 68 25</a></p><br></div>\n");
      out.write("        </div>        \n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<style>\n");
      out.write("    .footer{\n");
      out.write("        width: 100%; height: 250px; background-color: #fd7522; padding: 0;\n");
      out.write("    }\n");
      out.write("    .footer .content-footer{\n");
      out.write("        width: 100%;\n");
      out.write("        background-color: transparent;\n");
      out.write("        padding-left: 20px;\n");
      out.write("    }\n");
      out.write("    .footer .content-footer .hanoi{\n");
      out.write("        width: 30%; height: 100%; background-color: transparent; float: left;\n");
      out.write("        margin-right: 50px;\n");
      out.write("    }\n");
      out.write("    .footer .content-footer .danang{\n");
      out.write("        width: 30%; height: 100%; background-color: transparent; float: left;\n");
      out.write("        margin-right: 50px;\n");
      out.write("    }\n");
      out.write("    .footer .content-footer .HCM{\n");
      out.write("        width: 30%; height: 100%; background-color: transparent; float: left;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write('\n');
      out.write('\n');
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

  private boolean _jspx_meth_s_property_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_0 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_0.setPageContext(_jspx_page_context);
    _jspx_th_s_property_0.setParent(null);
    _jspx_th_s_property_0.setValue("%{session.Admin}");
    int _jspx_eval_s_property_0 = _jspx_th_s_property_0.doStartTag();
    if (_jspx_th_s_property_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
    return false;
  }

  private boolean _jspx_meth_s_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpSession session = _jspx_page_context.getSession();
    ServletContext application = _jspx_page_context.getServletContext();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_0 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_method_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_0.setPageContext(_jspx_page_context);
    _jspx_th_s_form_0.setParent(null);
    _jspx_th_s_form_0.setAction("AssignTraineeToCourse");
    _jspx_th_s_form_0.setMethod("POST");
    int _jspx_eval_s_form_0 = _jspx_th_s_form_0.doStartTag();
    if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_0.doInitBody();
      }
      do {
        out.write("           \n");
        out.write("        <p>Course</p> \n");
        out.write("        ");
        Model.UpdateProcess mrCourse = null;
        synchronized (session) {
          mrCourse = (Model.UpdateProcess) _jspx_page_context.getAttribute("mrCourse", PageContext.SESSION_SCOPE);
          if (mrCourse == null){
            mrCourse = new Model.UpdateProcess();
            _jspx_page_context.setAttribute("mrCourse", mrCourse, PageContext.SESSION_SCOPE);
          }
        }
        out.write("\n");
        out.write("        <select class=\"put\" name=\"courseId\">\n");
        out.write("            ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        </select>\n");
        out.write("        <p>Trainee</p> \n");
        out.write("        <select class=\"put\" name=\"traineeId\">\n");
        out.write("            ");
        if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        </select>\n");
        out.write("        <input value=\"Assign\" type=\"submit\" id=\"btnAdd\"/>\n");
        out.write("    ");
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

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_c_forEach_0.setVar("t");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mrCourse.courseList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("            ");
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
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_c_forEach_1.setVar("t");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mrCourse.trainee}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.traineeId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.traineeName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("            ");
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
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
