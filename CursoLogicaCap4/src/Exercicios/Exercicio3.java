package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Double total = 0.0;
		
		System.out.print("Informe o valor da conta de luz: ");
		total += scan.nextDouble();
				
		System.out.print("Informe o valor da conta de água: ");
		total += scan.nextDouble();
		
		System.out.print("Informe o valor da conta de Telefone: ");
		total += scan.nextDouble();
		
		System.out.print("Informe o valor da Escola do seu filho(a): ");
		total += scan.nextDouble();
		
		System.out.print("Informe o valor da fatura do seu cartão: ");
		total += scan.nextDouble();
		
		System.out.print("Informe o valor de gastos com o supermercado: ");
		total += scan.nextDouble();
		
		System.out.println("O total de gastos que a família teve este mês foi de: R$" + total);
		
		scan.close();
	}

}
