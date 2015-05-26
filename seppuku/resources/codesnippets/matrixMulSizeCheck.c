if(§A_ID§.cols == §B_ID§.rows && §A_ID§.rows == §RES_ID§.rows && §B_ID§.cols == §RES_ID§.cols){
    §CODE§
} else {
    printf("\nMatrix %s and %s not compatible for matrix multiplication into %s \n", "§A_ID§", "§B_ID§", "§RES_ID§");
    exit(0);
}