package Formas;

public class Circulo extends FormaGeometrica {
    
     public Circulo(float raio){
       super.FormaGeometrica(raio);
    }
    
    public void imprimir2(){
        super.imprimirRaio();
    }
    
    public float area(){
        
        float area = (float) (2 * Math.PI * super.getRaio());

       return area;
        
    }
    
     
    
}
