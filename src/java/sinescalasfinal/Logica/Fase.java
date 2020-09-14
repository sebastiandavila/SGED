
package sinescalasfinal.Logica;

/**
 * @author David Cordoba Pimienta, Valentina Hernandez Arroyave y Juan Pablo Hincapie Cardenas
 */
public class Fase {
    
    private int num_fase = 01;
    private String descripcion_fase = "";
    private int tiempo = 00;
    private String cod_concurso = "00001";

    public String getCod_concurso() {
        return cod_concurso;
    }

    public void setCod_concurso(String cod_concurso) {
        this.cod_concurso = cod_concurso;
    }

    
    public Fase(int num_fase, String descripcion_fase, int tiempo, String cod){
        
        this.num_fase = num_fase;
        this.descripcion_fase = descripcion_fase;
        this.tiempo = tiempo;
        this.cod_concurso=cod;
    }
    

    public int getNum_fase() {
        return num_fase;
    }

    public void setNum_fase(int num_fase) {
        this.num_fase = num_fase;
    }
    
    
    public String getDescripcion_fase() {
        return descripcion_fase;
    }

    public void setDescripcion_fase(String descripcion_fase) {
        this.descripcion_fase = descripcion_fase;
    }
        

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    

}
