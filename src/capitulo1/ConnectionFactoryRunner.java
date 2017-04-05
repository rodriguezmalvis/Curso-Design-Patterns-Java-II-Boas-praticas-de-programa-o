package capitulo1;

import java.sql.Connection;

public class ConnectionFactoryRunner {

	public static void main(String[] args) {
		
		String banco = System.getenv("tipoBanco");
		
		Connection connection = new ConnectionFactory().getConnection(banco);
		
	}
	
}
