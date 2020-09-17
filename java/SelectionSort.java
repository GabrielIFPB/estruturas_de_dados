
import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {

		int N = 5;
		int vetor[] = new int[N];
		int aux, menor, pos;
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < N; i++) {
			System.out.print("Digite o " + (i + 1) + "° número: ");
			vetor[i] = entrada.nextInt();
		}

		for (int i = 0; i < (N - 1); i++) {
			aux = vetor[i];
			menor = vetor[i+1];
			pos = i + 1;
			for (int j = i + 1; j < N; j++) {
				if (vetor[j] < menor) {
					menor = vetor[j];
					pos = j;
				}
			}
			if (menor < aux) {
				vetor[i] = vetor[pos];
				vetor[pos] = aux;
			}
		}

		for (int i = 0; i < N; i++) {
			System.out.println((i + 1) + "° número: " + vetor[i]);
		}
	}
}
