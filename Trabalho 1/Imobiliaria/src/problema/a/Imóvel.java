1
package problema.a;

import java.util.Scanner;

public class Imóvel {

    private String matricula;
    private String endereco;
    private String proprietario;
    private float areatotal;
    private int cod;
 

    public Imóvel(){
        Scanner input = new Scanner(System.in);

        System.out.println("----------------------");
        System.out.println("Digite a matricula:");
        matricula = input.nextLine();
        System.out.println("Digite o endereco:");
        endereco = input.nextLine();
        System.out.println("Digite o nome do proprietario:");
        proprietario = input.nextLine();
        System.out.println("Digite a area do imovel:");
        areatotal = input.nextFloat();

        while (areatotal <= 0) {
            System.out.println("**Digite uma area maior que zero**");
            areatotal = input.nextFloat();
        }
        System.out.println("Digite o codigo:");
        cod = input.nextInt();
        
        
        
        
    }
    
    public void imprimir(){
        System.out.println("------------------");
        System.out.println("Ficha do imóvel\n");
        System.out.println("Matricula:"+matricula);
        System.out.println("Endereço:"+endereco);
        System.out.println("Proprietario:"+proprietario);
        System.out.println("Area do imovel:"+areatotal);
        
               
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

  
   
}
