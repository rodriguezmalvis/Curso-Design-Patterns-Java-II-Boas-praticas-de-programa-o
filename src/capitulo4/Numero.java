package capitulo4;

import capitulo5.Visitor;

public class Numero implements Expressao{

	private int numero;

	public Numero(int numero){
		this.numero = numero;
		
	}

	@Override
	public int avalia() {
		return numero;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public void aceita(Visitor impresora) {
		impresora.visitaNumero(this);
	}
	
}
