package javaapplication1;

import static java.lang.Math.sqrt;

public class Vetor4D {

    private float x1;
    private float x2;
    private float x3;
    private float x4;

    public Vetor4D(float x1, float x2, float x3, float x4) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
    }
    public Vetor4D(){
        
    }

    public void imprimir() {
        System.out.println(getX1()+ " " + getX2() + " " + getX3() + " " + getX4() );
       
    }

    public float valorAbsoluto(float x1,float x2, float x3, float x4) {
        
        float absoluto = (float) sqrt(x1*x1 + x2*x2 + x3*x3 + x4*x4);
        
        return absoluto;
       
    }

    public Vetor4D soma(Vetor4D v2) {
        
        Vetor4D v4 = new Vetor4D(x1 + v2.x1,x2 + v2.x2,x3 + v2.x3,x4 + v2.x4);
     
        return this;
    }


    public float getX1() {
        return x1;
    }

   
    public float getX2() {
        return x2;
    }

    
    public float getX3() {
        return x3;
    }

   
    public float getX4() {
        return x4;
    }
}
