//MATRIX INDEXWISE MULTIPLICATION OF §MATRIX_A§ AND §MATRIX_B§ INTO §MATRIX_RES§
global_size[0] = §MATRIX_A§.rows*§MATRIX_A§.cols;
software = sclGetCLSoftware("matrixIndexMul.cl", "matrixIndexMul", hardware);
sclManageArgsLaunchKernel(hardware, software, global_size, local_size, "%R %R %R",
    §MATRIX_A§.dataSize, §MATRIX_A§.dataStart, §MATRIX_B§.dataSize, §MATRIX_B§.dataStart,
    §MATRIX_RES§.dataSize, §MATRIX_RES§.dataStart);
//END OF MATRIX INDEXWISE MULTIPLICATION