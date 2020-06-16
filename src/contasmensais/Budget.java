package contasmensais;
public abstract class Budget {

    protected Double value;

    public Budget(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
    
    
    
}
