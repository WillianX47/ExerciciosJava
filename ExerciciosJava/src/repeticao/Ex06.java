package repeticao;

import java.util.Scanner;

/*Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/

public class Ex06 {
	public static void main(String[]args) {
		int num1 = 0, soma = 0, cont = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite ( 0 ) para encerrar o loop");
		do {
			System.out.println("Digite um n�mero: ");
			num1 = scan.nextInt();
			if(num1%3 == 0) {
				soma+=num1;
				cont++;
			}
		}while(num1 != 0);
		scan.close();
		System.out.println("A m�dia = " + (soma/cont));
	}
}
