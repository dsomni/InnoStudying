#include<stdio.h>

int main(){

    int n = 10;

    int* p1 = &n;
    int *p2 = &n;

    printf("%d\n",*p1);
    printf("%d",*p2);

    return 0;
}