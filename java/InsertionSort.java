
import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] args) {

		int N = 20;
		int vetor[] = new int[N];
		int aux;
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < N; i++) {
			System.out.print("Digite o " + (i + 1) + "° número: ");
			vetor[i] = entrada.nextInt();
		}

		int j = 0;
		for (int i = 1; i < N; i++) {
			aux = vetor[i];
			j = i - 1;
			while (j >= 0 && vetor[j] > aux) {
				vetor[j+1] = vetor[j];
				j--;
			}
			vetor[j+1] = aux;
		}

		for (int i = 0; i < N; i++) {
			System.out.println((i + 1) + "° número: " + vetor[i]);
		}
	}
}
