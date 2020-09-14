<%-- 
    Document   : auxiliarEliminarAct
    Created on : 3/03/2019, 01:22:32 AM
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
              String año = request.getParameter("a");
              String nombre = request.getParameter("a");
              String mes = request.getParameter("mes");
              
               ResultSet rs = lg.pagosM(año, mes);
              
              
              while(rs.next()){
       
       String nom=rs.getString("SUM(Valor_pago)"); %>
      
        <div style="width:250px;">
        <h6><%out.println("En el mes "+mes+" del año "+año+" se recibieron "+nom+" pesos en pagos."); %></h6>
        </div>
   
      
   <%}%>
         
             
             
    </body>
</html>
