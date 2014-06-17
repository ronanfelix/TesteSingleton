package br.padroes.singleton;

public class FabricaDeCarro extends Cliente {

    protected int totalCarrosFiat;
    protected int totalCarrosFord;
    protected int totalCarrosVolks;

    private static FabricaDeCarro instancia;

    private FabricaDeCarro() {
    }

    public static FabricaDeCarro getInstancia() {
        if (instancia == null) {
            instancia = new FabricaDeCarro();
        }
        return instancia;
    }
        
    public String criarCarroVolks() {
        return new String("Carro Volks " + totalCarrosVolks++ + " criado.");
    }

    public String criarCarroFord() {
        return new String("Carro Ford " + totalCarrosFord++ + " criado.");
    }

    public String criarCarroFiat() {
        return new String("Carro Fiat " + totalCarrosFiat++ + " criado.");
    }

    public String gerarRelatorio() {
        return new String("Total de carros Fiat vendidos: " + totalCarrosFiat + "\nTotal de carros Ford vendidos: " + totalCarrosFord + "\nTotal de carros Volks vendidos: " + totalCarrosVolks);
    }

}