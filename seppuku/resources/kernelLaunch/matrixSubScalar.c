//MATRIX §MATRIX_A§ SUBTRACTED WITH A SCALAR §MATRIX_B§
global_size[0] = §MATRIX_A§.rows*§MATRIX_A§.cols;
software = sclGetCLSoftware("matrixSubScalar.cl", "matrixSubScalar", hardware);
§MATRIXTYPE§ scl_scalar_sub§NUM§ = §MATRIX_B§;
sclManageArgsLaunchKernel(hardware, software, global_size, local_size, "%R %a",
    §MATRIX_A§.dataSize, §MATRIX_A§.dataStart, sizeof(§MATRIXTYPE§), &scl_scalar_sub§NUM§);
//END MATRIX SCALAR SUBTRACT