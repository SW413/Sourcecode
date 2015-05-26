__kernel void matrixAddScalar(__global §SIMPLETYPE§ *ma,__global §SIMPLETYPE§ *res, §SIMPLETYPE§ scalar){

	int global_x = get_global_id(0);

	res[global_x] = ma[global_x] + scalar;
}
