__kernel void matrixMulScalar(__global §SIMPLETYPE§ *ma, §SIMPLETYPE§ scalar){

	int global_x = get_global_id( 0);

	ma[ global_x] *=  scalar;
}
