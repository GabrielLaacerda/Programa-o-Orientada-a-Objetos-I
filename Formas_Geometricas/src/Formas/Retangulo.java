package Formas;

public class Retangulo extends FormaGeometrica {
    
    public Retangulo(float base, float altura){
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
