//MATRIX §A_ID§ MULTIPLIED WITH A SCALAR §B_ID§
global_size[0] = §A_ID§.rows*§A_ID§.cols;
software = sclGetCLSoftware("matrixMulScalar.cl", "matrixMulScalar", hardware);
§SIMPLETYPE§ scl_scalar_mul§NUM§ = §B_ID§;
sclManageArgsLaunchKernel(hardware, software, global_size, local_size, "%R %a",
    §A_ID§.dataSize, §A_ID§.dataStart, sizeof(§SIMPLETYPE§), &scl_scalar_mul§NUM§);
//END MATRIX SCALAR MULTIPLY
