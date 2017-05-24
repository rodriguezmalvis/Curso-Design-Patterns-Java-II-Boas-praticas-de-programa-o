package capitulo7;

public class Programa {

	public static void main(String[] args) {

		Pedido pedido = new Pedido("Ruben", 1000.00);
		Pedido pedido2 = new Pedido("Ruben", 1000.00);
		
		FilaDeTrabalho fila = new FilaDeTrabalho();
		
		fila.adiciona(new PagaPedido(pedido));
		fila.adiciona(new PagaPedido(pedido2));
		
		fila.adiciona(new ConcluiPedido(pedido2));
		fila.adiciona(new ConcluiPedido(pedido));
		
		fila.processa();
		
	}

}
