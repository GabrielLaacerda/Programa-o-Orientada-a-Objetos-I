package problema.a;

import java.util.Scanner;

public class Casa extends Imóvel {

    private int numandares;
    private int jardim;

    public Casa() {

        super();
        Scanner input = new Scanner(System.in);

        System.out.println("--------------------------");
        System.out.println("\nCadastro residencia:\n");
        System.out.println("Digite o numero de andares:");
        numandares = input.nextInt();
        System.out.println("O imóvel possui jardim (1 para sim ou 0 para nao)?");
        jardim = input.nextInt();
        
        if(jardim!=0&&jardim!=1){
       
        while(jardim!=0&&jardim!=1){
            System.out.println("Digite um codigo valido");
            jardim = input.nextInt();
                  
        }
        
        
        }
            
   
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Numero de andares:" + numandares);
        System.out.println("Possui jardim:" + (jardim == 1 ? "Sim" : "Nao"));

    }

}
