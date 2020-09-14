<%-- 
    Document   : auxiliarCrearU
    Created on : 1/03/2019, 03:27:57 PM
    Author     : USUARIO
--%>
<%@page import="sinescalasfinal.Logica.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


        
        <%
            Logica lg = new Logica();
            
             ConexionExcel a = new ConexionExcel();
            
             lg.conectarBD();
            
             String nombre = request.getParameter("archivo");                 
             //String nombre = request.getParameter("nombre");
             String dir="C:/Users/sebastian/Desktop/"+nombre;
             //holi
             a.leerExcelp(dir);
              
             response.sendRedirect("perfilAdmin.jsp");
        
        
        %>
  