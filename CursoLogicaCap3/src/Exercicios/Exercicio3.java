package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite sua nota: ");
		Integer nota = scanner.nextInt();
		
		Boolean result = nota >= 70;
		
		if (result) {
			System.out.println("Parabéns você passou!");
		} else {
			System.out.println("Infelizmente você não passou!");
		}
		
		scanner.close();
	}

}
