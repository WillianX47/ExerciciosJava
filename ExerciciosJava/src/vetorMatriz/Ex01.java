package vetorMatriz;

import java.util.Scanner;

/*Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.*/

public class Ex01 {
	public static void main(String[] args) {
		int numero[] = new int[5];
		int maior = 0;
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			numero[i] =  scan.nextInt();
			System.out.println("Escreva o " + (i+1) + "� n�mero");
			if(numero[i] > maior)
				maior = numero[i];
		}
		scan.close();
		System.out.println("Maior n�mero �: " + maior);
		
	}
}
