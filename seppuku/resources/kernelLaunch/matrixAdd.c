//MATRIX ADDITION OF §A_ID§ AND §B_ID§ INTO §RES_ID§
global_size[0] = §A_ID§.cols * §A_ID§.rows;
software = sclGetCLSoftware("matrixAdd.cl", "matrixAdd", hardware);
sclManageArgsLaunchKernel(hardware, software, global_size, local_size, "%R %R %R",
	§A_ID§.dataSize, §A_ID§.dataStart, §B_ID§.dataSize, §B_ID§.dataStart, §RES_ID§.dataSize, §RES_ID§.dataStart);
//END OF MATRIX ADDITION
