
N = 5
aux = -1
vetor = [None] * N

for i in range(N):
	vetor[i] = int(input('Entre com o ' + str(i + 1) + 'º valor: '))

n = 0
troca = True
while n < N and troca:
	troca = False
	for i in range(N - 1):
		if vetor[i] > vetor[i+1]:
			troca = True
			aux = vetor[i]
			vetor[i] = vetor[i+1]
			vetor[i+1] = aux
	n += 1


for i in range(N):
	print(str(i + 1) + '° número: ' + str(vetor[i]), end='\n')
