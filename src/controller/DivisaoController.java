package controller;

public class DivisaoController {

	public DivisaoController() {
		super();
	}
	
	public int dividirNumero(int dividendo, int divisor) {
		if(dividendo < divisor) {
			return dividendo;
		} else {
			return dividirNumero(dividendo - divisor, divisor);
		}
	}
}
