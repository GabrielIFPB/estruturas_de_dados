
import java.util.Scanner;

public class MergeSort {
	public static void main(String[] args) {

		int N = 10;
		int vetor[] = new int[N];
		int aux, menor, pos;
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < N; i++) {
			System.out.print("Digite o " + (i + 1) + "° número: ");
			vetor[i] = entrada.nextInt();
		}

		merge(vetor, 0, N - 1);

		for (int i = 0; i < N; i++) {
			System.out.println((i + 1) + "° número: " + vetor[i]);
		}
	}

	private static void merge(int vetor[], int inicio, int fim) {
		int meio;
		if (inicio < fim) {
			meio = (inicio + fim) / 2;
			merge(vetor, inicio, meio);
			merge(vetor, meio + 1, fim);
			intercalar(vetor, inicio, fim, meio);
		}
	}

	private static void intercalar(int vetor[], int inicio, int fim, int meio) {
		int pos = inicio;
		int init = inicio;
		int medium = meio + 1;
		int aux[] = new int[fim + 1];
		
		while (init <= meio && medium <= fim ) {
			if (vetor[init] <= vetor[medium]) {
				aux[pos] = vetor[init];
				init += 1;
			} else {
				aux[pos] = vetor[medium];
				medium += 1;
			}
			pos += 1;
		}

		for (int i = init; i <= meio; i++) {
			aux[pos] = vetor[i];
			pos +=1;
		}

		for (int i = medium; i <= fim; i++) {
			aux[pos] = vetor[i];
			pos += 1;
		}

		for (int i = inicio; i <= fim; i++)
			vetor[i] = aux[i];
	}
}
