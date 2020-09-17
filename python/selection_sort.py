
N = 5
aux = -1
vetor = [None] * N

for i in range(N):
	vetor[i] = int(input('Entre com o ' + str(i + 1) + 'º valor: '))


for i in range(N - 1):
	aux = vetor[i]
	menor = vetor[i+1]
	pos = i + 1
	for j in range(i + 1, N):
		if vetor[j] < menor:
			menor = vetor[j]
			pos = j
	if menor < aux:
		vetor[i] = vetor[pos]
		vetor[pos] = aux

for i in range(N):
	print(str(i + 1) + '° número: ' + str(vetor[i]), end='\n')
