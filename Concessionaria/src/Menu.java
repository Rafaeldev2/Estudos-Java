
import javax.swing.JOptionPane;

public class Menu {
    private VeiculoService veiculoService;

    public Menu(VeiculoService veiculoService) {
        this.veiculoService = veiculoService;
    }

    public void exibirMenu(){
        int opcao = 0;
        while (opcao != 4) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "Menu Inicial\n" +
                "1. Cadastrar Carro\n" +
                "2. Cadastrar SUV\n" +
                "3. Cadastrar Picape\n" +
                "4. Sair"));
                switch (opcao){
                    case 1:
                    cadastrarCarro();
                    break;

                    case 2:
                    cadastrarSuv();
                    break;

                    case 3:
                    cadastrarPicape();
                    break;

                    case 4:
                    JOptionPane.showMessageDialog(null,"Saindo do sistema...");
                    break;

                    default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                }
            }
        }
        private void cadastrarCarro(){
            String marca = JOptionPane.showInputDialog("Qual a marca do seu carro: ");
            String modelo = JOptionPane.showInputDialog("Qual o modelo do seu carro: ");
            int ano = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano do seu carro: "));
            String tipo = JOptionPane.showInputDialog("Qual o tipo do seu carro: ");
            double motor = Double.parseDouble(JOptionPane.showInputDialog("Quantos litros tem o motor do carro: "));
            String cor = JOptionPane.showInputDialog("Qual o cor do seu carro: ");

            Carro carro = new Carro(marca, modelo, ano, tipo, motor, cor);
            veiculoService.cadastrarVeiculo(carro);
            veiculoService.exibirInformacoesVeiculo(carro);
        }

        private void cadastrarSuv(){
            String marca = JOptionPane.showInputDialog("Qual a marca do seu SUV: ");
            String modelo = JOptionPane.showInputDialog("Qual o modelo do seu SUV: ");
            int ano = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano do seu SUV: "));
            String tipo = JOptionPane.showInputDialog("Digite o tipo do seu SUV: ");
            double motor = Double.parseDouble(JOptionPane.showInputDialog("Quantos litros tem o motor do seu SUV: "));
            int portaMalas = Integer.parseInt(JOptionPane.showInputDialog("Quantos litros tem o porta malas do SUV: "));
            int numAssentos = Integer.parseInt(JOptionPane.showInputDialog("Qual o número de assentos do SUV: "));
            String cor = JOptionPane.showInputDialog("Qual a cor do seu SUV: ");

            Suv suv = new Suv(numAssentos, portaMalas, marca, modelo, ano, tipo, motor, cor);
            veiculoService.cadastrarVeiculo(suv);
            veiculoService.exibirInformacoesVeiculo(suv);
        }

        private void cadastrarPicape(){
            String marca = JOptionPane.showInputDialog("Digite a marca da sua picape: ");
            String modelo = JOptionPane.showInputDialog("Digite o modelo da sua picape: ");
            int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano da sua picape: "));
            String tipo = JOptionPane.showInputDialog("Digite o tipo da sua picape: ");
            double motor = Double.parseDouble(JOptionPane.showInputDialog("Quantos litros tem o motor da sua picape: "));
            String cor = JOptionPane.showInputDialog("Qual a cor da sua Picape: ");
            double capacidadeCarga = Double.parseDouble(JOptionPane.showInputDialog("Qual a capacidade de carga da sua picape: "));
            String tracao = JOptionPane.showInputDialog("Qual a tração da sua picape: ");

            Picape picape = new Picape(marca, modelo, ano, tipo, motor, cor, capacidadeCarga, tracao);
            veiculoService.cadastrarVeiculo(picape);
            veiculoService.exibirInformacoesVeiculo(picape);
        }
}
