//VECTOR DOT PRODUCT OF §A_ID§ AND §B_ID§
global_size[0] = §A_ID§.rows*§A_ID§.cols;
software = sclGetCLSoftware("kernels/vectorDotProduct.cl", "vectorDotProduct", hardware);
sclManageArgsLaunchKernel(hardware, software, global_size, local_size, "%R, %r, %r",
    sizeof(§SIMPLETYPE§), &§RES_ID§, §A_ID§.dataSize, §A_ID§.dataStart, §B_ID§.dataSize,
    §B_ID§.dataStart);
//END OF VECTOR DOT PRODUCT
