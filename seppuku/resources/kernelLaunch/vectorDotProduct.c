//VECTOR DOT PRODUCT OF §MATRIX_A§ AND §MATRIX_B§
global_size[0] = §MATRIX_A§.rows*§MATRIX_A§.cols;
software = sclGetCLSoftware("vectorDotProduct.cl", "vectorDotProduct", hardware);
sclManageArgsLaunchKernel(hardware, software, global_size, local_size, "%R, %r, %r",
    sizeof(§MATRIXTYPE§), &§MATRIX_RES§, §MATRIX_A§.dataSize, §MATRIX_A§.dataStart, §MATRIX_B§.dataSize,
    §MATRIX_B§.dataStart);
//END OF VECTOR DOT PRODUCT