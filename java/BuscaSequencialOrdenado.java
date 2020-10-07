
import java.util.Scanner;

public class BuscaSequencialOrdenado {
	public static void main(String[] args) {
		int N = 10;
		int vetor[] = new int[N];
		int buscar;
		int achou = 0;
		int j = 0;
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < N; i++) {
			System.out.print("Digite o " + (i + 1) + "° número: ");
			vetor[i] = entrada.nextInt();
		}

		System.out.print("Digite o número a ser buscado no vetor: ");
		buscar = entrada.nextInt();

		while (j <= 9 && achou == 0 && buscar >= vetor[j]) {
			if (vetor[j] == buscar)
				achou = 1;
			else
				j++;
		}

		if (achou == 0)
			System.out.println("Número não encontrado no vetor");
		else
			System.out.println("Número encontrado na posição: " + (j + 1));

	}
}