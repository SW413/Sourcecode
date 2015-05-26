__kernel void matrixIndexMul(__global §SIMPLETYPE§ *ma, __global §SIMPLETYPE§ * mb, __global §SIMPLETYPE§ *res)
{
    int global_x = get_global_id( 0);
    res[global_x] =  ma[global_x]*mb[global_x];
}
