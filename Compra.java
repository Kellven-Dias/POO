import java.util.ArrayList;

public class Compra {

//Atributos-----------------
    int data;
    String idCompra;
    float valor;
//---------------------------


//Array-----------------------
public static ArrayList<Compra> listacompras = new ArrayList<Compra>();
//--------------------------

//Construtores-------------------

    public Compra(int data, String idCompra, float valor) {
        this.data = data;
        this.idCompra = idCompra;
        this.valor = valor;
    }

    public Compra(int data, String idCompra, float valor, Conta conta) {
        new CompraCartaoDebito(data, idCompra, valor, conta);
        
    }
    
    public Compra(int data, String idCompra, float valor, Conta conta, int numParcelas){
        if (numParcelas == 1) {
            new CompraCartaoCreditoAVista(data, idCompra, valor, conta);
            
            
        } else {
            new CompraCartaoCreditoParcelada(data, idCompra, valor, conta, numParcelas);
            
        }
        
    }
//----------------------------------

//metodos-------------------------

    void debitar(float valor, Conta conta){
        if(conta.getSaldo() > valor){
            conta.setSaldo(conta.getSaldo() - valor);            
        } else{
            System.out.println("Saldo insuficiente");
        }
        
    }

    void reterLimiteDisp(float valor, Conta conta){
        if(conta.getLimiteDisponivel() > valor){
            conta.setLimiteDisponivel(conta.getLimiteDisponivel() - valor);            
        } else{
            System.out.println("Limite insuficiente");
        }
    } 

    void devolverLimiteDisp(float valor, Conta conta){
        conta.setLimiteDisponivel(conta.getLimiteDisponivel()+valor);
    }
//-----------------------------------

//toString------------------------

    @Override
    public String toString() {
        return "Compra: "+data+"; "+idCompra+"; "+valor+";\n";
    }
//---------------------------------  
}