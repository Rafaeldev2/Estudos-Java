public class SUV{

    String marca;
    String modelo;
    int anoFabric;
    int numeroAssentos;

    SUV(String marca, String modelo, int anoFabric, int numeroAssentos){

        this.marca = marca;
        this.modelo = modelo;
        this.anoFabric = anoFabric;
        this.numeroAssentos = numeroAssentos;
    }

    String getInfo(){

        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano de Fabricação: " + anoFabric + ", Número de assentos: " + numeroAssentos;
    }
}