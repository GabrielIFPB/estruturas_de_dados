#include<iostream>

using namespace std;

int main() {
	int aux, N = 5;
	int vetor[N];

	for (int i = 0; i < N; i++) {
		cout << "Digite o " << i + 1 << "° número: ";
		cin >> vetor[i];
	}

	int j = 0;
	for (int i = 1; i < N; i++) {
		aux = vetor[i];
		j = i - 1;
		while (j >= 0 && vetor[j] > aux) {
			vetor[j+1] = vetor[j];
			j--;
		}
		vetor[j+1] = aux;
	}


	for (int i = 0; i < N; i++) {
		cout << (i + 1) << "° número: " << vetor[i] << "\n";
	}

	return 0;
}
