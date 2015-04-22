#include <stdio.h>
#include <stdint.h>
#define true 1
#define false 0


//--= PROTOTYPES =--
int32_t bar(int32_t aB);
void baz();
int32_t foo(int32_t a, int32_t b);


/*--= MAIN METHOD =--*/
int main(){
    int32_t a = foo(2, 2) - bar(55);
    int32_t neo[3][3]  = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
    printf("%s", "\n");
    if(a == 2) {
        baz();
        a = 2;
    }
    printf("%d %s", a, "\n");
    return 0;
}


/*--= CUSTOM FUNCTIONS =--*/
int32_t bar(int32_t aB){
    aB += 1;
    return aB + 3 * foo(2, aB);
}
void baz(){
    printf("%d %s", 2, "\n");
}
int32_t foo(int32_t a, int32_t b){
    int32_t c = a + b;
    return c++;
}
