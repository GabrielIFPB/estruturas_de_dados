
import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {

		int N = 5;
		int x[] = new int[5];
		int aux;
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < N; i++) {
			System.out.print("Digite o " + (i + 1) + "° número: ");
			x[i] = entrada.nextInt();
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < (N - 1); j++) {
				if (x[j] > x[j + 1]) {
					aux = x[j];
					x[j] = x[j + 1];
					x[j + 1] = aux;
				}
			}
		}

		for (int i = 0; i < N; i++) {
			System.out.println((i + 1) + "° número: " + x[i]);
		}
	}
}