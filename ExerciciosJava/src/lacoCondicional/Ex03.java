package lacoCondicional;

import java.util.Scanner;

/*Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for &gt;= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.*/

public class Ex03 {
	public static void main(String[]args) {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite quatro números: ");
		num1 = (int) Math.pow(scan.nextInt(), 2);
		num2 = (int) Math.pow(scan.nextInt(), 2);
		num3 = (int) Math.pow(scan.nextInt(), 2);
		num4 = (int) Math.pow(scan.nextInt(), 2);
		
		if(num3 >= 1000) {
			System.out.println("num3 = " + num3);
		} else {
			System.out.println("num1 ao quadrado = " + num1
			+ "\nnum2 ao quadrado = " + num2 
			+ "\nnum3 ao quadrado = " + num3 
			+ "\nnum4 ao quadrado = " + num4);
		}
		
		
		scan.close();
	}
}
