package ProgramacaoSequencial;

import java.util.Scanner;

/*Um sistema de equações lineares do tipo:

ax + by = c
dx + ey = f

pode ser resolvido segundo mostrado abaixo:

x = (ce-bf) / (ae-bd)
y = (af-cd) / (ae-bd)

Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
valores de x e y.*/

public class Ex07 {
	
	public static void main(String[]args) {
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		int X = 0;
		int Y = 0;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite os valores de a,b,c,d,e,f respectivamente: ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
		e = scan.nextInt();
		f = scan.nextInt();
		X = ( ((c*e)-(b*f)) / ((a*e)-(b*d)) );
		Y = ( ((a*f)-(c*d)) / ((a*e)-(b*d)) );
		System.out.println("O resultado de X eh: " + X + 
						   "\nO resultado de Y eh: " + Y);
		scan.close();
	}
}
