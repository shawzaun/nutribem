package servlets;

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
public class ExcluirProduto extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out;
        response.setContentType("text/html;charset=UTF-8");
        out = response.getWriter();
        
        
        try{
            ConexaoBancoDados conexao = new ConexaoBancoDados();
            ProdutosBd prod = new ProdutosBd();
            
            if(conexao.abrirConexao()){
                prod.configurarConexao(conexao.obterConexao());
                String cod = request.getParameter("excluicodigop");
                if(prod.excluirProduto(cod)){
                    out.println("<h2>Registro do produto excluído com sucesso!</h2>");                
                }else
                    out.println("<h2>Não foi possível excluir o produto!</h2>");                    
                conexao.fecharConexao();
            }else
                out.println("<h2>Não foi possível estabelecer conexão com o banco de dados!</h2>");                    
               
        }catch(Exception erro){
            erro.printStackTrace();
            out.println("<h2>Erro do sistema:processo de exclusão do produto!</h2>");
        }
        
    }
}




