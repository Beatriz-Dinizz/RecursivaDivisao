package view;

import controller.DivisaoController;

public class Principal {

	public static void main(String[] args) {
		DivisaoController divisao = new DivisaoController();
		
		int dividendo = 15;
		int divisor = 4;
		
		int resto = divisao.dividirNumero(dividendo, divisor);
		System.out.println("O resto da divisão de " + dividendo + " por " + divisor + " é: " + resto);
	}
}
