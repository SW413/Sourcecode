__kernel void matrixSub(__global §MATRIXTYPE§ *a,
					    __global §MATRIXTYPE§ *b,
					    __global §MATRIXTYPE§ *result
					    )
{
	int global_x = get_global_id( 0);

	result[global_x] = a[global_x] - b[global_x];
}