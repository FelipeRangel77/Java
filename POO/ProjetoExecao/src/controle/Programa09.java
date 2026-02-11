package controle;

public class Programa09 {

	public static void main(String[] args) {
		int[] n = {36, 4, 8, 6, 48, 50};
		int[] d = {12, 2, 4, 2, 12, 10};
		int q = 0, soma = 0;
		
		for(int i = 0; i < n.length; i++) {
			try {
			q = n[i] / d[i];
			System.out.println("O quociente é " + q);
		}
			catch(ArithmeticException e){
				System.out.println("Não é possivel dividir por zero!");
			}
			finally {
				soma +=q;
			}
			
		
		System.out.println("A soma dos quocientes é: " + soma);
	
			}
		} 
	}