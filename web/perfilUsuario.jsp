<%-- 
    Document   : perfilUsuario
    Created on : 24/02/2019, 09:21:17 PM
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% HttpSession objSesion = request.getSession(false); 
String usuario = (String)objSesion.getAttribute("usuario");
 %>
<html>
    <head>
        <title>Usuario</title>
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
         <h9>Bienvenido Usuario</h9>
        </center>
        <br>
    <center>
        
        <div class="col-4">
        <div class="list-group" id="lista">
            <h1> <% out.println(usuario);%></h1>
            <a href="asistencia.jsp?"><button type="submit" class="list-group-item list-group-item-action" id="actualizarPerfil">Asistencia a clase</button> </a> 
            <a href="consultar_alumno.jsp?"><button type="submit" class="list-group-item list-group-item-action" id="actualizarPerfil">Consultar por alumno</button> </a> 
            
            
        </div>
            
        </div>
    </center>
    <!--<script src="JS/codigo2.js"></script>-->
   
    </body>
</html>

