
<%@page import="java.util.Objects"%>
<%@page import="sinescalasfinal.Logica.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
    </head>
    <body>
        <%
            
            Logica lg = new Logica();
            int u=0;
            
            
            
            lg.conectarBD();
            
            String usuario = request.getParameter("usuario");
            String clave = request.getParameter("clave");
            System.out.println(usuario);
            int a;
            
            
            u = lg.buscarU(usuario, clave);
            a=lg.buscarA(usuario, clave);
            
            
            if(u == 1){
                 //response.sendRedirect("perfilUsuario.jsp");
                
                HttpSession objSesion = request.getSession(true); 
                String user = usuario; //aqui tu identificador de usuario
                objSesion.setAttribute("usuario", user );
                out.println("Poniendo usuario en sesion ...");

                 String parametrosJspOrigen="lol";
                 String urlDestino = "perfilUsuario.jsp?"+parametrosJspOrigen;
                 response.sendRedirect(urlDestino);
            }
            else if(a==1){
               
               
                     response.sendRedirect("perfilAdmin.jsp");
               }
            else{
                %><script>
                    window.alert('¡Alerta!');
                    </script>
                    <%     
                 
                 String urlDestino = "inicioSesion.jsp?";
                 response.sendRedirect(urlDestino);
                    
                          
               
            }

        %>
        
    </body>
</html>
