//MATRIX MULTIPLICATION OF §A_ID§ AND §B_ID§ INTO §RES_ID§
global_size[0] = §A_ID§.rows;
local_size[0] = 1;
global_size[1] = §B_ID§.cols;
local_size[1] = 1;
software = sclGetCLSoftware("matrixMul.cl", "matrixMul", hardware);
sclManageArgsLaunchKernel(hardware, software, global_size, local_size, "%r %r %R %a %a %a %a",
	§A_ID§.dataSize, §A_ID§.dataStart, §B_ID§.dataSize, §B_ID§.dataStart, §RES_ID§.dataSize, §RES_ID§.dataStart,
	sizeof(int), &§A_ID§.rows, sizeof(int), &§A_ID§.cols, sizeof(int), &§B_ID§.rows, sizeof(int), &§B_ID§.cols);
//END OF MATRIX MULTIPLICATION
