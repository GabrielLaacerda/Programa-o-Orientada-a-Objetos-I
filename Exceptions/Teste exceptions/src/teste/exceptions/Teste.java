package teste.exceptions;

public class Teste {
    
    private int x1;
    private int x2;
    private int x3;
    
    public static int[] soma(int[] vet,int[] vet2)throws DivisaoPorZeroException{
       
        int result[] = new int[vet.length];
        
        for(int i=0;i<vet.length;i++){
            if(vet2[i] == 0){
                throw new DivisaoPorZeroException();
            }
            else{
            result[i] = vet[i] / vet2[i];
            }  
        }
        return result;
    
    }
    
    
    
    
    
    
}
