package testearraylist;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.reverse;
import java.util.Scanner;

public class TesteArrayList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Contato> l1 = new ArrayList<>();
        ArrayList<String> cores = new ArrayList<>();

        Contato c1 = new Contato();

        c1.setNome("Gabriel");
        c1.setIdade(18);
        c1.setTelefone("(34)99163-5258");

        Contato c2 = new Contato();

        c2.setNome("Carlos");
        c2.setIdade(20);
        c2.setTelefone("(34)99163-5258");

        Contato c3 = new Contato();

        c3.setNome("Maria");
        c3.setIdade(19);
        c3.setTelefone("(34)99163-5258");

        l1.add(c1);
        l1.add(c2);
        l1.add(c3);

        int loop = 1;

        while (loop != 0) {

            int tam = l1.size();
            System.out.println("\nTamanho atual da lista:" + tam);

            printar(l1);

            boolean encontrou;

            System.out.println("\nDigite o nome do contato a ser removido:");
            String cont = input.nextLine();

            encontrou = removerContato(l1, cont);

            if (encontrou == false) {
                System.out.println("\nContato inexistente");
            } else {
                System.out.println("\nContato removido");
            }

            System.out.println(l1);

            System.out.println("\nTECLE ENTER PARA CONTINUAR:");
            input.nextLine();

}

           cores.add("verde");
           cores.add("amarelo");
           cores.add("rosa");
           cores.add("preto");
           cores.add("laranja");
           
           cores.set(4, "roxo");
       
           System.out.println("Sem Ordenaçao");
            
           System.out.println(cores); 
           
           System.out.println("\nCom ordenaçao");
           Collections.sort(cores);
           System.out.println(cores);
           
           System.out.println("\nInvertida");
           reverse(cores);
           System.out.println(cores);
   
        

    }

    public static void printar(ArrayList<Contato> l1) {

        System.out.println(l1);
    }

    public static boolean removerContato(ArrayList<Contato> l1, String nome) {

        int flag = 0;

        for (int i = 0; i < l1.size(); i++) {
            if (nome.equals(l1.get(i).getNome())) {
                l1.remove(i);
                i = l1.size() + 1;
                flag = 1;
            }

        }
        if (flag == 0) {
            return false;
        } else {
            return true;
        }

      
        
        
    }

}
