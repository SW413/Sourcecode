#include <stdio.h>
#include <stdint.h>
#define true 1
#define false 0


//--= PROTOTYPES =--


/*--= MAIN METHOD =--*/
int main(){
    int32_t a = 2;
    int32_t b = 3;
    if(a < b) {
        int32_t c = a + b;
        printf("%d %s", c, "\n");
    } else if(b < a) {
        int32_t c = a - b;
        printf("%d %s", c, "\n");
    } else {
        printf("%s%s",  a + b , "\n");
    }
    return 0;
}


/*--= CUSTOM FUNCTIONS =--*/
