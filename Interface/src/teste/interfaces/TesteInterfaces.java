package teste.interfaces;

import java.util.Scanner;


public class TesteInterfaces {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Quadrado[] q1 = new Quadrado[3];
        
        int x;
        
        for(int i=0;i<q1.length;i++){
            System.out.println("Digite a area do quadrado "+ (i+1) +":");
            x = input.nextInt();
            q1[i] = new Quadrado(x);
        }
       

        q1[0] = new Quadrado(3);
        q1[1] = new Quadrado(9);
        q1[2] = new Quadrado(4);
        
        float result[] = new float[3];
        result = passarValores(q1);
        
        printarAreas(result);
        
        System.out.println("\nArea Média:");
        float res = areaMedia(q1);
        System.out.println(res);
        
    }
 
    public static float areaMedia(Quadrado[] q1){
        
        float areaMedia = 0;
      
        for(int i=0;i<q1.length;i++){
            areaMedia += q1[i].area();
        }  
        return areaMedia = areaMedia / 3;
  
    }
    
    public static void printarAreas(float[] result){
        
        int j=0;
        
         System.out.println("Area dos Quadrados:");
        
        while(j<result.length){
            System.out.println(result[j]);
            j++;
        }
        
    }
    
    public static float[] passarValores(Quadrado[] q1){
        
        float result[] = new float[3];
        
        for(int i=0;i<result.length;i++){
           result[i] = q1[i].area();
        }
        
        return result;
    }

}
