#include <stdio.h>
int isPrime(int n){
    if (n == 1)
        return 0;

    for (int i = 2; i <= n / 2; i++) {
        if (n % i == 0)
            return 0;
    }
    return 1;
}
void generatePrimes(int n){
    int num = 1, count = 0;
    while (1)
    {
        if (isPrime(num))
        {
            printf("%d ", num);
            count++;
        }
        num++;
        if (count == n)
            break;
    }
}
int main(){
    int n;
    printf("\nEnter a positive integer : ");
    scanf("%d", &n);
    generatePrimes(n);
    printf("\n");
    return 0;
}