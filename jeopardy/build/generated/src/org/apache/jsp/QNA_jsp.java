package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import LoginBean.Question;

public final class QNA_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"QNA.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
Question s = (Question)request.getAttribute("correctQuestion"); 
      out.write("\n");
      out.write("        <fieldset style = \"width: 500px; margin:0px auto; border-color: red;border-radius: 10px;\">\n");
      out.write("            \n");
      out.write("            <legend style=\"font-family: Monotype Corsiva; font-size: 35px; color: black; \">");
      out.print(s.getCategory());
      out.write("</legend>\n");
      out.write("            <p>Value: $");
      out.print(s.getValue());
      out.write("</p>\n");
      out.write("            <p>Q1: ");
      out.print(s.getQuestion());
      out.write("</p>\n");
      out.write("            \n");
      out.write("            <form action=\"game\" method=\"POST\">\n");
      out.write("                <input type=\"radio\" name=\"answer\" value=\"");
      out.print(s.getAnswer1());
      out.write('"');
      out.write('>');
      out.print(s.getAnswer1());
      out.write(" <br>\n");
      out.write("                <input type=\"radio\" name=\"answer\" value=\"");
      out.print(s.getAnswer2());
      out.write('"');
      out.write('>');
      out.print(s.getAnswer2());
      out.write("<br>\n");
      out.write("                <input type=\"radio\" name=\"answer\" value=\"");
      out.print(s.getAnswer3());
      out.write('"');
      out.write('>');
      out.print(s.getAnswer3());
      out.write("<br>\n");
      out.write("                <input type=\"radio\" name=\"answer\" value=\"");
      out.print(s.getAnswer4());
      out.write('"');
      out.write('>');
      out.print(s.getAnswer4());
      out.write("\n");
      out.write("                <button type=\"submit\" name=\"button\" style=\"float: left;\" value=\"skip\">Skip</button>\n");
      out.write("                <button type=\"submit\" name=\"button\" style=\"float: right;\" value=\"Submit\">Submit</button>\n");
      out.write("            </form>\n");
      out.write("        </fieldset>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
