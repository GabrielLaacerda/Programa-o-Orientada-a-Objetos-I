package trabalho.b;

import java.util.Scanner;

public class Aluno extends Pessoa {

    private String matricula;
    private int curso;
    private int reingresso;

    public Aluno(String matricula, int curso, int reingresso, String cpf, String nome, String endereco, int ano) {

        super(cpf, nome, endereco, ano);
        this.matricula = matricula;
        this.curso = curso;
        this.reingresso = reingresso;

    }

    public Aluno() {

    }

    public Aluno cadastrarAluno(String cpf) {
        Scanner input = new Scanner(System.in);

        int x;
        boolean aceitar = false;

        System.out.println("---------------------");
        System.out.println("Cadastro de aluno\n");
        super.cadastrarPessoa();
        System.out.println("Digite a matricula do aluno:");
        matricula = input.nextLine();

        x = matricula.length();

        if (x != 11) {
            while (x != 11) {
                System.out.println("Digite uma matricula valida:");
                matricula = input.nextLine();
                x = matricula.length();

            }
        }
        do {

            System.out.println("Digite o curso(1 para Bacharelado em Sistemas de Informação,"
                    + " 2 para Engenharia de Agrimensura e Cartografica, 3 para Agronomia)");
            curso = input.nextInt();

            if (curso == 1 || curso == 2 || curso == 3) {
                aceitar = true;
            }

        } while (aceitar == false);

        System.out.println("Digite 1 para reingressante ou 0 para nao reingressante:");
        reingresso = input.nextInt();

        return new Aluno(matricula, curso, reingresso, cpf, nome, endereco, ano);

    }

    public int printarAluno(Aluno[] array, String matricula) {

        int i;

        for (i = 0; i < array.length; i++) {

            if (array[i].getMatricula().equals(matricula)) {

                imprimirAtributos(array[i].getCpf(), array[i].getNome(), array[i].getEndereco(), array[i].getAno(), array[i].getCurso(),
                        array[i].getReingresso(), array[i].getMatricula());

                return 0;
            }

        }
        return -1;
    }

    public void imprimirAtributos(String cpf, String nome, String endereco, int ano, int curso, int reingresso, String matricula) {

        super.imprimir(cpf, nome, endereco, ano);

        System.out.println("Matricula:" + matricula);
        if (curso == 1) {
            System.out.println("Curso:" + "Bacharelado em sistemas de informaçao");
        }
        if (curso == 2) {
            System.out.println("Curso:" + "Engenharia de Agrimensura e Cartografia");
        }
        if (curso == 3) {
            System.out.println("Curso:" + "Agronomia");
        }
        System.out.println("Aluno reingressante:" + (reingresso == 1 ? "Sim" : "Nao"));

    }

    public int buscaCurso(Aluno[] array, int curso, int cont2) {

        int i;
        int qtd = 0;

        for (i = 0; i < cont2; i++) {
            if (array[i].getCurso() == curso) {

                imprimirAtributos(array[i].getCpf(), array[i].getNome(), array[i].getEndereco(), array[i].getAno(), array[i].getCurso(),
                        array[i].getReingresso(), array[i].getMatricula());
                qtd++;

            }

        }

        return qtd;

    }

    public int buscarAluno(Aluno[] array, int cont2) {

        int i;
        int aluno = 0;

        for (i = 0; i < cont2; i++) {
            if (array[i].getReingresso() == 1) {

                imprimirAtributos(array[i].getCpf(), array[i].getNome(), array[i].getEndereco(), array[i].getAno(), array[i].getCurso(),
                        array[i].getReingresso(), array[i].getMatricula());
                aluno++;

            }

        }
        return aluno;
    }

    public int getCurso() {
        return curso;
    }
    public int getReingresso() {
        return reingresso;
    }
 
    public String getMatricula() {
        return matricula;
    }

}
