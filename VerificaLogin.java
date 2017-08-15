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
public class VerificaLogin extends HttpServlet {
     
    @Override
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ResultSet rsRegiSenha;
        ResultSet rsRegiEmail;
        PrintWriter out;
        String strEmail;
        String strSenha;
        
        strEmail= request.getParameter("txtEmailLogin");
        strSenha = request.getParameter("txtSenhaLogin");
        
        response.setContentType("text/html;charset=UTF-8");
        out = response.getWriter();
        
        try{
            ConexaoBancoDados conexao = new ConexaoBancoDados();
            ClienteBd cli = new ClienteBd();
            
            if(conexao.abrirConexao()){
                cli.configurarConexao(conexao.obterConexao());
                String senha = cli.localizarRegistro(strSenha);
                if(strEmail.equals("judelara@gmail.com")|| strSenha.equals("isisisis")){
                    out.println("alert('Cliente cadastrado com sucesso!');");
                    request.getRequestDispatcher("Principal.jsp").forward(request, response);
                }else{
                    out.println("Usuário não encontrando!");
                    request.setAttribute("Falha", "erro de autenticação");
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                }
                conexao.fecharConexao();
            }else{
                out.println("<h2>Não foi possível estabelecer conexão com o banco de dados!</h2>"); 
            }
        }catch(Exception erro){
            erro.printStackTrace();
            out.println("<h2>Erro do sistema:processo de Login</h2>");
        }
     }

}


