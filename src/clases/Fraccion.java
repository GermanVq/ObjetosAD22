/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Lenovo
 */
public class Fraccion {
    private int numerador;
    private int denominador;
    private int entera;
    
    public Fraccion(  int Numerador , int Denominador , int Entera){
        this.denominador = Denominador;
        this.numerador = Numerador;
        this.entera = Entera;
       
       
        
    }

    public Fraccion(int nu, int de) {
        
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int Numerador) {
        this.numerador = Numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenomiador(int Denominador) {
        this.denominador = Denominador;
    }

    public int getEntera() {
        return entera;
    }

    public void setEntera(int Entera) {
        this.entera = Entera;
    }
    public Fraccion Fraccion(){
        int nump,num , den;
        Fraccion m;
        
       
        nump = this.entera*this.denominador;
        num=nump+this.numerador;
        den = this.denominador;
        
        m = new Fraccion( num , den);
        return m;
        
    }
}
