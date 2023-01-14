package Formas;

public class Triangulo extends FormaGeometrica {
    
    public Triangulo(float base, float altura){
       super.FormaGeometrica(base,altura);    
    }
    
    public void imprimir2(){
        super.imprimir();
    }
    
    public float area(){
        float area = super.getAltura()* super.getBase();
        
       return area;
        
    }
    
}
