

def troca(vetor: list, i: int, j: int):
	aux = vetor[i]
	vetor[i] = vetor[j]
	vetor[j] = aux


def particao(vetor: list, inicio: int, fim: int) -> int:
	pivo = vetor[(inicio + fim) // 2]
	i = inicio - 1
	j = fim + 1

	while i < j:
		
		j -= 1
		while vetor[j] > pivo:
			j -= 1

		i += 1
		while vetor[i] < pivo:
			i += 1

		if i < j:
			troca(vetor, i, j)
	return j


def quick_sort(vetor: list, inicio: int, fim: int):
	if inicio < fim:
		q = particao(vetor, inicio, fim)
		quick_sort(vetor, inicio, q)
		quick_sort(vetor, (q + 1), fim)


if __name__ == '__main__':
	
	N = 10
	vetor = [None] * N

	for i in range(N):
		vetor[i] = int(input('Entre com o ' + str(i + 1) + 'º valor: '))

	quick_sort(vetor, 0, (N - 1))

	for i in range(N):
		print(str(i + 1) + '° número: ' + str(vetor[i]), end='\n')
