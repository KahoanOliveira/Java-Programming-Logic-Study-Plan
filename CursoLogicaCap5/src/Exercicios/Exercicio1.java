package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	static final Double MEDIA_PARA_PASSAR = 150.0;
	
	static final Double NOTA_MINIMA = 60.0;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a nota de Matemática: ");
		Double notaMatematica = scan.nextDouble();
		
		System.out.print("Digite a nota de Português: ");
		Double notaPortugues = scan.nextDouble();
		
		Boolean notaMatematicaMaiorOuIgual60 = notaMatematica >= NOTA_MINIMA;
		Boolean notaPortuguesMaiorOuIgual60 = notaPortugues >= NOTA_MINIMA;
		
		Double notaTotal = notaMatematica + notaPortugues;
		
		Boolean notaFinal = notaMatematicaMaiorOuIgual60 && notaPortuguesMaiorOuIgual60 && (notaTotal >= MEDIA_PARA_PASSAR);
		
		if (notaFinal) {
			System.out.println("Parabéns! Você conseguiu passar.");
		}else {
			System.out.println("Infelizmente você não atingiu as notas necessárias.");
		}
		
		scan.close();
	}

}
