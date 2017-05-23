package capitulo5;

import capitulo4.Numero;
import capitulo4.Soma;
import capitulo4.Subtracao;

public interface Visitor {

	void visitaSoma(Soma soma);

	void visitaSubtracao(Subtracao subtracao);

	void visitaNumero(Numero numero);

}