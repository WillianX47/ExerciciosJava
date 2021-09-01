package ProgramacaoSequencial;

import java.util.Scanner;

/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.*/

public class Ex05 {
	public static void main(String[] args) {
		int nota1 = 0;
		int nota2 = 0;
		int nota3 = 0;
		int media = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite as 3 notas do aluno respectivamente: ");
		nota1 = scan.nextInt();
		nota2 = scan.nextInt();
		nota3 = scan.nextInt();
		
		media = ((nota1*2) + (nota2*3) + (nota3*5))/10;
		System.out.println("A media eh: " + media);
		
		scan.close();
	}
}
