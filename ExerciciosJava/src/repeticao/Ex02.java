package repeticao;

import java.util.Scanner;

//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

public class Ex02 {
	public static void main(String[]args) {
		
		int vetor[] = new int[10];
		int totalPar = 0, totalImpar = 0;
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i+1) + "º número");
			vetor[i] = scan.nextInt();
		}
		for(int numero : vetor) {
			if(numero%2==0) {
				System.out.println("O número: " + numero + " é par");
				totalPar++;
			}
			if(numero%2!=0) {
				System.out.println("O número: " + numero + " é impar");
				totalImpar++;
			}
		}
		System.out.println("\nExistem " + totalPar + " números pares e " 
		+ totalImpar + " números impares");
		scan.close();
	}
}
