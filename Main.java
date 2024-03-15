public class Main {
    public static void main(String[] args) {

        Conta nuBank = new Conta (1000 , " NuBank ", 500f ) ;
        System.out.println (nuBank.toString());

        new Compra(20220513, "padaria", 15f, nuBank);
        System.out.println (nuBank.toString());

        new Compra(20220613, "gasolina", 50f, nuBank);

        new CompraCartaoCreditoAVista(20220713, "Tenis", 300f, nuBank);

        for (int i = 0; i < Compra.listacompras.size(); i ++){
          System.out.println(Compra.listacompras.get(i).toString()) ;
        }
    }
}
