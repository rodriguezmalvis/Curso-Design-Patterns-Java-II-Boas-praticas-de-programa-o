package capitulo4;

import capitulo5.Visitor;

public interface Expressao {
	int avalia();
	void aceita(Visitor impresora);
}
