#include <stdio.h>
int main(){
    FILE *fi, *fo;
    char c;
    fi = fopen("input.txt" , "r");

    fo = fopen("output.txt" , "w");

    int arr[123];
    for(int i = 0; i < 123;i++) {
        arr[i] = 0;
    }

    c = fgetc(fi);
    int mx = 0;

    while(c!=EOF){
        if(((int) c <= 90 && (int) c >= 65) || ((int) c <= 122 && (int) c >= 97)){
            arr[(int) c]++;
            if(arr[(int) c]>mx){
                mx = arr[(int) c];
            }
        }
        c = fgetc(fi);
    }
    for(int f=mx; f>0; f-- ){
        for(int i = 0; i < 123;i++){
            if(arr[i]==f){
                fprintf(fo,"%c:",(char)i);
                for(int j = 0; j < arr[i];j++) {
                    fprintf(fo,".");
                }
                fprintf(fo,"\n");
            }
        }
    }


    return 0;
}
