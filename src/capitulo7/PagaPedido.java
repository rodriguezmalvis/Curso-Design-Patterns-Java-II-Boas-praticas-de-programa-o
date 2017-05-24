package capitulo7;

public class PagaPedido implements Comando{
	
	private Pedido p;

	public PagaPedido(Pedido p) {
		this.p = p;
	}

	@Override
	public void executa() {
		p.paga();
		System.out.println("Pedido pago");
	}

	
}
