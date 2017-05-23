package capitulo3;

import java.util.Calendar;

public class Contrato {
	
	private Calendar data;
	private String cliente;
	private TipoContrato tipo;
	
	public Contrato(Calendar data, String cliente, TipoContrato tipo) {
		super();
		this.data = data;
		this.cliente = cliente;
		this.tipo = tipo;
	}
	
	public Estado salvaEstado(){
		return new Estado(new Contrato(this.data, this.cliente, this.tipo));
	}
	
	public void avanca(){
		if(tipo == TipoContrato.NOVO) tipo = TipoContrato.EM_ANDAMENTO;
		else if(tipo == TipoContrato.EM_ANDAMENTO) tipo = TipoContrato.ACERTADO;
		else if(tipo == TipoContrato.ACERTADO) tipo = TipoContrato.CONCLUIDO;
	}
	
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public TipoContrato getTipo() {
		return tipo;
	}
	public void setTipo(TipoContrato tipo) {
		this.tipo = tipo;
	}

}
