package capitulo4;

import capitulo5.Visitor;

public class RaizQudrada implements Expressao {

	private Expressao numero;

	public RaizQudrada(Expressao numero){
		this.numero = numero;
		
	}
	
	@Override
	public int avalia() {
		return (int) Math.sqrt(numero.avalia());
	}

	@Override
	public void aceita(Visitor impresora) {
		// TODO Auto-generated method stub
		
	}

}
