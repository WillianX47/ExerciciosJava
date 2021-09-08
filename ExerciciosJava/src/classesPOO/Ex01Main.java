package classesPOO;
/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class Ex01Main {
	public static void main(String[]args) {
		Ex01ClasseCliente cliente = new Ex01ClasseCliente();
		cliente.setIdade(21);
		cliente.setNome("Willian");
		cliente.setSexo("Masculino");
		cliente.setUsuario("Will");
		
		System.out.println("Nome: " + cliente.getNome() + " | idade: " + cliente.getIdade()
		+ " | Sexo: " + cliente.getSexo() + " | Usuário: " + cliente.getUsuario());
	}
}
