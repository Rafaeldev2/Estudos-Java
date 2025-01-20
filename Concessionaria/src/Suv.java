public class Suv extends VeiculoAbstrato{
    
    private int PortaMalas;
    private int numAssentos;

    public Suv(int PortaMalas, int numAssentos, String marca, String modelo, int ano, String tipo, double motor, String cor) {
        super(marca, modelo, ano, tipo, motor, cor);
        this.PortaMalas = PortaMalas;
        this.numAssentos = numAssentos;
    }

    public int getPortaMalas() {
        return PortaMalas;
    }

    public int getNumAssentos() {
        return numAssentos;
    }
}
