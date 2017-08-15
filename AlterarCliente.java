package servlets;

import BancoDeDados.ClienteBd;
import BancoDeDados.ConexaoBancoDados;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Cliente;


/**
 *
 * @author Emmerson
 */
public class AlterarCliente extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String strNome, strSenha,strRestricao,strSobrenome,strEmail; 
       int intCodigoUsuario;
        PrintWriter out;
        
        strNome = request.getParameter("alteranomec");
        strSenha = request.getParameter("alterasenhac");
        strRestricao = request.getParameter("alterarestricaoc");
        strSobrenome = request.getParameter("alterasbnmc");
        strEmail = request.getParameter("alteraemailc");
        
        
        response.setContentType("text/html;charset=UTF-8");
        out = response.getWriter();
        
        
        try{
            ConexaoBancoDados conexao = new ConexaoBancoDados();
            ClienteBd usuario = new ClienteBd ();
            
            Cliente Usuario = new Cliente(strNome,strSenha,strRestricao,strSobrenome,strEmail);
            
            if(conexao.abrirConexao()){
                usuario.configurarConexao(conexao.obterConexao());
                
                if(usuario.alterarCliente(Usuario)){
                    out.println("<h2>Dados do usuário atualizados com sucesso!</h2>");
                    out.println("<br><br><br><br>");
                    out.println("<a href='menu_usuarios.html'>Voltar</a>");
                }else
                    out.println("<h2>Não foi possível atualizar os dados do usuário!</h2>");
                
                conexao.fecharConexao();
            }else{
                out.println("<h2>Não foi possível estabelecer conexão com o banco de dados!</h2>");
            }
            
        }catch(Exception erro){
            erro.printStackTrace();
            out.println("<h2>Erro do sistema: processo de atualização dos dados do usuário!</h2>");
        }
        
    }        
}    
