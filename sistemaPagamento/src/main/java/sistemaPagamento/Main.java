package sistemaPagamento;

public class Main {

	public static void main(String[] args) {
		SistemaPagamento sistema = new SistemaPagamento();

		sistema.setMetodoPagamento(new PagamentoCartao());
		sistema.realizarPagamento(150.00);

		sistema.setMetodoPagamento(new PagamentoBoleto());
		sistema.realizarPagamento(200.00);

		// Adicionando novo método sem modificar o código existente
		sistema.setMetodoPagamento(new PagamentoPix());
		sistema.realizarPagamento(300.00);
	}

}
