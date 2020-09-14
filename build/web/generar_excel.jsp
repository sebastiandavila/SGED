<%-- 
    Document   : responderPregunta
    Created on : 24/02/2019, 09:20:39 PM
    Author     : USUARIO
--%>
<%@page import="java.awt.FileDialog"%>
<%@page import="sinescalasfinal.Logica.*"%>
<%@page import="java.sql.ResultSet" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

        <%
            HttpSession objSesion1 = request.getSession(false); 
            String alumno = (String)objSesion1.getAttribute("alumno");
        ConexionExcel a = new ConexionExcel();
        //String idu = request.getParameter("archivo");
        //String dir ="C:/Users/sebastian/Desktop/"+idu;
        a.crearExcel(alumno);
        int i=a.mostrar();
        out.println(i);
        
            String urlDestino = "consultar_alumno.jsp?";
                 response.sendRedirect(urlDestino);
        
        %>
        
        
        
       