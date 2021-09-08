package vetorMatriz;

import java.util.Random;

import java.util.Arrays;

/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/

public class Ex02 {
	public static void main(String[] args) {
		int vetor[] = new int[10];
		int cont = 0;
		int soma = 0;
		int maior = 0;
		Random random = new Random();

		for (int i = 0; i < 10; i++) {
			vetor[i] = random.nextInt(6) + 1;
			soma += vetor[i];
			if (vetor[i] > maior) {
				maior = vetor[i];
				cont = 0;
			}
			if (vetor[i] == maior)
				cont++;
		}
		System.out.println("Valores sorteados: " + Arrays.toString(vetor));
		System.out.println("Média aritmética: " + (soma / 10));
		System.out.println("O maior número foi " + maior + " e apareceu " + cont + " vezes");
	}
}
