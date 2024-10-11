package sistemaPagamento;

public class SistemaPagamento {
	private Pagamento metodoPagamento;

    public void setMetodoPagamento(Pagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void realizarPagamento(double valor) {
        if (metodoPagamento != null) {
            metodoPagamento.processarPagamento(valor);
        } else {
            System.out.println("Método de pagamento não definido.");
        }
    }

}
