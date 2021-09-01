package lacoCondicional;

import java.util.Scanner;

/*Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes
categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos*/

public class Ex06 {
	public static void main (String[] args) {
		int idade = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		idade = scan.nextInt();
		scan.close();
		if(idade >= 5 && idade <= 7)
			System.out.println("Infantil A");
		if(idade >= 8 && idade <= 11)
			System.out.println("Infantil B");
		if(idade >=12 && idade <= 13)
			System.out.println("Juvenil A");
		if(idade >= 14 && idade <= 17)
			System.out.println("Juvenil B");
		if(idade >= 18) 
			System.out.println("Adulto");
		if(idade > 0 && idade < 5)
			System.out.println("Muito jovem");
		if(idade < 0)
			System.out.println("Entrada invalida");
	}
}
