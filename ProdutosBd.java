package BancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Produto;

public class ProdutosBd {

    private Connection conBanco;
    private PreparedStatement psComando;
    private ResultSet rsRegistros;

    public void configurarConexao(Connection conBanco) {
        this.conBanco = conBanco;
    }

    public boolean inserirProduto(Produto produto) {
        String strComandoSQL;
        try {
            strComandoSQL = "INSERT INTO Produtos(nome,preco,codigoP,descricao)"
                    + "VALUES(?,?,?,?)";

            PreparedStatement pstmt = conBanco.prepareStatement(strComandoSQL);
            pstmt.setString(1, produto.getNomeProd());
            pstmt.setFloat(2, Float.parseFloat(produto.getPrecoProd()));
            pstmt.setString(3, produto.getCodigoProd());
            pstmt.setString(4, produto.getDescricaoProd());
            if (pstmt.executeUpdate() == 1) {
                return true;
            }
            pstmt.close();
            conBanco.close();
        } catch (Exception erro) {
            erro.printStackTrace();
        }
        return false;
    }

    public String localizarProduto(String codigoP) {
        String codigo = "";
        String strComandoSQL;

        try {
            strComandoSQL = "SELECT * FROM Produto WHERE codigoP ='" + codigoP + "'";
            psComando = conBanco.prepareStatement(strComandoSQL);
            rsRegistros.next();
            codigo = rsRegistros.getString("codigoP");
        } catch (SQLException erro) {
        }
        return codigo;
    }

    public ResultSet lerProduto(String CodigoProd) {
        String strComandoSQL;

        try {
            strComandoSQL = "SELECT * FROM Produto WHERE codigoP= " + CodigoProd;
            psComando = conBanco.prepareStatement(strComandoSQL);
            rsRegistros = psComando.executeQuery();
            rsRegistros.next();

            return rsRegistros;
        } catch (SQLException erro) {
            erro.printStackTrace();
            return null;
        }
    }

    public boolean alterarProduto(Produto prod) {
        String strComandoSQL;

        try {
            strComandoSQL = "UPDATE Produtos SET codigoP ='" + prod.getCodigoProd() + "',"
                    + "nome = '" + prod.getNomeProd() + "',"
                    + "preco = '" + prod.getPrecoProd() + "',"
                    + "descricao = '" + prod.getDescricaoProd() + "'";
            psComando = conBanco.prepareStatement(strComandoSQL);
            psComando.executeUpdate();

            return true;
        } catch (SQLException erro) {
            erro.printStackTrace();
            return false;
        }
    }

    public boolean excluirProduto(String codigoP) {
        String strComandoSQL;

        try {
            strComandoSQL = "DELETE FROM Produtos WHERE codigoP = '" + codigoP + "'";
            psComando = conBanco.prepareStatement(strComandoSQL);
            psComando.executeUpdate();

            return true;
        } catch (Exception erro) {
            erro.printStackTrace();
            return false;
        }
    }
}
