package repeticao;

import java.util.Scanner;

//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

public class Ex02 {
	public static void main(String[]args) {
		
		int vetor[] = new int[10];
		int totalPar = 0, totalImpar = 0;
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i+1) + "� n�mero");
			vetor[i] = scan.nextInt();
		}
		for(int numero : vetor) {
			if(numero%2==0) {
				System.out.println("O n�mero: " + numero + " � par");
				totalPar++;
			}
			if(numero%2!=0) {
				System.out.println("O n�mero: " + numero + " � impar");
				totalImpar++;
			}
		}
		System.out.println("\nExistem " + totalPar + " n�meros pares e " 
		+ totalImpar + " n�meros impares");
		scan.close();
	}
}
