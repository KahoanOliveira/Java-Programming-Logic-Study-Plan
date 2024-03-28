package Aulas;

public class OperadoresLogicos {

	public static void main(String[] args) {
		Boolean carrinhoMaiorQue100 = false;
		Boolean periodoDePromocao = true;
		
//		Boolean aplicarDesconto = carrinhoMaiorQue100 && periodoDePromocao;			// (Só retorna verdadeiro se as duas ou mais condições forem verdadeiras)
		
		Boolean aplicarDesconto = carrinhoMaiorQue100 || periodoDePromocao;			// (Só retorna verdadeiro se uma das condições derem verdadeiras)
		
		if (aplicarDesconto) {
			System.out.println("Sim! Aplique o desconto.");
		}else {
			System.out.println("Não aplique o desconto!");
		}
	}

}
