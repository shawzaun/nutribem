<%-- 
    Document   : login
    Created on : 14/08/2017, 05:17:44
    Author     : swing
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="materialize.css">
    <link rel="stylesheet" href="customLogin.css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

</head>

<html>


<body>

  

<!-- Parei aqui -->
    <div id="cadastro">
    <h4 id="titulodologin" class="Black-text "> Entre na sua conta </h4>
        
            <form name="formCadastro"  method="post" action="VerificaLogin">
        <div class="row s2 ">
            <div class="input-field col s2  " id="cadLogin">
                <p class="titulos black-text">Seu email*: </p>
                <input type="email" name="txtEmailLogin" placeholder="Digite o seu email" class="inputsCad" id="nome" required >
                <p class="titulos black-text">Sua senha*: </p>
                <input type="password" name="txtSenhaLogin" placeholder="Digite a senha que você criou" class="inputsCad" id="sobrenome" required >
                
                <input type="submit" value="Entrar" id="btnLogin" class="waves-effect waves-light btn" >        
        
                <a href="qqq" style="color:blue;"> Esqueceu sua senha? </a> <br>
                <p id="configLogin"> Ainda não possui uma conta? </p>
                <a href="TelaCadastro.xhtml" id="configLogin2"> Criar uma nova conta </a>
            </div>
             </div>
        </form>
   

</body>

</html>

