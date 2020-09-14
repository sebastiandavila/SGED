package sinescalasfinal.Datos;


import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 * @author sebastian davila, andres, camila espinosa
 */
public class Datos {
    
    
     public static Connection conexion(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String connection = "jdbc:mysql://localhost:3306/escuela(4)";
            con = (Connection) DriverManager.getConnection(connection, "root", "");
        } catch (ClassNotFoundException ex) {            
            System.out.println("Error: No se encontró el DRIVER de conexión" + ex.toString());
        } catch (SQLException ex) {            
            System.out.println("Error: No se encontró la Base de Datos" + ex.toString());
        }
        return con;
    }
     
     
  
     
          
     
     public static int insertarConcurso(Connection con, String id, String cal, String ob, String asis, String num){
        int cantRegs = 0;
        Statement st = null;
        
        try {
            st = con.createStatement();            
            
            String strsql="INSERT INTO `calificacion` ( `Id_alumno`, `calificacion`, `observaciones`, `asistencia`, `clase_numero`) "
                    + "VALUES ( '"+id+"', '"+cal+"', '"+ob+"', '"+asis+"', '"+num+"')";
            cantRegs = st.executeUpdate(strsql);
        } catch (SQLException ex) {
            System.out.println("Error insertando usuario: " + ex.toString());
        }
        
        return 1;
    }
      public static int insertareval(Connection con, String id, String cal, String informe){
        int cantRegs = 0;
        Statement st = null;
        
        try {
            st = con.createStatement();            
            
            String strsql="INSERT INTO `evaluacion` (  `id_entrenador`, `Nota_entrenador`, `Entrega de informes`) "
                    + "VALUES ( '"+id+"', '"+cal+"', '"+informe+"')";
            cantRegs = st.executeUpdate(strsql);
        } catch (SQLException ex) {
            System.out.println("Error insertando usuario: " + ex.toString());
        }
        
        return 1;
    }
     
     public static int insertarAlumnos(Connection con, String i_d, String nom, String es,String tip,String gp,String ident,String ipago){
        int cantRegs = 0;
        Statement st = null;
        
        try {
            st = con.createStatement();            
            
            /*String strsql="INSERT INTO `alumno`  "
                    + "VALUES ( '"+i_d+"', '"+nom+"', '"+es+"', '"+gp+"', '"+ident+"', '"+ipago+"')";
            */
            String strsql="INSERT INTO `alumno` (`Id_alumno`, `Nombre_alumno`, `Estado_alumno`, `Tipo_alumno`, `grupo`, `Id_entrenador`, `id_pago`) "
                    + "VALUES ('"+i_d+"', '"+nom+"', '"+es+"', '"+tip+"', '"+gp+"', '"+ident+"', '"+ipago+"')";
            cantRegs = st.executeUpdate(strsql);
        } catch (SQLException ex) {
            System.out.println("Error insertando usuario: " + ex.toString());
        }
       
        return 1;
    }
     public static int insertarE(Connection con, String i_d, String nom, String clave){
        int cantRegs = 0;
        Statement st = null;
        
        try {
            st = con.createStatement();            
            
            /*String strsql="INSERT INTO `alumno`  "
                    + "VALUES ( '"+i_d+"', '"+nom+"', '"+es+"', '"+gp+"', '"+ident+"', '"+ipago+"')";
            */
            String strsql="INSERT INTO `entrenador` (`Id_entrenador`, `Nombre_entrenador`, `contraseña`) "
                    + "VALUES ('"+i_d+"', '"+nom+"', '"+clave+"')";
            cantRegs = st.executeUpdate(strsql);
        } catch (SQLException ex) {
            System.out.println("Error insertando usuario: " + ex.toString());
        }
       
        return 1;
    }
     public static int insertarP(Connection con, String i_d, String val, String men, String mes, String año){
        int cantRegs = 0;
        Statement st = null;
        
        try {
            st = con.createStatement();            
            
            /*String strsql="INSERT INTO `alumno`  "
                    + "VALUES ( '"+i_d+"', '"+nom+"', '"+es+"', '"+gp+"', '"+ident+"', '"+ipago+"')";
            
            String strsql="INSERT INTO `entrenador` (`Id_entrenador`, `Nombre_entrenador`, `contraseña`) "
                    + "VALUES ('"+i_d+"', '"+nom+"', '"+clave+"')";*/
           String strsql=" INSERT INTO `pago` (`Id_pago`, `Valor_pago`, `Mensaje_pago`, `mes`, `año`) "
                   + "VALUES ('"+i_d+"', '"+val+"', '"+men+"', '"+mes+"', '"+año+"')";
            cantRegs = st.executeUpdate(strsql);
        } catch (SQLException ex) {
            System.out.println("Error " + ex.toString());
        }
       
        return 1;
    }
     public static int insertard(Connection con, String i_d, String tipo, String categoria){
        int cantRegs = 0;
        Statement st = null;
        
        try {
            st = con.createStatement();            
            
            /*String strsql="INSERT INTO `alumno`  "
                    + "VALUES ( '"+i_d+"', '"+nom+"', '"+es+"', '"+gp+"', '"+ident+"', '"+ipago+"')";
            
            String strsql="INSERT INTO `entrenador` (`Id_entrenador`, `Nombre_entrenador`, `contraseña`) "
                    + "VALUES ('"+i_d+"', '"+nom+"', '"+clave+"')";*/
           String strsql=" INSERT INTO `deporte` (`Id_deporte`, `Tipo_deporte`, `Categoria_deporte`)"
                   + "VALUES ('"+i_d+"', '"+tipo+"', '"+categoria+"')";
            cantRegs = st.executeUpdate(strsql);
        } catch (SQLException ex) {
            System.out.println("Error " + ex.toString());
        }
       
        return 1;
    }
     
     
     
     
     
    
     
      
       public static  int buscarU(Connection con, String u, String clave){  /////////////////////////////////////////////////////////////////////////////////////////////
         ResultSet rs = null;
         Statement st = null;
         int p=0;
         
        
        try {
            st = con.createStatement();
            
            rs = st.executeQuery("SELECT Id_entrenador FROM entrenador WHERE Id_entrenador = '" + u + "' AND Contraseña = '" + clave + "'");
            while(rs.next()){
                String k=rs.getString(1);
                
                p=1;
            }
            rs.close();
            st.close();
                 
           
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error con la conexión a la Base de Datos " + ex.toString());
        } 
           
        return p;

      }
       
       public static  int buscarA(Connection con, String u, String clave){  /////////////////////////////////////////////////////////////////////////////////////////////
         ResultSet rs = null;
         Statement st = null;
         int p=0;
         
        
        try {
            st = con.createStatement();
            
            rs = st.executeQuery("SELECT identificacion FROM admin WHERE identificacion = '" + u + "' AND Contraseña = '" + clave + "'");
            while(rs.next()){
                String k=rs.getString(1);
                
                p=1;
            }
            rs.close();
            st.close();
                 
           
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error con la conexión a la Base de Datos " + ex.toString());
        } 
           
        return p;

      }
       
       public static  ResultSet mostrar(Connection con, String id){  /////
       
       ResultSet rs = null;
        Statement st = null;
        
        try {
            st = con.createStatement();
            String strsql = "SELECT * FROM alumno WHERE `alumno`.`Id_entrenador` = '"+id+"'";
                             
                            
            rs = st.executeQuery(strsql);
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error con la conexión a la Base de Datos" + ex.toString());
        }        
        return rs;
       
      }
       public static  ResultSet mostrarE(Connection con){  /////
       
       ResultSet rs = null;
        Statement st = null;
        
        try {
            st = con.createStatement();
            String strsql = "SELECT * FROM entrenador ";
                             
                            
            rs = st.executeQuery(strsql);
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error con la conexión a la Base de Datos" + ex.toString());
        }        
        return rs;
       
      }
        public static  ResultSet consulta(Connection con, String id){  /////
       
       ResultSet rs = null;
        Statement st = null;
        
        try {
            st = con.createStatement();
            String strsql = "SELECT * FROM calificacion WHERE `calificacion`.`Id_alumno` = '"+id+"'";
                             
                            
            rs = st.executeQuery(strsql);
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error con la conexión a la Base de Datos" + ex.toString());
        }        
        return rs;
       
      }
       
       
       
       public int insertar_cal(Connection con, String id, String cal, String ob, String asis, String num)
       {
       int cantRegs = 0;
        Statement st = null;
        
        try {
            st = con.createStatement();            
            
            String strsql="INSERT INTO `calificacion` (`codigo`, `Id_alumno`, `calificacion`, `observaciones`, `asistencia`, `clase_numero`) "
                    + "VALUES (NULL, '"+id+"', '"+cal+"', '"+ob+"', '"+asis+"', '"+num+"');";
            cantRegs = st.executeUpdate(strsql);
        } catch (SQLException ex) {
            System.out.println("Error insertando usuario: " + ex.toString());
        }
        
        return 1;
       }
       
       public static ResultSet prom(Connection con, String id){
        float cantRegs = 0;
        Statement st = null;
         ResultSet rs = null;
        try {
            st = con.createStatement();            
            String strsql = "SELECT AVG(calificacion) FROM calificacion WHERE Id_alumno='"+id+"'" ;
            //rs = st.executeUpdate(strsql);
             rs = st.executeQuery(strsql);
        } catch (SQLException ex) {
            System.out.println("Error  " + ex.toString());
        }
        
        return rs;
    }
       public static ResultSet promE(Connection con, String id){
        float cantRegs = 0;
        Statement st = null;
         ResultSet rs = null;
        try {
            st = con.createStatement();            
            String strsql = "SELECT AVG(Nota_entrenador) FROM evaluacion WHERE id_entrenador='"+id+"'" ;
            //rs = st.executeUpdate(strsql);
             rs = st.executeQuery(strsql);
        } catch (SQLException ex) {
            System.out.println("Error : " + ex.toString());
        }
        
        return rs;
    }
       
       public static  ResultSet mostrar_prom(Connection con){  /////
       
       ResultSet rs = null;
        Statement st = null;
        
        try {
            st = con.createStatement();
            String strsql = "SELECT * FROM alumno";
                             
                            
            rs = st.executeQuery(strsql);
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error con la conexión a la Base de Datos" + ex.toString());
        }        
        return rs;
       
      }
        public static  ResultSet mostrar_promE(Connection con){  /////
       
       ResultSet rs = null;
        Statement st = null;
        
        try {
            st = con.createStatement();
            String strsql = "SELECT * FROM entrenador";
                             
                            
            rs = st.executeQuery(strsql);
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error con la conexión a la Base de Datos" + ex.toString());
        }        
        return rs;
       
      }
        
        public static ResultSet pagosA(Connection con, String año)
        {
        ResultSet rs = null;
        Statement st = null;
        
        try {
            st = con.createStatement();
            String strsql = "SELECT SUM(Valor_pago) FROM pago WHERE año='"+año+"'"; ///////////////////////////////////////////////////////////////
                             
                            
            rs = st.executeQuery(strsql);
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error con la conexión a la Base de Datos" + ex.toString());
        }        
        return rs;
        
        }
        
        public static ResultSet pagosM(Connection con, String año, String mes)
        {
        ResultSet rs = null;
        Statement st = null;
        
        try {
            st = con.createStatement();
            String strsql ="SELECT SUM(Valor_pago) FROM pago WHERE año='"+año+"' AND mes='"+mes+"'"; 
                    
                    //"SELECT SUM(Valor_pago) FROM pago WHERE año='"+año+"'"; ///////////////////////////////////////////////////////////////
                             
                            
            rs = st.executeQuery(strsql);
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error con la conexión a la Base de Datos" + ex.toString());
        }        
        return rs;
        
        }
        
        public static ResultSet pedirCorreo(Connection con, String ced){
            ResultSet rs = null;
        Statement st = null;
        
        try {
            st = con.createStatement();
            String strsql ="SELECT correo, contraseña FROM `entrenador` WHERE Id_entrenador='"+ced+"'"; 
                    
            
                    //"SELECT SUM(Valor_pago) FROM pago WHERE año='"+año+"'"; ///////////////////////////////////////////////////////////////
                          
                            
            rs = st.executeQuery(strsql);
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error con la conexión a la Base de Datos" + ex.toString());
        }        
        return rs;
        }
       
      
}