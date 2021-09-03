package vetorMatriz;

import java.util.Scanner;

/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/

public class Ex04 {
	public static void main(String[] args) {
		int matriz[][] = new int[3][3];
		int somaDiagonal = 0;
		int soma = 0;
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.println("Digite o valor da matriz na posição: ( " + i + " , " + j + " )");
				matriz[i][j] = scan.nextInt();
				soma+=matriz[i][j];
				if(i == j)
					somaDiagonal+=matriz[i][j];
			}
		}
		scan.close();
		System.out.println("Matriz:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (j == 0)
					System.out.print("[\t");
				System.out.print(matriz[i][j]);
				if (j >= 0 && j < matriz[i].length-1)
					System.out.print("\t");
				if (j == matriz[i].length-1)
					System.out.println("\t]");
			}
		}
		System.out.println("Soma dos valores da matriz: " + soma);
		System.out.println("Soma dos valores da diagonal da matriz: " + somaDiagonal);
	}
}
