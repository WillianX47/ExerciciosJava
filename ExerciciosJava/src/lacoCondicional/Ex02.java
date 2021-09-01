package lacoCondicional;

import java.util.Scanner;

/*Elabore um sistema que leia as vari�veis C e N, respectivamente c�digo e n�mero de
horas trabalhadas de um oper�rio. E calcule o sal�rio sabendo-se que ele ganha R$ 10,00
por hora. Quando o n�mero de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na vari�vel E, caso contr�rio zerar tal vari�vel. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o sal�rio total e o sal�rio
excedente.*/

public class Ex02 {
	public static void main (String[] args) {
		int C = 0;
		int N = 0;
		float E = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o seu c�digo de funcion�rio: ");
		C = scan.nextInt();
		System.out.println("Digite sua carga hor�ria: ");
		N = scan.nextInt();
		scan.close();
		
		if(N > 50) {
			E = (N-50)*20;
			System.out.println("Funcion�rio c�digo: " + C 
					+ ", sua carga hor�ria foi de " + N + " horas, sendo sal�rio total de: R$" 
					+ ((50*10)+E) + " com sal�rio excedente de: R$" + E);
		} else {
			System.out.println("Belo trabalho, sal�rio de R$" + (N*10) 
					+ " pago / vari�vel E zerada como solicitado pelo exerc�cio: " + E);
		}

	}
}
