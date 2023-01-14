package trabalho.b;

import java.util.Scanner;

public class ProblemaB {

    public static int verificaCPF(Docente[] docente, String cpf, int cont) {

        if (cont == 0) {

            return -1;

        } else {

            for (int i = 0; i < cont; i++) {

                if (docente[i].getCpf().equals(cpf)) {
                    return 1;
                }

            }

        }

        return 0;
    }

    public static int verificaCPF2(Aluno[] aluno, String cpf, int cont) {

        if (cont == 0) {

            return -1;

        } else {

            for (int i = 0; i < cont; i++) {

                if (aluno[i].getCpf().equals(cpf)) {
                    return 1;
                }
            }

        }

        return 0;
    }

    public static int Menu() {

        Scanner input = new Scanner(System.in);
        int code;
        System.out.println("ESCOLHA A OPÇAO DESEJADA\n");
        System.out.println("->1 - Cadastrar docente\n");
        System.out.println("->2 - Cadastrar Aluno\n");
        System.out.println("->3 - Mostrar dados do docente\n");
        System.out.println("->4 - Mostrar os dados do aluno\n");
        System.out.println("->5 - Listar todos os docentes efetivos(digite 1) ou temporarios(Digite 2)\n");
        System.out.println("->6 - Listar todos os docentes de uma titulação\n");
        System.out.println("->7 - Listar todos os alunos de um curso escolhido\n");
        System.out.println("->8 - Listar todos os alunos reingressantes\n");
        System.out.println("->0 - Sair\n");
        System.out.println("Opçao:");
        code = input.nextInt();

        return code;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int cont = 0, cont2 = 0;

        Docente arraydocente[] = new Docente[30];
        Aluno arrayaluno[] = new Aluno[30];

        boolean valido;
        int code;

        String siape;
        String titulacao;
        int tipo;
        String cpf;
        String matricula;

        do {

            code = Menu();

            switch (code) {

                case 1:

                    System.out.println("------------------------");

                    System.out.println("Cadastrar Docente:\n");
                    System.out.println("Informe o cpf:");
                    cpf = input.nextLine();

                    int var = verificaCPF(arraydocente, cpf, cont);

                    if (var == 0 || var == -1) {

                        arraydocente[cont] = new Docente().cadastrarDocente(cpf);

                        cont++;

                    } else if (var == 1) {

                        System.out.println("\n O cpf já esta cadastrado:\n\n");

                    }

                    break;

                case 2:
                    System.out.println("------------------------");

                    System.out.println("Cadastrar Aluno\n");
                    System.out.println("Informe o cpf:");
                    cpf = input.nextLine();

                    int var2 = verificaCPF2(arrayaluno, cpf, cont2);

                    if (var2 == 0 || var2 == -1) {

                        Aluno aluno = new Aluno();
                        arrayaluno[cont2] = aluno.cadastrarAluno(cpf);

                        cont2++;

                    } else if (var2 == 1) {

                        System.out.println("O cpf já esta cadastrado:");

                    }
                    break;

                case 3:

                    if (cont == 0) {
                        System.out.println("\nNao ha docentes cadastrados\n");
                    } else {

                        System.out.println("Digite o SIAPE:");
                        siape = input.nextLine();

                        Docente docente = new Docente();
                        int aceito = docente.imprimir2(arraydocente, siape);

                        if (aceito == -1) {
                            System.out.println("\nNao foi possivel encontrar\n\n");
                        }

                    }
                    break;

                case 4:

                    if (cont2 == 0) {
                        System.out.println("\nNao ha alunos cadastrados\n");
                    } else {

                        System.out.println("Digite a matricula:");
                        matricula = input.nextLine();

                        Aluno aluno = new Aluno();

                        int aceitar = aluno.printarAluno(arrayaluno, matricula);

                        if (aceitar == -1) {
                            System.out.println("\nNao foi possivel encontrar\n\n");
                        }

                    }
                    break;

                case 5:

                    if (cont == 0) {
                        System.out.println("\nNao ha docentes cadastrados\n");
                    } else {

                        int cod;

                        System.out.println("Digite 1 para printar docentes efetivos ou 2 para temporários:");
                        cod = input.nextInt();

                        Docente d = new Docente();
                        int aceito = d.buscaDocente(arraydocente, cod, cont);

                        if (aceito == 0) {
                            System.out.println("\nNao foram encontrados docentes deste tipo\n\n");
                        }
                    }

                    break;

                case 6:

                    if (cont == 0) {
                        System.out.println("\nNao ha docentes cadatrados\n");
                    } else {

                        System.out.println("Digite a titulaçao:");
                        titulacao = input.nextLine();

                        Docente d1 = new Docente();
                        int aceito = d1.buscaTitulacao(arraydocente, titulacao, cont);

                        if (aceito == -1) {
                            System.out.println("\nNao foi possivel encontrar\n\n");
                        }
                    }

                    break;

                case 7:

                    if (cont2 == 0) {
                        System.out.println("\nNao ha alunos cadastrados\n");
                    } else {

                        int curso;

                        System.out.println("Digite 1 para Bacharelado em Sistemas de Informação, 2 para Engenharia de Agrimensura e Cartografica, 3 para Agronomia:");
                        curso = input.nextInt();

                        Aluno aluno1 = new Aluno();
                        int aceito = aluno1.buscaCurso(arrayaluno, curso, cont2);

                        if (aceito == 0) {
                            System.out.println("\nNao foram encontrados alunos deste curso\n\n");
                        }
                    }

                    break;

                case 8:

                    if (cont2 == 0) {
                        System.out.println("\nNao ha alunos cadastrados\n");
                    } else {

                        Aluno a = new Aluno();
                        int aceito = a.buscarAluno(arrayaluno, cont2);

                        if (aceito == 0) {
                            System.out.println("\nNão ha alunos reingressantes\n\n");
                        }

                    }

                    break;

            }

        } while (code != 0);

    }

}
