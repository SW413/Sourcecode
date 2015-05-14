__kernel void matrixMul(const __global §SIMPLETYPE§ *matrixA,
                        const __global §SIMPLETYPE§ *matrixB,
                        __global §SIMPLETYPE§ *matrixResult,
                        unsigned int colsA,
                        unsigned int colsB
                        )
{
    unsigned int currentX = get_global_id(0);
    unsigned int currentY = get_global_id(1);

    §SIMPLETYPE§ value = 0;
    for (unsigned int k = 0; k < colsA; ++k){
        §SIMPLETYPE§ elementA = matrixA[currentX * colsA + k];
        §SIMPLETYPE§ elementB = matrixB[k * colsB + currentY];
        value += elementA * elementB;
    }
    unsigned int index = currentX * colsB + currentY;

    matrixResult[index] = value;
}
