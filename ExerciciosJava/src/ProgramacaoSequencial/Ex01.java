package ProgramacaoSequencial;

import java.util.Scanner;

/*Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/

public class Ex01 {

	public static void main(String[]args) {
		int ano = 0;
		int mes = 0;
		int dias = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite respectivamente ano, mes, dia: ");
		ano = scan.nextInt();
		mes = scan.nextInt();
		dias = scan.nextInt();
		
		dias += (ano*365) + (mes*30);
		
		System.out.println("Sua idade imprimida em dias eh: " + dias);
		
		scan.close();
	}

}
