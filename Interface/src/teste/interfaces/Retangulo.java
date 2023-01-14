package teste.interfaces;

public class Retangulo implements FormaGeometrica{
    
    private float base;
    private float altura;
    
    public Retangulo(float altura, float base){
        this.altura = altura;
        this.base = base;
    }

    @Override
    public float area() {
       return base*altura;
    }

    @Override
    public float perimetro() {
       return (base*2)*(altura*2);
    }
    
}
