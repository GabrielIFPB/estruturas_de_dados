#include<iostream>

using namespace std;

int main() {
	int N = 10;
	int vetor[N];
	int buscar;
	int achou = 0;
	int j = 0;

	for (int i = 0; i < N; i++) {
		cout << "Digite o " << i + 1 << "° número: ";
		cin >> vetor[i];
	}

	cout << "Digite o número a ser buscado no vetor: ";
	cin >> buscar;

	while (j <= 9 && achou == 0 && buscar >= vetor[j]) {
		if (vetor[j] == buscar)
			achou = 1;
		else
			j++;
	}

	if (achou == 0)
		cout << "Número não encontrado no vetor" << "\n";
	else
		cout << "Número encontrado na posição: " << (j + 1) << "\n";

	return 0;
}
