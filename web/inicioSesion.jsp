<%-- 
    Document   : inicioSesion
    Created on : 24/02/2019, 09:22:35 PM
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     
     
     <head>
        <title>SGED</title>
        
        <!--<link rel="stylesheet" href="CSS/EstiloInicio.css"/>-->
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link rel="stylesheet" href="CSS/Estilo.css"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <link rel="stylesheet" href="icomoon/style.css"/>
        
     </head>
          <body>
        
        
        
  
        <br>
        <br>
        <center>
            <h9>INICIO DE SESIÓN</h9>
    </center>
         <br>
        
<div class="container">
    <form id="formula" action="auxiliar.jsp" method="POST" >
            <div class="form-group">
                
                <div>
                    
                    <input id="usuario" name="usuario" class="form-control"  placeholder="Cedula" type="text" ><br>
                    
                </div>
                <div>
                    
                    <input id="clave" name="clave" class="form-control"  placeholder="Contraseña" type="password" ><br>
                    
                </div>
                
                
                
               
                <center>
                    <center><input type="submit" id="login" class="btn btn-success" value="Enviar"> </center>
                </center>
                </div>
        <a id="recuperar" name="recuperar" href="recuperar.jsp?">Recuperar contraseña</a>  
        </form>
    <style type="text/css"> 
                            #recuperar{
                                color: blue;
                                
                            
                            }
    </style>
</div>
         <script src="JS/codigo2.js"></script>
    </body>
</html>
        

