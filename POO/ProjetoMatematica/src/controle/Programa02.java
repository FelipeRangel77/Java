package controle;

import java.util.Scanner;

public class Programa02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n = input.nextInt();
		
		System.out.println("A Raiz quadrada de " + n + " é: " + Operacoes.calcularRaiz(n));
	}

}
