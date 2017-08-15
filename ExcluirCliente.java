

package servlets;

import BancoDeDados.ClienteBd;
import BancoDeDados.ConexaoBancoDados;
import BancoDeDados.ProdutosBd;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Emmerson
 */
public class ExcluirCliente extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out;
        response.setContentType("text/html;charset=UTF-8");
        out = response.getWriter();
        
        
        try{
            ConexaoBancoDados conexao = new ConexaoBancoDados();
            ClienteBd prod = new ClienteBd();
            
            if(conexao.abrirConexao()){
                prod.configurarConexao(conexao.obterConexao());
                String sen = request.getParameter("excluisenhac");
                if(prod.excluirCliente(sen)){
                    out.println("<h2> Cliente excluído com sucesso!</h2>");                
                }else
                    out.println("<h2>Não foi possível excluir o cliente!</h2>");                    
                conexao.fecharConexao();
            }else
                out.println("<h2>Não foi possível estabelecer conexão com o banco de dados!</h2>");                    
               
        }catch(Exception erro){
            erro.printStackTrace();
            out.println("<h2>Erro do sistema:processo de exclusão do cliente!</h2>");
        }
        
    }
}




