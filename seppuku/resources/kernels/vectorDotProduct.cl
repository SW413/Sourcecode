__kernel void vectorDotProduct(__global §MATRIXTYPE§ *res, __global §MATRIXTYPE§ ma, __global §MATRIXTYPE§ *mb){

	int global_x = get_global_id(0)

	§MATRIXTYPE§ tmp =  ma[global_x]*mb[global_x];
	atomic_add(res, tmp);
}