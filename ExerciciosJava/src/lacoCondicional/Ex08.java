package lacoCondicional;

import java.util.Scanner;

/*Construa um sistema para ler uma vari�vel num�rica N e imprimi-la somente se a mesma
for maior que 100, caso contr�rio imprimi-la com o valor zero.*/

public class Ex08 {
	public static void main(String[]args) {
		int N = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um n�mero");
		N = scan.nextInt();
		scan.close();
		
		if(N>100) {
			System.out.println("O n�mero digitado foi: " + N);
		} else {
			N=0;
			System.out.println("N�mero digitado menor que 100, ent�o a vari�vel foi zerada: ( " + N + " )");
		}
		
	}
}
