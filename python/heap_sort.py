
N = 11
vetor = [None] * N


def heap(i: int, quantidade: int):
	f_esq = 0
	f_dir = 0
	maior = i;
	aux = 0

	if ((2 * i) + 1) <= quantidade:
		f_esq = (2 * i) + 1
		f_dir = 2 * i

		if vetor[f_esq] >= vetor[f_dir] and vetor[f_esq] > vetor[i]:
			maior = (2 * i) + 1

		elif vetor[f_dir] > vetor[f_esq] and vetor[f_dir] > vetor[i]:
			maior = 2 * i

	elif (2 * i) <= quantidade:
		f_dir = 2 * i

		if vetor[f_dir] > vetor[i]:
			maior = 2 * i

	if maior != i:
		aux = vetor[i]
		vetor[i] = vetor[maior]
		vetor[maior] = aux
		heap(maior, quantidade)


def ordena(quantidade: int):
	aux = 0
	ultima = 0

	for i in range(quantidade, 1, -1):
		aux = vetor[1]
		vetor[1] = vetor[i]
		vetor[i] = aux
		ultima = i - 1
		heap(1, ultima)


def transforma_heap(quantidade: int):
	for i in range(quantidade, 0, -1):
		heap(i, quantidade)


if __name__ == '__main__':

	for i in range(1, N):
		vetor[i] = int(input('Entre com o ' + str(i) + 'º valor: '))

	transforma_heap(N - 1)

	ordena(N - 1)

	for i in range(1, N):
		print(str(i) + '° número: ' + str(vetor[i]), end='\n')
