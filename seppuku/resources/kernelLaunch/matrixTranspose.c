//MATRIX TRANSPOSE OF §A_ID§ INTO §RES_ID§
global_size[0] = §A_ID§.rows;
global_size[1] = §A_ID§.cols;
software = sclGetCLSoftware("kernels/matrixTranspose.cl", "matrixTranspose", hardware);
sclManageArgsLaunchKernel(hardware, software, global_size, local_size, "%R %r %a %a",
    §A_ID§.dataSize, §RES_ID§.dataStart, §A_ID§.dataSize, §A_ID§.dataStart,
    sizeof(int), &§A_ID§.cols, sizeof(int), &§A_ID§.rows);
global_size[1] = 1;
//END OF MATRIX TRANSPOSE
