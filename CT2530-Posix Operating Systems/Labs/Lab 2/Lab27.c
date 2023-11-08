#include <stdio.h>
int sum(int num[], int size){
    int array_sum = 0;
    for (int i = 0; i < size; i++)
    {
        array_sum += num[i];
    }
    return array_sum;
}
int findLargest(int num[], int size)
{
    int max = num[0];
    for (int i = 0; i < size; i++){
        if (max < num[i])
            max = num[i];
    }
    return max;
}
int findSmallest(int num[], int size){
    int min = num[0];
    for (int i = 0; i < size; i++){
        if (min > num[i])
            min = num[i];
    }
    return min;
}
int main(){
    int size = 5;
    int arr[size];
    printf("\nEnter 5 elements : ");
    for (int i = 0; i < size; i++){
        scanf("%d", &arr[i]);
    }
    int array_sum = sum(arr, size);
    printf("Sum of elements of Array are : %d\n", array_sum);
    int largest = findLargest(arr, size);
    printf("Largest elements of Array is : %d\n", largest);
    int smallest = findSmallest(arr, size);
    printf("Smallest elements of Array is : %d\n", smallest);
    return 0;
}