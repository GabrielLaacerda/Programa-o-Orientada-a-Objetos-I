package problema.a;

import java.util.Scanner;

public class Comercial extends Imóvel {

    private int numsalas;
    private int numbanheiros;

    public Comercial() {
        super();
        System.out.println("--------------------------");
        System.out.println("\nCadastro Comercial:\n");
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o numero de salas");
        numsalas = input.nextInt();
        System.out.println("Digite a quantidade de banheiros");
        numbanheiros = input.nextInt();

    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Numero de salas:" + numsalas);
        System.out.println("Numero de banheiros:" + numbanheiros);
    }

}
