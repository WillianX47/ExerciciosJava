package ProgramacaoSequencial;

import java.util.Scanner;

/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/

public class Ex02 {
	public static void main(String[]args) {
		int ano = 0;
		int mes = 0;
		int dia = 0;
		int totalDias = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite quantos dias de vida voce tem: ");
		totalDias = scan.nextInt();
		
		ano = totalDias/365;
		mes = (totalDias - (365*ano))/30;
		dia = (totalDias - (365*ano))%30;
		
		System.out.println("Voce esta vivo a: " + ano 
		+ " anos " + mes + " meses e " + dia + " dias");
		
		scan.close();
	}

}
