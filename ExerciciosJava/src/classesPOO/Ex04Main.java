package classesPOO;
/*Crie uma classe funcion�rio e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto funcion�rio, defina as
instancias deste objeto e apresente as informa��es deste objeto no
console.*/

public class Ex04Main {

	public static void main(String[] args) {
		Ex04ClasseFuncionario gerente = new Ex04ClasseFuncionario();
		gerente.setFuncao("Gerente");
		gerente.setSalario(4950.00);
		System.out.println("A fun��o do funcion�rio �: " + gerente.getFuncao() + " com sal�rio de R$" + gerente.getSalario());
	}

}
