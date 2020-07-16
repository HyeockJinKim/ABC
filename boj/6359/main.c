#include <stdio.h>
#include <stdlib.h>

int main() {
	int testNum, max=5;
	scanf("%d", &testNum);
	
	int * testCase = malloc(sizeof(int)*testNum);
	for (int i =0; i < testNum; ++i) {
		scanf("%d", testCase+i);
		if (max < *(testCase+i)) {
			max = *(testCase+i);
		}
	}
	int * rooms = malloc(sizeof(int)*(max+1));
	int * openRooms = calloc(max+1, sizeof(int));
	for (int i = 1; i <= max; ++i) {
		for (int j = i; j <=max; j += i) {
			++*(rooms+j);
		}
		if (*(rooms+i)%2) {
			++*(openRooms+i);
		}
		*(openRooms+i) += *(openRooms+i-1);
	}

	for (int i = 0; i< testNum; ++i) {
		printf("%d\n", *(openRooms+*(testCase+i)));
	}
	free(openRooms);
	free(rooms);
	free(testCase);
}