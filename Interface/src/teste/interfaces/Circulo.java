package teste.interfaces;

public class Circulo implements FormaGeometrica{
    
    private float raio;
    
    public Circulo(float raio){
        this.raio = raio;
    }

    @Override
    public float area() {
        return PI * (raio*raio);
    }

    @Override
    public float perimetro() {     
        return (2*PI) * raio;
       
    }
  
}
