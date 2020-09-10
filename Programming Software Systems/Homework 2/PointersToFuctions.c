#include <stdio.h>

void one(){
    printf("1\n");
}

void two(){
    printf("2\n");
}

void three(){
    printf("3\n");
}

int main(){

    int m = 10;

    void (*ptrs[3])();

    ptrs[0] = &one;
    ptrs[1] = &two;
    ptrs[2] = &three;

    ptrs[0]();
    ptrs[1]();
    ptrs[2]();

    printf("\n");

    for(int i=0;i<3;i++){
        ptrs[i]();
    }

    return 0;
}