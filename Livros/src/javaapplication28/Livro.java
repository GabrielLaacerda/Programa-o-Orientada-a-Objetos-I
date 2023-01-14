 package javaapplication28;
 import java.util.*;
 import java.util.ArrayList;
 import java.util.Collections;

import java.util.Scanner;

public class Livro {
    
    private String titulo;
    private String ibsn;
    private int ano;
    Capitulo[] c1 = new Capitulo[30];
    
    public Livro(){
        
    }
    
    public int cadastro(){
        
        int i = 0,num;
        
        Scanner input = new Scanner(System.in);
        System.out.println("\nCadastro de livro:\n");
        
        System.out.println("Digite o nome:");
        titulo = input.nextLine();
        System.out.println("Digite o ibsn:");
        ibsn= input.nextLine();
        System.out.println("Digite o ano:");
        ano = input.nextInt();
        System.out.println("Digite quantos capitulos deseja cadastrar:");
        num = input.nextInt();
        
        cadastroCap(num);
     
       
        System.out.println("\nCadastro concluido\n");
        
       return num;
    }
    
    public void cadastroCap(int num){
       
        int i=0;
        
        while(i<num){
            
            System.out.printf("\nCadastro %d\n",i+1);
            
           c1[i] = new Capitulo();
           
           i++;
            
        }
  
    }
    
   
    public void imprimir(int num){
        System.out.println("-----------------");
        System.out.println("Livro:\n");
        System.out.println("Titulo:"+titulo);
        System.out.println("Ibsn:"+ibsn);
        System.out.println("Ano:"+ano);
        
        for(int i=0;i<num;i++){
            System.out.printf("\nCapitulo %d\n",i+1);
            c1[i].imprimir2();
        }
        
        System.out.println("\n");
     
       
    }
    public static void excluir(Livro l1){
        l1 = null;
    }
    
    
}
