package contasmensais;
public abstract class Orçamento {

    protected Double valor;

    public Orçamento(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    
    
}
