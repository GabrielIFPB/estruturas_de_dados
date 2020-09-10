#include<iostream>

using namespace std;

int main() {
	int vetor[5], aux, N = 5;

	for (int i = 0; i < N; i++) {
		cout << "Digite o " << i + 1 << "° número: ";
		cin >> vetor[i];
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
		cout << (i + 1) << "° número: " << vetor[i] << "\n";
	}

	return 0;
}
