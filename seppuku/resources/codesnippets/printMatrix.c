printf("%c", '\n');
for(int i = 0; i < §MATRIX§.cols * §MATRIX§.rows; i++){
    printf("%d %c", ((int*)§MATRIX§.dataStart)[i], i % §MATRIX§.cols == §MATRIX§.cols - 1 ? '\n' : ' ');
}