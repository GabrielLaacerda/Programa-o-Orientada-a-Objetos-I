package teste.interfaces;

public class Quadrado implements FormaGeometrica{
    
    private float lado;
    
    public Quadrado(float lado){
        this.lado = lado;
    }

    @Override
    public float area() {
       return lado*lado;
    }

    @Override
    public float perimetro() {
       return lado * 4;
    }
    
}
