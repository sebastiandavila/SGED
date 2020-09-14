
<%@page import="java.sql.ResultSet"%>
<%@page import="sinescalasfinal.Logica.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    
         <%HttpSession objSesion = request.getSession(false); 
String usuario = (String)objSesion.getAttribute("usuario");
             Logica lg = new Logica();
         lg.conectarBD();
         ResultSet rs = lg.mostrar(usuario);
         String num = request.getParameter("clase");
             while(rs.next()){
       String id=rs.getString("Id_alumno");
       String nom=rs.getString("Nombre_alumno");
             
              String calificacion;
               calificacion = request.getParameter("calificacion"+id);
               String asistencia = request.getParameter("asistencia"+id);
               String observaciones = request.getParameter("ob"+id);
               if(asistencia==null)
               {
                   asistencia="No";
                   calificacion="";
               }
            
               lg.insertar_cal(id, calificacion, observaciones, asistencia, num);
               
  }
             
             
             response.sendRedirect("perfilUsuario.jsp");


        %>
    </body>
</html>
