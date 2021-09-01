package lacoCondicional;

import java.util.Scanner;

/*Receber valores de base e altura de um tri�ngulo e verificar se s�o valores v�lidos
(positivos maiores que zero). Em caso afirmativo, calcular a �rea do tri�ngulo.*/

public class Ex07 {
	public static void main(String[]args) {
		float base = 0;
		float altura = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a base e altura do tri�ngulo respectivamente");
		base = scan.nextFloat();
		altura = scan.nextFloat();
		scan.close();
		if(base > 0 && altura > 0) {
			System.out.println("�rea do tri�ngulo: " + ((base*altura)/2));
		} else {
			System.out.println("Base ou altura inv�lida");
		}
	}
}
