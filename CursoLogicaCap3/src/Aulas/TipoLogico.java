package Aulas;

public class TipoLogico {

	public static void main(String[] args) {
		Boolean variavelVerdadeira = true;
		System.out.println("Variavel verdadeira: " + variavelVerdadeira);
		
		Boolean variavelFalsa = false;
		System.out.println("Variavel falsa: " + variavelFalsa);
		
		System.out.println("--------------------------------");
		
		Integer idade = 15;
		
		Boolean podeTirarCarta = idade >= 18;
		
		if (podeTirarCarta) {
			System.out.println("Sim! ele(a) pode tirar carteira.");
		} else {
			System.out.println("Não! ele(a) pode tirar carteira.");
		}
		
		//System.out.println("Pode tirar a carteira? " + podeTirarCarta);
	}
}
