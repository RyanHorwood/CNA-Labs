#include <stdio.h>
void shift(int *a, int *b, int *c){

    int temp;
    temp = *a;
    *a = *b;
    *b = temp;

    temp = *a;
    *a = *c;
    *c = temp;
}
int main(){
    int a, b, c;
    printf("Enter three integers : ");
    scanf("%d%d%d", &a, &b, &c);
    printf("Values before Shift : ");
    printf("%d %d %d\n", a, b, c);
    shift(&a, &b, &c);
    printf("Values after Shift : ");
    printf("%d %d %d\n", a, b, c);
    return 0;
}