#include<stdio.h>


int findFactorial(unsigned int num){

  int res = 1;

  for(int i = 2; i <= num; i++){
    res *= i;
  }

return res;

}

int main() {

int number;

printf("Enter a number : ");
scanf("%d", &number);

int result = findFactorial(number);

printf("The factorial is : ");
printf("%d", result);

    return 0;
}

// Output:
// Enter a number : 5
// The factorial is : 120%                                                                                                                                          