__kernel void matrixIndexMul(__global §MATRIXTYPE§ *ma, __global §MATRIXTYPE§ * mb, __global §MATRIXTYPE§ *res)
{
    int global_x = get_global_id( 0);
    res[global_x] =  ma[global_x]*mb[global_x];
}