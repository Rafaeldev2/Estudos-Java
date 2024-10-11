package sistemaPagamento;

public class PagamentoBoleto implements Pagamento {

	@Override
	public void processarPagamento(double valor) {
		System.out.println("Processando pagamento de R$" + valor + " via Boleto.");
	}

}
