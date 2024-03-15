public class CompraCartaoCreditoAVista extends CompraCartaoCredito {


    public CompraCartaoCreditoAVista(int data, String idCompra, float valor, Conta conta) {
        super(data, idCompra, valor, conta);
        reterLimiteDisp(valor, conta);
        Compra.listacompras.add(this);
    }

    @Override
    public String toString() {
        return super.toString()+"(Crédito)";
    }
    
}
