package contasmensais;
public class Account extends Budget {

    private String name;

    public Account(String name, Double value) {
        super(value);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }   
    
    public String toString(){
        return "Nome da conta: " + name + String.format("\nValor: R$%.2f", value);
    }
}
