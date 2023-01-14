package javaapplication28;

import java.util.Scanner;

public class Capitulo extends Livro{
    
    private String nome;
    private int numCap;
    private String pagInicial;
    
    public Capitulo(){
        Scanner input = new Scanner(System.in);
   
        System.out.println("Digite o nome:");
        nome = input.nextLine();
        System.out.println("Digite numero de capitulos:");
        numCap = input.nextInt();
        input.nextLine();
        System.out.println("Digite o nome da pagina principal:");
        pagInicial = input.nextLine();
        
       
    
    }
 
    public void imprimir2(){
        
        System.out.println("Nome:"+nome);
        System.out.println("Numero de capitulos:"+numCap);
        System.out.println("Pagina Inicial:"+pagInicial); 
        
        
    }
   
   
    
}
