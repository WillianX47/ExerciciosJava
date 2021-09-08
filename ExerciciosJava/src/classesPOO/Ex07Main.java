package classesPOO;

/*Crie uma classe paciente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class Ex07Main {

	public static void main(String[] args) {
		Ex07ClassePaciente paciente = new Ex07ClassePaciente();
		paciente.setIdade(21);
		paciente.setNomePaciente("Willian");
		paciente.setNomeDoenca("Miopia");
		
		System.out.println("O paciente " + paciente.getNomePaciente() + " com idade de " 
		+ paciente.getIdade() + " anos, possui a doença: " + paciente.getNomeDoenca());
		
	}

}
