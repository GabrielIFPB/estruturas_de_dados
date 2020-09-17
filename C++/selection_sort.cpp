#include<iostream>

using namespace std;

int main() {
	int N = 5;
	int aux, menor, pos;
	int vetor[N];

	for (int i = 0; i < N; i++) {
		cout << "Digite o " << i + 1 << "° número: ";
		cin >> vetor[i];
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
		cout << (i + 1) << "° número: " << vetor[i] << "\n";
	}

	return 0;
}
