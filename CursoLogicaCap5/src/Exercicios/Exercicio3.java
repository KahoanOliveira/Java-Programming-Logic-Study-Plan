package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	static final String DOMINGO = "Domingo";
	static final String SEGUNDA = "Segunda-feira";
	static final String TERCA 	= "Terça-feira";
	static final String QUARTA 	= "Quarta-feira";
	static final String QUINTA 	= "Quinta-feira";
	static final String SEXTA 	= "Sexta-feira";
	static final String SABADO 	= "Sábado";
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o dia da semana em números: "
				+ "\n 1 - Domingo"
				+ "\n 2 - Segunda-feira"
				+ "\n 3 - Terça-feira"
				+ "\n 4 - Quarta-feira"
				+ "\n 5 - Quinta-feira"
				+ "\n 6 - Sexta-feira"
				+ "\n 7 - Sábado: ");
		Integer diaSemana = scan.nextInt();
		
		switch (diaSemana) {
		case 1: System.out.println(DOMINGO);
			break;
		case 2: System.out.println(SEGUNDA);
			break;
		case 3: System.out.println(TERCA);
			break;
		case 4: System.out.println(QUARTA);
			break;
		case 5: System.out.println(QUINTA);
			break;
		case 6: System.out.println(SEXTA);
			break;
		case 7: System.out.println(SABADO);
			break;
		default:
			System.err.println("Digite um dia da semana válido!");
			System.exit(1);
		}
		
		scan.close();
	}

}
