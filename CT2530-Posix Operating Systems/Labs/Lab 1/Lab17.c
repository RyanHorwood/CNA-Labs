#include<stdio.h>
int main() {
	int n;

	printf("Enter the value of n: ");
	scanf("%d", &n);

	int sum = 0, i = 1;

	while (i <= n)
	{
		if (n % i == 0)
			sum += i;
		i++;
	}

	if (sum == 2 * n)
		printf("%d is Perfect", n);
	else
		printf("%d is not Perfect", n);

	return 0;
}