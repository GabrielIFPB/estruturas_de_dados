#include <stdio.h>
#include <stdlib.h>
#define LIN 2
#define COL 3

int main(int argc, char *argv[]) {
	int **mat;

	mat = (int**)malloc(LIN * sizeof(int));
	for(int i = 0; i < LIN; i++)
		mat[i] = (int*)malloc(COL * sizeof(int));

	mat[0][0] = 10;
	mat[0][1] = 20;
	mat[0][2] = 30;
	mat[1][0] = 40;
	mat[1][1] = 50;
	mat[1][2] = 60;

	for (int i = 0; i < LIN; i++) {
		for (int j = 0; j < COL; j++)
			printf("%d ", mat[i][j]);
		printf("\n");
	}

	for(int i = 0; i < LIN; i++)
		free(mat[i]);

	free(mat);

	return 0;
}
