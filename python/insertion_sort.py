
N = 5
aux = -1
vetor = [None] * N

for i in range(N):
	vetor[i] = int(input('Entre com o ' + str(i + 1) + 'º valor: '))

j = 0
for i in range(1, N):
	aux = vetor[i]
	j = i - 1
	while j >= 0 and vetor[j] > aux:
		vetor[j+1] = vetor[j]
		j -= 1
	vetor[j+1] = aux

for i in range(N):
	print(str(i + 1) + '° número: ' + str(vetor[i]), end='\n')
