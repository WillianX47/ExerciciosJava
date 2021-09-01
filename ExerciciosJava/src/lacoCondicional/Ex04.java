package lacoCondicional;

import java.util.Scanner;

/*Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
número é par ou ímpar, e se é positivo ou negativo*/
public class Ex04 {
	public static void main(String[] args) {
		int num1 = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número: ");
		num1 = scan.nextInt();
		scan.close();
		
		if(num1>0) {
			System.out.print("O número é positivo e ");
			if(num1%2!=0) {
				System.out.println("impar");
			} else {
				System.out.println("par");
			}
		} else {
			System.out.print("O número é negativo e ");
			if(num1%2!=0) {
				System.out.println("impar");
			} else {
				System.out.println("par");
			}
		}	
	}
}
