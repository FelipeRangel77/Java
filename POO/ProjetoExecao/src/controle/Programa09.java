package controle;

public class Programa09 {

	public static void main(String[] args) {
		int[] n = {36, 4, 8, 6, 48, 50};
		int[] d = {12, 2, 4, 2, 12, 10};
		int q = 0, soma = 0;
		
		for(int i = 0; i < n.length; i++) {
			q = n[i] / d[i];
			soma +=q;
		}
		
		System.out.println("A soma dos quocientes é: " + soma);
	}

}
