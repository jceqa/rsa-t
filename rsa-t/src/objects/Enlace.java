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
    int inicioRanuraTrans, finRanuraTrans;
    List<Boolean> ranurasTrans;

    public Enlace (){
        inicio = -1;
        fin = -1;
        ranuras = new ArrayList<>();
        inicioRanuraTrans = -1;
        finRanuraTrans = -1;
        ranurasTrans = new ArrayList<>();
    }

    public Enlace(int p, int s, List<Boolean> ranuras, int r,  int t, List<Boolean> ranurasTrans) {
        this.inicio = p;
        this.fin = s;
        this.ranuras = ranuras;
        this.inicioRanuraTrans = r;
        this.finRanuraTrans = t;
        this.ranurasTrans = ranurasTrans;
    }

    public int getInicioRanuraTrans() {
        return inicioRanuraTrans;
    }

    public void setInicioRanuraTrans(int inicioRanuraTrans) {
        this.inicioRanuraTrans = inicioRanuraTrans;
    }

    public int getFinRanuraTrans() {
        return finRanuraTrans;
    }

    public void setFinRanuraTrans(int finRanuraTrans) {
        this.finRanuraTrans = finRanuraTrans;
    }

    public List<Boolean> getRanurasTrans() {
        return ranurasTrans;
    }

    public void setRanurasTrans(List<Boolean> ranurasTrans) {
        this.ranurasTrans = ranurasTrans;
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
