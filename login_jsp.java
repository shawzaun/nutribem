package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"materialize.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"customLogin.css\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("<!-- Parei aqui -->\n");
      out.write("    <div id=\"cadastro\">\n");
      out.write("    <h4 id=\"titulodologin\" class=\"Black-text \"> Entre na sua conta </h4>\n");
      out.write("        \n");
      out.write("            <form name=\"formCadastro\"  method=\"post\" action=\"VerificaLogin\">\n");
      out.write("        <div class=\"row s2 \">\n");
      out.write("            <div class=\"input-field col s2  \" id=\"cadLogin\">\n");
      out.write("                <p class=\"titulos black-text\">Seu email*: </p>\n");
      out.write("                <input type=\"email\" name=\"txtEmailLogin\" placeholder=\"Digite o seu email\" class=\"inputsCad\" id=\"nome\" required >\n");
      out.write("                <p class=\"titulos black-text\">Sua senha*: </p>\n");
      out.write("                <input type=\"password\" name=\"txtSenhaLogin\" placeholder=\"Digite a senha que você criou\" class=\"inputsCad\" id=\"sobrenome\" required >\n");
      out.write("                \n");
      out.write("                <input type=\"submit\" value=\"Entrar\" id=\"btnLogin\" class=\"waves-effect waves-light btn\" >        \n");
      out.write("        \n");
      out.write("                <a href=\"qqq\" style=\"color:blue;\"> Esqueceu sua senha? </a> <br>\n");
      out.write("                <p id=\"configLogin\"> Ainda não possui uma conta? </p>\n");
      out.write("                <a href=\"TelaCadastro.xhtml\" id=\"configLogin2\"> Criar uma nova conta </a>\n");
      out.write("            </div>\n");
      out.write("             </div>\n");
      out.write("        </form>\n");
      out.write("   \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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
}
