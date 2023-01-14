package Teste;

public class teste {
    
    public static void testee(int[] v, int[] v2)throws Divisaoz{
        
        int result[] = new int[4];
        
        for(int i=0;i<result.length;i++){
            
            if(v2[i] == 0){
                throw new Divisaoz("Erro divisao por zero");
            }
            else{
            result[i] = v[i] / v2[i];
            }
        }
        
    }
    
}
