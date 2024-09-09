public class Automovel {
    public static void main(String[] args) {

        Carro carro = new Carro("Honda", "Civic", 2006, 4);
        Picape picape = new Picape("Toyota", "Hilux", 2018, 1500.00);
        SUV suv = new SUV("Porsche", "Cayene", 2024, 5);

        System.out.println("Informações dos Veículos: ");
        System.out.println(carro.getInfo());
        System.out.println(picape.getInfo());
        System.out.println(suv.getInfo());
    }
}
