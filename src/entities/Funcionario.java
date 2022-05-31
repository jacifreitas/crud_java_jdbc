package entities;

public class Funcionario {
	
	private String nome;
	private String profissao;
	
	
	public Funcionario() {
	
	}

	public Funcionario(String nome, String profissao) {
		this.nome = nome;
		this.profissao = profissao;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getProfissao() {
		return profissao;
	}


	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	
	
	
	

}
