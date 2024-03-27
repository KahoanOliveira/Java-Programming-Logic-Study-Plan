package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		
		System.out.print("Digite o valor do produto: ");
		Double valorProd = scanner.nextDouble();
		
		System.out.print("Digite a quantidade desejada do produto: ");
		Double quantidade = scanner.nextDouble();
		
		Double valorSemDesconto = valorProd * quantidade;
		
		Double desconto = 0.0;
		
		if (quantidade >= 10) {
			desconto = 10.0;
		}
		
		Double valorDesconto = valorSemDesconto * desconto / 100; 
		
		Double valorFinal = valorSemDesconto - valorDesconto;
		
		System.out.println("Valor Final: " + valorFinal);
		
		scanner.close();
	}

}
