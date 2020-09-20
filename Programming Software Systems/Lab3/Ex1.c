#include <stdio.h>
int main(){
    FILE *fi, *fo;
    char c;
    fi = fopen("input.txt" , "r");

    fo = fopen("output.txt" , "w");

    c = fgetc(fi);
    int characters = 0, words = 0, lines = 0;
    int b = 0;
    while(c!=EOF){
        b = 1;
        if(c==' '){
            words++;
        }
        else if(c=='\n'){
            lines++;
            words++;
        }
        else{
            characters++;
        }
        c = fgetc(fi);
    }
    if(b==1){
        lines++;
    }
    fprintf(fo,"characters: %d\nwords: %d\nlines: %d",characters,words,lines);

    return 0;
}
