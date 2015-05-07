__kernel void matrixTranspose(__global §SIMPLETYPE§ *odata, __global §SIMPLETYPE§* idata, int width, int height)
{
    unsigned int xIndex = get_global_id(0);
    unsigned int yIndex = get_global_id(1);


    unsigned int index_in  = xIndex + width * yIndex;
    unsigned int index_out = yIndex + height * xIndex;
    odata[index_out] = idata[index_in];
}
