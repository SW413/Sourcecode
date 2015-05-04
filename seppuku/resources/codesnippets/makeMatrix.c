
//MATRIX GENERATION FOR §ID§
matrix §ID§;
§ID§.cols = §COLS§;
§ID§.rows = §ROWS§;
§ID§.dataSize = sizeof(§SIMPLETYPE§) * §COLS§ * §ROWS§;
§ID§.dataStart = calloc(§ID§.cols * §ID§.rows, §ID§.dataSize);
//END MATRIX GENERATION