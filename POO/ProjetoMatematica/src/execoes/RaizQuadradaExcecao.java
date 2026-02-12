package execoes;

//public class RaizQuadradaExcecao extends RuntimeException{

public class RaizQuadradaExcecao extends Exception{
	public RaizQuadradaExcecao() {
		super("Não existe raiz quadrada de numero negativo no conjunto de numeros naturais");
	}
	
}
