#include <stdio.h>
#include <string.h>

int main() {
	char a[101], b[101], op[2];

	scanf("%s", a);
	scanf("%s", op);
	scanf("%s", b);

	int a_len = strlen(a);
	int b_len = strlen(b);

	if (op[0] == '+') {
		if (a_len==b_len) {
			*a = '2';
			printf("%s", a);
		} else {
			if (a_len > b_len) {
				*(a+a_len-b_len) = '1';
				printf("%s", a);
			} else {
				*(b+b_len-a_len) = '1';
				printf("%s", b);
			}
		}
	} else {
		int len = a_len + b_len -1;
		*(a) = '1';
		for (int i = 1; i < len; ++i)
			*(a+i) = '0';
		*(a+len) = '\0';
		printf("%s", a);
	}

}