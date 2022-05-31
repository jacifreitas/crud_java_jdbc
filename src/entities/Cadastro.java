package entities;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import conexao.Conexao;

public class Cadastro {
	private static Connection conn = null;
	private static Statement stm = null;
	private static ResultSet rs = null;
	private static PreparedStatement st = null;

	
	
	
	public static void inserir(Funcionario func) {
		try {
			 conn = Conexao.criarConexao();
			 st = conn.prepareStatement("INSERT INTO funcionarios(nome, profissao) VALUES (?,?)");
				st.setString(1, func.getNome());
				st.setString(2, func.getProfissao());
				
				int linhasAfetadas = st.executeUpdate();
				System.out.println("dados inseridos com sucesso! linhas afetadas: " + linhasAfetadas);
				
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			Conexao.fecharConexao();
		}
	
	}
	
	public static void ordernar(String campo, int ordem) {
			try {
				 conn = Conexao.criarConexao();
				stm = conn.createStatement();
				if(campo.equals("id")== true && ordem == 1){
				rs = stm.executeQuery("SELECT * FROM funcionarios ORDER BY id ASC");
				System.out.println("ID - NOME - PROFISSÃO");
					while (rs.next()) {
						System.out.print(rs.getString("id"));
						System.out.print(" ");
						System.out.print(rs.getString("nome"));
						System.out.print(" ");
						System.out.println(rs.getString("profissao"));
					}
				}
				if(campo.equals("id")== true && ordem == 2) {
					rs = stm.executeQuery("SELECT * FROM funcionarios ORDER BY id DESC");
					System.out.println("ID - NOME - PROFISSÃO");
						while (rs.next()) {
							System.out.print(rs.getString("id"));
							System.out.print(" ");
							System.out.print(rs.getString("nome"));
							System.out.print(" ");
							System.out.println(rs.getString("profissao"));
						}
				}
				if(campo.equals("nome") == true && ordem == 1) {
					rs = stm.executeQuery("SELECT * FROM funcionarios ORDER BY nome ASC");
					System.out.println("ID - NOME - PROFISSÃO");
						while (rs.next()) {
							System.out.print(rs.getString("id"));
							System.out.print(" ");
							System.out.print(rs.getString("nome"));
							System.out.print(" ");
							System.out.println(rs.getString("profissao"));
						}
				}
				
				if(campo.equals("nome") == true && ordem == 2) {
					rs = stm.executeQuery("SELECT * FROM funcionarios ORDER BY nome DESC");
					System.out.println("ID - NOME - PROFISSÃO");
						while (rs.next()) {
							System.out.print(rs.getString("id"));
							System.out.print(" ");
							System.out.print(rs.getString("nome"));
							System.out.print(" ");
							System.out.println(rs.getString("profissao"));
						}
				}
				
				if(campo.equals("profissao") == true && ordem == 1) {
					rs = stm.executeQuery("SELECT * FROM funcionarios ORDER BY profissao ASC");
					System.out.println("ID - NOME - PROFISSÃO");
						while (rs.next()) {
							System.out.print(rs.getString("id"));
							System.out.print(" ");
							System.out.print(rs.getString("nome"));
							System.out.print(" ");
							System.out.println(rs.getString("profissao"));
						}
				}
				
				if(campo.equals("profissao") == true && ordem == 1) {
					rs = stm.executeQuery("SELECT * FROM funcionarios ORDER BY profissao ASC");
					System.out.println("ID - NOME - PROFISSÃO");
						while (rs.next()) {
							System.out.print(rs.getString("id"));
							System.out.print(" ");
							System.out.print(rs.getString("nome"));
							System.out.print(" ");
							System.out.println(rs.getString("profissao"));
						}
				}
				if(campo.equals("profissao") == true && ordem == 2) {
					rs = stm.executeQuery("SELECT * FROM funcionarios ORDER BY profissao DESC");
					System.out.println("ID - NOME - PROFISSÃO");
						while (rs.next()) {
							System.out.print(rs.getString("id"));
							System.out.print(" ");
							System.out.print(rs.getString("nome"));
							System.out.print(" ");
							System.out.println(rs.getString("profissao"));
						}
				}
				if(ordem == 0) {
					rs = stm.executeQuery("SELECT * FROM funcionarios");
					System.out.println("ID - NOME - PROFISSÃO");
						while (rs.next()) {
							System.out.print(rs.getString("id"));
							System.out.print(" ");
							System.out.print(rs.getString("nome"));
							System.out.print(" ");
							System.out.println(rs.getString("profissao"));
						}
				}
				
			}
			
			catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				Conexao.fecharConexao();
			}

		}
	
	public static void listar() {
		try {
			conn = Conexao.criarConexao();
			stm = conn.createStatement();
			rs = stm.executeQuery("SELECT * FROM funcionarios");
			System.out.println("ID - NOME - PROFISSÃO");
				while (rs.next()) {
					System.out.print(rs.getString("id"));
					System.out.print(" ");
					System.out.print(rs.getString("nome"));
					System.out.print(" ");
					System.out.println(rs.getString("profissao"));
				}
			
		}
			catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				Conexao.fecharConexao();
			}
	}
	

	public static void atualizar(Funcionario func,int id) {
			try {
					conn = Conexao.criarConexao();
				st = conn.prepareStatement("UPDATE funcionarios SET nome = ?, profissao = ? WHERE id = ?");
				st.setString(1,func.getNome() );
				st.setString(2, func.getProfissao());
				st.setInt(3, id);
				
				int linhasAfetadas = st.executeUpdate();
				System.out.println("dados atualizados com sucesso! linhas afetadas: " + linhasAfetadas);
					
			}
		catch (Exception e) {
				e.printStackTrace();
			
			}
			finally {
				Conexao.fecharConexao();
			}
	}
	
	public static void deletar(int id) {
		
		try {
			conn= Conexao.criarConexao();
			st = conn.prepareStatement("DELETE FROM funcionarios WHERE id = ?");
			st.setInt(1, id);
			int linhasAfetadas = st.executeUpdate();
			System.out.println("dados deletados com sucesso! linhas afetadas: " + linhasAfetadas);
			
		}
		catch (Exception e){
			e.printStackTrace();
		}
		finally {
			Conexao.fecharConexao();
		}
	
		
	}

		
}



