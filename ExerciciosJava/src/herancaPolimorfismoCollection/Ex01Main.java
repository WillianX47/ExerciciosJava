package herancaPolimorfismoCollection;
/*Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
características de forma que tudo o que for comum a todos os animais fique na classe
Animal:

2-

Implemente um programa que crie os 3 tipos de animais definidos no exercício
anterior e invoque o método que emite o som de cada um de forma polimórfica, isto
é, independente do tipo de animal.*/

public class Ex01Main {
	public static void main(String[]args) {
		Ex01ClasseCachorro cachorro = new Ex01ClasseCachorro();
		Ex01ClasseCavalo cavalo = new Ex01ClasseCavalo();
		Ex01ClassePreguica preguica = new Ex01ClassePreguica();
		
		cachorro.emitirSom(1);
		cavalo.emitirSom(2);
		preguica.emitirSom(3);
		
	}
}
