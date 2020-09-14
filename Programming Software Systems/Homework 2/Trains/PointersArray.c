#include<stdio.h>

int main(){

    int a = 1, b = 2, c =3;
    int *ptrs[3] = {&a, &b, &c};

    for(int i=0;i<3;i++){
        printf("%d %d\n",*ptrs[i],ptrs[i]);
    }

    return 0;
}