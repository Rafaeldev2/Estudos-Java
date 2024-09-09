public class Carro{

    String marca;
    String modelo;
    int anoFabric;
    int numeroPortas;

    Carro(String marca, String modelo, int anoFabric, int numeroPortas){

        this.marca = marca;
        this.modelo = modelo;
        this.anoFabric = anoFabric;
        this.numeroPortas = numeroPortas;
    }

    String getInfo(){

        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano de Fabricação: " + anoFabric + ", Número de portas: " + numeroPortas;
    }
}