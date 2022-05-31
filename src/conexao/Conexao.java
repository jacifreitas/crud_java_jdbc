package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	private static Connection conn = null;
	
	public static Connection criarConexao() {
		if(conn == null) {
			try {
				String url = "jdbc:mysql://localhost/padaria";
				
				String usuario = "developer";
				
				String senha = "1234567";
				
				conn = DriverManager.getConnection(url, usuario, senha);
				
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
	
	public static Connection fecharConexao() {
		if(conn != null) {
			try {
				conn.close();
				conn = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
	
	

}
