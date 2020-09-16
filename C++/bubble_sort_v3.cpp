#include<iostream>

using namespace std;

int main() {
	int aux, N = 5, troca = 1;
	int vetor[N];

	for (int i = 0; i < N; i++) {
		cout << "Digite o " << i + 1 << "° número: ";
		cin >> vetor[i];
	}

	int n = 0;
	while (n < N && troca) {
		troca = 0;
		for (int i = 0; i < (N - 1); i++) {
			if (vetor[i] > vetor[i+1]) {
				troca = 1;
				aux = vetor[i];
				vetor[i] = vetor[i+1];
				vetor[i+1] = aux;
			}
		}
		n++;
	}

	for (int i = 0; i < N; i++) {
		cout << (i + 1) << "° número: " << vetor[i] << "\n";
	}

	return 0;
}
