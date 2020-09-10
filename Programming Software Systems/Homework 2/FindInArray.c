#include <stdio.h>

int* find(int* array, int n, int x){
    int *p = array;
    for(int i=0;i<n;i++){
        if(*p == x) return p;
        p++;
    }
    return NULL;
}

int main(){

    int a[5], b[10];
    for(int i=0; i<10; i++){
        a[i] = i;
        b[i] = i;
    }

    printf("%d\n",find(a,5,1));
    printf("%d\n",find(a,5,7));
    printf("%d\n",find(b,10,8));

    return 0;
}