package ProgramacaoSequencial;
import java.util.Scanner;

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
