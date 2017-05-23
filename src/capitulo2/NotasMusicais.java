package capitulo2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotasMusicais {
	
	private static Map<String, Nota> notas = new HashMap<String, Nota>();
	private static List<Class<? extends Nota>> classes;
	
	static {
		classes = Arrays.asList(
				Do.class,
				Re.class,
				Mi.class,
				Fa.class,
				Sol.class,
				La.class,
				Si.class
		);
	}
	
	public Nota pega(String nome) throws InstantiationException, IllegalAccessException{
		
		if(!notas.containsKey(nome)){
			for (Class<? extends Nota> clazz : classes) {
				if(clazz.getSimpleName().toLowerCase().equals(nome)){
					System.out.println("Instanciando: "+nome);
					notas.put(nome, clazz.newInstance());
					break;
				}
			}
		}
		
		return notas.get(nome);
	}

}
