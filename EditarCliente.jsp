<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="model.Cliente"%>
<jsp:useBean id="conexao" scope="page" class="BancoDeDados.ConexaoBancoDados"/>
<jsp:useBean id="cli" scope="page" class="BancoDeDados.ClienteBd"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>SGC - Versão 1.0</title>
        <link href="clinica_medica.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        Cliente client = new Cliente();
        <%
            ResultSet rsRegistro;
            boolean blnConectado;
            Cliente = new Cliente(nome, senha, restricao, sobrenome, email);
            
            String senha = (request.getParameter("senha"));
            blnConectado = false;
            
            if (conexao.abrirConexao()) 
            {
                cli.configurarConexao(conexao.obterConexao());
                
                rsRegistro = cli.lerRegistro(senha);
                
                client.setNome(rsRegistro.getString("nome"));
                client.setSenha(senha);
                client.setRestricoes(rsRegistro.getString("restricoes"));
                client.setSobrenome(rsRegistro.getString("sobrenome"));
                

                conexao.fecharConexao();
                
                blnConectado = true;
            }
            else
                out.println("<p>Falha na conexão com o banco de dados!</p>");
        %>
                
        <% if (blnConectado) {%>
        <p class="TituloAplicacao">SGC - Sistema de Gestão de Clínicas 1.0</p>
        <p class="TituloPagina">Cadastro de Funcionários - Edição</p>

        <form name="formEditaUsuario" method="post" action="atualizarUsuario" target="_parent">
              <p>Nome do usuário: <input type="text" name="txtNomeUsuario" size="20" maxlength="20" value="<%=client.getNome()%>"/></p> 
              <p>
                  <input type="hidden" name="senha" value="<%=senha%>">
                  <input type="hidden" name="email" value="<%=client.getEmail()%>">
              </p>
              <br>
              <p><input type="submit" name="btnAtualizar" value="Atualizar" />
                  <span class="LinkVoltar"><a href="javascript:history.back()">[Voltar]</a></span>
              </p>
        </form>
        
        <p class="RodapePagina">Copyright(c) 2015 - Editora Érica Ltda.</p>
        <%}%>
    </body>
</html>


    </body>
</html>

