package trabalho.b;

import java.util.Scanner;

public class Docente extends Pessoa {

    private String siape;
    private String titulacao;
    private int cargaH;
    private int tipo;

    public Docente(String cpf, String siape, String titulacao, int cargaH, int tipo, String nome, String endereco, int nascimento) {

        super(cpf, nome, endereco, nascimento);
        this.cargaH = cargaH;
        this.siape = siape;
        this.titulacao = titulacao;
        this.tipo = tipo;

    }

    public Docente() {

    }

    public Docente cadastrarDocente(String cpfdocente) {
        int x;

        Scanner input = new Scanner(System.in);
        super.cadastrarPessoa();
        System.out.println("Digite o SIAPE:");
        siape = input.nextLine();

        x = siape.length();

        if (x != 7) {

            while (x != 7) {
                System.out.println("Digite um SIAPE valido:");
                siape = input.nextLine();
                x = siape.length();
            }
        }

        boolean aceitar = false;

        do {

            System.out.println("Digite a titulaçao:");
            titulacao = input.nextLine();

            if (titulacao.equals("GR") || titulacao.equals("ME") || titulacao.equals("DO")) {
                aceitar = true;
            }

        } while (aceitar != true);

        System.out.println("Digite a carga horária:");
        cargaH = input.nextInt();

        if (cargaH < 0 || cargaH > 40) {
            while (cargaH < 0 || cargaH > 40) {
                System.out.println("Digite uma carga horaria valida:");
                cargaH = input.nextInt();
            }
        }
        System.out.println("Digite 1 para docente efetivo ou 2 docente temporário:");
        tipo = input.nextInt();

        if (tipo != 1 && tipo != 2) {
            while (tipo != 1 && tipo != 2) {
                System.out.println("Diite um codio valido:\n");
                System.out.println("Digite 1 para docente efetivo ou 2 docente temporário:");
                tipo = input.nextInt();
            }
        }

        Docente d = new Docente(cpfdocente, siape, titulacao, cargaH, tipo, nome, endereco, ano);
        return d;
    }

    public void imprimiTodosAtributos(String cpf, String siape, String titulacao, int cargaH, int tipo, String nome, String endereco, int nascimento) {

        super.imprimir(cpf, nome, endereco, nascimento);
        System.out.println("Siape:" + siape);
        System.out.println("Tiulaçao:" + titulacao);
        System.out.println("CargaH:" + cargaH);

        if (tipo == 1) {
            System.out.println("Tipo de professor:Docente efetivo");

        }
        if (tipo == 2) {
            System.out.println("Tipo de professor:Docente temporario");

        }

    }

    public int imprimir2(Docente[] array, String siape) {
        int i;

        for (i = 0; i < array.length; i++) {

            if (array[i].getSiape().equals(siape)) {

                imprimiTodosAtributos(array[i].getCpf(), array[i].getSiape(), array[i].getTitulacao(), array[i].getCargaH(),
                        array[i].getTipo(), array[i].getNome(), array[i].getEndereco(), array[i].getAno());

                return 0;
            }

        }
        return -1;

    }

    public int buscaDocente(Docente[] array, int cod, int cont) {
        int i;
        int qtd = 0;

        for (i = 0; i < cont; i++) {

            if (array[i].getTipo() == cod) {

                imprimiTodosAtributos(array[i].getCpf(), array[i].getSiape(), array[i].getTitulacao(), array[i].getCargaH(),
                        array[i].getTipo(), array[i].getNome(), array[i].getEndereco(), array[i].getAno());
                qtd++;
            }

        }

        return qtd;
    }

    public int buscaTitulacao(Docente[] array, String titulacao, int cont) {

        int i;
        int qtd = 0;

        for (i = 0; i < cont; i++) {

            if (array[i].getTitulacao().equals(titulacao)) {

                imprimiTodosAtributos(array[i].getCpf(), array[i].getSiape(), array[i].getTitulacao(), array[i].getCargaH(),
                        array[i].getTipo(), array[i].getNome(), array[i].getEndereco(), array[i].getAno());
                qtd++;

                

            }
            
            

        }
        
        if(qtd!=0){
                return 0;
        }
        return -1;

    }

    public String getSiape() {
        return siape;
    }


    public String getTitulacao() {
        return titulacao;
    }

    public int getCargaH() {
        return cargaH;
    }


    public int getTipo() {
        return tipo;
    }

}
