public class CompraCartaoDebito extends CompraCartao {
   


//Construtor--------------------------
    public CompraCartaoDebito(int data, String idCompra, float valor, Conta conta) {
        super(data, idCompra, valor, conta);
        debitar(valor, conta);
        Compra.listacompras.add(this);
        
    }
//------------------------------------
  
//toString----------
    @Override
    public String toString() {
        return super.toString()+" (Debito)";
    }
//------------------
    
}