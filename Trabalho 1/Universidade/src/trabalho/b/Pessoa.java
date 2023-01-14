package trabalho.b;

import java.util.Scanner;

public class Pessoa {

    private String cpf;
    protected String nome;
    protected String endereco;
    int ano;

    public Pessoa(String cpf, String nome, String endereco, int nascimento) {

        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.ano = nascimento;
    }

    public Pessoa() {

    }

    protected void cadastrarPessoa() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome:");
        nome = input.nextLine();

        System.out.println("Digite o endereço:");
        endereco = input.nextLine();

        System.out.println("Digite o ano de nascimento:");
        ano = input.nextInt();

        if (ano < 1920) {

            while (ano < 1920) {
                System.out.println("Digite o ano de nascimento:");
                ano = input.nextInt();
            }

        }
    }

    protected void imprimir(String cpf, String nome, String endereco, int ano) {

        System.out.println("\nFICHA:\n");
        System.out.println("Cpf:" + cpf);
        System.out.println("Nome:" + nome);
        System.out.println("Endereço:" + endereco);
        System.out.println("Data de nascimento:" + ano);

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}
