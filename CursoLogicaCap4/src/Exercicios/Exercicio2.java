package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scan.nextDouble();
		
		Double total = valorProduto;
		
		if (valorProduto < 100.00) {
			total += 15.00;
		}
		
		System.out.println("O total da compra é: " + total);
		
		scan.close();
	}

}
