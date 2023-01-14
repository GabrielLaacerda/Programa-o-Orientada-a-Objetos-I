package Formas;

public class JavaApplication27 {

    public static void main(String[] args) {
        
        System.out.println("Triangulo:\n");
       
        Triangulo t1 = new Triangulo(15,32);
        t1.imprimir2();
        
        float areat = t1.area();
        System.out.println("\nArea:"+areat);
        
        System.out.println("\n----------------:");
        System.out.println("Retangulo:\n");
        
        Retangulo r1 = new Retangulo(7,22);
        r1.imprimir2();
        
        float arear = r1.area();
        System.out.println("Area:"+arear);
        
        System.out.println("\n----------------:");
        System.out.println("Circulo:\n");
        
        
        Circulo c1 = new Circulo((float) 33.3);
        c1.imprimir2();
        
        float areac = c1.area();
        System.out.println("Area:"+areac);
        
        System.out.println("\n----------------:");
        System.out.println("New Triangulo:\n");
         
        r1.setBase(1);
        
        System.out.println("Base:"+r1.getBase());
        System.out.println("Altura:"+r1.getAltura());
        
        float area2 = r1.area();
        System.out.println("Area:"+area2);
        
       
        
        
  
        
        
        
       
        
        
        
        
        
        
        
        
        
    }
    
}
