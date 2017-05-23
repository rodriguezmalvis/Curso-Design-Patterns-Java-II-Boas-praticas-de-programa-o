package capitulo4;

import capitulo5.ImpresoraPrefixaVisitor;
import capitulo5.ImpresoraVisitor;
import capitulo5.Visitor;

public class Programa {
	
	public static void main(String[] args) {
		
		Visitor impresora = new ImpresoraPrefixaVisitor();
		
		Expressao esquerda = new Soma(new Soma(new Numero(5),new Numero(5)),new Numero(10));  
		Expressao direita = new Soma(new Numero(5),new Numero(10));  
		Expressao expressao = new Subtracao(esquerda,direita);
		Expressao mutiplicao = new Multiplicacao(new Numero(5),new Numero(10));  
		Expressao divisao = new Divisao(new Numero(5),new Numero(10));  
		Expressao raiz = new RaizQudrada(new Numero(5));  
		
		System.out.println(expressao.avalia());
		
		expressao.aceita(impresora);
		
	}

}
