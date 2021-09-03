package repeticao;

import java.util.Scanner;

/*Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
O número de pessoas calmas;	   OK
O número de mulheres nervosas; OK
O número de homens agressivos; OK
O número de outros calmos;	   OK
O número de pessoas nervosas com mais de 40 anos;OK
O número de pessoas calmas com menos de 18 anos. OK*/

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
			System.out.println("Digite seu gênero onde 1 = Masculino | 2 = Feminino | 3 = Outro ");
			genero = scan.nextInt();
			System.out.println("Digite sua idade: ");
			idade = scan.nextInt();
			scan.nextLine();
			
			if(genero == 1) {
				System.out.println("Digite se você é: 1 = Calmo | 2 = Agressivo");
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
				System.out.println("Digite se você é: 1 = Calma | 2 = Nervosa");
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
				System.out.println("Digite se você é uma pessoa: 1 = Calma | 2 = Nervosa");
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
				System.out.println("Entrada de gênero inválida");
		}while(cont_pessoa != 3); //Trocar este número caso queira fazer testes
		
		scan.close();
		
		System.out.println("Número de homens agressivos: " + cont_homemAgressivo +
		"Número de mulheres nervosas: " + cont_mulherNervosa +
		"Número de pessoas calmas: " + cont_pessoaCalma +
		"Número de outros calmos: " + cont_outroCalmo +
		"Número de pessoas nervosas com mais de 40 anos: " + cont_nervoso40 +
		"Número de pessoas calmas menor que 18 anos: " + cont_calmo18);
	}
}
