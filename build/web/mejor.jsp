<%-- 
    Document   : adminConcurso
    Created on : 24/02/2019, 09:37:27 PM
    Author     : USUARIO
--%>

<%@page import="sinescalasfinal.Logica.ConexionExcel"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="sinescalasfinal.Logica.Logica"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
         <title>Administrador</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="shortcut icon" href="Img/SinEscalasICO.ico"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link rel="stylesheet" href="CSS/Estilo.css"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <link rel="stylesheet" href="icomoon/style.css"/>
    </head>
    <body>
       
<%
            Logica lg = new Logica();
                float mayor = 0;
                String mejore = "";
                lg.conectarBD();
                ResultSet rs = lg.mostrar_prom();
                while (rs.next()) {
                    String id1 = rs.getString("Id_alumno");
                    ResultSet l = lg.prom(id1);
                    while (l.next()) {

                        String id = l.getString("AVG(calificacion)");
                        if (id != null) {
                            float flotante = Float.parseFloat(id);
                            if (flotante > mayor) {
                                mejore = rs.getString("Id_alumno");
                                mayor = flotante;
                            }

                        }

                    }
                }
                //out.println(mejore);
                float mayore=0;
                String mejorentre="";
                ResultSet rse = lg.mostrar_promE();    ///
                while (rse.next()) {
                    String identificacion = rse.getString("Id_entrenador");
                    ResultSet promedios = lg.promE(identificacion);
                    while (promedios.next()) {

                        String avg = promedios.getString("AVG(Nota_entrenador)");
                        if (avg != null) {
                            float flotante = Float.parseFloat(avg);
                            if (flotante > mayore) {
                                mejorentre = rse.getString("Id_entrenador");
                                mayore = flotante;
                                
                            }

                        }

                    }
                }
              
               
              
               ConexionExcel a = new ConexionExcel();
               a.crearExcel_mejor(mejore, mayor, mejorentre, mayore);
               
                 
               

%>
<script src="JS/mensaje.js"></script>
</body>
</html>


