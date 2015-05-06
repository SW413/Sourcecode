//MATRIX §MATRIX_A§ MULTIPLIED WITH A SCALAR §MATRIX_B§
global_size[0] = §MATRIX_A§.rows*§MATRIX_A§.cols;
software = sclGetCLSoftware("matrixMulScalar.cl", "matrixMulScalar", hardware);
§MATRIXTYPE§ scl_scalar_mul§NUM§ = §MATRIX_B§;
sclManageArgsLaunchKernel(hardware, software, global_size, local_size, "%R %a",
    §MATRIX_A§.dataSize, §MATRIX_A§.dataStart, sizeof(§MATRIXTYPE§), &scl_scalar_mul§NUM§);
//END MATRIX SCALAR MULTIPLY