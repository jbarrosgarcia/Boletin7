/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7;

/**
 *
 * @author Jose Barros
 */
public class Libro {
    private String nomeAutor;
    private String nomeLibro;
    private int exemplares;
    private int exempPrest;

    public Libro() {
    }

    public Libro(String nomeAutor, String nomeLibro, int exemplares, int exempPrest) {
        this.nomeAutor = nomeAutor;
        this.nomeLibro = nomeLibro;
        this.exemplares = exemplares;
        this.exempPrest = exempPrest;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getNomeLibro() {
        return nomeLibro;
    }

    public void setNomeLibro(String nomeLibro) {
        this.nomeLibro = nomeLibro;
    }

    public int getExemplares() {
        return exemplares;
    }

    public void setExemplares(int exemplares) {
        this.exemplares = exemplares;
    }

    public int getExempPrest() {
        return exempPrest;
    }

    public void setExempPrest(int exempPrest) {
        this.exempPrest = exempPrest;
    }

    @Override
    public String toString() {
        return "Libro{" + "nomeAutor=" + nomeAutor + ", nomeLibro=" + nomeLibro + ", exemplares=" + exemplares + ", exempPrest=" + exempPrest + '}';
    }
    public boolean prestamo(int y){
        boolean pres=false;
        if(this.exemplares<this.exempPrest&&this.exemplares>(y+this.exempPrest)){
            this.exempPrest=this.exempPrest+y;
            pres=true;
        }
        return pres;
    }
    public boolean devolucion(int x){
        boolean dev=false;
        if(this.exempPrest>0&&this.exempPrest>x){
            this.exempPrest=this.exempPrest-x;
            dev=true;
        }
        return dev;
    }
}
