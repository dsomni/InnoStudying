#include<stdio.h>

int main(){
    FILE *fi, *fo;
    char c;
    int nums[1000];
    for (int i = 0; i < 1000; ++i) {
        nums[i] = 0;
    }
    int k;
    int n;
    fi = fopen("input.txt" , "r");
    fo = fopen("output.txt" , "w");
    c = fgetc(fi);
    while(c != EOF){
        n = 0;
        while((c>='0' && c<='9') || (c>='A' && c<='F')){
            n*=16;
            if((c>='0' && c<='9')){
                n+= (c-48);
            }
            if((c>='A' && c<='F')){
                n+= (c-55);
            }
            c = fgetc(fi);
        }
        nums[n]+=1;
        c = fgetc(fi);
    }
    for(int i=0;i<1000;i++){
        if(nums[i]>0){
            for(int j = 0;j < nums[i];j++){
                n = i;
                char ans[100];
                int p = 0;
                while(n!=0){
                    k = n%16;
                    if(k<10){
                        ans[p]=(char)(k+48);
                    }
                    else{
                        ans[p]=(char)(k+55);
                    }
                    n/=16;
                    p++;
                }
                p--;
                for (int l = p; l >=0; l--) {
                    fprintf(fo,"%c",ans[l]);
                }
                fprintf(fo," ");
            }
        }
    }

    return 0;
}