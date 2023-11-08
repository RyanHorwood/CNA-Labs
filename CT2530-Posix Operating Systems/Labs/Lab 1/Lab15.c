#include <stdio.h>
int main(void) {
    int num; {
        printf("Enter your numeric Grade(between 0 to 100)\n");
        scanf("%d",&num);
   }while(num > 100 || num < 0);

    if(num >= 85)
    {
         printf("\nA");
    }
    else if(num >= 65)
    {
        printf("\nB");
    }
    else if(num >= 55)
    {
        printf("\nC");
    }
    else if(num >= 50)
    {
        printf("\nD");
     }
     else
     {
         printf("\nF");
     }
     return 0;
}