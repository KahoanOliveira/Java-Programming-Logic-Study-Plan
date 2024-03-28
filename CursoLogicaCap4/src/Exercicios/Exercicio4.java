package Exercicios;

import java.util.Scanner;

public class Exercicio4 {
	
	static final Integer IDADE_MINIMA_PARA_APOSENTAR = 55;
	
	static final Integer TEMPO_MINIMO_DE_CONTRIBUICAO = 25;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe sua idade: ");
		Integer idade = scan.nextInt();
		
		Boolean idadeMaiorQueOuIgual55 = idade >= IDADE_MINIMA_PARA_APOSENTAR;
		
		System.out.print("Informe o tempo contribuído com a previdência: ");
		Integer previdencia = scan.nextInt();
		
		Boolean previdenciaMaiorQueOuIgual25 = previdencia >= TEMPO_MINIMO_DE_CONTRIBUICAO;
		
		if (idadeMaiorQueOuIgual55 && previdenciaMaiorQueOuIgual25) {
			System.out.println("Parabéns! Você pode se aposentar! =D");
		}else {
			System.out.println("Infelizmente você não pode se aposentar! :(");
		}
		
		scan.close();
	}

}
