package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import LoginBean.login;

public final class questionGrid_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Question Page</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"question.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div style=\"clear: both\">\n");
      out.write("            ");
 login name = (login) session.getAttribute("player");
      out.write("\n");
      out.write("            \n");
      out.write("            ");
 String dis0 = (String) session.getAttribute("b0"); 
      out.write("\n");
      out.write("            ");
 String dis1 = (String) session.getAttribute("b1"); 
      out.write("\n");
      out.write("            ");
 String dis2 = (String) session.getAttribute("b2"); 
      out.write("\n");
      out.write("            ");
 String dis3 = (String) session.getAttribute("b3"); 
      out.write("\n");
      out.write("            ");
 String dis4 = (String) session.getAttribute("b4"); 
      out.write("\n");
      out.write("            ");
 String dis5 = (String) session.getAttribute("b5"); 
      out.write("\n");
      out.write("            ");
 String dis6 = (String) session.getAttribute("b6"); 
      out.write("\n");
      out.write("            ");
 String dis7 = (String) session.getAttribute("b7"); 
      out.write("\n");
      out.write("            ");
 String dis8 = (String) session.getAttribute("b8"); 
      out.write("\n");
      out.write("            ");
 String dis9 = (String) session.getAttribute("b9"); 
      out.write("\n");
      out.write("            ");
 String dis10 = (String) session.getAttribute("b10"); 
      out.write("\n");
      out.write("            ");
 String dis11 = (String) session.getAttribute("b11"); 
      out.write("\n");
      out.write("            ");
 String dis12 = (String) session.getAttribute("b12"); 
      out.write("\n");
      out.write("            ");
 String dis13 = (String) session.getAttribute("b13"); 
      out.write("\n");
      out.write("            ");
 String dis14 = (String) session.getAttribute("b14"); 
      out.write("\n");
      out.write("            ");
 String dis15 = (String) session.getAttribute("b15"); 
      out.write("\n");
      out.write("            ");
 String dis16 = (String) session.getAttribute("b16"); 
      out.write("\n");
      out.write("            ");
 String dis17 = (String) session.getAttribute("b17"); 
      out.write("\n");
      out.write("            ");
 String dis18 = (String) session.getAttribute("b18"); 
      out.write("\n");
      out.write("            ");
 String dis19 = (String) session.getAttribute("b19"); 
      out.write("\n");
      out.write("            ");
 String dis20 = (String) session.getAttribute("b20"); 
      out.write("\n");
      out.write("            ");
 String dis21 = (String) session.getAttribute("b21"); 
      out.write("\n");
      out.write("            ");
 String dis22 = (String) session.getAttribute("b22"); 
      out.write("\n");
      out.write("            ");
 String dis23 = (String) session.getAttribute("b23"); 
      out.write("\n");
      out.write("            ");
 String dis24 = (String) session.getAttribute("b24"); 
      out.write("\n");
      out.write("            \n");
      out.write("            <h1 style=\"float: left\">Name: ");
      out.print( name.getName());
      out.write("</h1>\n");
      out.write("            <h2 style=\"float: right\">Winnings: $");
      out.print( name.getScore());
      out.write("</h2>\n");
      out.write("        </div>\n");
      out.write("        <form action=\"Question\" method=\"POST\">\n");
      out.write("            <table style=\"width:100%\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>Computer</th>\n");
      out.write("                    <th>Earth</th>\n");
      out.write("                    <th>Plants</th>\n");
      out.write("                    <th>Games</th>\n");
      out.write("                    <th>Human Body</th>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><button type=\"submit\" value=\"0\" name=\"1\" ");
      out.print( dis0);
      out.write(">$100</button></td>\n");
      out.write("                    <td><button type=\"submit\" value=\"5\" name=\"1\" ");
      out.print( dis5);
      out.write(">$100</button></td>\n");
      out.write("                    <td><button type=\"submit\" value=\"10\" name=\"1\" ");
      out.print( dis10);
      out.write(">$100</button></td>\n");
      out.write("                    <td><button type=\"submit\" value=\"15\" name=\"1\" ");
      out.print( dis15);
      out.write(">$100</button></td>\n");
      out.write("                    <td><button type=\"submit\" value=\"20\" name=\"1\" ");
      out.print( dis20);
      out.write(">$100</button></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><button type=\"submit\" value=\"1\" name=\"1\" ");
      out.print( dis1);
      out.write(">$200</button></td>\n");
      out.write("                    <td><button type=\"submit\" value=\"6\" name=\"1\" ");
      out.print( dis6);
      out.write(">$200</button></td>\n");
      out.write("                    <td><button type=\"submit\" value=\"11\" name=\"1\" ");
      out.print( dis11);
      out.write(">$200</button></td>\n");
      out.write("                    <td><button type=\"submit\" value=\"16\" name=\"1\" ");
      out.print( dis16);
      out.write(">$200</button></td>\n");
      out.write("                    <td><button type=\"submit\" value=\"21\" name=\"1\" ");
      out.print( dis21);
      out.write(">$200</button></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><button type=\"submit\" value=\"2\" name=\"1\" ");
      out.print( dis2);
      out.write(">$300</button></td>\n");
      out.write("                    <td><button type=\"submit\" value=\"7\" name=\"1\" ");
      out.print( dis7);
      out.write(">$300</button></td>\n");
      out.write("                    <td><button type=\"submit\" value=\"12\" name=\"1\" ");
      out.print( dis12);
      out.write(">$300</button></td>\n");
      out.write("                    <td><button type=\"submit\" value=\"17\" name=\"1\" ");
      out.print( dis17);
      out.write(">$300</button></td>\n");
      out.write("                    <td><button type=\"submit\" value=\"22\" name=\"1\" ");
      out.print( dis22);
      out.write(">$300</button></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><button type=\"submit\" value=\"3\" name=\"1\" ");
      out.print( dis3);
      out.write(">$400</button></td>\n");
      out.write("                    <td><button type=\"submit\" value=\"8\" name=\"1\" ");
      out.print( dis8);
      out.write(">$400</button></td>\n");
      out.write("                    <td><button type=\"submit\" value=\"13\" name=\"1\" ");
      out.print( dis13);
      out.write(">$400</button></td>\n");
      out.write("                    <td><button type=\"submit\" value=\"18\" name=\"1\" ");
      out.print( dis18);
      out.write(">$400</button></td>\n");
      out.write("                    <td><button type=\"submit\" value=\"23\" name=\"1\" ");
      out.print( dis23);
      out.write(">$400</button></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><button type=\"submit\" value=\"4\" name=\"1\" ");
      out.print( dis4);
      out.write(">$500</button></td>\n");
      out.write("                    <td><button type=\"submit\" value=\"9\" name=\"1\" ");
      out.print( dis9);
      out.write(">$500</button></td>\n");
      out.write("                    <td><button type=\"submit\" value=\"14\" name=\"1\" ");
      out.print( dis14);
      out.write(">$500</button></td>\n");
      out.write("                    <td><button type=\"submit\" value=\"19\" name=\"1\" ");
      out.print( dis19);
      out.write(">$500</button></td>\n");
      out.write("                    <td><button type=\"submit\" value=\"24\" name=\"1\" ");
      out.print( dis24);
      out.write(">$500</button></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
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
