package Projeto;

public class calculos extends Formulario {

	public calculos(String nome, String genero, int idade, float estatura, float peso)
	{
		super(nome, genero, idade, estatura, peso);
	}
		
	public void QtdAguaNecessaria() 
	{
		double aguaNecessaria = 0.035 * getPeso();
		
		System.out.printf("\nQuantidade de água necessária por dia: %.2f (Litros)",aguaNecessaria);
		System.out.printf("\nAproximadamente %.0f garrafas de 500 mL por dia",aguaNecessaria/0.500);
		System.out.print(				  "\n                   OU");
		System.out.printf("\nAproximadamente %.0f copos americanos(250 mL) por dia",aguaNecessaria/0.250);
	}
	
	public void Imc() 
	{
		double imc = getPeso() / Math.pow(getEstatura(), 2);
		
		System.out.println();
		if (imc > 0.0 && imc < 18.5) 
		{
			System.out.printf("\nValor do imc: %.2f - Baixo Peso.",imc);
		}
		else if (imc >= 18.5 && imc <= 24.9) 
		{
			System.out.printf("\nValor do imc: %.2f - Peso ideal.",imc);
		}
		else if (imc >= 25.0 && imc <= 29.9) 
		{
			System.out.printf("\nValor do imc: %.2f - Sobrepeso.",imc);
		}
		else if (imc >= 30.0 && imc <= 34.9) 
		{
			System.out.printf("\nValor do imc: %.2f - Obesidade(Grau I).",imc);
		}
		else if (imc >= 35.0 && imc <= 39.9) 
		{
			System.out.printf("\nValor do imc: %.2f - Obesidade(Grau II).",imc);
		}
		else if (imc >= 40.0) 
		{
			System.out.printf("\nValor do imc: %.2f - Obesidade(Grau III)",imc);
		}
			
	}
}
