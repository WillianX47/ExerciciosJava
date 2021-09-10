package herancaPolimorfismoCollection;

public abstract class Ex01ClasseAnimal implements Ex01InterfaceAnimal{
	private String nome = "";
	private int idade = 0;
	
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
