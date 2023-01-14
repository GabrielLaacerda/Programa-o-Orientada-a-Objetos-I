package arraylist;

public class Alunos1 implements AddCell{

    private String nome;
    private int idade;
    private String celular;
    private String endereco;

    public void addIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Alunos1{" + "nome=" + nome + ", idade=" + idade + ", celular=" + celular + '}'+"\n";
    }

    

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void adicionarIdade(int idade){
        this.idade = this.idade + idade;
    }

    @Override
    public void adicionarCelular(String celular) {
        this.celular = celular;
    }

    
    public String getCelular() {
        return celular;
    }

    
    public void addEnd(String end) {
        this.endereco = end;
    }

   
    }
