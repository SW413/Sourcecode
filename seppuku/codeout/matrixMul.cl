__kernel void matrixMul(const __global int *matrixA,
                        const __global int *matrixB,
                        __global int *matrixResult,
                        int colsA,
                        int colsB
                        )
{
    int currentX = get_global_id(0);
    int currentY = get_global_id(1);

    int value = 0;
    for (int k = 0; k < colsA; ++k){
        int elementA = matrixA[currentX * colsA + k];
        int elementB = matrixB[k * colsB + currentY];
        value += elementA * elementB;
    }
    int index = currentX * colsB + currentY;

    matrixResult[index] = value;
}
