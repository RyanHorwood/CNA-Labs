#include <stdio.h>
int main() {
    int sum, difference, product, quotient, remainder, a, b;
    printf("Enter a number: ");
    scanf("%d", &a);
    printf("Enter another number: ");
    scanf("%d", &b);

	sum = a + b;
	difference = a - b;
	product = a * b;
    quotient = a / b;
    remainder = a % b;

    printf("Sum = %d\n", sum);
	printf("Difference = %d\n", difference);
	printf("Product = %d\n", product);
    printf("Quotient = %d\n", quotient);
    printf("Remainder = %d", remainder);
    return 0;
}