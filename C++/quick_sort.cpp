#include<iostream>

using namespace std;

void troca(int vetor[], int i, int j) {
	int aux = vetor[i];
	vetor[i] = vetor[j];
	vetor[j] = aux;
}

int particao(int vetor[], int inicio, int fim) {
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

void quicksort(int vetor[], int inicio, int fim) {
	int q;
	if (inicio < fim) {
		q = particao(vetor, inicio, fim);
		quicksort(vetor, inicio, q);
		quicksort(vetor, (q + 1), fim);
	}
}

int main() {
	int N = 10;
	int aux, menor, pos;
	int vetor[N];

	for (int i = 0; i < N; i++) {
		cout << "Digite o " << i + 1 << "° número: ";
		cin >> vetor[i];
	}

	quicksort(vetor, 0, (N - 1));

	for (int i = 0; i < N; i++) {
		cout << (i + 1) << "° número: " << vetor[i] << "\n";
	}

	return 0;
}
