package herancaPolimorfismoCollection;

public class Ex01ClasseAnimal {
	private String nome = "";
	private int idade = 0;

	public void emitirSom(int i) {
		if(i==1)
			System.out.println("\nO cachorro emitiu um som!");
		if(i==2)
			System.out.println("\nO cavalo emitiu um som!");
		if(i==3)
			System.out.println("\nO bixo preguiça emitiu um som!");
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
