
import javax.swing.JOptionPane;

public class VeiculoServiceImpl implements VeiculoService{

    @Override
    public void cadastrarVeiculo(Veiculo veiculo) {
        // TODO Auto-generated method stub
        JOptionPane.showMessageDialog(null, "Veículo cadastrado com sucesso!");
    }

    @Override
    public void exibirInformacoesVeiculo(Veiculo veiculo) {
        String informacoes = 
            "Marca: " + veiculo.getMarca() + "\n" +
            "Modelo: " + veiculo.getModelo() + "\n" +
            "Ano: " + veiculo.getAno() + "\n" +
            "Tipo: " + veiculo.getTipo() + "\n" +
            "Motor: " + veiculo.getMotor() + "\n" +
            "Cor: " + veiculo.getCor();

        if (veiculo instanceof Suv) {
            Suv suv = (Suv) veiculo;
            informacoes += 
                "\nPorta-malas: " + suv.getPortaMalas() + "\n" +
                "Número de assentos: " + suv.getNumAssentos();
        } else if (veiculo instanceof Picape) {
            Picape picape = (Picape) veiculo;
            informacoes +=
                "\nCapacidade de carga: " + picape.getCapacidadeCarga() + "\n" +
                "Tração: " + picape.getTracao();
        }
        JOptionPane.showMessageDialog(null, informacoes);
    }
}