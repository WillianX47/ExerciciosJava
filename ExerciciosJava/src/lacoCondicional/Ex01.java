package lacoCondicional;

import java.util.Scanner;

/*Jo�o, homem de bem, comprou um microcomputador para controlar o rendimento di�rio
de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
regulamento do estado de S�o Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
excedente. Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P (peso de tomates) e
verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso) e na vari�vel M o valor
da multa que Jo�o dever� pagar. Caso contr�rio mostrar tais vari�veis com o conte�do
ZERO.*/

public class Ex01 {
	
	public static void main (String []args) {
		float P = 0;
		float E = 0;
		float M = 0;

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o peso P total dos tomates: ");
		P = scan.nextFloat();
		scan.close();
		
		if(P>50) {
			E = P-50;
			M = E*4;
			System.out.println("Valor excedido em " + E 
					+ "kg, valor total a pagar de multa: R$" + M);
		} else {
			System.out.println("N�o � necess�rio pagar multa" +
			"\nValor da vari�vel zerada como soliciatado pelo exerc�cio" 
					+ " E e M respecitivamente: ( " +E + " ) - ( " + M + " )");
		}
	}
}
