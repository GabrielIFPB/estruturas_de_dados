
import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {

		int N = 5;
		int vetor[] = new int[5];
		int aux;
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < N; i++) {
			System.out.print("Digite o " + (i + 1) + "° número: ");
			vetor[i] = entrada.nextInt();
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < (N - 1); j++) {
				if (vetor[j] > vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}
			}
		}

		for (int i = 0; i < N; i++) {
			System.out.println((i + 1) + "° número: " + vetor[i]);
		}
	}
}