//MATRIX MULTIPLICATION OF §MATRIX_A§ AND §MATRIX_B§ INTO §MATRIX_RES§
global_size[0] = §MATRIX_A§.rows;
local_size[0] = 1;
global_size[1] = §MATRIX_B§.cols;
local_size[1] = 1;
software = sclGetCLSoftware("matrixMul.cl", "matrixMul", hardware);
sclManageArgsLaunchKernel(hardware, software, global_size, local_size, "%r %r %R %a %a %a %a",
	§MATRIX_A§.dataSize, §MATRIX_A§.dataStart, §MATRIX_B§.dataSize, §MATRIX_B§.dataStart, §MATRIX_RES§.dataSize, §MATRIX_RES§.dataStart,
	sizeof(int), &§MATRIX_A§.rows, sizeof(int), &§MATRIX_A§.cols, sizeof(int), &§MATRIX_B§.rows, sizeof(int), &§MATRIX_B§.cols);
//END OF MATRIX MULTIPLICATION