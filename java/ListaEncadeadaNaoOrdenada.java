
import java.util.Scanner;

public class ListaEncadeadaNaoOrdenada {

	private static class LISTA {
		public int numero;
		public LISTA prox;
	}

	public static void main(String... args) {
		Scanner entrada = new Scanner(System.in);
		LISTA inicio = null;
		LISTA fim = null;
		LISTA aux;
		LISTA anterior;
		int op, numero, achou;

		do {
			System.out.println("\nMENU DE OPÇÕES\n");
			System.out.println("1 - Inserir no início da lista");
			System.out.println("2 - Inserir no fim da lista");
			System.out.println("3 - Consultar toda a lista");
			System.out.println("4 - Remover da lista");
			System.out.println("5 - Esvaziar a lista");
			System.out.println("6 - Sair");
			System.out.print("Digite sua opção: ");
			
			op = entrada.nextInt();

			System.out.println(op);

			if (op < 1 || op > 6) {
				System.out.println("Opção inválida!!!");
			}

			if (op == 1) {
				System.out.println("Digite o número a ser inserido no início da lista: ");
				LISTA novo = new LISTA();
				novo.numero = entrada.nextInt();
				if (inicio == null) {
					inicio = novo;
					fim = novo;
					novo.prox = null;
				} else {
					novo.prox = inicio;
					inicio = novo;
				}
				System.out.println("Número inserido no início da lista!!!");
			}
			if (op == 2) {
				System.out.println("Digite o número a ser inserido no fima da lista: ");
				LISTA novo = new LISTA();
				novo.numero = entrada.nextInt();
				if (inicio == null) {
					inicio = novo;
					fim = novo;
					novo.prox = null;
				} else {
					fim.prox = novo;
					fim = novo;
					fim.prox = null;
				}
				System.out.println("Número inserido no fim da lista!!!");
			}
			if (op == 3) {
				if (inicio == null) {
					System.out.println("Lista vazia!!!");
				} else {
					System.out.println("\nConsultando toda a lista\n");
					aux = inicio;
					while (aux != null) {
						System.out.println(aux.numero + " ");
						aux = aux.prox;
					}
				}
			}
			if (op == 4) {
				if (inicio == null) {
					System.out.println("Lista vazia!!!");
				} else {
					System.out.println("\nDigite o elemento a ser removido: \n");
					numero = entrada.nextInt();
					aux = inicio;
					anterior = null;
					achou = 0;
					while (aux != null) {
						if (aux.numero == numero) {
							achou++;
							if (aux == inicio) {
								inicio = aux.prox;
								aux = inicio;
							} else if (aux == fim) {
								anterior.prox = null;
								fim = anterior;
								aux = null;
							} else {
								anterior.prox = aux.prox;
								aux = aux.prox;
							}
						} else {
							anterior = aux;
							aux = aux.prox;
						}
					}
					if (achou == 0)
						System.out.println("Número não encontrado");
					else if (achou == 1)
						System.out.println("Número removido 1 vez");
					else
						System.out.println("Número removido " + achou + " vezes");
				}
			}
			if (op == 5) {
				if (inicio == null) {
					System.out.println("Lista vazia!!!");
				} else {
					inicio = null;
					System.out.println("Lista esvaziada!!!");
				}
			}
		} while (op != 6);
	}
}
