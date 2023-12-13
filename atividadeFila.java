package atividadesFilaPilha;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class atividadeFila {

	public static void main(String[] args) {
		Queue<String> clientes = new LinkedList<String>();
		Scanner read = new Scanner(System.in);
		int op;

		do {

			System.out.println("\n------------------------------");
			System.out.println("\n\t\tMenu");
			System.out.println("\n(1) Adicionar um novo Cliente na fila");
			System.out.println("\n(2) Listar todos os Clientes na fila");
			System.out.println("\n(3) Retirar cliente da fila");
			System.out.println("\n(0) Sair");
			System.out.println("\n------------------------------");
			System.out.println("\nEntre com a opção desejada: ");
			op = read.nextInt();
			
			switch (op) {
			case 1:
				read.nextLine();
				System.out.println("\nDigite o nome: ");
				clientes.add(read.nextLine());
				break;
			case 2:
				System.out.println("\nTodos os clientes: ");
				System.out.println(clientes);
				break;
			case 3:
				read.nextLine();
				if (clientes.isEmpty()){
					System.out.println("A fila está vazia!");
				}else{
					System.out.println("\nNome: " +clientes.remove()+ " retirado da fila");
				}
				break;
			case 0:
				System.out.println("\nPrograma finalizado.");
				break;	
			default:
				System.out.println("\nOpção inválida");
				break;
			}
		} while (op != 0);
		read.close();
	}
		
}

