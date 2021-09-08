package classesPOO;
/*
Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
public class Ex05Main {

	public static void main(String[] args) {
		Ex05ClassePatinete patinete = new Ex05ClassePatinete();
		patinete.setDistanciaPercorrida(50.0);
		patinete.setValor(150.00);
		System.out.println("O patinete custou R$" + patinete.getValor() + " e percorri " + patinete.getDistanciaPercorrida() + "m com ele");
	}

}
