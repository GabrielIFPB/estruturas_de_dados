
import java.util.Scanner;

public class BuscaBinaria {

	public static void main(String[] args) {
		int N = 10;
		int vetor[] = new int[N];
		int buscar;
		int inicio = 0;
		int fim = N - 1;
		int meio = (inicio + fim) / 2;
		boolean achou = false;

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < N; i++) {
			System.out.print("Digite o " + (i + 1) + "° número: ");
			vetor[i] = entrada.nextInt();
		}

		System.out.print("Digite o número a ser buscado no vetor: ");
		buscar = entrada.nextInt();

		while (inicio <= fim && !achou) {
			if (vetor[meio] == buscar) {
				achou = true;
			} else {
				if (buscar < vetor[meio])
					fim = meio - 1;
				else
					inicio = meio + 1;
				meio = (inicio + fim) / 2;
			}
		}

		if (!achou)
			System.out.println("Número não encontrado no vetor");
		else
			System.out.println("Número encontrado na posição: " + (meio + 1));

	}
}
