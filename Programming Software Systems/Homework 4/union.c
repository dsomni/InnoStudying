#include<stdio.h>

typedef unsigned long long int ull;

union U{
    short odds[64];
    short evens[64];
};

int main() {

    FILE *fi, *fo;
    fi = fopen("input.txt", "r");
    fo = fopen("output.txt", "w");

    ull n, m = 0, n_old;
    fscanf(fi, "%lld", &n);
    n_old = n;
    //printf("%lld",n);

    union U u;
    for(int i = 0;i < 64;i++){
        u.evens[i] = -1;
        u.odds[i] = -1;
    }
    int p = 0, r;
    while(n != 0){
        r = n%2;
        n /= 2;
        if (!(p % 2)){
            u.evens[p] = r;
        } else{
            u.odds[p] = r;
        };
        p+=1;
    };

    p = 1;
    while(u.odds[p]!=-1){
        u.odds[p] = u.evens[p-1];
        p += 2;
    };

    p = 0;
    ull two = 1;
    while(u.odds[p]!= -1 && p<=63){
        m += (p%2==0) ? u.evens[p]*two : u.odds[p]*two;
        p+=1;
        two*=2;
    };

    fprintf(fo,"Encrypted message: %llu\n", m);
    fprintf(fo,"Decrypted message: %llu\n", n_old);

    return 0;
}