__kernel void vectorDotProduct(__global §SIMPLETYPE§ *res, __global §SIMPLETYPE§ *ma, __global §SIMPLETYPE§ *mb){

	int global_x = get_global_id(0);

	§SIMPLETYPE§ tmp =  ma[global_x]*mb[global_x];
	atomic_add(res, tmp);
}
