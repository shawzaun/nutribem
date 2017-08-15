package servlets;

import BancoDeDados.ProdutosBd;
import BancoDeDados.ConexaoBancoDados;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Produto;


/**
 *
 * @author Emmerson
 */
public class AlterarProduto extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String strNome, strPreco, strCodigop, strDesc;
        PrintWriter out;
        
        strNome = request.getParameter("alteranome");
        strPreco = request.getParameter("alterapreco");
        strCodigop =request.getParameter("alteracodigop");
        strDesc = request.getParameter("alteradescricao");
        
        
        response.setContentType("text/html;charset=UTF-8");
        out = response.getWriter();
        
        try{
            ConexaoBancoDados conexao = new ConexaoBancoDados();
            ProdutosBd prod = new ProdutosBd();
            
            Produto produto = new Produto(strNome,strPreco,strCodigop,strDesc);
            
            if(conexao.abrirConexao()){
                prod.configurarConexao(conexao.obterConexao());
                
                if(prod.alterarProduto(produto)){
                    out.println("<h2>Dados do produto atualizados com sucesso!</h2>");
                    
                }else
                    out.println("<h2>Não foi possível atualizar os dados do produto!</h2>");
                
                conexao.fecharConexao();
            }else{
                out.println("<h2>Não foi possível estabelecer conexão com o banco de dados!</h2>");
            }
            
        }catch(Exception erro){
            erro.printStackTrace();
            out.println("<h2>Erro do sistema: processo de atualização dos dados do produto!</h2>");
        }
        
    }        
}    
