public class Picape extends VeiculoAbstrato{
        
    private double capacidadeCarga;
    private String tracao;
    
    public Picape(String marca, String modelo, int ano, String tipo, double motor, String cor, double capacidadeCarga, String tracao) {
        super(marca, modelo, ano, tipo, motor, cor);
        
        this.capacidadeCarga = capacidadeCarga;
        this.tracao = tracao;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public String getTracao() {
        return tracao;
    }
}
