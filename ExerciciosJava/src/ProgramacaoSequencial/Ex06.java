package ProgramacaoSequencial;

import java.util.Scanner;

/*Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula

que efetua tal cálculo é: d = raiz((x2-x1)^2 + (y2-y2)^2)*/

public class Ex06 {
	
	public static void main(String[]args) {
		double x1 = 0;
		double x2 = 0;
		double y1 = 0;
		double y2 = 0;
		double D = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite respectivamente: X1, X2, Y1, Y2");
		x1 = scan.nextInt();
		x2 = scan.nextInt();
		y1 = scan.nextInt();
		y2 = scan.nextInt();
		D = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1), 2));
		scan.close();
		
		System.out.println("O resultado de D é: " + D);
	}
	

	
}
