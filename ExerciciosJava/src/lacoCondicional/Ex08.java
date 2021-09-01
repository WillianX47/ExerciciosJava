package lacoCondicional;

import java.util.Scanner;

/*Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma
for maior que 100, caso contrário imprimi-la com o valor zero.*/

public class Ex08 {
	public static void main(String[]args) {
		int N = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número");
		N = scan.nextInt();
		scan.close();
		
		if(N>100) {
			System.out.println("O número digitado foi: " + N);
		} else {
			N=0;
			System.out.println("Número digitado menor que 100, então a variável foi zerada: ( " + N + " )");
		}
		
	}
}
