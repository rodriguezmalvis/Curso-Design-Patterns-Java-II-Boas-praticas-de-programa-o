package capitulo7;

public class ConcluiPedido implements Comando{
	
	private Pedido p;

	public ConcluiPedido(Pedido p) {
		this.p = p;
	}

	@Override
	public void executa() {
		p.finaliza();
		System.out.println("Pedido finalizado");
	}

}
