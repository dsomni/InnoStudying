#include<stdio.h>

typedef long long int ll;

int main(){
    FILE *fi, *fo;
    fi = fopen("input.txt","r");
    fo = fopen("output.txt","w");

    ll n;
    int l, r, j;
    int factorials[10] = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
    fscanf(fi,"%d %d",&l,&r);
    for (int i = l; i <=r ; i++) {
        n = 0;
        j = i;
        while(j!=0){
            n+=factorials[j%10];
            j/=10;
        }
        if(n==i){
            fprintf(fo,"%d ",i);
        }
    }

    return 0;
}

