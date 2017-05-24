package capitulo7;

import java.util.Calendar;

public class Pedido {
	
	private String cliente;
	private Double valor;
	private Status status;
	private Calendar dataFinalizado;

	public Pedido(String cliente, Double valor) {
		super();
		this.cliente = cliente;
		this.valor = valor;
		this.status = Status.NOVO;
	}
	
	public void paga(){
		this.status = Status.PAGO;
	}
	
	public void finaliza(){
		dataFinalizado = Calendar.getInstance();
		this.status = Status.ENTREGUE;
	}
	
}
