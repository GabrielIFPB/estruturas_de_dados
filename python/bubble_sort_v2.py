
N = 5
aux = -1
vetor = [None] * N

# vetor = list(range(N))

for i in range(N):
	vetor[i] = int(input('Entre com o ' + str(i + 1) + 'º valor: '))

for i in range(N - 1):
	for j in range((N - 1), 0, -1):
		if j > i:
			if vetor[j] < vetor[j - 1]:
				aux = vetor[j]
				vetor[j] = vetor[j - 1]
				vetor[j - 1] = aux
		else:
			break

for i in range(N):
	print(str(i + 1) + '° número: ' + str(vetor[i]), end='\n')
