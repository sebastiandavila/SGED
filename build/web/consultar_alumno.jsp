<%@page import="java.sql.ResultSet"%>
<%@page import="sinescalasfinal.Logica.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Usuario</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link rel="stylesheet" href="CSS/Estilo.css"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <link rel="stylesheet" href="icomoon/style.css"/>
        <link rel="shortcut icon" href="Img/SinEscalasICO.ico"/>

    </head>
    <body>
       <%   /* HttpSession objSesion = request.getSession(false); 
String usuario = (String)objSesion.getAttribute("usuario");
       Logica lg = new Logica();
         lg.conectarBD();
         ResultSet rs = lg.consulta(usuario);*/
          %>
         

      
        
        <nav class="navbar navbar-light" id="mainNav" style="background-color:#52a552"> 
            <div class="container">
                <h8 href="#page-top" >SGED</h8>    <ul class="nav justify-content-end">
                   
                        <li class="nav-item">
                          <a class="nav-link" href="#"><span7 class="icon-exit"> </span7></a>
                        </li>
                      </ul>                                                                 
                
                  
            </div>
            
        </nav>
        <br>
        <center>
         <h9>Consulta</h9>
        </center>
        <br>
       
        
        
        <div class="container">
            <form id="actualizarPerfilU" methos="POST" action="consulta.jsp">
            <div class="form-group">
                <center><input type="text" name="idu" id="idu" placeholder="Id del alumno">
 
      </center>
       
      
                <br>
                <center>
                    <center><input type="submit" id="aceptarP" class="btn btn-success" value="Enviar"> </center>
                </center>               

        <br>
            </div>
            </form>
            </div>  
        
</body>


        
</html>

