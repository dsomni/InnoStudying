#include<stdio.h>

int main() {

    FILE *fi, *fo;
    fi = fopen("input.txt", "r");
    fo = fopen("output.txt", "w");

    struct {
        char name[50];
        int num_of_ingredients;
        struct {
            char iname[50];
            char metric[50];
            char amount[50];
        } ingredients[10];
    } a[10];
    int num_of_recipes = 0;
    char c;
    int p, n;

    while ( (c = fgetc(fi)) != EOF) {
        p = 0;
        while (c != '\n') {
            a[num_of_recipes].name[p] = c;
            c = fgetc(fi);
            p++;
        };

        c = fgetc(fi);
        n = 0;
        while (c != '\n' && c!=EOF) {

            p = 0;
            while (c != ' ') {
                a[num_of_recipes].ingredients[n].iname[p] = c;
                p++;
                c = fgetc(fi);
            };
            c = fgetc(fi);


            p = 0;
            while (c != ' ') {
                a[num_of_recipes].ingredients[n].metric[p] = c;
                p++;
                c = fgetc(fi);
            };
            c = fgetc(fi);

            p = 0;
            while (c != '\n' && c != EOF) {
                a[num_of_recipes].ingredients[n].amount[p] = c;
                p++;
                c = fgetc(fi);
            };
            c = fgetc(fi);
            n += 1;
        };


        //printf("%s",s);
        a[num_of_recipes].num_of_ingredients = n;
        num_of_recipes++;
    };

    //printf("%s\n",a[0].name);
    for (int i = 0; i < num_of_recipes; i++) {
        fprintf(fo, "To make a %s you need", a[i].name);
        fprintf(fo, " %s %s of %s", a[i].ingredients[0].amount,
                a[i].ingredients[0].metric, a[i].ingredients[0].iname);
        for (int j = 1; j < a[i].num_of_ingredients; j++) {
            fprintf(fo, ", %s %s of %s", a[i].ingredients[j].amount,
                    a[i].ingredients[j].metric, a[i].ingredients[j].iname);
        }
        fprintf(fo, "\n");
    };
    return 0;
}