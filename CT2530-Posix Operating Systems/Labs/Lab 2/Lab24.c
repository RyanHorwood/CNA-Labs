#include <stdio.h>
int main(){
    int n = 69;
    char c = 'F';
    int *n_ptr = &n;
    char *c_ptr = &c;
    printf("\n"); 
    printf("Integer Value = %d\n", n);
    printf("Character Value = %c\n", c);
    *n_ptr = 14;
    *c_ptr = 'R';
    printf("New Integer Value = %d\n", n); 
    printf("New Character Value = %c\n", c);
    return 0;
}