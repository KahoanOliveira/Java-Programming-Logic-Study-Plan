package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		Double valor1 = scanner.nextDouble();
		
		System.out.print("Escolha uma das opções abaixo para fazer a operação:"
				+ "\n1 - Adição"
				+ "\n2 - Subtração"
				+ "\n3 - Divisão"
				+ "\n4 - Multiplicação: ");
		Integer operador = scanner.nextInt();
		
		System.out.print("Digite o primeiro valor: ");
		Double valor2 = scanner.nextDouble();
		
		Double resultado = 0.0;
		
		if (operador.equals(1)) {
			resultado = valor1 + valor2;			
		}if(operador.equals(2)) {
			resultado = valor1 - valor2;
		}if(operador.equals(3)) {
			resultado = valor1 / valor2;
		}if(operador.equals(4)){
			resultado = valor1 * valor2;
		}
		
		System.out.println("O resultado da conta é: " + resultado);
		
		scanner.close();
	}

}
