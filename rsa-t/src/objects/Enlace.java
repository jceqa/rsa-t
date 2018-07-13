/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author Julio
 */
import java.util.ArrayList;
import java.util.List;

public class Enlace {
    
    int inicio, fin;
    List<Boolean> ranuras;

    public Enlace (){
        inicio = -1;
        fin = -1;
        ranuras = new ArrayList<>();
    }

    public Enlace(int p, int s, List<Boolean> ranuras) {
        this.inicio = p;
        this.fin = s;
        this.ranuras = ranuras;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public List<Boolean> getRanuras() {
        return ranuras;
    }

    public void setRanuras(List<Boolean> ranuras) {
        this.ranuras = ranuras;
    }
}
