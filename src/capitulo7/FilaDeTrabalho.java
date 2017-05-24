package capitulo7;

import java.util.ArrayList;
import java.util.List;

public class FilaDeTrabalho {
	
	private List<Comando> comandos = new ArrayList<>();
	
	public void adiciona(Comando comando){
		comandos.add(comando);
	}

	public void processa(){
		for (Comando comando : comandos) {
			comando.executa();
		}
	}
}
