package repeticao;

/*Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)*/

public class Ex01 {
	public static void main(String[]args) {
		for(int i=1006; i<2000; i+=11) {
			if(i%11==5)
				System.out.println(i);	
		}
	}
}
