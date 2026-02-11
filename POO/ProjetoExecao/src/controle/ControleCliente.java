package controle;

import modelo.Cliente;

public class ControleCliente {

	public static void main(String[] args) {
			Cliente cliente;
			//cliente = new Cliente();
			cliente = null;
			
			try {
			cliente.setCpf("09876543212");
			cliente.setNome("Fernanda");
			System.out.println("CPF: " + cliente.getCpf());
			System.out.println("Nome: " + cliente.getNome());
			
			}
			catch(NullPointerException e) {
				System.out.println("Objeto de cliente não foi criado");
				System.out.println("Erro: " + e.getMessage());
				//e.printStackTrace();
			}
		}

}
