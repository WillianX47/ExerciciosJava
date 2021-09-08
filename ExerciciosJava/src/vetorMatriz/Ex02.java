package vetorMatriz;

import java.util.Random;

import java.util.Arrays;

/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.*/

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
		System.out.println("M�dia aritm�tica: " + (soma / 10));
		System.out.println("O maior n�mero foi " + maior + " e apareceu " + cont + " vezes");
	}
}
