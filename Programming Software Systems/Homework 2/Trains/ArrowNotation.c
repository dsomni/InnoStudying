#include<stdio.h>

int main(){

    int n = 10;

    struct S{
        int a;
        int b;
    };

    struct S s;
    s.a = 5;
    s.b = 0;

    struct S *p = &s;

    printf("%d\n",p->a);
    printf("%d\n",p->b);

    printf("\n");

    p->b = 10;
    printf("%d\n",p->a);
    printf("%d\n",p->b);

    return 0;
}