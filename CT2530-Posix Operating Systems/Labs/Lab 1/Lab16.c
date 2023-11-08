#include<stdio.h>
int main()
{
    int number,i,even=0,odd=0;
    printf("Enter the value of n: ");
    scanf("%d",&number);
    for(i=1;i<=number;i++)
    {
        if(i%2==0)
        {
            even=even-i;
        }
        else
        {
            odd=odd+i;
        }
    }
    printf("Output is: %d",even+odd);

}