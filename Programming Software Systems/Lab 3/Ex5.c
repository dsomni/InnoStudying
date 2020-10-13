#include<stdio.h>
#include<string.h>

int main(){
    FILE *fi, *fo;
    fi = fopen("input.txt","r");
    fo = fopen("output.txt","w");

    char validPassword[4];
    int steps = 0;
    fscanf(fi,"%s",&validPassword);
    char password[4]={' ','\0','\0','\0'};

    int b = 0;
    for(int i = -1; i<96;i++){
        for(int j = -1; j<96;j++){
            for(int k= -1; k<96;k++){
                password[0] = (char) (' '+k);
                if(j!=-1){
                    password[1] = (char) (' '+j);
                }
                if(i!=-1){
                    password[2] = (char) (' '+i);
                }
                steps++;
                if(strcmp(password,validPassword)==0){
                    b = 1;
                    break;
                }
            }
            if(b==1){
                break;
            }
        }
        if(b==1){
            break;
        }
    }
    fprintf(fo,"%s\nsteps: %d",password,steps);

    return 0;
}
