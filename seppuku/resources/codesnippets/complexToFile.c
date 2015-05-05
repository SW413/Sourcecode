matrix loadFromFile(char* str)
{
    FILE * file = fopen(str, "r");

    char buffer[128];

    fscanf(file, "%s ", buffer);
    if(strcmp(buffer, "intmatrix") == 0 || strcmp(buffer, "int32matrix") == 0){
        int dim[2];
        fscanf(file, " %d %d ", &dim[0], &dim[1]);

        matrix m;
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
        return m;
    } else if(strcmp(buffer, "int64matrix") == 0){
        int dim[2];
        fscanf(file, " %d %d ", &dim[0], &dim[1]);

        matrix m;
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
        return m;
    } else if(strcmp(buffer, "int16matrix") == 0){
        int dim[2];
        fscanf(file, " %d %d ", &dim[0], &dim[1]);

        matrix m;
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
        return m;
    } else if (strcmp(buffer, "float64matrix") == 0) {
        int dim[2];
        fscanf(file, " %d %d ", &dim[0], &dim[1]);

        matrix m;
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
        return m;
    } else {
        printf("Unknown type: %s\n", buffer);
        exit(1);
    }
}
