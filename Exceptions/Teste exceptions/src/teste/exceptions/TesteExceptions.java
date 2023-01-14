package teste.exceptions;

public class TesteExceptions {

    public static void main(String[] args){
      
        int vet[] = new int[5];
        int num[] = {1,2,3,4};
        int den[] = {0,2,0,2};
        
        try{
            
           vet = Teste.soma(num, den);
   
        }
        catch(DivisaoPorZeroException f){
            System.out.println(f.getMessage()); 
        }
       
       
        
        
        
        
        
        
   
    }
    
}
