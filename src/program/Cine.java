/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package program;

/**
 * 
 * @author David Massana
 */
public class Cine {
    private String nameCine;
    private String lema;
    
    public Cine(String nameCine){
        this.nameCine = nameCine;
    }
    
    public Cine(String nameCine, String lema){
        this.nameCine = nameCine;
        this.lema = lema;
    }

    public String getNameCine() {
        return nameCine;
    }

    public void setNameCine(String nameCine) {
        this.nameCine = nameCine;
    }

    public String getLema() {
        return lema;
    }

    public void setLema(String lema) {
        this.lema = lema;
    }
    
    
}
