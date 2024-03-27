package IMC;

import java.util.Scanner;

public class CalculaIMC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite seu peso (em Kg): ");
		Double peso = scanner.nextDouble();
		
		System.out.print("Digite sua altura (em metros): ");
		Double altura = scanner.nextDouble();
		
		Double alt2 = altura * altura;
		
		Double imc = peso / alt2;
		
		System.out.println("Seu IMC é: " + imc);
		
		scanner.close();
	}

}
