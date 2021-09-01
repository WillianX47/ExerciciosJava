package ProgramacaoSequencial;

import java.util.Scanner;

/*Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão:

R = ( A + B )^2
S = ( B + C )^2
D = ( R + S )/2

*/

public class Ex04 {
	public static void main(String[]args) {
		double A = 0;
		double B = 0;
		double C = 0;
		double D = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite os valores de A, B, C respectivamente: ");
		A = scan.nextInt();
		B = scan.nextInt();
		C = scan.nextInt();
		D = Math.pow((A+B), 2) + Math.pow((B+C),2);
		
		System.out.println("O resultado da expressao eh: " + D);
		
		scan.close();
	}
}
