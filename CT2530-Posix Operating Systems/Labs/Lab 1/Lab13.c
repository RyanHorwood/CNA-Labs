#include <stdio.h>
int main() {
    int i, sum = 0;
    i = 1;
    while (i <= 15) {
        sum += i;
        ++i;
    }
    printf("Sum = %d", sum);
    return 0;
}