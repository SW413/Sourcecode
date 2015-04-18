#include <stdio.h>
#include <stdint.h>
#define true 1
#define false 0


//--= PROTOTYPES =--
int64_t fibR(int64_t n);
int64_t fibI(int64_t n);


/*--= MAIN METHOD =--*/
int main(){
    printf("%s%s", "FibR", "\n");
    for(int32_t i = 0; i < 12; i++) {
        printf("%lld %s", fibR(i), "\n");
    }

    printf("%s%s", "FibI", "\n");
    for(int32_t i = 0; i < 12; i++) {
        printf("%lld %s", fibI(i), "\n");
    }

    return 0;
}


/*--= CUSTOM FUNCTIONS =--*/
int64_t fibR(int64_t n){
    int64_t tmp = 0;
    if(n == 0) {
        tmp = 0;
    } else if(n == 1) {
        tmp = 1;
    } else {
        tmp = fibR(n - 1) + fibR(n - 2);
    }
    return tmp;
}
int64_t fibI(int64_t n){
    int64_t tmp1 = 0;
    int64_t tmp2 = 1;
    for(int64_t i = 0; i < n; i++) {
        int64_t tmp3 = tmp1;
        tmp1 = tmp2;
        tmp2 += tmp3;
    }

    return tmp1;
}
