package repeticao;

import java.util.Scanner;

/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/

public class Ex05 {
	public static void main(String[] args) {
		int num1 = 0, soma = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite ( 0 ) para concluir o loop");
		do {
			System.out.println("Digite um n�mero: ");
			num1 = scan.nextInt();
			soma+=num1;
		}while(num1 != 0);
		scan.close();
		
		System.out.println("A soma dos n�meros �: " + soma);
	}

}
