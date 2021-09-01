package lacoCondicional;

import java.util.Scanner;

/*A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de
indústrias que são altamente poluentes do meio ambiente. O índice de poluição aceitável
varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a
suspenderem suas atividades, se o índice crescer para 0,4 as industrias do 1º e 2º grupo são
intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser
notificados a paralisarem suas atividades. Faça um sistema que leia o índice de poluição
medido e emita a notificação adequada aos diferentes grupos de empresas.*/

public class Ex05 {
	public static void main(String[] args) {
		float num1;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o nível de poluição atual: ex (0,2)");
		num1 = scan.nextFloat();
		scan.close();
		
		if(num1 >= 0.3 && num1 < 0.4) {
			System.out.println("Empresas do grupo 01, suspender atividades!");
		} else if (num1 >= 0.4 && num1 < 0.5) {
			System.out.println("Empresas do grupo 02, suspender atividades!");
		} else if (num1 >= 0.5) {
			System.out.println("Todas as empresas devem suspender atividades!");
		} else {
			System.out.println("As atividades das empresas podem continuar normalmente.");
		}
	}
}
