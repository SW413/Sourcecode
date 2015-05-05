//MATRIX TRANSPOSE OF §MATRIX_A§ INTO §MATRIX_RES§
global_size[0] = §MATRIX_A§.rows;
local_size[0] = 1;
global_size[1] = §MATRIX_A§.cols;
local_size[1] = 1;
software = sclGetCLSoftware("matrixTranspose.cl", "matrixTranspose", hardware);
sclManageArgsLaunchKernel(hardware, software, global_size, local_size, "%R %r %a %a",
    §MATRIX_A§.dataSize, §MATRIX_RES§.dataStart, §MATRIX_A§.dataSize, §MATRIX_A§.dataStart,
    sizeof(int), &§MATRIX_A§.cols, sizeof(int), &§MATRIX_A§.rows);
//END OF MATRIX TRANSPOSE