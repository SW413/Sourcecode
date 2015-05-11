#include "complexTypes.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

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
    } else if (strcmp(type, "MATRIX_FLOAT64") == 0) {
        for(int i = 0; i < m.cols * m.rows; i++){
            fprintf(file, "%f %c", ((double*)m.dataStart)[i], i % m.cols == m.cols - 1 ? '\n' : ' ');
        }
    } else if (strcmp(type, "MATRIX_FLOAT") == 0) {
        for(int i = 0; i < m.cols * m.rows; i++){
            fprintf(file, "%f %c", ((float*)m.dataStart)[i], i % m.cols == m.cols - 1 ? '\n' : ' ');
        }
    } else {
        printf("Error!");
    }

    fclose(file);
}

matrix loadFromFile(char* str)
{
    FILE * file = fopen(str, "r");
    if(file == NULL)
    {
    	printf("FILE NOT FOUND\n");
    	exit(0);
    }

    matrix m;
    char buffer[128];

    fscanf(file, "%s", buffer);
    if(strcmp(buffer, "MATRIX_INT") == 0){
        int dim[2];
        fscanf(file, " %d %d ", &dim[0], &dim[1]);

        m.cols = dim[0];
        m.rows = dim[1];
        m.dataSize = sizeof(int) * dim[0] * dim[1];
        m.dataStart = malloc(m.dataSize);

        for (int i = 0; i < dim[1]; ++i)
        {
            for (int j = 0; j < dim[0]; ++j)
            {
                fscanf(file, " %d ", &((int*)m.dataStart)[i * dim[0] + j]);
            }
        }
    } else if(strcmp(buffer, "MATRIX_INT64") == 0){
        int dim[2];
        fscanf(file, " %d %d ", &dim[0], &dim[1]);

        m.cols = dim[0];
        m.rows = dim[1];
        m.dataSize = sizeof(long long) * dim[0] * dim[1];
        m.dataStart = malloc(m.dataSize);

        for (int i = 0; i < dim[1]; ++i)
        {
            for (int j = 0; j < dim[0]; ++j)
            {
                fscanf(file, " %lli ", &((long long*)m.dataStart)[i * dim[0] + j]);
            }
        }
    } else if(strcmp(buffer, "MATRIX_INT16") == 0){
        int dim[2];
        fscanf(file, " %d %d ", &dim[0], &dim[1]);

        m.cols = dim[0];
        m.rows = dim[1];
        m.dataSize = sizeof(short) * dim[0] * dim[1];
        m.dataStart = malloc(m.dataSize);

        for (int i = 0; i < dim[1]; ++i)
        {
            for (int j = 0; j < dim[0]; ++j)
            {
                fscanf(file, " %hd ", &((short*)m.dataStart)[i * dim[0] + j]);
            }
        }
    } else if (strcmp(buffer, "MATRIX_FLOAT64") == 0) {
          int dim[2];
          fscanf(file, " %d %d ", &dim[0], &dim[1]);

          m.cols = dim[0];
          m.rows = dim[1];
          m.dataSize = sizeof(double) * dim[0] * dim[1];
          m.dataStart = malloc(m.dataSize);

          for (int i = 0; i < dim[1]; ++i)
          {
              for (int j = 0; j < dim[0]; ++j)
              {
                  fscanf(file, " %lf ", &((double*)m.dataStart)[i * dim[0] + j]);
              }
          }
    } else if (strcmp(buffer, "MATRIX_FLOAT") == 0) {
           int dim[2];
           fscanf(file, " %d %d ", &dim[0], &dim[1]);

           m.cols = dim[0];
           m.rows = dim[1];
           m.dataSize = sizeof(float) * dim[0] * dim[1];
           m.dataStart = malloc(m.dataSize);

           for (int i = 0; i < dim[1]; ++i)
           {
               for (int j = 0; j < dim[0]; ++j)
               {
                   fscanf(file, " %f ", &((float*)m.dataStart)[i * dim[0] + j]);
               }
           }
    } else {
        printf("Unknown type: %s\n", str);
        fclose(file);
        exit(1);
    }
    fclose(file);
    return m;
}
