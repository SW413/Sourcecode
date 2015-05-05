__kernel void matrixMulScalar(__global float *ma, float scalar){

	int global_x = get_global_id( 0);

	ma[ global_x] *=  scalar;
}
