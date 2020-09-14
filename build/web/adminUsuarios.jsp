<%-- 
    Document   : adminUsuarios
    Created on : 24/02/2019, 09:35:40 PM
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Calificador</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link rel="stylesheet" href="CSS/Estilo.css"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <link rel="stylesheet" href="icomoon/style.css"/>
        <link rel="shortcut icon" href="Img/SinEscalasICO.ico"/>
    </head>
    <body>
                
        <nav class="navbar navbar-light" id="mainNav" style="background-color:#52a552"> 
            <div class="container">
                   <ul class="nav justify-content-end">
                    
                     
                    
                    <li class="nav-item">
                          <a class="nav-link active" href="#"><span6 class="icon-envelop"> </span6></a>
                        </li>
                        
                        <li class="nav-item">
                          <a class="nav-link" href="#"><span6 class="icon-info"> </span6></a>
                        </li>
                        <li class="nav-item">
                          <a class="nav-link" href="#"><span7 class="icon-exit"> </span7></a>
                        </li>
                      </ul>                                                                 
                
                  
            </div>
            
        </nav>
  
        <br>
        <br>
    <center>
         <h9>Administrar Usuarios</h9>
    </center>
         <br>
         
    <center>
        
        <div class="col-4">
        <div class="list-group" id="lista">
            <button type="submit" class="list-group-item list-group-item-action" id="editarRol">Editar rol</button>    
            <button type="submit" class="list-group-item list-group-item-action" id="editarCalificacion">Editar calificación</button>
            <button type="submit" class="list-group-item list-group-item-action" id="editarFaseU">Editar fase usuario</button>
            <button type="submit" class="list-group-item list-group-item-action" id="eliminarU">Eliminar usuario</button>
            <button type="submit" class="list-group-item list-group-item-action"> Mostrar usuarios</button> <!--FALTA-->
            
        
        </div>
        </div>
    </center>
         
         <script src="JS/codigoB.js"></script>
    </body>
</html>

