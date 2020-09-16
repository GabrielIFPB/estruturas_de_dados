
import java.util.Scanner;

public class BubbleSort03 {
	public static void main(String[] args) {

		int N = 20;
		int vetor[] = new int[N];
		int aux;
		boolean troca = true;
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < N; i++) {
			System.out.print("Digite o " + (i + 1) + "° número: ");
			vetor[i] = entrada.nextInt();
		}

		int n = 0;
		while (n < N && troca) {
			troca = false;
			for (int i = 0; i < (N - 1); i++) {
				if (vetor[i] > vetor[i+1]) {
					troca = true;
					aux = vetor[i];
					vetor[i] = vetor[i+1];
					vetor[i+1] = aux;
				}
			}
			n++;
		}

		for (int i = 0; i < N; i++) {
			System.out.println((i + 1) + "° número: " + vetor[i]);
		}
	}
}
