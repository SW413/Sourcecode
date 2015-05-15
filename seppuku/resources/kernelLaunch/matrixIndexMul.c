//MATRIX INDEXWISE MULTIPLICATION OF §A_ID§ AND §B_ID§ INTO §RES_ID§
global_size[0] = §A_ID§.rows*§A_ID§.cols;
software = sclGetCLSoftware("kernels/matrixIndexMul.cl", "matrixIndexMul", hardware);
sclManageArgsLaunchKernel(hardware, software, global_size, local_size, "%R %R %R",
    §A_ID§.dataSize, §A_ID§.dataStart, §B_ID§.dataSize, §B_ID§.dataStart,
    §RES_ID§.dataSize, §RES_ID§.dataStart);
//END OF MATRIX INDEXWISE MULTIPLICATION
