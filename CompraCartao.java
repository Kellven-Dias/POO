public abstract class CompraCartao extends Compra {

    Conta conta;

 
    public CompraCartao(int data, String idCompra, float valor, Conta conta) {
        super(data, idCompra, valor);
        this.conta = conta;
    }

    @Override
    public String toString() {
        return super.toString()+conta;
    }
}