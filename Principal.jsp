<%-- 
    Document   : Principal
    Created on : 14/08/2017, 09:30:32
    Author     : swing
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

    <head>
        <title> NutriBem</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="materialize.css">
        <link rel="stylesheet" href="custom.css"/>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    </head>

    <body>

        <header>
            <div class=" div1">  
            </div>
            <section class="w3-content">
                <img class="mySlides" src="FotoHome5.jpg"  style="width:100%; height:700px;"/>
                <button onclick="plusDivs(-1)">&#10094;</button>
                <button class=" w3-black w3-display-right" onclick="plusDivs(1)">&#10095;</button>
            </section>



            <nav class="divNav  white-text">
                <div class="nav-wrapper ">
                    <a href="#" class="brand-logo black-text">NutriBem</a>
                    <ul id="id-nav" class="right ">
                        <li><a href="">Home</a></li>
                        <li><a href="http://localhost:8080/TesteNutri/adm.xhtml">Adm</a></li>
                        <li><a href="">Produtos</a></li>
                        <li><a href="">Quem somos?</a></li>
                    </ul>
                </div>
            </nav>

            <div class=" titulos sectionMargem2" style="position:absolute; top:40%; font-size:40px;">
                <p class="titulos">Tem problemas para encontrar<br> tudo para sua restrição?<br>Bem vindo ao NutriBem,<br> o site que concentra <br>a melhor saúde para você, com a ajuda da Amazônia.</p>
            </div>

        </header>

        <br>
        <section class="sectionMargem center-align">
            <h1 class="titulos center-align" style="font-size:40px;"> Como Funciona?</h1>
            <div class="card-panel green"  id="divComo" class="green"><p class="white-text comoFuncionaStyle">Compra de produtos específicos para sua restrição.
            <i class="material-icons medium red-text">done</i></div></p>
            <div  class="card-panel green"  id="divComo1" class="green"><p class="white-text comoFuncionaStyle">Você recebe cardápios semanais detalhado conforme seu perfil.
            <i class="material-icons medium red-text">done</i></div></p>
            <div  class="card-panel green" ><p class="white-text comoFuncionaStyle">É disponivel também contato academicos e profissionais em nutrição,buscando sempre o melhor para você.
                    <i class="material-icons medium red-text">done</i><Br></div></p>
            
        </section>
        <br>

        <section class="white sectionMargem">
            <h1 class="titulos center-align" style="font-size:40px;" > Produtos</h1>
            <div  class="white sectionMargem4 center-align">
            <div class="divProd1 white">
                    <ul>
                        <a href="http://localhost:8080/TesteNutri/pagamento.xhtml" > <img class="img-responsive" src="prod1.jpg" width="100%" height="80%;">  </a>
                    </ul>
                     <ul>
                        <img class="img-responsive" src="prod1.jpg" href="http://localhost:8080/TesteNutri/pagamento.xhtml"width="100%" height="80%;">  
                    </ul>
                    <ul>
                        <img class="img-responsive" src="prod4.jpg" href="http://localhost:8080/TesteNutri/pagamento.xhtml"width="100%" height="80%;">  
                    </ul>
                   <ul>
                        <img class="img-responsive" src="prod3.jpg"href="http://localhost:8080/TesteNutri/pagamento.xhtml" width="100%" height="80%;">  
                        
                        <div></div>
                    </ul>
                </div>

        </section>
        <br><br><br>
        <section class="sectionMargem white">
            <h1 class="titulos center-align" style="font-size:40px;" >Cardápios</h1>
            <div  class="white sectionMargem4 center-align">
                <div class="divProd2 white">
                        <ul>
                            <img class="img-responsive" src="seg.png" width="90%" height="70%;">  
                            <div></div>
                        </ul>
                        <ul>
                            <img class="img-responsive" src="ter.png" width="90%" height="70%;">  
                            <div></div>
                        </ul>
                        <ul>
                            <img class="img-responsive" src="qua.png" width="90%" height="70%;">  
                            <div></div>
                        </ul>
                        <ul>
                            <img class="img-responsive" src="qui.png" width="90%" height="70%;">  
                            <div></div>
                        </ul>
                        <ul>
                            <img class="img-responsive" src="sex.png" width="90%" height="70%;">  
                            <div></div>
                        </ul>
                        <ul>
                            <img class="img-responsive" src="sab2.png" width="90%" height="70%;">  
                            <div></div>
                        </ul>
                    </div>
            </div>
        </section>
        <br><br><br>
        
        <section class="white sectionMargem">
            <h1 class="titulos center-align" style="font-size:40px;" > Pratos</h1>
            <div  class="white sectionMargem4 center-align">
            <div class="divProd1 white">
                    <ul>
                        <img class="img-responsive" src="prato5.jpg" width="90%" height="70%;">  
                        
                        <div></div>
                    </ul>
                    <ul>
                        <img class="img-responsive" src="prato2.jpg" width="90%" height="70%;">  
                        
                        <div></div>
                    </ul>
                    <ul>
                        <img class="img-responsive" src="prato3.jpg" width="90%" height="70%;">  
                        
                        <div></div>
                    </ul>
                    <ul>
                        <img class="img-responsive" src="prato2.jpg" width="90%" height="70%;">  
                        
                        <div></div>
                    </ul>
                </div>

        </section>
        <br><br><br>

        
        
         <div class="parallax-container">
            <div class="parallax"><img src="TelaFundo.jpg"></div>
        </div>
        <div class="section white">
            <div class="row container">
                <h2 class="header" style="font-size:40px;" class="center-align titulos">Você sabe ler rótulos?</h2>
                <img class="img-responsive" src="rotulosHome.jpg" width="60%" height="60%;">
                <h5>aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa<br>
                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa<br>
                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa<br>
                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa<br>
                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa<br>
                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa<br></h5>
                <a class="btn right">Detalhes</a>
            </div>
            </div>
            <div class="parallax-container">
                <div class="parallax"><img src="TelaFundo.jpg"></div>
            </div>
        
        
        
       
    
        <br><br><br>

        <div id="divQuemsomos3" class="  black-text "> 
            <p> Todos os direitos reservados     ----</p>
        </div>

        <script>
            var myIndex = 0;
            carousel();

            function carousel() {
                var i;
                var x = document.getElementsByClassName("mySlides");
                for (i = 0; i < x.length; i++) {
                    x[i].style.display = "none";
                }
                myIndex++;
                if (myIndex > x.length) {
                    myIndex = 1
                }
                x[myIndex - 1].style.display = "block";
                setTimeout(carousel, 6000); // Change image every 2 seconds
            }

        </script>

        <script>
            var slideIndex = 1;
            showDivs(slideIndex);

            function plusDivs(n) {
                showDivs(slideIndex += n);
            }

            function showDivs(n) {
                var i;
                var x = document.getElementsByClassName("mySlides");
                if (n > x.length) {
                    slideIndex = 1
                }
                if (n < 1) {
                    slideIndex = x.length
                }
                for (i = 0; i < x.length; i++) {
                    x[i].style.display = "none";
                }
                x[slideIndex - 1].style.display = "block";
            }
        </script>
    </body>
</html>