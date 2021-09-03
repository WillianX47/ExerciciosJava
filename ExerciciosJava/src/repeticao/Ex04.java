package repeticao;

import java.util.Scanner;

/*Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
O n�mero de pessoas calmas;	   OK
O n�mero de mulheres nervosas; OK
O n�mero de homens agressivos; OK
O n�mero de outros calmos;	   OK
O n�mero de pessoas nervosas com mais de 40 anos;OK
O n�mero de pessoas calmas com menos de 18 anos. OK*/

public class Ex04 {
	public static void main(String[] args) {
		int cont_pessoa = 0;
		int cont_pessoaCalma = 0;
		int cont_mulherNervosa = 0;
		int cont_homemAgressivo = 0;
		int cont_outroCalmo = 0;
		int cont_nervoso40 = 0;
		int cont_calmo18 = 0;
		int idade = 0;
		int genero = 0;
		int estado = 0;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Digite seu g�nero onde 1 = Masculino | 2 = Feminino | 3 = Outro ");
			genero = scan.nextInt();
			System.out.println("Digite sua idade: ");
			idade = scan.nextInt();
			scan.nextLine();
			
			if(genero == 1) {
				System.out.println("Digite se voc� �: 1 = Calmo | 2 = Agressivo");
				estado = scan.nextInt();
				scan.nextLine();
				if(estado == 1) {
					cont_pessoaCalma++;
					if(idade < 18)
						cont_calmo18++;
				} else if(estado == 2) {
					cont_homemAgressivo++;
					if(idade > 40)
						cont_nervoso40++;
				}
				cont_pessoa++;
			}
			if(genero == 2) {
				System.out.println("Digite se voc� �: 1 = Calma | 2 = Nervosa");
				estado = scan.nextInt();
				if(estado == 1) {
					cont_pessoaCalma++;
					if(idade < 18)
						cont_calmo18++;
				} else if (estado == 2) {
					cont_mulherNervosa++;
					if(idade > 40)
						cont_nervoso40++;
				}
				cont_pessoa++;
			}
			if(genero == 3) {
				System.out.println("Digite se voc� � uma pessoa: 1 = Calma | 2 = Nervosa");
				estado = scan.nextInt();
				if(estado == 1) {
					cont_pessoaCalma++;
					cont_outroCalmo++;
					if(idade < 18)
						cont_calmo18++;
				}
				if(estado == 2)
					if(idade>40)
						cont_nervoso40++;
				cont_pessoa++;
			}
			if(genero != 1 && genero !=2 && genero != 3)
				System.out.println("Entrada de g�nero inv�lida");
		}while(cont_pessoa != 3); //Trocar este n�mero caso queira fazer testes
		
		scan.close();
		
		System.out.println("N�mero de homens agressivos: " + cont_homemAgressivo +
		"N�mero de mulheres nervosas: " + cont_mulherNervosa +
		"N�mero de pessoas calmas: " + cont_pessoaCalma +
		"N�mero de outros calmos: " + cont_outroCalmo +
		"N�mero de pessoas nervosas com mais de 40 anos: " + cont_nervoso40 +
		"N�mero de pessoas calmas menor que 18 anos: " + cont_calmo18);
	}
}
