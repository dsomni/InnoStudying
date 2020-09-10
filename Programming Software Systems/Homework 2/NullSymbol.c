#include<stdio.h>

main()
{ 
   char s[20] = "Hello\0Hi";

   
   printf("%d %d", strlen(s), sizeof(s));
}