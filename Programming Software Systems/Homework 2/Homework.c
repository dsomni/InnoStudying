#include <stdio.h>

int main(){
    FILE *fi, *fo;
    char c;
    fi = fopen("input.txt" , "r");
    
    fo = fopen("output.txt" , "w");
    
    c = fgetc(fi);
    while(c!=EOF){
        fputc(c,fo);
        c = fgetc(fi);
    }

    return 0;
}