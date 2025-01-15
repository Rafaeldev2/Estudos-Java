import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o seu Nome: ");

        String idade = JOptionPane.showInputDialog(" Digite a sua Idade: ");
        int anos = Integer.parseInt(idade);

        String nota1 = JOptionPane.showInputDialog(" Digite a sua nota 1: ");
        String nota2 = JOptionPane.showInputDialog(" Digite a sua nota 2: ");
        String nota3 = JOptionPane.showInputDialog(" Digite a sua nota 3: ");

        double media = 0.0;
        media = (Double.parseDouble(nota1) + Double.parseDouble(nota2) + Double.parseDouble(nota3));
        media = media / 3;

        String historia = " O aluno " + nome + " tem, " + anos + " anos e sua média é: " + media;

        JOptionPane.showMessageDialog(null, historia);
    }
}