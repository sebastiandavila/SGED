/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinescalasfinal.Logica;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.System.out;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Ninguno
 */
public class ConexionExcel {
 
    
    
    
    public int mostrar()
    {
    
    return 16;
    
    }
    public static void crearExcel(String alumno){
        Logica lg = new Logica();
         lg.conectarBD();
                Workbook book = new XSSFWorkbook();
        Sheet sheet = book.createSheet("pestaña1");
        Sheet sheet2 = book.createSheet("pestaña2");
        
        
        Row row = sheet.createRow(0);
        //Esto es lo que se coloca en las columnas
        //En estas se organiza de manera horizontal
        //Row es una fila
        row.createCell(0).setCellValue("numero de clase");
        row.createCell(1).setCellValue("asistencia");
        row.createCell(2).setCellValue("observaciones");
        row.createCell(3).setCellValue("calificacion");
        
        int i=1;
     ResultSet rs = lg.consulta(alumno);
        try {
            while(rs.next()){
                
                String cal=rs.getString("calificacion");
                String ob=rs.getString("observaciones");
                String clase=rs.getString("clase_numero");
                String asis=rs.getString("asistencia");
            Row rowUno = sheet.createRow(i);
            
            rowUno.createCell(0).setCellValue(clase);
            rowUno.createCell(1).setCellValue(asis);
            rowUno.createCell(2).setCellValue(ob);
            rowUno.createCell(3).setCellValue(cal);
            
            i++;
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexionExcel.class.getName()).log(Level.SEVERE, null, ex);
        }
     
      
        try {
                    try (FileOutputStream fileout = new FileOutputStream("C:\\Users\\sebastian\\Desktop\\"+alumno+".xlsx")) {
                        out.println("archivo creado");
                        book.write(fileout);
                    }
            out.println("FDfsdvsd");

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Logica.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Logica.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    
    public static void crearExcel_mejor(String alumno, float notaa, String en, float notae){
        Logica lg = new Logica();
         lg.conectarBD();
                Workbook book = new XSSFWorkbook();
        Sheet sheet = book.createSheet("pestaña1");
        //Sheet sheet2 = book.createSheet("pestaña2");
        
        
        Row row = sheet.createRow(0);
        //Esto es lo que se coloca en las columnas
        //En estas se organiza de manera horizontal
        //Row es una fila
        row.createCell(0).setCellValue("identificacion entrenador");
        row.createCell(1).setCellValue("promedio evaluacion");
        
      row = sheet.createRow(1);
        row.createCell(0).setCellValue(en);
        row.createCell(1).setCellValue(notae);
        
         row = sheet.createRow(2);
        row.createCell(0).setCellValue("identificacion alumno");
        row.createCell(1).setCellValue("calificacion promedio");
        
        row = sheet.createRow(3);
        row.createCell(0).setCellValue(alumno);
        row.createCell(1).setCellValue(notaa);
   
       
     
      
        try {
                    try (FileOutputStream fileout = new FileOutputStream("C:\\Users\\sebastian\\Desktop\\"+"mejores"+".xlsx")) {
                        out.println("archivo creado");
                        book.write(fileout);
                    }
            out.println("FDfsdvsd");

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Logica.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Logica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void leerExcela(String dir){
    Logica lg = new Logica();
         lg.conectarBD();
        try {
            FileInputStream file = new FileInputStream(new File(dir));

            try {
               
               XSSFWorkbook wb = new XSSFWorkbook(file);
               
               XSSFSheet sheet = wb.getSheetAt(0);  
               
            int nFilas = sheet.getLastRowNum();
            
            for (int i = 0; i <= nFilas; i++) {
                
                Row fila = sheet.getRow(i);
              //  int nColum = sheet.getLastCellNum();
          
              Cell id = fila.getCell(0);   //Id 	Nombre 	Estado	Tipo	Grupo	 id_entrenador	id_pago
                Cell nombre = fila.getCell(1);
              Cell estado = fila.getCell(2);
               Cell tipo = fila.getCell(3);
                    Cell grupo = fila.getCell(4);
                    Cell id_entrenador = fila.getCell(5);
                    Cell id_pago = fila.getCell(6);
                    DataFormatter formatter = new DataFormatter();
                    //String i_d=id.getStringCellValue();
                    String i_d=formatter.formatCellValue(id);
                    String nom=nombre.getStringCellValue();
                    String es=estado.getStringCellValue();
                    String tip=tipo.getStringCellValue();
                    //String gp=grupo.getStringCellValue();
                    String gp=formatter.formatCellValue(grupo);
                    //String ident=id_entrenador.getStringCellValue();
                    String ident=formatter.formatCellValue(id_entrenador);
                    //String ipago=id_pago.getStringCellValue();
                    String ipago=formatter.formatCellValue(id_pago);
                    
                    lg.insertar_alumnos(i_d, nom, es, tip, gp, ident, ipago);
                    
                   // System.out.println(celda.getStringCellValue()+" ");
                
                System.out.println("\n");
            }
                
                
            } catch (IOException ex) {
                Logger.getLogger(ConexionExcel.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConexionExcel.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    public static void leerExcelE(String dir){
    Logica lg = new Logica();
         lg.conectarBD();
        try {
            FileInputStream file = new FileInputStream(new File(dir));

            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sheet = wb.getSheetAt(0);
            int nFilas = sheet.getLastRowNum();
            for (int i = 0; i <= nFilas; i++) {
                
                Row fila = sheet.getRow(i);
                //  int nColum = sheet.getLastCellNum();
                
                Cell id = fila.getCell(0);   //Id 	Nombre 	Estado	Tipo	Grupo	 id_entrenador	id_pago
                Cell nombre = fila.getCell(1);
                Cell contraseña = fila.getCell(2);
                
                DataFormatter formatter = new DataFormatter();
                //String i_d=id.getStringCellValue();
                String i_d=formatter.formatCellValue(id);
                String nom=nombre.getStringCellValue();
                //String clave=contraseña.getStringCellValue();
                String clave=formatter.formatCellValue(contraseña);
                
                
                lg.insertar_E(i_d, nom, clave);
                
                // System.out.println(celda.getStringCellValue()+" ");
                
                System.out.println("\n");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConexionExcel.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public static void leerExcelp(String dir){
    Logica lg = new Logica();
         lg.conectarBD();
        try {
            FileInputStream file = new FileInputStream(new File(dir));

            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sheet = wb.getSheetAt(0);
            int nFilas = sheet.getLastRowNum();
            for (int i = 0; i <= nFilas; i++) {
                
                Row fila = sheet.getRow(i);
                //  int nColum = sheet.getLastCellNum();
                
                Cell id = fila.getCell(0);   //Id 	Nombre 	Estado	Tipo	Grupo	 id_entrenador	id_pago
                Cell valor = fila.getCell(1);
                Cell mensaje = fila.getCell(2);
                Cell mes = fila.getCell(3);
                Cell año = fila.getCell(4);
                
                
                DataFormatter formatter = new DataFormatter();
                String men=mensaje.getStringCellValue();
                String val=formatter.formatCellValue(valor);
                String mes1=formatter.formatCellValue(mes);
                String año1=formatter.formatCellValue(año);
                String i_d=formatter.formatCellValue(id);
                //String nom=nombre.getStringCellValue();
                //String clave=contraseña.getStringCellValue();
                //String clave=formatter.formatCellValue(contraseña);
                
                
                lg.insertar_p(i_d, val, men, mes1, año1); ////////////////////////////////////////////////////////////////////////////////
                
                // System.out.println(celda.getStringCellValue()+" ");
                
                System.out.println("\n");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConexionExcel.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
     public static void leerExceld(String dir){
    Logica lg = new Logica();
         lg.conectarBD();
        try {
            FileInputStream file = new FileInputStream(new File(dir));

            try {
               
               XSSFWorkbook wb = new XSSFWorkbook(file);
               
               XSSFSheet sheet = wb.getSheetAt(0);  
               
            int nFilas = sheet.getLastRowNum();
            
            for (int i = 0; i <= nFilas; i++) {
                
                Row fila = sheet.getRow(i);
              //  int nColum = sheet.getLastCellNum();
          
              Cell id = fila.getCell(0);   
                Cell tipo = fila.getCell(1);
              Cell categoria = fila.getCell(2);
             
               
                    DataFormatter formatter = new DataFormatter();
                    
                    String cat=formatter.formatCellValue(categoria);
                    String tip=formatter.formatCellValue(tipo);
                    String i_d=formatter.formatCellValue(id);
                    //String nom=nombre.getStringCellValue();
                    //String clave=contraseña.getStringCellValue();
                     //String clave=formatter.formatCellValue(contraseña);
                    
                    
                    lg.insertar_d(i_d, tip, cat);
                    
                   // System.out.println(celda.getStringCellValue()+" ");
                
                System.out.println("\n");
            }
                
                
            } catch (IOException ex) {
                Logger.getLogger(ConexionExcel.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConexionExcel.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
