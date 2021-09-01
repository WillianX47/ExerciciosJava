package lacoDecisao;

/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		int num1 = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		num1 = scan.nextInt();
		scan.close();
		
		if(num1%2 == 0)
			System.out.println("O número " + num1 +  " é par e sua raiz quadrada é: " + Math.sqrt(num1));
		if(num1%2 != 0)
			System.out.println("O número " + num1 + " é impar e seu valor elevado ao quadrado é: " + Math.pow(num1, 2));
	}
}
