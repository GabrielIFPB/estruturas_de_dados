#include<iostream>

using namespace std;

int main() {
	int N = 10;
	int vetor[N];
	int buscar;
	int inicio = 0;
	int fim = N - 1;
	int meio = (inicio + fim) / 2;
	int achou = 0;


	for (int i = 0; i < N; i++) {
		cout << "Digite o " << i + 1 << "° número: ";
		cin >> vetor[i];
	}

	cout << "Digite o número a ser buscado no vetor: ";
	cin >> buscar;

	while (inicio <= fim && achou == 0) {
		if (vetor[meio] == buscar) {
			achou = 1;
		} else {
			if (buscar < vetor[meio])
				fim = meio - 1;
			else
				inicio = meio + 1;
			meio = (inicio + fim) / 2;
		}
	}

	if (achou == 0)
		cout << "Número não encontrado no vetor" << "\n";
	else
		cout << "Número encontrado na posição: " << (meio + 1) << "\n";

	return 0;
}
