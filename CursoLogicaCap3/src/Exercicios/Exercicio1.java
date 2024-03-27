package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o numero ao qual você quer saber o quadrado: ");
		Integer num = scanner.nextInt();
		
		Integer result = num * num;
		
		System.out.println("O valor do numero elevado ao quadrado é: " + result);
		
		scanner.close();
	}
}
