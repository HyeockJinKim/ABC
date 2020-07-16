#include <stdio.h>


int main() {
	int n;

	scanf("%d", &n);

	int kg5 = n/5;
	int remains = n%5;
	int kg3;
	if (!remains)
		kg3 = 0;
	else if (remains < 3) {
		if (remains == 1) {
			kg5 -= 1;
			kg3 = 2;
		} else {
			kg5 -= 2;
			kg3 = 4;
		}
	} else {
		if (remains == 3) {
			kg3 = 1;
		} else {
			kg5 -= 1;
			kg3 = 3;
		}
	}

	if (kg5 < 0) {
		printf("-1");
	} else {
		printf("%d", kg5+kg3);
	}


	return 0;
}