//MATRIX ADDITION OF §MATRIX_A§ AND §MATRIX_B§ INTO §MATRIX_RES§
global_size[0] = §MATRIX_A§.cols * §MATRIX_A§.rows;
global_size[1] = 1;
local_size[0] = 1;
local_size[1] = 1;
software = sclGetCLSoftware("matrixAdd.cl", "matrixAdd", hardware);
sclManageArgsLaunchKernel(hardware, software, global_size, local_size, "%R %R %R",
	§MATRIX_A§.dataSize, §MATRIX_A§.dataStart, §MATRIX_B§.dataSize, §MATRIX_B§.dataStart, §MATRIX_RES§.dataSize, §MATRIX_RES§.dataStart);
//END OF MATRIX ADDITION