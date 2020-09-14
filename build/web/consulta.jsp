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
       <%    HttpSession objSesion = request.getSession(false); 
         String usuario = (String)objSesion.getAttribute("usuario");
         Logica lg = new Logica();
         lg.conectarBD();
         String idu = request.getParameter("idu");
         ResultSet rs = lg.consulta(idu);
         
        HttpSession objSesion1 = request.getSession(true); 
                String alumno = idu; //aqui tu identificador de usuario
                objSesion1.setAttribute("alumno", alumno );
         
          %>
         

      
        
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
        <center>
         <h9>Reporte del alumno con identificacion: <%out.println(idu);%></h9>
        </center>
        <br>
       
        
        
        <div class="container">
            <form id="actualizarPerfilU" methos="POST" action="generar_excel.jsp">
            <div class="form-group">
                
 <%   
       while(rs.next()){
       String id=rs.getString("calificacion");
       String nom=rs.getString("observaciones"); 
       String clase=rs.getString("clase_numero");
       String asis=rs.getString("asistencia");
 %>
      <table class="egt">
                <tr>

<th>Clase numero</th>
<th>Asistio</th>
<th>Calificacion</th>

<th>Observaciones</th>

</tr>
       <tr>

    <td>
        <div style="width:150px;">
        <h6><%out.println(clase); %></h6>
        </div>
    </td>
    <td>
        <div style="width:150px;">
        <h6><%out.println(asis); %></h6>
        </div>
    </td>
    <td>
        <div style="width:250px;">
        <h6><%out.println(id); %></h6>
        </div>
    </td>
    <td>
        <div style="width:250px;">
        <h6><%out.println(nom); %></h6>
        </div>
    </td>
    
  </tr>
  </table>
       
      
       
       
   <%}%>
                
                
                <br>
                <center>
                    <center><input type="submit" id="aceptarP" class="btn btn-success" value="Generar excel"> </center>
             </center>               

        <br>
            </div>
            </form>
            </div>  
        
</body>


        
</html>

