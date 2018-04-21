package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/3/w3.css\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("* {box-sizing: border-box}\r\n");
      out.write("body {\r\n");
      out.write("font-family: Verdana, \r\n");
      out.write("sans-serif; \r\n");
      out.write("margin:0\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".mySlides img {\r\n");
      out.write("height: 400px;\r\n");
      out.write("width: 1000px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("img {vertical-align: middle;}\r\n");
      out.write("\r\n");
      out.write("/* Slideshow container */\r\n");
      out.write(".slideshow-container {\r\n");
      out.write("  max-width: 40%;\r\n");
      out.write("  position: relative;\r\n");
      out.write("  margin: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Next & previous buttons */\r\n");
      out.write(".prev, .next {\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  top: 50%;\r\n");
      out.write("  width: auto;\r\n");
      out.write("  padding: 16px;\r\n");
      out.write("  margin-top: -22px;\r\n");
      out.write("  color: white;\r\n");
      out.write("  font-weight: bold;\r\n");
      out.write("  font-size: 18px;\r\n");
      out.write("  transition: 0.6s ease;\r\n");
      out.write("  border-radius: 0 3px 3px 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Position the \"next button\" to the right */\r\n");
      out.write(".next {\r\n");
      out.write("  right: 0;\r\n");
      out.write("  border-radius: 3px 0 0 3px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* On hover, add a black background color with a little bit see-through */\r\n");
      out.write(".prev:hover, .next:hover {\r\n");
      out.write("  background-color: rgba(0,0,0,0.8);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Caption text */\r\n");
      out.write(".text {\r\n");
      out.write("  color: #f2f2f2;\r\n");
      out.write("  font-size: 15px;\r\n");
      out.write("  padding: 8px 12px;\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  bottom: 8px;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Number text (1/3 etc) */\r\n");
      out.write(".numbertext {\r\n");
      out.write("  color: #f2f2f2;\r\n");
      out.write("  font-size: 12px;\r\n");
      out.write("  padding: 8px 12px;\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  top: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* The dots/bullets/indicators */\r\n");
      out.write(".dot {\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("  height: 15px;\r\n");
      out.write("  width: 15px;\r\n");
      out.write("  margin: 0 2px;\r\n");
      out.write("  background-color: #bbb;\r\n");
      out.write("  border-radius: 50%;\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  transition: background-color 0.6s ease;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".active, .dot:hover {\r\n");
      out.write("  background-color: #717171;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Fading animation */\r\n");
      out.write(".fade {\r\n");
      out.write("  -webkit-animation-name: fade;\r\n");
      out.write("  -webkit-animation-duration: 1.5s;\r\n");
      out.write("  animation-name: fade;\r\n");
      out.write("  animation-duration: 1.5s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@-webkit-keyframes fade {\r\n");
      out.write("  from {opacity: .4} \r\n");
      out.write("  to {opacity: 1}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@keyframes fade {\r\n");
      out.write("  from {opacity: .4} \r\n");
      out.write("  to {opacity: 1}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* On smaller screens, decrease text size */\r\n");
      out.write("@media only screen and (max-width: 300px) {\r\n");
      out.write("  .prev, .next,.text {font-size: 11px}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("iframe {    \r\n");
      out.write("    display: block;\r\n");
      out.write("\tmargin-left: auto;\r\n");
      out.write("\tmargin-right: auto;\r\n");
      out.write("\twidth: 50%;\r\n");
      out.write("\theight: 400px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".clear {    \r\n");
      out.write("    clear:both;    \r\n");
      out.write("}\r\n");
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<nav class=\"w3-bar w3-black\">\r\n");
      out.write("  <a href=\"index.jsp\" class=\"w3-button w3-bar-item\">Inicio</a>\r\n");
      out.write("  <a href=\"Registrarse.jsp\" class=\"w3-button w3-bar-item\">Registrarse</a>\r\n");
      out.write("  <a href=\"ingresar.jsp\" class=\"w3-button w3-bar-item\">Ingresar</a>\r\n");
      out.write("  <a href=\"#contacto\" class=\"w3-button w3-bar-item\">Contacto</a>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<section class=\"w3-container w3-center\" >\r\n");
      out.write("  <h2 class=\"w3-wide\" style= \"color:white\">Financial Coach</h2>\r\n");
      out.write("  <p class=\"w3-opacity\"style= \"color:white\"><i>Tu bolsillo, nuestra preocupación</i></p>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<section class=\"w3-container w3-center\" >\r\n");
      out.write(" \r\n");
      out.write("  <h1 class=\"w3-wide\"style= \"color:white\"><i>¿ En que consiste Financial Coach ?</i></h1>\r\n");
      out.write("</section>\r\n");
      out.write("<div>\r\n");
      out.write("\r\n");
      out.write("<iframe width=\"480\" height=\"277\" src=\"https://www.youtube.com/embed/OmY4t4N7tVo\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"video-background\">\r\n");
      out.write("    <div class=\"video-foreground\">\r\n");
      out.write("      <iframe src=\"https://www.youtube.com/embed/W0LHTWG-UmQ?controls=0&showinfo=0&rel=0&autoplay=1&loop=1&playlist=W0LHTWG-UmQ\" frameborder=\"0\" allowfullscreen></iframe>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html> \r\n");
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
