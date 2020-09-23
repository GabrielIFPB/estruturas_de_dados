
N = 10
aux = -1
vetor = [None] * N

def intercalar(vetor, inicio: int, fim: int, meio: int):
	pos = inicio;
	init = inicio;
	medium = meio + 1;
	aux = [None] * (fim + 1);
	
	while init <= meio and medium <= fim:
		if vetor[init] <= vetor[medium]:
			aux[pos] = vetor[init];
			init += 1;
		else:
			aux[pos] = vetor[medium];
			medium += 1;
		pos += 1;

	for i in range(init, meio + 1):
		aux[pos] = vetor[i];
		pos += 1;

	for i in range(medium, fim + 1):
		aux[pos] = vetor[i];
		pos += 1;

	for i in range(inicio, fim + 1):
		vetor[i] = aux[i];


def merge(vetor, inicio: int, fim: int):
	meio = 0;
	if inicio < fim:
		meio = (inicio + fim) // 2;
		merge(vetor, inicio, meio);
		merge(vetor, meio + 1, fim);
		intercalar(vetor, inicio, fim, meio);


for i in range(N):
	vetor[i] = int(input('Entre com o ' + str(i + 1) + 'º valor: '))


merge(vetor, 0, N - 1)

for i in range(N):
	print(str(i + 1) + '° número: ' + str(vetor[i]), end='\n')
