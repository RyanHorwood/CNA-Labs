#include <stdio.h>
int isEven(int n){

    if (n % 2 == 0)    
        return 1;
    else 
        return 0;

}int main(){
    int n;
    printf("Enter a positive integer : ");
    scanf("%d", &n); 

    if (isEven(n)) {

        printf("%d is an even integer\n", n);

    }else{

        printf("%d is a non even integer\n", n);

    }return 0;
}
