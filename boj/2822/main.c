#include <stdio.h>

int main() {
	int t[8], max;
	for (int i = 0; i < 8; ++i) {
		scanf("%d", t+i);
	}
	int index, a[5], result = 0;
	for (int i = 0; i < 5; ++i) {
		max = 0;
		for (int j = 0; j < 8; ++j) {
			if (max < *(t+j)) {
				index = j;
				max = *(t+j);
			}
		}
		*(a+i) = index;
		result += max;
		*(t+index) = -1;
	}

	printf("%d\n", result);
	int min;
	for (int i = 0; i < 5; ++i) {
		min =10;
		for (int j = 0; j < 5; ++j) {
			if (min > *(a+j)) {
				min = *(a+j);
				index = j;
			}
		}
		
		printf("%d ", *(a+index)+1);

		*(a+index) = 10;
	}

	return 0;
}