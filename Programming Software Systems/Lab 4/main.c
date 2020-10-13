#include <stdio.h>
#include<stdlib.h>

long identity(long i) { return i; }
long square(long i) { return i*i; }
long cube(long i) { return i*i*i; }
typedef long (*F)(long);

int main()
{
    F A[3] = { identity, square, cube };
    long res= 0;
    for (int i=0; i<3; i++)
        res += A[i](i+1);
    printf("%d\n",res);
    return 0;
}
/*fg*/
