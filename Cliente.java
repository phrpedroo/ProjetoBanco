package ProjetoBanco;

public class Cliente extends Banco {

    protected String nome;
    protected String CPF;

    public Cliente(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    public Cliente() {

    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }
}
