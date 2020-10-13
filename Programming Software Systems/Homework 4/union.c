#include<stdio.h>

typedef unsigned long long int ull;

union U{
    ull number;
    char bytes[8];
};

int main() {

    FILE *fi, *fo;
    fi = fopen("input.txt", "r");
    fo = fopen("output.txt", "w");

    ull n, n_old;
    fscanf(fi, "%lld", &n);
    n_old = n;
    //fprintf(fo,"%lld",n);

    union U u;
    u.number = n;
    char c;
    for(int i = 7; i>0; i-=2){
        c = u.bytes[i];
        u.bytes[i] = u.bytes[i-1];
        u.bytes[i-1] = c;
    }

    fprintf(fo,"Encrypted message: %llu\n", u.number);
    fprintf(fo,"Decrypted message: %llu\n", n_old);

    return 0;
}