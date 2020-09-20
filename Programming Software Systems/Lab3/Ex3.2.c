#include<stdio.h>

int main(){
    FILE *fi, *fo;
    fi = fopen("input.txt" , "r");
    fo = fopen("output.txt" , "w");

    int n;
    fscanf(fi,"%d",&n);

    int cn = 1;
    int rep = 1;
    for(int i = 0; i < n; i++){
        for(int j = 0;j<rep;j++){
            fprintf(fo,"%d",cn);
            cn++;
        }
        fprintf(fo,"\n");
        rep++;
    }

    return 0;
}

