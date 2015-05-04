printf("\n");
for(int i = 0; i < §ID§.cols * §ID§.rows; i++){
    printf("%3d%c", ((int*)§ID§.dataStart)[i], i % §ID§.cols == §ID§.cols - 1 ? '\n' : ' ');
}
printf("\n");