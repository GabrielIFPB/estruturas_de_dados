
N = 10
inicio = 0
fim = N - 1
meio = (inicio + fim) // 2
achou = False
vetor = [None] * N

for i in range(N):
	vetor[i] = int(input('Entre com o ' + str(i + 1) + 'º valor: '))

buscar = int(input('Digite o número a ser buscado no vetor: '))

while inicio <= fim and not achou:
	if vetor[meio] == buscar:
		achou = True
	else:
		if buscar < vetor[meio]:
			fim = meio - 1;
		else:
			inicio = meio + 1;
		meio = (inicio + fim) // 2


if not achou:
	print("Número não encontrado no vetor");
else:
	print("Número encontrado na posição: %d" % (meio + 1));
