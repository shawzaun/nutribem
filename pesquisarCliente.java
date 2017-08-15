package servlets;

import BancoDeDados.ClienteBd;
import BancoDeDados.ConexaoBancoDados;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Emmerson
 */
public class pesquisarCliente extends HttpServlet {
     
    @Override
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ResultSet rsRegistro;
        PrintWriter out;
        String strSenha;
        
        strSenha = request.getParameter("txtPesqSenhaC");
        response.setContentType("text/html;charset=UTF-8");
        out = response.getWriter();
        
        
        
        try{
            
            ConexaoBancoDados conexao = new ConexaoBancoDados();
            ClienteBd usuario = new ClienteBd();
            
            if(conexao.abrirConexao()){
                usuario.configurarConexao(conexao.obterConexao());
                 strSenha = usuario.localizarRegistro(strSenha);
                if(strSenha != null){
                    rsRegistro = usuario.lerRegistro(strSenha);
                    
                    out.println("<a href='http://localhost:8080/TesteNutri/AlteraCliente.html'>[Editar]</a> ");
                     out.println("<a href='http://localhost:8080/TesteNutri/ExcluiCliente.html'>[Excluir]</a>");
                    out.println("<span class='LinkVoltar'><a href='javascript:history.back()'>[Voltar]</a></span>");
                    
                }else{
                    out.println("<h2>Usuário não encontrado!</h2>");
                    out.println("<br><br><br>");
                    out.println("<p class='LinkVoltar'><a href='javascript:history.back()'>[Voltar]</a></p>");
                }
                conexao.fecharConexao();
                
            }else
                out.println("<h2>Não foi possível estabelecer conexão com o banco de dados!</h2>");
        
        }catch(Exception erro){
            erro.printStackTrace();
            out.println("<h2>Erro do sistema:processo de cadastro do usuário!</h2>");
        }
    }

}


