package Aulas;

import java.util.Scanner;

public class Constantes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		final Integer idadeMinimaParaTirarCarteira = 18;
		
		System.out.print("Idade: ");
		Integer idade = scanner.nextInt();
		
		Boolean podeTirarCarteira = idade >= idadeMinimaParaTirarCarteira;
		
		if (podeTirarCarteira) {
			System.out.println("Sim! Ele(a) pode tirar carteira.");
		} else {
			System.out.println("Não! Ele(a) não pode tirar carteira.");
		}
		
		scanner.close();
	}

}
