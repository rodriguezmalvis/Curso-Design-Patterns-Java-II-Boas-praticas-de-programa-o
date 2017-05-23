package capitulo2;

import java.util.Arrays;
import java.util.List;

public class Programa {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {

		NotasMusicais notas = new NotasMusicais();
		
		List<Nota> musica = Arrays.asList(
				notas.pega("si"),
				notas.pega("si"),
				notas.pega("do"),
				notas.pega("re"),
				notas.pega("re"),
				notas.pega("do"),
				notas.pega("si"),
				notas.pega("la"),
				notas.pega("sol"),
				notas.pega("sol"),
				notas.pega("la"),
				notas.pega("si"),
				notas.pega("si"),
				notas.pega("la"),
				notas.pega("la"),
				notas.pega("si"),
				notas.pega("si"),
				notas.pega("do"),
				notas.pega("re"),
				notas.pega("re"),
				notas.pega("do"),
				notas.pega("si"),
				notas.pega("la"),
				notas.pega("sol"),
				notas.pega("sol"),
				notas.pega("la"),
				notas.pega("si"),
				notas.pega("la"),
				notas.pega("sol"), 
				notas.pega("sol"), 
				notas.pega("la"), 
				notas.pega("la"), 
				notas.pega("si"), 
				notas.pega("sol"), 
				notas.pega("la"),
				notas.pega("si"),
				notas.pega("do"),
				notas.pega("si"),
				notas.pega("sol"), 
				notas.pega("la"),
				notas.pega("si"),
				notas.pega("do"),
				notas.pega("si"),
				notas.pega("la"),
				notas.pega("sol"), 
				notas.pega("la"),
				notas.pega("re"),
				notas.pega("si"),
				notas.pega("si"),
				notas.pega("do"),
				notas.pega("re"),
				notas.pega("re"),
				notas.pega("do"),
				notas.pega("si"),
				notas.pega("la"),
				notas.pega("sol"), 
				notas.pega("sol"), 
				notas.pega("la"),
				notas.pega("si"),
				notas.pega("la"),
				notas.pega("sol"),
				notas.pega("sol")
		);
		
		Piano piano = new Piano();
		
		piano.toca(musica);
	}

}
