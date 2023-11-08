#include<stdio.h>
int main()
{
char c;
int a;
float b;
printf("Enter a character: ");
scanf("%c",&c);
printf("Enter an integer: ");
scanf("%d",&a);
printf("Enter a real number: ");
scanf("%f",&b);
printf("\n%c is a character\n%d is an integer\n%.4f is a real number",c,a,b);
return 0;
}