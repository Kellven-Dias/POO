public class CompraCartaoCreditoParcelada extends CompraCartaoCredito{

    int numParcelas;
    float valorParcela;

    public CompraCartaoCreditoParcelada(int data, String idCompra, float valor, Conta conta, int numParcelas) {
        super(data, idCompra, valor, conta);
        this.numParcelas = numParcelas;
        reterLimiteDisp(valor, conta);
        Compra.listacompras.add(this);
    }

    void calcValorParcela(float valor, int numParcelas){
        valorParcela = valor/numParcelas;
    }

    @Override
    public String toString() {
        return super.toString()+"(Credito "+numParcelas+"x)";
    }


    
}