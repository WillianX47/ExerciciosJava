package lacoDecisao;

/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		int num1 = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		num1 = scan.nextInt();
		scan.close();
		
		if(num1%2 == 0)
			System.out.println("O n�mero " + num1 +  " � par e sua raiz quadrada �: " + Math.sqrt(num1));
		if(num1%2 != 0)
			System.out.println("O n�mero " + num1 + " � impar e seu valor elevado ao quadrado �: " + Math.pow(num1, 2));
	}
}
