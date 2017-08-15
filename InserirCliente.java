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
public class InserirCliente extends HttpServlet {  
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String strNome, strSobrenome,strEmail, strRestricoes,strSenha;
        PrintWriter out;
        
        strNome = request.getParameter("txtNome");
        strSenha = request.getParameter("txtSenha");
        strEmail = request.getParameter("txtEmail");
        strSobrenome = request.getParameter("txtSobrenome");
        strRestricoes = request.getParameter("txtRestricoes");
        response.setContentType("text/html;charset=UTF-8");
                out = response.getWriter();
        try{
            ConexaoBancoDados conexao = new ConexaoBancoDados();
            ClienteBd clie = new ClienteBd();
            
           Cliente cliente = new Cliente(strNome,strSenha,strRestricoes,strSobrenome,strEmail);
            
            if(conexao.abrirConexao()){
                clie.configurarConexao(conexao.obterConexao());
                
                if(clie.inserirCliente(cliente)){
                    out.println("alert('Cliente cadastrado com sucesso!');");
                    request.getRequestDispatcher("Principal.jsp").forward(request, response);
                }else
                    out.println("Não foi possível cadastrar o Cliente!");
                
                conexao.fecharConexao();
            }else{
                out.println("Não foi possível estabelecer conexão com o banco de dados!");
            }
            
        }catch(Exception erro){
            erro.printStackTrace();
            out.println("Erro do sistema: processo de cadastro de usuário!");
        }
    }        
}
