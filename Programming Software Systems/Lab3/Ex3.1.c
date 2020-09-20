#include<stdio.h>

int main(){
    FILE *fi, *fo;
    fi = fopen("input.txt" , "r");
    fo = fopen("output.txt" , "w");
    char c;

    int numbers[11] = {0, };
    int n;
    //printf("%d",(int) '1');

    c = fgetc(fi);
    while(c!=EOF){
        n = (int) c - 48;
        if(n<11 && numbers[n]==0){
            numbers[n] = 1;
            fprintf(fo,"%d ",n);
        }
        c = fgetc(fi);
    }

    return 0;
}

