package ProgramacaoSequencial;
import java.util.Scanner;

public class Ex08 {
	public static void main(String[]args) {
		double valorFabrica = 0;
		double valorDistribuidor = 0;
		double valorImpostos = 0;
		double valorConsumidor = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor: ");
		valorFabrica = scan.nextInt();
		valorDistribuidor = valorFabrica + ((valorFabrica*28)/100);
		valorImpostos = valorFabrica + ((valorFabrica*45)/100);
		valorConsumidor = (valorFabrica + valorImpostos + valorDistribuidor);
		
		System.out.println("O valor para o consumidor e: " + valorConsumidor);
		
		scan.close();
	}
}
