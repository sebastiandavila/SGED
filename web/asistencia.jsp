
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
        <%   HttpSession objSesion = request.getSession(false);
            String usuario = (String) objSesion.getAttribute("usuario");
            Logica lg = new Logica();
            lg.conectarBD();
            ResultSet rs = lg.mostrar(usuario);
        %>




        <nav class="navbar navbar-light" id="mainNav" style="background-color:#52a552"> 
            <div class="container">
                <h8 href="#page-top" ></h8>    <ul class="nav justify-content-end">
                    <li class="nav-item">
                        <a class="nav-link" href="#"><span7 class="icon-exit"> </span7></a>
                    </li>
                </ul>                                                                 


            </div>

        </nav>
        <br>
    <center>
        <h9>Asistencia</h9>
    </center>
    <br>



    <div class="container">
        <form id="actualizarPerfilU" methos="POST" action="auxiliarActualizarPerfil.jsp">
            <div class="form-group">
                <input type="text" name="clase" id="clase" placeholder="numero de la clase">
                <%
                    while (rs.next()) {
                        String id = rs.getString("Id_alumno");
         String nom = rs.getString("Nombre_alumno"); %>
                <table class="egt">

                    <tr>

                        <td>
                            <div style="width:150px;">
                                <h6><%out.println(id); %></h6>
                            </div>
                        </td>
                        <td>
                            <div style="width:250px;">
                                <h6><%out.println(nom); %></h6>
                            </div>
                        </td>

                        <td>  <div style="width:220px;"><select id="calificacion" name=<%out.println("calificacion" + id);%> class="form-control" >
                                    <option selected="true" disabled="disabled">Calificacion de la clase</option>
                                    <option>1</option>
                                    <option>2</option>
                                    <option>3</option>
                                    <option>4</option>
                                    <option>5</option>
                                </select></div>
                            &nbsp;&nbsp;
                        </td>

                        <td>
                            &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;
                            <label>asistencia&nbsp;<input type="checkbox" id="cbox1" value="si" name=<%out.println("asistencia" + id);%>> </label><br>
                        </td>
                        <td>
                            <textarea name=<%out.println("ob" + id);%> rows="1" cols="40" placeholder="Observaciones"></textarea>
                        </td>
                    </tr>
                </table>




                <%}%>


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



