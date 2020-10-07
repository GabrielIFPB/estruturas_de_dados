
N = 10
j = 0
achou = 0
vetor = [None] * N

for i in range(N):
	vetor[i] = int(input('Entre com o ' + str(i + 1) + 'º valor: '))

buscar = int(input('Digite o número a ser buscado no vetor: '))

while j <= 9 and achou == 0 and buscar >= vetor[j]:
	if vetor[j] == buscar:
		achou = 1
	else:
		j += 1


if achou == 0:
	print("Número não encontrado no vetor");
else:
	print("Número encontrado na posição: %d" % (j + 1));
