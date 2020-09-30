
import java.util.Scanner;

class QuickSort {
	public static void main(String[] args) {

		int N = 10;
		int vetor[] = new int[N];
		int aux;
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < N; i++) {
			System.out.print("Digite o " + (i + 1) + "° número: ");
			vetor[i] = entrada.nextInt();
		}

		quicksort(vetor, 0, (N - 1));

		for (int i = 0; i < N; i++) {
			System.out.println((i + 1) + "° número: " + vetor[i]);
		}
	}

	private static void quicksort(int vetor[], int inicio, int fim) {
		int q;
		if (inicio < fim) {
			q = particao(vetor, inicio, fim);
			quicksort(vetor, inicio, q);
			quicksort(vetor, (q + 1), fim);
		}
	}

	private static int particao(int vetor[], int inicio, int fim) {
		int pivo = vetor[(inicio + fim) / 2];
		int i = inicio - 1;
		int j = fim + 1;

		while (i < j) {

			do {
				j -= 1;
			} while (vetor[j] > pivo);

			do {
				i += 1;
			} while (vetor[i] < pivo);

			if (i < j) {
				troca(vetor, i, j);
			}
		}
		return j;
	}

	private static void troca(int vetor[], int i, int j) {
		int aux = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = aux;
	}
}
