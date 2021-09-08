package classesPOO;
/*Crie uma classe conta bancaria e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto conta bancaria, defina
as instancias deste objeto e apresente as informações deste objeto no
console.*/

public class Ex06Main {

	public static void main(String[] args) {
		Ex06ClasseContaBancaria conta = new Ex06ClasseContaBancaria();
		conta.setCpf("000.000.000-00");
		conta.setNomeCliente("Willian");
		conta.setIdade(21);
		
		System.out.println("O proprietário do CPF ( " + conta.getCpf() + " ) é o cliente " 
		+ conta.getNomeCliente() + " com idade de " + conta.getIdade() + " anos");
	}

}
