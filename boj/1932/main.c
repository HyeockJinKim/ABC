#include <stdio.h>
#include <stdlib.h>

int main() {
	int n, len, last;

	scanf("%d", &n);
	len = n*(n+1)/2; 
	int * three = malloc(sizeof(int) * len);

	for (int i = 0; i < len; ++i) {
		scanf("%d", three+i);
	}
	last = len - n;
	--n;

	while (last > 0) {
		for (int i = last; i <= last+n; ++i) {
			*(three+i-n) += *(three+i) > *(three+i+1) ? *(three+i) : *(three+i+1);
		}
		last -= n;
		--n;
	}
	printf("%d", *(three));

	free(three);
	return 0;
}