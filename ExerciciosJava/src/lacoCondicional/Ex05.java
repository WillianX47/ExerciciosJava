package lacoCondicional;

import java.util.Scanner;

/*A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 3 grupos de
ind�strias que s�o altamente poluentes do meio ambiente. O �ndice de polui��o aceit�vel
varia de 0,05 at� 0,25. Se o �ndice sobe para 0,3 as ind�strias do 1� grupo s�o intimadas a
suspenderem suas atividades, se o �ndice crescer para 0,4 as industrias do 1� e 2� grupo s�o
intimadas a suspenderem suas atividades, se o �ndice atingir 0,5 todos os grupos devem ser
notificados a paralisarem suas atividades. Fa�a um sistema que leia o �ndice de polui��o
medido e emita a notifica��o adequada aos diferentes grupos de empresas.*/

public class Ex05 {
	public static void main(String[] args) {
		float num1;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o n�vel de polui��o atual: ex (0,2)");
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
