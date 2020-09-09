#include <stdio.h>
#include <malloc.h>

#define ALTURAMAXIMA 255

typedef struct {
	int altura;
	int peso;
} Pessoa;

int main() {
	Pessoa* pessoa = (Pessoa*) malloc(sizeof(Pessoa));
	pessoa->peso = 45;
	pessoa->altura = 170;
	printf("Peso: %i, Altira: %i\n", pessoa->peso, pessoa->altura);
	free(pessoa);
	return 0;
}
