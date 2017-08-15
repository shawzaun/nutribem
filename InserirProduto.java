package servlets;

import BancoDeDados.ConexaoBancoDados;
import BancoDeDados.ProdutosBd;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Produto;

public class InserirProduto extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String strNome, strPreco, strCodigoP, strDescricao;
        PrintWriter out;

        if (request.getParameter("txtNomeProd") != null) {
            strNome = request.getParameter("txtNomeProd");
        } else {
            strNome = "N";
        }

        if (request.getParameter("txtPrecoProd") != null) {
            strPreco = request.getParameter("txtPrecoProd");
        } else {
            strPreco = "N";
        }

        if (request.getParameter("txtCodigoProd") != null) {
            strCodigoP = request.getParameter("txtCodigoProd");
        } else {
            strCodigoP = "N";
        }

        if (request.getParameter("txtDescProd") != null) {
            strDescricao = request.getParameter("txtDescProd");
        } else {
            strDescricao = "N";
        }

        out = response.getWriter();

        try {
            ConexaoBancoDados conexao = new ConexaoBancoDados();
            ProdutosBd prod = new ProdutosBd();

            Produto produto = new Produto(strNome,strPreco,strCodigoP,strDescricao);

            if (conexao.abrirConexao()) {
                prod.configurarConexao(conexao.obterConexao());
                if (prod.inserirProduto(produto)) {
                    out.println("Usuário cadastrado com sucesso!");
                } else {
                    out.println("Não foi possível cadastrar o Produto!");
                }

                conexao.fecharConexao();
            } else {
                out.println("Não foi possível estabelecer conexão com o banco de dados!");
            }

        } catch (Exception erro) {
            out.println("<h2>Erro do sistema: processo de cadastro de usuário!</h2>");
        }
    }
}
