<%-- 
    Document   : auxrecuperar
    Created on : 3/07/2019, 09:19:51 AM
    Author     : sebastian
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
    <%
              Logica lg = new Logica();
              lg.conectarBD();
              String ced = request.getParameter("ced");
              out.println(ced);
              
              ResultSet rs = lg.pedircorreo(ced);
               while(rs.next()){
       String clave=rs.getString("contraseña");
       String correo=rs.getString("correo");
       
       lg.recuperar(clave, correo);
         
    %>
    <body>
        <h1><%out.println(clave+"  "+correo);}%></h1>
        
    </body>
</html>
