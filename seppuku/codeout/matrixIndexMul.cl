__kernel void matrixIndexMul(__global int *ma, __global int * mb, __global int *res)
{
    int global_x = get_global_id( 0);
    res[global_x] =  ma[global_x]*mb[global_x];
}
