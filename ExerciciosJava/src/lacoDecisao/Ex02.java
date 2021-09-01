package lacoDecisao;

import java.util.Scanner;

//Faça um programa que entre com três números e coloque em ordem crescente.

public class Ex02 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite três números: ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		scan.close();
		
		if(num1 < num2 && num1 < num3) {
			System.out.print(num1);
			if (num2 < num3) {
				System.out.println(" " + num2 + " " + num3);
			} else {
				System.out.println(" " + num3 + " " + num2);
			}
		}
		if(num2 < num1 && num2 < num3) {
			System.out.print(num2);
			if (num1 < num3) {
				System.out.println(" " + num1 + " " + num3);
			} else {
				System.out.println(" " + num3 + " " + num1);
			}
		}
		if(num3 < num1 && num3 < num2) {
			System.out.print(num3);
			if (num1 < num2) {
				System.out.println(" " + num1 + " " + num2);
			} else {
				System.out.println(" " + num2 + " " + num1);
			}
		}
	}
}
