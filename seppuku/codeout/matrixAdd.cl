__kernel void matrixAdd(__global int *a,
					    __global int *b,
					    __global int *result
					    )
{
	int global_x = get_global_id( 0);

	result[global_x] = a[global_x] + b[global_x];
}
