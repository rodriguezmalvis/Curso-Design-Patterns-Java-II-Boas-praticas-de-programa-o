package capitulo3;

import java.util.Calendar;

public class Programa {
	
	public static void main(String[] args) {
		
		Historico historico = new Historico();
		Contrato contrato = new Contrato(Calendar.getInstance(), "Ruben", TipoContrato.NOVO);
		
		historico.adiciona(contrato.salvaEstado());
		contrato.avanca();
		
		historico.adiciona(contrato.salvaEstado());
		contrato.avanca();
		
		historico.adiciona(contrato.salvaEstado());
		contrato.avanca();
		
		historico.adiciona(contrato.salvaEstado());
		contrato.avanca();
		
		Estado estadoAterior = historico.pega(3);
		System.out.println(estadoAterior.getEstado().getTipo());
	}
}
