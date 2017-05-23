package capitulo4;

public class RaizQudrada implements Expressao {

	private Expressao numero;

	public RaizQudrada(Expressao numero){
		this.numero = numero;
		
	}
	
	@Override
	public int avalia() {
		return (int) Math.sqrt(numero.avalia());
	}

}
