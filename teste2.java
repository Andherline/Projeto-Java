package Projeto;

import java.util.Scanner;

public class teste2 {

	public static void main(String[] args) {
		
		int op;
		
		Scanner ler = new Scanner(System.in);
		
		do
		{
			System.out.println("\n------------------------------------------------------");
			System.out.println("\n(1) Deseja adicionar novo paciete:");
			System.out.println("\n(2) Deseja remover paciente:");
			System.out.println("\n(3) Deseja atualizar informa��o do paciente:");
			System.out.println("\n(4) Deseja mostrar lista de pacientes:");
			System.out.println("\n(0) Deseja sair do programa:");
			System.out.println("\n------------------------------------------------------");
			System.out.println("\nDigite sua op��o: ");
			op = ler.nextInt();
			
			switch(op)
			{
			case 0:
				System.out.println("\nFinalizando o programa");
			case 1:
				ler.nextLine();//limpeza de caches
				System.out.println("\nDigite um novo paciente:");
				String paciente = ler.nextLine();
				//estoque.add(produto);
				break;
			case 2:
				ler.nextLine();//limpeza de caches
				System.out.println("\nDigite um paciente que deseja remover do prontu�rio");
				String removePaciente = ler.nextLine();
				//contains: verifica se o elemento existe na lista
				break;
			case 3:
				ler.nextLine();//limpeza de caches
				System.out.println("\nDigite o nome do paciente que voc� deseja atualizar as informa��es:");
				String  verificar = ler.nextLine();
				System.out.println("\nQual informa��o quer atualizar:");
				String novo = ler.nextLine();
				System.out.println("\n------------------------------------------------------");
				System.out.println("\n(A) Deseja alterar o peso do paciete:");
				System.out.println("\n(B) Deseja alterar a idade:");
				System.out.println("\n(C) Deseja alterar o g�nero:");
				System.out.println("\n(D) Deseja mostrar lista de pacientes com as modifica��es:");
				System.out.println("\n------------------------------------------------------");
				System.out.println("\nDigite sua op��o: ");
				String opb = ler.nextLine();
				if (opb == "A")
				{
					System.out.println("as");
				}
				else if (opb == "B") 
				{
					System.out.println();
				}
				else if (opb == "C") 
				{
					System.out.println();
				}
				else if (opb == "D") 
				{
					System.out.println();
				}
				break;
			case 4:
				ler.nextLine();
				System.out.println();
				System.out.println();
				break;
			default:
				System.out.println("Op��o inv�lida!!!");
			}
		}
		while(op != 0);

	}

}
