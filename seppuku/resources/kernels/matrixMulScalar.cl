__kernel void matrixMulScalar(__global §MATRIXTYPE§ *ma, §MATRIXTYPE§ scalar){

	int global_x = get_global_id( 0);

	ma[ global_x] *=  scalar;
}