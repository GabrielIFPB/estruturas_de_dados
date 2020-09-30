#include <iostream>

using namespace std;

int N = 11;
int vetor[11];

void heap(int i, int quantidade) {
	int f_esq;
	int f_dir;
	int maior = i;
	int aux;

	if (((2 * i) + 1) <= quantidade) {
		f_esq = (2 * i) + 1;
		f_dir = 2 * i;

		if (vetor[f_esq] >= vetor[f_dir] && vetor[f_esq] > vetor[i])
			maior = 2 * i + 1;
		else if (vetor[f_dir] > vetor[f_esq] && vetor[f_dir] > vetor[i])
			maior = 2 * i;
	} else if ((2 * i) <= quantidade) {
		f_dir = 2 * i;
		if (vetor[f_dir] > vetor[i])
			maior = 2 * i;
	}

	if (maior != i) {
		aux = vetor[i];
		vetor[i] = vetor[maior];
		vetor[maior] = aux;
		heap(maior, quantidade);
	}
}

void ordena(int quantidade) {
	int aux, ultima;
	for (int i = quantidade; i >= 2; i--) {
		aux = vetor[1];
		vetor[1] = vetor[i];
		vetor[i] = aux;
		ultima = i - 1;
		heap(1, ultima);
	}
}

void transformaHeap(int quantidade) {
	for (int i = (quantidade / 2); i >= 1; i--)
		heap(i, quantidade);
}

int main() {

	for (int i = 1; i < N; i++) {
		cout << "Digite o " << i << "° número: ";
		cin >> vetor[i];
	}

	transformaHeap(N - 1);

	ordena(N - 1);

	for (int i = 1; i < N; i++) {
		cout << i << "° número: " << vetor[i] << "\n";
	}

	return 0;
}
