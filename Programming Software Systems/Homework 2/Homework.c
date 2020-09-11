#include <stdio.h>

int main(){
    FILE *fi, *fo;
    char iname[256], oname[256], str[256];
    printf("Write name of input file: ");
    gets(iname);
    fi = fopen(iname , "r");
    printf("\n");
    
    printf("Write name of output file: ");
    gets(oname);
    fo = fopen(oname , "w");
    printf("\n");

    fgets(str,256,fi);
    fputs(str,fo);

    printf("Completed!\n");

    return 0;
}