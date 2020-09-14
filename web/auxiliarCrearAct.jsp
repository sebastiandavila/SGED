<%-- 
    Document   : auxiliarCrearAct
    Created on : 3/03/2019, 01:00:07 AM
    Author     : USUARIO
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="sinescalasfinal.Logica.Logica"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
             Logica lg = new Logica();
         lg.conectarBD();
         ResultSet rs = lg.mostrarE();
         
             while(rs.next()){
       String id=rs.getString("Id_entrenador");
       
             
              String calificacion;
               calificacion = request.getParameter("calificacion"+id);
               String informe = request.getParameter("informe"+id);
               String observaciones = request.getParameter("ob"+id);
               
            
               lg.insertar_eval(id, calificacion, informe);
               
  }
             
             
             response.sendRedirect("perfilAdmin.jsp");


        %>
    </body>
</html>
