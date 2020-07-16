#include <stdio.h>
#include <stdlib.h>

int main() {
	int * x;
	int n;
	double sum = 0, temp;

	scanf("%d", &n);

	x = malloc(sizeof(int)*(n+1));
	
	for (int i = 1; i <= n; ++i) {
		scanf("%d", x+i);
	}

	temp = *(x+n);
	for (int i = n-1; i >= 1; --i) {
		sum += temp * *(x+i);
		temp += *(x+i);
	}
	printf("%.lf", sum);
	free(x);
	return 0;
}