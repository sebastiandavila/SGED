
package sinescalasfinal.Logica;

/**
 * @author David Cordoba Pimienta, Valentina Hernandez Arroyave y Juan Pablo Hincapie Cardenas
 */
public class Concurso {
    
    private String cod_concurso = "";
    private String nombre_concurso = "";
    private String dia_inicio = "";
    private String mes_inicio = "";
    private String año_inicio = "";
    private String dia_fin = "";
    private String mes_fin = "";
    private String año_fin = "";
    
    
    public Concurso(String cod_concurso, String nombre_concurso, String dia_inicio, String mes_inicio, String año_inicio, String dia_fin, String mes_fin, String año_fin) {
        
        this.cod_concurso = cod_concurso;
        this.nombre_concurso = nombre_concurso;
        this.dia_inicio = dia_inicio;
        this.mes_inicio = mes_inicio;
        this.año_inicio = año_inicio;
        this.dia_fin = dia_fin;
        this.mes_fin = mes_fin;
        this.año_fin = año_fin;
        
    }
    
    public String getCod_concurso() {
        return cod_concurso;
    }

    public void setCod_concurso(String cod_concurso) {
        this.cod_concurso = cod_concurso;
    }

    public String getNombre_concurso() {
        return nombre_concurso;
    }

    public void setNombre_concurso(String nombre_concurso) {
        this.nombre_concurso = nombre_concurso;
    }
    
    public String getDia_inicio() {
        return dia_inicio;
    }

    public void setDia_inicio(String dia_inicio) {
        this.dia_inicio = dia_inicio;
    }
    
    public String getMes_inicio() {
        return mes_inicio;
    }

    public void setMes_inicio(String mes_inicio) {
        this.mes_inicio = mes_inicio;
    }
    
    public String getAño_inicio() {
        return año_inicio;
    }

    public void setAño_inicio(String año_inicio) {
        this.año_inicio = año_inicio;
    }
    
    public String getDia_fin() {
        return dia_fin;
    }

    public void setDia_fin(String dia_fin) {
        this.dia_fin = dia_fin;
    }
    
    public String getMes_fin() {
        return mes_fin;
    }

    public void setMes_fin(String mes_fin) {
        this.mes_fin = mes_fin;
    }
    
    public String getAño_fin() {
        return año_fin;
    }

    public void setAño_fin(String año_fin) {
        this.año_fin = año_fin;
    }
    
}
