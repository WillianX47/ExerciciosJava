package ProgramacaoSequencial;

import java.util.Scanner;

/*Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/

public class Ex03 {
	public static void main(String[]args) {
		int hora = 0;
		int minuto = 0;
		int segundo = 0;
		int totalSegundos = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a duracao do evento em segundos: ");
		totalSegundos = scan.nextInt();
		
		hora = totalSegundos/3600;
		minuto = (totalSegundos - (3600*hora)) / 60;
		segundo = (totalSegundos - (3600*hora)) % 60;
		
		System.out.println("O evento durou: " +
		hora + " horas " +
		minuto + " minutos e " +
		segundo + " segundos");
		
		scan.close();
	}
}
