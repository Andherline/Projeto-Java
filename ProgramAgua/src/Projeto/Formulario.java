package Projeto;

public class Formulario {

	private String nome;
	private String genero;
	private int idade;
	private float estatura;
	private float peso;
	
	public Formulario(String nome, String genero, int idade, float estatura, float peso)
	{
		super();
		this.nome = nome;
		this.genero = genero;
		this.idade = idade;
		this.estatura = estatura;
		this.peso = peso;
	}

	public void imprimirInfo() 
	{
		System.out.println("Nome: "+nome
				          +"\nIdade: "+idade
				          +"\nGênero: "+genero
				          +"\nEstatura: "+estatura
				          +"\nPeso: "+peso
				          +"\n");
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getEstatura() {
		return estatura;
	}

	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
}
