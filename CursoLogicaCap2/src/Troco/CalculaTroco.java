package Troco;

import java.util.Scanner;

public class CalculaTroco {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite quantidade passada pelo cliente: ");
		Double valorCliente = scanner.nextDouble();
		
		Double result = valorCliente - valorProduto;
		
		System.out.println("Valor Produto: " + valorProduto);
		
		System.out.println("Troco: " + result);
		
		scanner.close();
	}
}
