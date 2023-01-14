package arraylist;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Alunos1> ListaPessoas = new ArrayList<>();
        
       
        int x = 1;

            try {

                Alunos1 Gabriel = new Alunos1();

                Gabriel.setNome("Gabriel");
                ListaPessoas.add(Gabriel);
                Gabriel.addIdade(18);
                Gabriel.adicionarCelular("99163-5258");

                Alunos1 Claudia = new Alunos1();
                
                Claudia.setNome("Claudia");
                Claudia.addIdade(23);
                ListaPessoas.add(Claudia);
               
               

                for (int i = 0; i < 3; i++) {
                    Alunos1 c = new Alunos1();

                    System.out.println("Digite a idade:");
                    int idade = input.nextInt();
                    c.addIdade(idade);
                    input.nextLine();

                    System.out.println("Digite o nome:");
                    String nome = input.nextLine();
                    c.setNome(nome);
                    ListaPessoas.add(c);
                   
                }
       
                ListaPessoas.get(4).adicionarIdade(100);
                
                System.out.println(ListaPessoas);
                
                 ListaPessoas.remove(0);
                 
                 System.out.println(ListaPessoas);

               
            } catch (Throwable e) {
                System.out.println("\nVai dar nao\n");
                main(args);
            }
            System.out.println("Tecle algo para continaur");
            input.nextLine();

        }

    }


