public class App {
    public static void main(String[] args){
        VeiculoService veiculoService = new VeiculoServiceImpl();
        Menu menu = new Menu(veiculoService);
        menu.exibirMenu();
    }
}