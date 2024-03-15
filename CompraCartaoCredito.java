import java.util.ArrayList;

public abstract class CompraCartaoCredito extends CompraCartao {
    public static ArrayList<CompraCartaoCredito> listacompraCartaoCreditos = new ArrayList<CompraCartaoCredito>();

    public CompraCartaoCredito(int data, String idCompra, float valor, Conta conta) {
        super(data, idCompra, valor, conta);
        CompraCartaoCredito.listacompraCartaoCreditos.add(this);
    }//ta chamando o construtor do pai

  //methods
    public static void compraCartaoCredito(CompraCartaoCredito cCredito){

        listacompraCartaoCreditos.add(cCredito);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    
}