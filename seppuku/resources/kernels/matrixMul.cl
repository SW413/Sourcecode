__kernel void matrixMul(const __global §SIMPLETYPE§ *matrixA,
                        const __global §SIMPLETYPE§ *matrixB,
                        __global §SIMPLETYPE§ *matrixResult,
                        int colsA,
                        int colsB
                        )
{
    int currentX = get_global_id(0);
    int currentY = get_global_id(1);

    §SIMPLETYPE§ value = 0;
    for (int k = 0; k < colsA; ++k){
        §SIMPLETYPE§ elementA = matrixA[currentX * colsA + k];
        §SIMPLETYPE§ elementB = matrixB[k * colsB + currentY];
        value += elementA * elementB;
    }
    int index = currentX * colsB + currentY;

    matrixResult[index] = value;
}
