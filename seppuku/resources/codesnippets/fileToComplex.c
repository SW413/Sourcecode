void saveToFile(char* str, char* type, matrix m)
{
    FILE * file = fopen(str, "w");

    fprintf(file, "%s %d %d\n", type, m.cols, m.rows);
    if(strcmp(type, "MATRIX_INT") == 0){
        for(int i = 0; i < m.cols * m.rows; i++){
            fprintf(file, "%d %c", ((int*)m.dataStart)[i], i % m.cols == m.cols - 1 ? '\n' : ' ');
        }
    } else if(strcmp(type, "MATRIX_INT16") == 0){
        for(int i = 0; i < m.cols * m.rows; i++){
            fprintf(file, "%hi %c", ((short*)m.dataStart)[i], i % m.cols == m.cols - 1 ? '\n' : ' ');
        }
    } else if(strcmp(type, "MATRIX_INT64") == 0){
        for(int i = 0; i < m.cols * m.rows; i++){
            fprintf(file, "%lli %c", ((long long*)m.dataStart)[i], i % m.cols == m.cols - 1 ? '\n' : ' ');
        }
    } else if (strcmp(type, "float64matrix") == 0) {
        for(int i = 0; i < m.cols * m.rows; i++){
            fprintf(file, "%f %c", ((double*)m.dataStart)[i], i % m.cols == m.cols - 1 ? '\n' : ' ');
        }
    } else if (strcmp(type, "float32matrix") == 0) {
        for(int i = 0; i < m.cols * m.rows; i++){
            fprintf(file, "%f %c", ((double*)m.dataStart)[i], i % m.cols == m.cols - 1 ? '\n' : ' ');
        }
    } /*else if (strcmp(type, "float16matrix") == 0) {
        for(int i = 0; i < m.cols * m.rows; i++){
            fprintf(file, "%lf %c", ((double*)m.dataStart)[i], i % m.cols == m.cols - 1 ? '\n' : ' ');
        }
    } */
}