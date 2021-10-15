package Projeto;

import java.util.Scanner;

public class testeProjeto {

	public static void main(String[] args) {
		
		String nome;
		String genero;
		int idade;
		float estatura;
		float peso;
		
		Scanner leia = new Scanner(System.in);
		
		/*System.out.println("Digite o nome:");
		nome = leia.nextLine();
		System.out.println("Digite o gênero:");
		genero = leia.nextLine();
		System.out.println("Digite a idade:");
		idade = leia.nextInt();
		System.out.println("Digite a altura:");
		estatura = leia.nextFloat();
		System.out.println("Digite o peso:");
		peso = leia.nextFloat();*/
		
		calculos []paciente = new calculos[2];
		
		for (int contador = 0; contador < paciente.length; contador++)
		{
			System.out.println("Digite o nome:");
			nome = leia.next();
			System.out.println("Digite o gênero:");
			genero = leia.next();
			System.out.println("Digite a idade:");
			idade = leia.nextInt();
			System.out.println("Digite a altura:");
			estatura = leia.nextFloat();
			System.out.println("Digite o peso:");
			peso = leia.nextFloat();
			
			paciente[contador] = new calculos(nome,genero,idade,estatura,peso);
	
		}
		
		paciente[0].imprimirInfo();
		paciente[1].QuantidadeAguaNecessaria();
		paciente[1].imprimirInfo();
	
		
	}

}
