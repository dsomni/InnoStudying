#include<stdio.h>

int main(){
    FILE *fi, *fo;
    char c;
    char s[256];
    int k = 0;
    fi = fopen("input.txt" , "r");
    fo = fopen("output.txt" , "w");
    c = fgetc(fi);
    while(c != EOF){
        s[k] = c;
        k++;
        c = fgetc(fi);
    }
    k--;
    int shft = 0;
    int st = 1;
    while(s[k]>='0' && s[k]<='9'){
        shft += st * (s[k]-48);
        k--;
        st*=10;
    }
    shft%=26;
    if(s[k]=='-'){
        shft = 26-shft;
    }
    for(int i = 0; i<k;i++){
        if(s[i]>='a' && s[i]<='z'){
            if(s[i]+shft>'z'){
                s[i]-=26;
            }
            s[i]+=shft;
        }
        if(s[i]>='A' && s[i]<='Z'){
            if(s[i]+shft>'Z'){
                s[i]-=26;
            }
            s[i]+=shft;
        }
        fprintf(fo,"%c",s[i]);
    }
    return 0;
}