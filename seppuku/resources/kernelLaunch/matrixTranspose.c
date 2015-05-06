//MATRIX TRANSPOSE OF §MATRIX_A§ INTO §MATRIX_RES§
global_size[0] = §MATRIX_A§.rows;
global_size[1] = §MATRIX_A§.cols;
software = sclGetCLSoftware("matrixTranspose.cl", "matrixTranspose", hardware);
sclManageArgsLaunchKernel(hardware, software, global_size, local_size, "%R %r %a %a",
    §MATRIX_A§.dataSize, §MATRIX_RES§.dataStart, §MATRIX_A§.dataSize, §MATRIX_A§.dataStart,
    sizeof(int), &§MATRIX_A§.cols, sizeof(int), &§MATRIX_A§.rows);
global_size[1] = 1;
//END OF MATRIX TRANSPOSE