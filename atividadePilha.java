package atividadesFilaPilha;

import java.util.Stack;
import java.util.Scanner;


public class atividadePilha {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		Scanner read = new Scanner(System.in);
		int op;
		
		do {

			System.out.println("\n------------------------------");
			System.out.println("\n\t\tMenu");
			System.out.println("\n(1) Adicionar Livro na pilha");
			System.out.println("\n(2) Listar todos os Livros");
			System.out.println("\n(3) Retirar Livro da pilha");
			System.out.println("\n(0) Sair?");
			System.out.println("\n------------------------------");
			System.out.println("\nDigite sua opção: ");
			op = read.nextInt();
			
			switch (op) {
			case 1:
				read.nextLine();
				System.out.println("\nDigite o nome: ");
				pilha.push(read.nextLine());
				break;
			case 2:
				System.out.println("\nListar todos os livros: ");
				System.out.println(pilha);
				break;
			case 3:
				read.nextLine();
				if (pilha.isEmpty()){
					System.out.println("A pilha está vazia!");
				}else{
					System.out.println("\nO Livro " + pilha.pop()+ "  foi retirado da pilha");
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
