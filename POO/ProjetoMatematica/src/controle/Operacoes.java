package controle;

import execoes.RaizQuadradaExcecao;

public class Operacoes {

	public static float calcularRaiz(int n) {
		if(n < 0) {
			throw new RaizQuadradaExcecao();
		}
		return(float)Math.sqrt(n);
				
	}
}
