#include<iostream>

using namespace std;

int main() {
	int aux, N = 10;
	int vetor[N];

	for (int i = 0; i < N; i++) {
		cout << "Digite o " << i + 1 << "° número: ";
		cin >> vetor[i];
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
		cout << (i + 1) << "° número: " << vetor[i] << "\n";
	}

	return 0;
}
