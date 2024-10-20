#include<stdio.h>

int main(){

int number;

printf("Enter a number to check if its even or odd : ");
scanf("%d", &number);

if (number % 2 == 0) {
    printf("The number is even");
}else{
    printf("The number is odd");
}

    return 0;
}

// Output:
// Enter a number to check if its even or odd : 4
// The number is even%   