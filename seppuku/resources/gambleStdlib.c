#include "complexTypes.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void saveToFile(char* str, char* type, matrix m)
{
    FILE * file = fopen(str, "w");

    fprintf(file, "%s\n%zd %zd\n", type, m.rows, m.cols);
    if(strcmp(type, "MATRIX_INT") == 0){
        for(size_t i = 0; i < m.cols * m.rows; i++){
            fprintf(file, "%d %c", ((int*)m.dataStart)[i], i % m.cols == m.cols - 1 ? '\n' : ' ');
        }
    } else if(strcmp(type, "MATRIX_INT16") == 0){
        for(size_t i = 0; i < m.cols * m.rows; i++){
            fprintf(file, "%hi %c", ((short*)m.dataStart)[i], i % m.cols == m.cols - 1 ? '\n' : ' ');
        }
    } else if(strcmp(type, "MATRIX_INT64") == 0){
        for(size_t i = 0; i < m.cols * m.rows; i++){
            fprintf(file, "%lli %c", ((long long*)m.dataStart)[i], i % m.cols == m.cols - 1 ? '\n' : ' ');
        }
    } else if (strcmp(type, "MATRIX_FLOAT64") == 0) {
        for(size_t i = 0; i < m.cols * m.rows; i++){
            fprintf(file, "%f %c", ((double*)m.dataStart)[i], i % m.cols == m.cols - 1 ? '\n' : ' ');
        }
    } else if (strcmp(type, "MATRIX_FLOAT") == 0) {
        for(size_t i = 0; i < m.cols * m.rows; i++){
            fprintf(file, "%f %c", ((float*)m.dataStart)[i], i % m.cols == m.cols - 1 ? '\n' : ' ');
        }
    } else {
        printf("Error!");
    }

    fclose(file);
}

void loadFromFile(char* str, matrix* m)
{
    FILE * file = fopen(str, "r");
    if(file == NULL)
    {
    	printf("FILE NOT FOUND\n");
    	exit(0);
    }

    char buffer[128];
    int bytes;

    if(!fscanf(file, "%s%n", buffer, &bytes)){
        printf("Error");
        exit(-1);
    }

    if(bytes > 100) {
        printf("Filetype identifier too big. EXITING\n");
        exit(-1);
    }

    size_t dim[2];
    size_t reallocate = 0;

    if(!fscanf(file, " %zu %zu ", &dim[0], &dim[1])){
        printf("Error");
        exit(-1);
    }

    if(0 == m->cols || 0 == m->rows)
    {
        reallocate = 1;
        m->rows = dim[0];
        m->cols = dim[1];
    } else if(m->cols != dim[0] || m->rows != dim[1]) {
        // This should be an error.
        printf("Size of input cols and rows differ from the ones read from file. EXITING\n");
        exit(-1);
    } // else all is ok!

    size_t oldDataSize = m->dataSize;

    if(strcmp(buffer, "MATRIX_INT") == 0){
        m->dataSize = sizeof(int) * dim[0] * dim[1];

        if(reallocate || m->dataSize != oldDataSize) {
            m->dataStart = realloc(m->dataStart, m->dataSize);
        }

        for (size_t i = 0; i < dim[1]; ++i)
        {
            for (size_t j = 0; j < dim[0]; ++j)
            {
                if(!fscanf(file, " %d ", &((int*)m->dataStart)[i * dim[0] + j])){
                    printf("Error!");
                }
            }
        }

    } else if(strcmp(buffer, "MATRIX_INT64") == 0){
        m->dataSize = sizeof(long long) * dim[0] * dim[1];

        if(reallocate || m->dataSize != oldDataSize) {
            m->dataStart = realloc(m->dataStart, m->dataSize);
        }

        for (size_t i = 0; i < dim[1]; ++i)
        {
            for (size_t j = 0; j < dim[0]; ++j)
            {
                if(!fscanf(file, " %lli ", &((long long*)m->dataStart)[i * dim[0] + j])) {
                    printf("Error!");
                }
            }
        }

    } else if(strcmp(buffer, "MATRIX_INT16") == 0){
        m->dataSize = sizeof(short) * dim[0] * dim[1];

        if(reallocate || m->dataSize != oldDataSize) {
            m->dataStart = realloc(m->dataStart, m->dataSize);
        }

        for (size_t i = 0; i < dim[1]; ++i)
        {
            for (size_t j = 0; j < dim[0]; ++j)
            {
                if(!fscanf(file, " %hd ", &((short*)m->dataStart)[i * dim[0] + j])) {
                    printf("Error!");
                }
            }
        }
    } else if (strcmp(buffer, "MATRIX_FLOAT64") == 0) {
        m->dataSize = sizeof(double) * dim[0] * dim[1];

        if(reallocate || m->dataSize != oldDataSize) {
            m->dataStart = realloc(m->dataStart, m->dataSize);
        }

        for (size_t i = 0; i < dim[1]; ++i)
        {
            for (size_t j = 0; j < dim[0]; ++j)
            {
                if(!fscanf(file, " %lf ", &((double*)m->dataStart)[i * dim[0] + j])) {
                    printf("Error!");
                }
            }
        }

    } else if (strcmp(buffer, "MATRIX_FLOAT") == 0) {
        m->dataSize = sizeof(float) * dim[0] * dim[1];

        if(reallocate || m->dataSize != oldDataSize) {
            m->dataStart = realloc(m->dataStart, m->dataSize);
        }

        for (size_t i = 0; i < dim[1]; ++i)
        {
            for (size_t j = 0; j < dim[0]; ++j)
            {
                if(!fscanf(file, " %f ", &((float*)m->dataStart)[i * dim[0] + j])) {
                    printf("Error!");
                }
            }
        }

    } else {
        printf("Unknown type: %s\n", str);
        fclose(file);
        exit(1);
    }
    fclose(file);
}
