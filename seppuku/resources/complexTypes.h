#include<stdlib.h>

typedef struct{
	size_t rows;
	size_t cols;
	size_t dataSize;
	void* dataStart;
} matrix;
