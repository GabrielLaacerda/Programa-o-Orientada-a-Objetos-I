package problema.a;

import java.util.Scanner;

public class Apartamento extends Imóvel {

    private int local;
    private int sacada;

    public Apartamento() {
        super();
        Scanner input = new Scanner(System.in);

        System.out.println("--------------------------");
        System.out.println("\nCadastro Apartamento:\n");

        System.out.println("Digite o andar do apartamento:");
        local = input.nextInt();
        System.out.println("O apartamento possui sacada (1 para sim ou 0 para nao) ?");
        sacada = input.nextInt();

    }

    @Override

    public void imprimir() {
        super.imprimir();
        System.out.println("Andar o apartamento:" + local);
        System.out.println("Possui sacada:" + (sacada == 1 ? "Sim" : "Nao"));

    }

}
