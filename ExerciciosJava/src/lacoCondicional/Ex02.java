package lacoCondicional;

import java.util.Scanner;

/*Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
excedente.*/

public class Ex02 {
	public static void main (String[] args) {
		int C = 0;
		int N = 0;
		float E = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o seu código de funcionário: ");
		C = scan.nextInt();
		System.out.println("Digite sua carga horária: ");
		N = scan.nextInt();
		scan.close();
		
		if(N > 50) {
			E = (N-50)*20;
			System.out.println("Funcionário código: " + C 
					+ ", sua carga horária foi de " + N + " horas, sendo salário total de: R$" 
					+ ((50*10)+E) + " com salário excedente de: R$" + E);
		} else {
			System.out.println("Belo trabalho, salário de R$" + (N*10) 
					+ " pago / variável E zerada como solicitado pelo exercício: " + E);
		}

	}
}
