package contasmensais;
public class Conta extends Orçamento {

    private String nome;

    public Conta(String nome, Double valor) {
        super(valor);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }   
    
    public String toString(){
        return "Nome da conta: " + nome + String.format("\nValor: R$%.2f", valor);
    }
}
