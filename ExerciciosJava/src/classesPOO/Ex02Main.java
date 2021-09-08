package classesPOO;

public class Ex02Main {
	public static void main(String[]args) {
		Ex02ClasseAviao aviao = new Ex02ClasseAviao();
		aviao.setPeso(22.680);
		aviao.setTamanho(76);
		aviao.setPilotoNome("Willian");
		System.out.println("O piloto " + aviao.getPilotoNome() + " controla um avião comercial com peso de " 
		+ aviao.getPeso() + "kg e tamanho de: " + aviao.getTamanho() + "m");
	}
}
