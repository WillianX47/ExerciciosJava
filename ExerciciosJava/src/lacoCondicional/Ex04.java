package lacoCondicional;

import java.util.Scanner;

/*Fa�a um sistema que leia um n�mero inteiro e mostre uma mensagem indicando se este
n�mero � par ou �mpar, e se � positivo ou negativo*/
public class Ex04 {
	public static void main(String[] args) {
		int num1 = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		num1 = scan.nextInt();
		scan.close();
		
		if(num1>0) {
			System.out.print("O n�mero � positivo e ");
			if(num1%2!=0) {
				System.out.println("impar");
			} else {
				System.out.println("par");
			}
		} else {
			System.out.print("O n�mero � negativo e ");
			if(num1%2!=0) {
				System.out.println("impar");
			} else {
				System.out.println("par");
			}
		}	
	}
}
