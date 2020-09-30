#include<iostream>

using namespace std;

void intercalar(int vetor[], int inicio, int fim, int meio) {
	int pos = inicio;
	int init = inicio;
	int medium = meio + 1;
	int aux[fim + 1];
	
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
		pos += 1;
	}

	for (int i = medium; i <= fim; i++) {
		aux[pos] = vetor[i];
		pos += 1;
	}

	for (int i = inicio; i <= fim; i++)
		vetor[i] = aux[i];
}

void merge(int vetor[], int inicio, int fim) {
	int meio;
	if (inicio < fim) {
		meio = (inicio + fim) / 2;
		merge(vetor, inicio, meio);
		merge(vetor, meio + 1, fim);
		intercalar(vetor, inicio, fim, meio);
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

	merge(vetor, 0, N - 1);

	for (int i = 0; i < N; i++) {
		cout << (i + 1) << "° número: " << vetor[i] << "\n";
	}

	return 0;
}
