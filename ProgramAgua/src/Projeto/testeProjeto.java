package Projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class testeProjeto {
	
	public static calculos preencher()  {
		
		String nome;
		String genero;
		int idade;
		float estatura;
		float peso;
		
		Scanner leia = new Scanner (System.in);		
		
		System.out.println("\nInsira o nome do paciente:");
		nome = leia.next();
		System.out.println("\nInsira o g�nero do paciente:");
		genero = leia.next();
		System.out.println("\nInsira a idade do paciente:");
		idade = leia.nextInt();
		System.out.println("\nInsira a altura do paciente:");
		estatura = leia.nextFloat();
		System.out.println("\nInsira o peso do paciente:");
		peso = leia.nextFloat();
		
		calculos teste = new calculos(nome,genero,idade,estatura,peso);
		return teste;
				
	}

	public static void main(String[] args) {
		
		
		ArrayList<calculos> Pacientes = new ArrayList();		
		
		int op, cont=0, posicao=0;
		String opb;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("********SEJA BEM VINDE � CLINIC GROUP 2!!!*********");
		
		do
		{
			System.out.println("\n------------------LISTA DE OP��ES---------------------");
			System.out.println("\n(1) Deseja adicionar novo paciente.");
			System.out.println("\n(2) Deseja remover paciente do sistema.");
			System.out.println("\n(3) Deseja atualizar informa��o do paciente.");
			System.out.println("\n(4) Deseja mostrar lista de pacientes.");
			System.out.println("\n(5) Deseja mostrar quantidade necess�ria de �gua e IMC de pacientes.");
			System.out.println("\n(0) Deseja sair do programa.");
			System.out.println("\n------------------------------------------------------");
			System.out.println("\nDigite sua op��o: ");
			op = ler.nextInt();
			
			switch(op)
			{
			case 0:
				System.err.println("\nFinalizando o programa...");//Imprime a mensagem com a cor vermelha			
				
			case 1:
		
				ler.nextLine(); //limpeza de cashes			
				Pacientes.add(preencher());
				break;				
				
			case 2:
				ler.nextLine();//limpeza de caches
				System.out.println("\nDigite o nome do paciente que deseja remover do sistema");
				String removePaciente = ler.nextLine(); //
				
				for(calculos lista:Pacientes) 
				{
					if(lista.getNome().equals(removePaciente)) 
					{
						Pacientes.remove(lista); 
						break;
					}					
				}
				break;				
				
			case 3:
				ler.nextLine();//limpeza de caches
				System.out.println("\nDigite o nome do paciente que deseja atualizar as informa��es:");
				String  verificar = ler.nextLine();

				System.out.println("\n------------------------------------------------------");
				System.out.println("\n(A) Deseja alterar o peso do paciente.");
				System.out.println("\n(B) Deseja alterar a idade.");
				System.out.println("\n(C) Deseja alterar o g�nero.");
				System.out.println("\n------------------------------------------------------");
				System.out.println("\nDigite sua op��o: ");
				opb = ler.nextLine();
				
				while(cont<Pacientes.size()) //la�o de repeti��o para percorrer a lista 
				{
					if(Pacientes.get(cont).getNome().equals(verificar)) //condicional para verificar se o atributo pertence ao objeto Pacientes
					{
						posicao=cont;	//posi�ao referente ao atributo que foi inserido				
					}
					cont++;
				}
				
				switch (opb)  //nova lista de op��es para a op��o 3
				{
				case "A":
					System.out.println("\nDigite o peso atual do paciente.");
					float novoPeso = ler.nextFloat();
					
					Pacientes.get(posicao).setPeso(novoPeso);	
					System.out.println("\nInforma��es com o peso atual do paciente: ");
					Pacientes.get(posicao).imprimirInfo();
					break;
					
				case "B":
					System.out.println("\nDigite a idade atual do paciente.");
					int novaIdade = ler.nextInt();
					
					Pacientes.get(posicao).setIdade(novaIdade);	
					System.out.println("\nInforma��es com a idade atual do paciente: ");
					Pacientes.get(posicao).imprimirInfo();
					break;
				
				case "C":
					System.out.println("\nDigite o g�nero atual do paciente.");
					String novoGenero = ler.nextLine();
					
					Pacientes.get(posicao).setGenero(novoGenero);
					System.out.println("\nInforma��es com o g�nero atual do paciente: ");
					Pacientes.get(posicao).imprimirInfo();
					break;					
				}
				break;		
			
			case 4:
				ler.nextLine();//limpeza de cashes	
				System.out.println("\nLista de pacientes: ");
				
				for (int contador=0;contador<Pacientes.size(); contador++) 
				{
					Pacientes.get(contador).imprimirInfo();
				}				
				break;
				
			case 5:
				ler.nextLine();//limpeza de cashes
				System.out.println("\nDigite o nome do paciente que deseja vizalizar as informa��es: ");
				String vizualizar = ler.nextLine();
				for(calculos lista:Pacientes) 
				{
					if(lista.getNome().equals(vizualizar)) 
					{
						lista.QtdAguaNecessaria();
						lista.Imc();
						break;
					}					
				}	
				break;
			default:
				System.err.println("\nPor favor insira uma op��o v�lida!!!"); //Imprime mensagem de erro
			}
		}
		while(op != 0);		

	}

}
