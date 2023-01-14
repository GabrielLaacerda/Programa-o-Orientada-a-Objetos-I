package Formas;

import static java.lang.Math.PI;
import static javax.management.Query.match;

public class FormaGeometrica {
    
    private float base;
    private float altura;
    private float raio;
    
    public void FormaGeometrica(float base, float altura){
        this.setBase(base);
        this.altura = altura;
    }
    public void FormaGeometrica(float raio){
        this.raio = raio;

    }
    
    public void imprimir(){
        System.out.println("Base:"+getBase());
        System.out.println("Altura:"+getAltura());
    }
    public void imprimirRaio(){
        System.out.println("Raio:"+getRaio());
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public float getRaio() {
        return raio;
    }

    public void setBase(float base) {
        this.base = base;
    }

   

    

    
    
}
