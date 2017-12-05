
package martes_5_12_2017;

import java.util.ArrayList;


public class Palabra {
    private String palabra;
    private  String ayuda;
    public Palabra(String palabra,String ayuda ){
        this.palabra=palabra;
        this.ayuda=ayuda;
        
    }
    public Palabra(){
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getAyuda() {
        return ayuda;
    }

    public void setAyuda(String ayuda) {
        this.ayuda = ayuda;
    }
    private void SeleccionarPalabra(){
    }
    
}
