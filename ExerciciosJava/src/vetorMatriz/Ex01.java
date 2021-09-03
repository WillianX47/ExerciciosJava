package vetorMatriz;

import java.util.Scanner;

/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/

public class Ex01 {
	public static void main(String[] args) {
		int numero[] = new int[5];
		int maior = 0;
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			numero[i] =  scan.nextInt();
			System.out.println("Escreva o " + (i+1) + "º número");
			if(numero[i] > maior)
				maior = numero[i];
		}
		scan.close();
		System.out.println("Maior número é: " + maior);
		
	}
}
