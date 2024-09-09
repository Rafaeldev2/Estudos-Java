public class Veiculo{
    String marca;
    String modelo;
    int anoFabric;

    Veiculo(String marca, String modelo, int anoFabric){

        this.marca = marca;
        this.modelo = modelo;
        this.anoFabric = anoFabric;
    }

    String getInfo(){

        return "Marca:" + marca + ", Modelo:" + modelo + ", Ano de Fabricação:" + anoFabric;
    }

}