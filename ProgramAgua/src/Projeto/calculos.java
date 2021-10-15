package Projeto;

public class calculos extends Formulario {

	public calculos(String nome, String genero, int idade, float estatura, float peso)
	{
		super(nome, genero, idade, estatura, peso);
	}
		
	public void QuantidadeAguaNecessaria() 
	{
		double aguaNecessaria = 0.035 * getPeso();
		
		System.out.printf("\nQuantidade de água necessaria por dia: %.2f (Litros)",aguaNecessaria);
		System.out.printf("\nAproximadamente %.0f garrafas de 500 mL por dia",aguaNecessaria/0.500);
		System.out.print(				  "\n                   OU");
		System.out.printf("\nAproximadamente %.0f copos americanos(250 mL) por dia",aguaNecessaria/0.250);
	}
	
	public void Imc() 
	{
		double imc = getPeso() / Math.pow(getEstatura(), 2);
		
		if (imc > 0.0 && imc < 18.5) 
		{
			System.out.printf("\nBaixo Peso, valor do imc: %.2f",imc);
		}
		else if (imc >= 18.5 && imc <= 24.9) 
		{
			System.out.printf("\nPeso ideal, valor do imc: %.2f",imc);
		}
		else if (imc >= 25.0 && imc <= 29.9) 
		{
			System.out.printf("\nSobrepeso, valor do imc: %.2f",imc);
		}
		else if (imc >= 30.0 && imc <= 34.9) 
		{
			System.out.printf("\nObesidade(Grau I), valor do imc: %.2f",imc);
		}
		else if (imc >= 35.0 && imc <= 39.9) 
		{
			System.out.printf("\nObesidade(Grau II), valor do imc: %.2f",imc);
		}
		else if (imc >= 40.0) 
		{
			System.out.printf("\nObesidade(Grau III), valor do imc: %.2f",imc);
		}
			
	}
}
