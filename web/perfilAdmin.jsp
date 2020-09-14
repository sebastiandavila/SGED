<%-- 
    Document   : perfilAdmin
    Created on : 24/02/2019, 09:21:57 PM
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Administrador</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="shortcut icon" href="Img/SinEscalasICO.ico"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link rel="stylesheet" href="CSS/Estilo.css"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <link rel="stylesheet" href="icomoon/style.css"/>
    </head>
    <body>
       <nav class="navbar navbar-light" id="mainNav" style="background-color:#52a552"> 
            <div class="container">
                   <ul class="nav justify-content-end">
                        <li class="nav-item">
                          <a class="nav-link" href="#"><span7 class="icon-exit"> </span7></a>
                        </li>
                      </ul>                                                                 
                
                  
            </div>
            
        </nav>
  
        <br>
        <br>
    <center>
         <h9>Bienvenido Administrador</h9>
    </center>
         <br>
         
    <center>
        
        <div class="col-4">
        <div class="list-group" id="lista">
             <a href="cargar_alumnos.jsp?"><button type="submit" class="list-group-item list-group-item-action" id="actualizarPerfil">Cargar lista de nuevos alumnos</button> </a> 
            <a href="cargar_entrenadores.jsp?"><button type="submit" class="list-group-item list-group-item-action" id="actualizarPerfil">Cargar lista de entrenadores</button> </a>    
            <a href="mejor.jsp?"><button type="submit" class="list-group-item list-group-item-action" id="actualizarPerfil">generar excel con el mejor alumno y el mejor entrenador</button> </a>    
            <a href="evaluar_entrenador.jsp?"><button type="submit" class="list-group-item list-group-item-action" id="actualizarPerfil">evaluar entrenadores</button> </a>    
            <a href="cargar_pagos.jsp?"><button type="submit" class="list-group-item list-group-item-action" id="actualizarPerfil">Cargar pagos</button> </a>    
            <a href="cargar_deporte.jsp?"><button type="submit" class="list-group-item list-group-item-action" id="actualizarPerfil">Cargar deporte</button> </a>    
            <a href="consultapagoA.jsp?"><button type="submit" class="list-group-item list-group-item-action" id="actualizarPerfil">Consulta de pago por año</button> </a>    
            <a href="consultapagoM.jsp?"><button type="submit" class="list-group-item list-group-item-action" id="actualizarPerfil">Consulta de pago por mes</button> </a>    
        </div>
        </div>
    </center>
         
    </body>
</html>
