//MATRIX §A_ID§ SUBTRACTED WITH A SCALAR §B_ID§
global_size[0] = §A_ID§.rows*§A_ID§.cols;
software = sclGetCLSoftware("matrixSubScalar.cl", "matrixSubScalar", hardware);
§SIMPLETYPE§ scl_scalar_sub§NUM§ = §B_ID§;
sclManageArgsLaunchKernel(hardware, software, global_size, local_size, "%r %R %a",
    §A_ID§.dataSize, §A_ID§.dataStart, §RES_ID§.dataSize, §RES_ID§.dataStart, sizeof(§SIMPLETYPE§), &scl_scalar_sub§NUM§);
//END MATRIX SCALAR SUBTRACT
