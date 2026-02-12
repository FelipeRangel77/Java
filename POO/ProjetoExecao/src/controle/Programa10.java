package controle;

public class Programa10 {
	public static void main (String[] args) {
		String[] nomes = {"Gabriel" , "Maria" , "Fernanda", "Mariana",null , "Taina", "Joao"};
		int i = 0;
		
		while(i < nomes.length) {
			try {
			System.out.println(nomes[i].toUpperCase());
			}
			finally {
				i++;
			}
		}
	}
}
