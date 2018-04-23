package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registrarse_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/3/w3.css\">\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("body {font-family: Arial, Helvetica, sans-serif;}\r\n");
      out.write("* {box-sizing: border-box}\r\n");
      out.write("\r\n");
      out.write("/* Full-width input fields */\r\n");
      out.write("input[type=text], input[type=password] {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    padding: 15px;\r\n");
      out.write("    margin: 5px 0 22px 0;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    border: none;\r\n");
      out.write("    background: #f1f1f1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=text]:focus, input[type=password]:focus {\r\n");
      out.write("    background-color: #ddd;\r\n");
      out.write("    outline: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("hr {\r\n");
      out.write("    border: 1px solid #f1f1f1;\r\n");
      out.write("    margin-bottom: 25px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Set a style for all buttons */\r\n");
      out.write("button {\r\n");
      out.write("    background-color: #4CAF50;\r\n");
      out.write("    color: white;\r\n");
      out.write("    padding: 14px 20px;\r\n");
      out.write("    margin: 8px 0;\r\n");
      out.write("    border: none;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    opacity: 0.9;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button:hover {\r\n");
      out.write("    opacity:1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Extra styles for the cancel button */\r\n");
      out.write(".cancelbtn {\r\n");
      out.write("    padding: 14px 20px;\r\n");
      out.write("    background-color: #f44336;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Float cancel and signup buttons and add an equal width */\r\n");
      out.write(".cancelbtn, .signupbtn {\r\n");
      out.write("  float: left;\r\n");
      out.write("  width: 50%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Add padding to container elements */\r\n");
      out.write(".container {\r\n");
      out.write("    padding: 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Clear floats */\r\n");
      out.write(".clearfix::after {\r\n");
      out.write("    content: \"\";\r\n");
      out.write("    clear: both;\r\n");
      out.write("    display: table;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Change styles for cancel button and signup button on extra small screens */\r\n");
      out.write("@media screen and (max-width: 300px) {\r\n");
      out.write("    .cancelbtn, .signupbtn {\r\n");
      out.write("       width: 100%;\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("* { box-sizing: border-box; }\r\n");
      out.write(".video-background {\r\n");
      out.write("  background: #000;\r\n");
      out.write("  position: fixed;\r\n");
      out.write("  top: 0; right: 0; bottom: 0; left: 0;\r\n");
      out.write("  z-index: -99;\r\n");
      out.write("}\r\n");
      out.write(".video-foreground,\r\n");
      out.write(".video-background iframe {\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  top: 0;\r\n");
      out.write("  left: 0;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  height: 100%;\r\n");
      out.write("  pointer-events: none;\r\n");
      out.write("}\r\n");
      out.write("#vidtop-content {\r\n");
      out.write("\ttop: 0;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("}\r\n");
      out.write(".vid-info { position: absolute; top: 0; right: 0; width: 33%; background: rgba(0,0,0,0.3); color: #fff; padding: 1rem; font-family: Avenir, Helvetica, sans-serif; }\r\n");
      out.write(".vid-info h1 { font-size: 2rem; font-weight: 700; margin-top: 0; line-height: 1.2; }\r\n");
      out.write(".vid-info a { display: block; color: #fff; text-decoration: none; background: rgba(0,0,0,0.5); transition: .6s background; border-bottom: none; margin: 1rem auto; text-align: center; }\r\n");
      out.write("@media (min-aspect-ratio: 16/9) {\r\n");
      out.write("  .video-foreground { height: 300%; top: -100%; }\r\n");
      out.write("}\r\n");
      out.write("@media (max-aspect-ratio: 16/9) {\r\n");
      out.write("  .video-foreground { width: 300%; left: -100%; }\r\n");
      out.write("}\r\n");
      out.write("@media all and (max-width: 600px) {\r\n");
      out.write(".vid-info { width: 50%; padding: .5rem; }\r\n");
      out.write(".vid-info h1 { margin-bottom: .2rem; }\r\n");
      out.write("}\r\n");
      out.write("@media all and (max-width: 500px) {\r\n");
      out.write(".vid-info .acronym { display: none; }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"w3-bar w3-black\">\r\n");
      out.write("  <a href=\"index.jsp\" class=\"w3-button w3-bar-item\">Inicio</a>\r\n");
      out.write("  <a href=\"Registrarse.jsp\" class=\"w3-button w3-bar-item\">Registrarse</a>\r\n");
      out.write("  <a href=\"ingresar.jsp\" class=\"w3-button w3-bar-item\">Ingresar</a>\r\n");
      out.write("  <a href=\"#contacto\" class=\"w3-button w3-bar-item\">Contacto</a>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"nuevousuario\" method = \"post\" >\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <h1>Sign Up</h1>\r\n");
      out.write("    <p>Please fill in this form to create an account.</p>\r\n");
      out.write("    <hr>\r\n");
      out.write("\r\n");
      out.write("    <label for=\"email\" style= \"color:white\"><b>Email</b></label>\r\n");
      out.write("    <input type=\"text\" id=\"txtusuario\" placeholder=\"Enter Email\"   name=\"email\"  required   >\r\n");
      out.write("\r\n");
      out.write("    <label for=\"psw\" style= \"color:white\"><b>Password </b> </label>\r\n");
      out.write("    <input type=\"password\" id=\"txtpassword1\" placeholder=\"Enter Password\"  name=\"psw\" required>\r\n");
      out.write("\r\n");
      out.write("    <label for=\"psw-repeat\" style= \"color:white\"><b>Repeat Password</b></label>\r\n");
      out.write("    <input type=\"password\" id=\"txtpassword2\" placeholder=\"Repeat Password\"  name=\"psw-repeat\" required>\r\n");
      out.write("    \r\n");
      out.write("    <label style= \"color:white\">\r\n");
      out.write("      <input type=\"checkbox\" checked=\"checked\" name=\"remember\" style=\"margin-bottom:15px\" > Remember me\r\n");
      out.write("    </label>\r\n");
      out.write("    \r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("    <div class=\"clearfix\">\r\n");
      out.write("      <button type=\"button\" class=\"cancelbtn\">Cancel</button>\r\n");
      out.write("      <button type=\"submit\" class=\"signupbtn\" id=\"btniniciar\">Sign Up</button>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</form>\r\n");
      out.write("<div class=\"video-background\">\r\n");
      out.write("    <div class=\"video-foreground\">\r\n");
      out.write("      <iframe src=\"https://www.youtube.com/embed/W0LHTWG-UmQ?controls=0&showinfo=0&rel=0&autoplay=1&loop=1&playlist=W0LHTWG-UmQ\" frameborder=\"0\" allowfullscreen></iframe>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
}
