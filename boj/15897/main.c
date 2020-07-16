#include <stdio.h>

int main() {
	int n;
	scanf("%d", &n);

	long long num = n+1;
	--n;
	if (!n) {
		printf("1");
		return 0;
	}
	for (int i = 1; i < n; ++i) {
		int t = n/i;
		num += t;
		if (t == 1) {
			num += n-i-1;
			break;
		} else {
			num += (n/t-i)*t;
			i = n/t;
		}
	}
	printf("%lld", num);
	return 0;
}