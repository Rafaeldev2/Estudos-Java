public class Picape{

    String marca;
    String modelo;
    int anoFabric;
    Double capacidadeCarga;

    Picape(String marca, String modelo, int anoFabric, Double capacidadeCarga){

        this.marca = marca;
        this.modelo = modelo;
        this.anoFabric = anoFabric;
        this.capacidadeCarga = capacidadeCarga;
    }

    String getInfo(){

        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano de Fabricação: " + anoFabric + ", Capacidade de Carga: " + capacidadeCarga;
    }
}