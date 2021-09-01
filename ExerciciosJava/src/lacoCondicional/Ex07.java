package lacoCondicional;

import java.util.Scanner;

/*Receber valores de base e altura de um triângulo e verificar se são valores válidos
(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.*/

public class Ex07 {
	public static void main(String[]args) {
		float base = 0;
		float altura = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a base e altura do triângulo respectivamente");
		base = scan.nextFloat();
		altura = scan.nextFloat();
		scan.close();
		if(base > 0 && altura > 0) {
			System.out.println("Área do triângulo: " + ((base*altura)/2));
		} else {
			System.out.println("Base ou altura inválida");
		}
	}
}
