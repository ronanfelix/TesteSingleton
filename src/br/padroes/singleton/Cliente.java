package br.padroes.singleton;

public class Cliente {
    public static void main(String[] args) {        
        FabricaDeCarro fabrica = FabricaDeCarro.getInstancia();
        System.out.println(fabrica.criarCarroFiat());
        System.out.println(fabrica.criarCarroFord());        
        System.out.println(fabrica.criarCarroVolks());        
        System.out.println(fabrica.gerarRelatorio());
        /*        
        FabricaDeCarro fabrica2 = FabricaDeCarro.getInstancia();
        System.out.println(fabrica2.criarCarroFiat());
        System.out.println(fabrica2.criarCarroFord());        
        System.out.println(fabrica2.criarCarroVolks());        
        System.out.println(fabrica2.gerarRelatorio());
        */
    }
}
