__kernel void matrixSub(__global §SIMPLETYPE§ *a,
					    __global §SIMPLETYPE§ *b,
					    __global §SIMPLETYPE§ *result
					    )
{
	int global_x = get_global_id( 0);

	result[global_x] = a[global_x] - b[global_x];
}
