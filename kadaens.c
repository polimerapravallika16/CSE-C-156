#include <stdio.h>

int main() {
    int n, i;
    printf("Enter number of elements: ");
    scanf("%d", &n);

    int arr[n];

    printf("Enter array elements:\n");
    for(i = 0; i < n; i++)
        scanf("%d", &arr[i]);

    int currentSum = 0;
    int maxSum = arr[0];

    for(i = 0; i < n; i++) {
        currentSum += arr[i];

        if(currentSum > maxSum)
            maxSum = currentSum;

        if(currentSum < 0)
            currentSum = 0;
    }

    printf("Maximum Subarray Sum = %d", maxSum);

    return 0;
}
