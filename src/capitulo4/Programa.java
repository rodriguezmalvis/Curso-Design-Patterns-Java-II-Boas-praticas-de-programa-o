package capitulo4;

public class Programa {
	
	public static void main(String[] args) {
		
		Expressao esquerda = new Soma(new Numero(5),new Numero(10));  
		Expressao direita = new Soma(new Numero(5),new Numero(10));  
		Expressao expressao = new Subtracao(esquerda,direita);
		Expressao mutiplicao = new Multiplicacao(new Numero(5),new Numero(10));  
		Expressao diciasao = new Divisao(new Numero(5),new Numero(10));  
		Expressao raiz = new RaizQudrada(new Numero(5));  
		
		System.out.println(expressao.avalia());
		
	}

}
