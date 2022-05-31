package application;

import java.util.Scanner;

import entities.Cadastro;
import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Funcionario func = null;
	
		System.out.println("SELECIONE A OPÇAO DESEJADA:");
		System.out.print("1- INSERIR, 2- LISTAR, 3- ATUALIZAR, 4- DELETAR, 5- SAIR: ");
		int acao = sc.nextInt();
	
		

		while(acao != 5 ) {
			
			if(acao == 1) {
		
				System.out.print("NOME:");
				String nome = sc.next();
				System.out.print("Profissao: ");
				String profissao = sc.next();
				func = new Funcionario(nome, profissao);
				Cadastro.inserir(func);
			}
			if(acao == 2) {
				System.out.print("Deseja ordernar por algum campo? ");
				String resp = sc.next();
				if(resp.equals("sim")) {
					System.out.print("Informe o campo: ");
					String campo = sc.next();
					System.out.print("Digite 1 para ordem ascendente ou 2 para descente");
					int ordem = sc.nextInt();
					Cadastro.ordernar(campo, ordem);
				}
				else {
				Cadastro.listar();
				}
			}
			if(acao == 3) {
				sc.nextLine();
				Cadastro.listar();
				System.out.println("Atualizar Cadastro");
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Profissao ");
				String profissao = sc.nextLine();
				System.out.print("Identificação do funcionário: ");
				int id = sc.nextInt();
				func = new Funcionario(nome, profissao);
				Cadastro.atualizar(func, id);
			}
			if(acao == 4) {
				System.out.print("Informe a identificação do funcionário a ser excluido: ");
				int id = sc.nextInt();
				Cadastro.deletar(id);
			}
			
			System.out.println();
			System.out.println("SELECIONE A OPÇAO DESEJADA:");
			System.out.print("1- INSERIR, 2- LISTAR, 3- ATUALIZAR, 4- DELETAR, 5- SAIR: ");
			
			acao = sc.nextInt();
	
		
	}
	
			
		System.out.println("Conexao encerrada!");
	
		sc.close();
		

	}
	


}

