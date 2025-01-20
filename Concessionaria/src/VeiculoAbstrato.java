public abstract class VeiculoAbstrato implements Veiculo{
    private String marca;
    private String modelo;
    private int ano;
    private String tipo;
    private double motor;
    private String cor;
    
    public VeiculoAbstrato(String marca, String modelo, int ano, String tipo, double motor, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.tipo = tipo;
        this.motor = motor;
        this.cor = cor;
    }

    @Override
    public int getAno() {
        // TODO Auto-generated method stub
        return ano;
    }

    @Override
    public String getMarca() {
        // TODO Auto-generated method stub
        return marca;
    }

    @Override
    public String getModelo() {
        // TODO Auto-generated method stub
        return modelo;
    }

    @Override
    public double getMotor() {
        // TODO Auto-generated method stub
        return motor;
    }

    @Override
    public String getTipo() {
        // TODO Auto-generated method stub
        return tipo;
    }

    public String getCor() {
        return cor;
    }
}
