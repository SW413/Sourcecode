int main()
{
    /*Array*/
    array A[5] = {1,2,3,4,5};
    /* empty 2x2 matrix */
    mx V0[2,2];

    /*1D matrix*/
    mx V1{1,2,3,4,5};

    /*2D matrix*/
    mx V2{1,1,1,1,1|
          2,2,2,2,2|
          3,3,3,3,3};

    /*3D matrix http://se.mathworks.com/help/matlab/math/ch_data_struct4.gif */
    mx V3{(1,1,1,1,1|
           2,2,2,2,2|
           3,3,3,3,3)
                (1,1,1,1,1|
                2,2,2,2,2|
                3,3,3,3,3)
                    (1,1,1,1,1|
                    2,2,2,2,2|
                    3,3,3,3,3)};
    /* compute and print */	   
    V4 = V2 * V1; /* "*", "/", "+", "-" */
    print("matrix:" + V3);
    print(V4/2);

    /* for (int i = 1, i < 10, i++) */
    for(1:10:+1)
    {
        V2 = V2 * 2;
        print(V2);
    }

    /* Alternativ lige som for, kunne bare ikke finde på noget*/
    num = 0;
    while(num < 10)
    {
        if(num != 0)
        {
            num = num-1;
            print(num);
        }
    }
    
    return 0;
}
