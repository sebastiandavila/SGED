package sinescalasfinal.Logica;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import com.sun.rowset.internal.Row;
import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;
import java.awt.FileDialog;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Cell;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.websocket.Session;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import sinescalasfinal.Datos.*;
import sun.rmi.transport.Transport;

/**
 * @author David Cordoba Pimienta, Valentina Hernandez Arroyave y Juan Pablo
 * Hincapie Cardenas
 */
public class Logica {

    private Connection con;
    private ResultSet rs;
    private Concurso c;

    public void conectarBD() {
        con = Datos.conexion();
        System.out.println("Conexión establecida.");
    }

    public ResultSet prom(String id) {
        ResultSet pro = Datos.prom((com.mysql.jdbc.Connection) con, id);
        return pro;
    }

    public ResultSet promE(String id) {
        ResultSet pro = Datos.promE((com.mysql.jdbc.Connection) con, id);
        return pro;
    }

    public int buscarU(String usuario, String clave) {
        int t = Datos.buscarU((com.mysql.jdbc.Connection) con, usuario, clave);
        return t;
    }

    public ResultSet mostrar(String id) {
        rs = Datos.mostrar((com.mysql.jdbc.Connection) con, id);
        return rs;
    }

    public ResultSet mostrarE() {
        rs = Datos.mostrarE((com.mysql.jdbc.Connection) con);
        return rs;
    }

    public ResultSet mostrar_prom() {
        rs = Datos.mostrar_prom((com.mysql.jdbc.Connection) con);
        return rs;
    }

    public ResultSet mostrar_promE() {
        rs = Datos.mostrar_promE((com.mysql.jdbc.Connection) con);
        return rs;
    }

    public ResultSet consulta(String id) {
        rs = Datos.consulta((com.mysql.jdbc.Connection) con, id);
        return rs;
    }

    public int insertar_cal(String id, String cal, String ob, String asis, String num) {
        //rs = Datos.mostrarActividad((com.mysql.jdbc.Connection) con);
        int i = Datos.insertarConcurso((com.mysql.jdbc.Connection) con, id, cal, ob, asis, num);
        return 1;
    }

    public int insertar_eval(String id, String cal, String informe) {
        //rs = Datos.mostrarActividad((com.mysql.jdbc.Connection) con);
        int i = Datos.insertareval((com.mysql.jdbc.Connection) con, id, cal, informe);
        return 1;
    }

    public int buscarA(String usuario, String clave) {
        int t = Datos.buscarA((com.mysql.jdbc.Connection) con, usuario, clave);
        return t;
    }

    public int insertar_alumnos(String i_d, String nom, String es, String tip, String gp, String ident, String ipago) {
        //rs = Datos.mostrarActividad((com.mysql.jdbc.Connection) con);
        int i = Datos.insertarAlumnos((com.mysql.jdbc.Connection) con, i_d, nom, es, tip, gp, ident, ipago);
        return 1;
    }

    public int insertar_E(String i_d, String nom, String clave) {
        //rs = Datos.mostrarActividad((com.mysql.jdbc.Connection) con);
        int i = Datos.insertarE((com.mysql.jdbc.Connection) con, i_d, nom, clave);
        return 1;
    }

    public int insertar_p(String i_d, String val, String men, String mes, String año) {
        //rs = Datos.mostrarActividad((com.mysql.jdbc.Connection) con);
        int i = Datos.insertarP((com.mysql.jdbc.Connection) con, i_d, val, men, mes, año);///////////////////////////////////
        return 1;
    }

    public int insertar_d(String i_d, String tip, String cat) {
        //rs = Datos.mostrarActividad((com.mysql.jdbc.Connection) con);
        int i = Datos.insertard((com.mysql.jdbc.Connection) con, i_d, tip, cat);
        return 1;
    }

    public ResultSet pagosA(String año) {
        ResultSet pro = Datos.pagosA((com.mysql.jdbc.Connection) con, año);
        return pro;
    }

    public ResultSet pagosM(String año, String mes) {
        ResultSet pro = Datos.pagosM((com.mysql.jdbc.Connection) con, año, mes);
        return pro;
    }
    
    public ResultSet pedircorreo(String cedula) {
        ResultSet rs=Datos.pedirCorreo((com.mysql.jdbc.Connection) con, cedula);
        return rs;
    }
    

    public void recuperar(String clave, String correo) {
        Properties propiedad = new Properties();

        propiedad.setProperty("mail.smtp.host", "smtp.gmail.com");
        propiedad.setProperty("mail.smtp.starttls.enable", "true");
        propiedad.setProperty("mail.smtp.port", "587");
        propiedad.setProperty("mail.smtp.auth", "true");
        
       
        
        

        javax.mail.Session sesion = javax.mail.Session.getDefaultInstance(propiedad);
        

        String Codigo = clave; //hacer igual a la contraseña en la BD

        String envia = "soportesged@gmail.com";
        String contra = "Davila12345";
        String recibe = correo; //de la base de datos lo tomamos
        String asunto = "Petición de Recuperación de Contraseña";
        String mensaje = "Cordial Saludo\nDebido a una solicitud se le envia la contraseña de su usuario en SGED\n La Contraseña es:\n" + Codigo;
        
       MimeMessage mail = new MimeMessage(sesion);

        try {
            mail.setFrom(new InternetAddress(envia));
            mail.addRecipient(javax.mail.Message.RecipientType.TO, new InternetAddress(recibe));
            mail.setSubject(asunto);
            mail.setText(mensaje);

            javax.mail.Transport transportar = sesion.getTransport("smtp");
            transportar.connect(envia, contra);
            transportar.sendMessage(mail, mail.getRecipients(javax.mail.Message.RecipientType.TO));
            transportar.close();

          //  JOptionPane.showMessageDialog(null, "Favor revisar el correo electronico con el mensaje con su contraseña");

        } catch (javax.mail.MessagingException ex) {
            Logger.getLogger(Logica.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
