package lacoDecisao;

//Faça um programa que receba três inteiros e diga qual deles é o maior.

import java.util.Scanner;

public class Ex01 {
	public static void main (String[]args) {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite três números: ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		scan.close();
		if(num1 > num2 && num1 > num3)
			System.out.println("O primeiro numero digitado é o maior, numero digitado = " + num1);
		if(num2 > num1 && num2 > num3)
			System.out.println("O segundo numero digitado é o maior, numero digitado = " + num2 );
		if(num3 > num1 && num3 > num2)
			System.out.println("O terceiro numero digitado é o maior, numero digitado = " + num3);
	}
}
