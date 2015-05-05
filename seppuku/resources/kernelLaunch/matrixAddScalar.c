//MATRIX §MATRIX_A§ ADDED WITH A SCALAR §MATRIX_B§
global_size[0] = §MATRIX_A§.rows*§MATRIX_A§.cols;
local_size[0] = 1;
global_size[1] = 1;
local_size[1] = 1;
software = sclGetCLSoftware("matrixAddScalar.cl", "matrixAddScalar", hardware);
§MATRIXTYPE§ scl_scalar_add§NUM§ = §MATRIX_B§;
sclManageArgsLaunchKernel(hardware, software, global_size, local_size, "%R %a",
    §MATRIX_A§.dataSize, §MATRIX_A§.dataStart, sizeof(§MATRIXTYPE§), &scl_scalar_add§NUM§);
//END MATRIX SCALAR ADDITION