package capitulo5;

import capitulo4.Numero;
import capitulo4.Soma;
import capitulo4.Subtracao;

public class ImpresoraVisitor implements Visitor {

	@Override
	public void visitaSoma(Soma soma) {
		System.out.print("(");
		soma.getEsquerda().aceita(this);
		System.out.print(" + ");
		soma.getDireita().aceita(this);
		System.out.print(")");
	}
	
	@Override
	public void visitaSubtracao(Subtracao subtracao) {
		System.out.print("(");
		subtracao.getEsquerda().aceita(this);
		System.out.print(" - ");
		subtracao.getDireita().aceita(this);
		System.out.print(")");
	}

	@Override
	public void visitaNumero(Numero numero) {
		System.out.print(numero.getNumero());
	}
	
}
