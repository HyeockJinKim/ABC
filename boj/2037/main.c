#include <stdio.h>


int main () {
	int p, w, result = 0;

	scanf("%d%d", &p, &w);

	char str[1000];
	gets(str);
	gets(str);

	int i=0;
	char prev = 'a';
	while (*(str+i) != '\0') {
		switch(*(str+i)) {
			case ' ':
				result += p;
				prev = ' ';
				break;
			case 'C':
				result += p * 3;
				if (prev == 'A') {
					result += w;
				}
				prev = 'A';
				break;
			case 'B':
				result += p * 2;
				if (prev == 'A') {
					result += w;
				}
				prev = 'A';
				break;
			case 'A':
				result += p;
				if (prev == 'A') {
					result += w;
				}
				prev = 'A';
				break;
			case 'F':
				result += p * 3;
				if (prev == 'D') {
					result += w;
				}
				prev = 'D';
				break;
			case 'E':
				result += p * 2;
				if (prev == 'D') {
					result += w;
				}
				prev = 'D';
				break;
			case 'D':
				result += p;
				if (prev == 'D') {
					result += w;
				}
				prev = 'D';
				break;
			case 'I':
				result += p * 3;
				if (prev == 'G') {
					result += w;
				}
				prev = 'G';
				break;
			case 'H':
				result += p * 2;
				if (prev == 'G') {
					result += w;
				}
				prev = 'G';
				break;
			case 'G':
				result += p;
				if (prev == 'G') {
					result += w;
				}
				prev = 'G';
				break;
			case 'L':
				result += p * 3;
				if (prev == 'J') {
					result += w;
				}
				prev = 'J';
				break;
			case 'K':
				result += p * 2;
				if (prev == 'J') {
					result += w;
				}
				prev = 'J';
				break;
			case 'J':
				result += p;
				if (prev == 'J') {
					result += w;
				}
				prev = 'J';
				break;
			case 'O':
				result += p * 3;
				if (prev == 'M') {
					result += w;
				}
				prev = 'M';
				break;
			case 'N':
				result += p * 2;
				if (prev == 'M') {
					result += w;
				}
				prev = 'M';
				break;
			case 'M':
				result += p;
				if (prev == 'M') {
					result += w;
				}
				prev = 'M';
				break;
			case 'S':
				result += p * 4;
				if (prev == 'P') {
					result += w;
				}
				prev = 'P';
				break;
			case 'R':
				result += p * 3;
				if (prev == 'P') {
					result += w;
				}
				prev = 'P';
				break;
			case 'Q':
				result += p * 2;
				if (prev == 'P') {
					result += w;
				}
				prev = 'P';
				break;
			case 'P':
				result += p;
				if (prev == 'P') {
					result += w;
				}
				prev = 'P';
				break;
			case 'V':
				result += p * 3;
				if (prev == 'T') {
					result += w;
				}
				prev = 'T';
				break;
			case 'U':
				result += p * 2;
				if (prev == 'T') {
					result += w;
				}
				prev = 'T';
				break;
			case 'T':
				result += p;
				if (prev == 'T') {
					result += w;
				}
				prev = 'T';
				break;
			case 'Z':
				result += p * 4;
				if (prev == 'W') {
					result += w;
				}
				prev = 'W';
				break;
			case 'Y':
				result += p * 3;
				if (prev == 'W') {
					result += w;
				}
				prev = 'W';
				break;
			case 'X':
				result += p * 2;
				if (prev == 'W') {
					result += w;
				}
				prev = 'W';
				break;
			case 'W':
				result += p;
				if (prev == 'W') {
					result += w;
				}
				prev = 'W';
				break;
		}
		++i;
	}
	printf("%d", result);
	return 0;
}