package Exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		final Integer notaFinalParaPassar = 70;
		
		System.out.print("Digite sua nota: ");
		Integer nota = scanner.nextInt();
		
		Boolean result = nota >= notaFinalParaPassar;
		
		if (result) {
			System.out.println("Parabéns você passou!");
		} else {
			System.out.println("Infelizmente você não passou!");
		}
		
		scanner.close();
	}

}
