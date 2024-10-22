package serializacao;

public class Main {
	public static void main(String args[]) {
		Cliente cliente = new Cliente("Cliente preferencial");
		System.out.println("Gravando um arquivo de cliente");
		GravarObjetoSerializado.gravarCliente(cliente, "cliente.ser");
		System.out.println("Arquivo gravado");
		System.out.println("Lendo o arquivo objeto");
		LerObjetoSerializado.lerCliente("cliente.ser");
		System.out.println("Arquivo lido");
	}
}
