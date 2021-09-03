package vetorMatriz;

import java.util.Random;

/*
3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.*/


public class Ex03 {
	public static void main(String[] args) {
		int matrizN1[][] = new int [4][6];
		int matrizN2[][] = new int [4][6];
		int matrizM1[][] = new int [4][6];
		int matrizM2[][] = new int [4][6];
		
		Random random = new Random();
		
		for(int i = 0; i < matrizN1.length; i++) {
			for(int j = 0; j < matrizN1[i].length; j++) {
				matrizN1[i][j] = random.nextInt(10)+1;
				matrizN2[i][j] = random.nextInt(10)+1;
				matrizM1[i][j] = matrizN1[i][j] + matrizN2[i][j];
				if(matrizN1[i][j] > matrizN2[i][j]) {
					matrizM2[i][j] = matrizN1[i][j] - matrizN2[i][j];
				} else {
					matrizM2[i][j] = matrizN2[i][j] - matrizN1[i][j];
				}
			}
		}
		
		System.out.println("Matriz M1:");
		for (int i = 0; i < matrizM1.length; i++) {
			for (int j = 0; j < matrizM1[i].length; j++) {
				if (j == 0)
					System.out.print("[\t");
				System.out.print(matrizM1[i][j]);
				if (j >= 0 && j < matrizM1[i].length-1)
					System.out.print("\t");
				if (j == matrizM1[i].length-1)
					System.out.println("\t]");
			}
		}
		System.out.println("Matriz M2:");
		for (int i = 0; i < matrizM2.length; i++) {
			for (int j = 0; j < matrizM2[i].length; j++) {
				if (j == 0)
					System.out.print("[\t");
				System.out.print(matrizM2[i][j]);
				if (j >= 0 && j < matrizM2[i].length-1)
					System.out.print("\t");
				if (j == matrizM2[i].length-1)
					System.out.println("\t]");
			}
		}
	}
}



