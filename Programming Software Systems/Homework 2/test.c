#include<stdio.h>

main()
{ 
   char s[20] = "Hello\0Hi";

   printf("%c\n",s[15]);
   
   printf("%d %d", strlen(s), sizeof(s));
}