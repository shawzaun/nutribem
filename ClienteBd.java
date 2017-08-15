package BancoDeDados;

import com.sun.istack.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import model.Cliente;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author Emmerson
 */
public class ClienteBd {

    private Connection conBanco;
    private PreparedStatement psComando;
    private ResultSet rsRegistros;

    public void configurarConexao(Connection conBanco) {
        this.conBanco = conBanco;
    }

    public boolean inserirCliente(Cliente cliente) {
        String strComandoSQL;

        try {
            strComandoSQL = "INSERT INTO Cliente( nome,senha,restricao,sobrenome,email)"
                    + "VALUES('" + cliente.getNome() + "',"
                    + "'" + cliente.getSenha() + "',"
                    + "'" + cliente.getRestricao() + "',"
                    + "'" + cliente.getSobrenome() + "',"
                    + "'" + cliente.getEmail() + "')";

            psComando = conBanco.prepareStatement(strComandoSQL);
            psComando.executeUpdate();

            return true;
        } catch (Exception erro) {
            erro.printStackTrace();
            return false;
        }
    }

    public boolean excluirCliente(String senha) {
        String strComandoSQL;

        try {
            strComandoSQL = "DELETE FROM Cliente WHERE senha = '" + senha + "'";
            psComando = conBanco.prepareStatement(strComandoSQL);
            psComando.executeUpdate();

            return true;
        } catch (Exception erro) {
            erro.printStackTrace();
            return false;
        }
    }

    public String localizarRegistro(String strSenha) {
        String CodigoUsuario = null;

        try {
            String sql = "SELECT * FROM Cliente WHERE senha='"+strSenha+"'";
            psComando = conBanco.prepareStatement(sql);
            rsRegistros = psComando.executeQuery();
            rsRegistros.next();
            CodigoUsuario = rsRegistros.getString("senha");
        } catch (Exception erro) {
            erro.printStackTrace();
        }
        return CodigoUsuario;
    }

    public ResultSet lerRegistro(String strCliente) {
        String strComandoSQL;

        try {
            strComandoSQL = "SELECT * FROM Cliente WHERE senha = '" + strCliente+"'";
            psComando = conBanco.prepareStatement(strComandoSQL);
            rsRegistros = psComando.executeQuery();
            rsRegistros.next();

            return rsRegistros;
        } catch (Exception erro) {
            erro.printStackTrace();
            return null;
        }
    }

    public boolean alterarCliente(Cliente cliente) {
       
        String strComandoSQL;

        try {
            strComandoSQL = "UPDATE Cliente SET nome = ?, restricao = ?, sobrenome = ?, email = ? where senha = ? ";
            psComando = conBanco.prepareStatement(strComandoSQL);
            psComando.setString(1, cliente.getNome());
            psComando.setString(2, cliente.getRestricao());
            psComando.setString(3, cliente.getSobrenome());
            psComando.setString(4, cliente.getEmail());
            psComando.setString(5, cliente.getSenha());
            psComando.executeUpdate();
            return true;
        } catch (SQLException erro){
         erro.printStackTrace();
         return false;
        }

    }
}
