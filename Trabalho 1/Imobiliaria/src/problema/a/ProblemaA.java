package problema.a;

import java.util.Scanner;

public class ProblemaA {

    public static void main(String[] args) {

        Imóvel im[] = new Imóvel[6];
        int code;
        int i = 0, j = 2, l = 4;
        int codigo;
        
        
        Scanner input = new Scanner(System.in);

        do {

            System.out.println("Digite a opçao desejada:\n");
            System.out.println("->1-Cadastrar comércio\n");
            System.out.println("->2-Cadastrar Apartamento\n");
            System.out.println("->3-Cadastrar Residencia\n");
            System.out.println("->4-Mostrar caracteristicas do comércio\n");
            System.out.println("->5-Mostrar caracteristicas do apartamento\n");
            System.out.println("->6-Mostrar caracteristicas da residencia\n");
            System.out.println("->7-Sair\n\n");
            System.out.println("OPÇAO:");

            code = input.nextInt();

            switch (code) {
                case 1:

                    if (i >= 2) {
                        System.out.println("\nNao é possivel cadastrar mais comércios\n");
                    } else {

                        im[i] = new Comercial();
                        i++;
                    }

                    break;

                case 2:

                    if (j >= 4) {
                        System.out.println("\nNao é possivel cadastrar mais apartamentos\n");
                    } else {

                        im[j] = new Apartamento();
                        j++;
                    }
                    break;

                case 3:

                    if (l >= 6) {
                        System.out.println("\nNao é possivel cadastrar mais residencias\n");
                    } else {

                        im[l] = new Casa();
                        l++;
                    }
                    break;

                case 4:

                    if (i == 0) {
                        System.out.println("\nNao ha comercios cadastrados\n");
                    } else {
                       
                      int encontrou=0;
                        
                        System.out.println("Digite o codigo do comercio:");
                        codigo = input.nextInt();

                        for (int x = 0; x < i; x++) {
                            if (im[x].getCod() == codigo) {
                                im[x].imprimir();
                                encontrou++;
                            }

                        }
                        if(encontrou==0){
                            System.out.println("\nNao foi possivel encontrar\n");
                        }

                    }
                    break;

                case 5:

                    if (j == 2) {
                        System.out.println("\nNao ha apartamentos cadastrados\n");
                    } else {

                        System.out.println("Digite o codigo do comercio:");
                        codigo = input.nextInt();
                        
                        int encontrou = 0;

                        for (int x = 2; x < j; x++) {
                            if (im[x].getCod() == codigo) {
                                im[x].imprimir();
                                encontrou++;
                            }

                        }
                        
                          if(encontrou==0){
                            System.out.println("\nNao foi possivel encontrar\n");
                        }

                    }
                    break;

                case 6:

                    if (l == 4) {
                        System.out.println("\nNao ha Residencias cadastrados\n");
                    } else {

                        System.out.println("Digite o codigo do comercio:");
                        codigo = input.nextInt();
                        
                        int encontrou = 0;

                        for (int x = 4; x < l; x++) {
                            if (im[x].getCod() == codigo) {
                                im[x].imprimir();
                                encontrou++;
                            }

                        }
                          if(encontrou==0){
                            System.out.println("\nNao foi possivel encontrar\n");
                        }
   

                    }
                    break;

            }

        } while (code != 0);
    }

}
