<%-- 
    Document   : editarFaseUsuario
    Created on : 24/02/2019, 09:29:09 PM
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
                <h8 href="#page-top" >SGED</h8>    <ul class="nav justify-content-end">
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
         <h9>EDITAR FASE DE USUARIO</h9>
    </center>
         <br>
        
<div class="container">
    <form id="formularioEditarFaseU" method="POST" action="auxiliarEditarFaseU.jsp" >
            <div class="form-group">
                <div>
                    
                    <input id="idUsuario" name="idUsuario" class="form-control"  placeholder="Cedula del usuario" type="text" ><br>
                    
                </div>
                <div>
                    
                    <input id="uFase" name="uFase" class="form-control"  placeholder="Fase" type="number" ><br>
                    
                </div>
            
    <br>
        <center>
                <input id="aceptar" class="btn btn-success" type="submit"> 
        </center>
    </div>
        </form>
</div>
         
    </body>
</html>

