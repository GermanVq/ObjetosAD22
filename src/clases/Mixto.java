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
public class Mixto {
    private int entero;
    private int numerador;
    private int denominador;

    public Mixto(int entero, int numerador, int denominador) {
        this.entero = entero;
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Mixto(int numerador, int denominador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getEntero() {
        return entero;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
  
      public Mixto Sumar (Mixto f2) {
        int mixt , mix2, suma , num , den , ent , mix1den ,mix2den ,sumaden;
        Mixto m;
        
        mixt = this.entero * this.denominador + this.numerador ;
        mix1den = this.denominador;
        mix2 = f2.entero * f2.denominador + f2.numerador;
        mix2den = f2.denominador;
        
        suma = mixt * mix2den + mix1den * mix2;
        sumaden = mix1den * mix2den;
        
        den = sumaden;
        ent = suma / sumaden;
        num = suma % ent;
        
        m = new Mixto (num , den ,ent);
        return m;
    }
    
      
      
    public Mixto Resta (Mixto f2) {
        int mixt , mix2, resta , num , den , ent , mix1den ,mix2den ,restaden;
        Mixto m;
        
        mixt = this.entero * this.denominador + this.numerador ;
        mix1den = this.denominador;
        mix2 = f2.entero* f2.denominador + f2.numerador;
        mix2den = f2.denominador;
        
        resta = mixt * mix2den - mix1den * mix2;
        restaden = mix1den * mix2den;
        
        
        den = restaden;
        ent = resta / restaden;
        num = resta % ent;
        
        m = new Mixto (num , den ,ent);
        return m;
    }
    public Mixto Multiplicacion (Mixto f2) {
        int mixt , mix2, multi , num , den , ent , mix1den ,mix2den ,multiden;
        Mixto m;
        
        mixt = this.entero * this.denominador + this.numerador ;
        mix1den = this.denominador;
        mix2 = f2.entero * f2.denominador + f2.numerador;
        mix2den = f2.denominador;
        
        multi = mixt * mix2;
        multiden = mix1den * mix2den;
        
        
        den = multiden;
        ent = multi / multiden;
        num = multi % ent;
        
        m = new Mixto (num , den , ent);
        return m;
    }
    public Mixto Division (Mixto f2) {
        int mixt , mix2, divi , num , den , ent , mix1den ,mix2den ,dividen;
        Mixto m;
        
        mixt = this.entero * this.denominador + this.numerador ;
        mix1den = this.denominador;
        mix2 = f2.entero * f2.denominador + f2.numerador;
        mix2den = f2.denominador;
        
        divi = mixt * mix2den;
        dividen = mix1den * mix2;
        
        
        den = dividen;
        ent = divi / dividen;
        num = divi % ent;
        
        m = new Mixto (num , den ,ent);
        return m;
    }
 
  
}
