
import java.util.Scanner;

public class BubbleSort01 {
	public static void main(String[] args) {

		int N = 10;
		int vetor[] = new int[N];
		int aux;
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < N; i++) {
			System.out.print("Digite o " + (i + 1) + "° número: ");
			vetor[i] = entrada.nextInt();
		}

		for (int i = 0; i < (N - 1); i++) {
			for (int j = (N - 1); j > i; j--) {
				if (vetor[j] < vetor[j - 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j - 1];
					vetor[j - 1] = aux;
				}
			}
		}

		for (int i = 0; i < N; i++) {
			System.out.println((i + 1) + "° número: " + vetor[i]);
		}
	}
}
