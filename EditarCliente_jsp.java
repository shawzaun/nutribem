package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import model.Cliente;

public final class EditarCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      BancoDeDados.ConexaoBancoDados conexao = null;
      synchronized (_jspx_page_context) {
        conexao = (BancoDeDados.ConexaoBancoDados) _jspx_page_context.getAttribute("conexao", PageContext.PAGE_SCOPE);
        if (conexao == null){
          conexao = new BancoDeDados.ConexaoBancoDados();
          _jspx_page_context.setAttribute("conexao", conexao, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      BancoDeDados.ClienteBd cli = null;
      synchronized (_jspx_page_context) {
        cli = (BancoDeDados.ClienteBd) _jspx_page_context.getAttribute("cli", PageContext.PAGE_SCOPE);
        if (cli == null){
          cli = new BancoDeDados.ClienteBd();
          _jspx_page_context.setAttribute("cli", cli, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>SGC - Versão 1.0</title>\n");
      out.write("        <link href=\"clinica_medica.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        Cliente client = new Cliente();\n");
      out.write("        ");

            ResultSet rsRegistro;
            boolean blnConectado;
            Cliente client = new Cliente(nome, senha, restricao, sobrenome, email);
            
            String senha = (request.getParameter("senha"));
            blnConectado = false;
            
            if (conexao.abrirConexao()) 
            {
                cli.configurarConexao(conexao.obterConexao());
                
                rsRegistro = cli.lerRegistro(senha);
                
                client.setNome(rsRegistro.getString("nome"));
                client.setSenha(senha);
                client.setRestricoes(rsRegistro.getString("restricoes"));
                client.setSobrenome(rsRegistro.getString("sobrenome"));
                

                conexao.fecharConexao();
                
                blnConectado = true;
            }
            else
                out.println("<p>Falha na conexão com o banco de dados!</p>");
        
      out.write("\n");
      out.write("                \n");
      out.write("        ");
 if (blnConectado) {
      out.write("\n");
      out.write("        <p class=\"TituloAplicacao\">SGC - Sistema de Gestão de Clínicas 1.0</p>\n");
      out.write("        <p class=\"TituloPagina\">Cadastro de Funcionários - Edição</p>\n");
      out.write("\n");
      out.write("        <form name=\"formEditaUsuario\" method=\"post\" action=\"atualizarUsuario\" target=\"_parent\">\n");
      out.write("              <p>Nome do usuário: <input type=\"text\" name=\"txtNomeUsuario\" size=\"20\" maxlength=\"20\" value=\"");
      out.print(client.getNome());
      out.write("\"/></p> \n");
      out.write("              <p>\n");
      out.write("                  <input type=\"hidden\" name=\"senha\" value=\"");
      out.print(senha);
      out.write("\">\n");
      out.write("                  <input type=\"hidden\" name=\"email\" value=\"");
      out.print(client.getEmail());
      out.write("\">\n");
      out.write("              </p>\n");
      out.write("              <br>\n");
      out.write("              <p><input type=\"submit\" name=\"btnAtualizar\" value=\"Atualizar\" />\n");
      out.write("                  <span class=\"LinkVoltar\"><a href=\"javascript:history.back()\">[Voltar]</a></span>\n");
      out.write("              </p>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <p class=\"RodapePagina\">Copyright(c) 2015 - Editora Érica Ltda.</p>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
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
