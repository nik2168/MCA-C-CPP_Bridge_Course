#include <stdbool.h>
#include <stdio.h>
#include <math.h>

// This function is to check
// if a given number is prime
bool isPrime(int n)
{
    if (n == 1 || n == 0)     // 0 and 1 are not prime numbers
        return false;
    // Check for divisibility from 2 to sqrt(n)
    for (int i = 2; i <= sqrt(n); i++) {
        if (n % i == 0)
            return false;
    }
    return true;
}

int main(){
    int N;
    printf("Enter a Number : ");
    scanf("%d", &N);
    printf("Primes form 1 - %d \n", N);   
    // Check every number from 1 to N
    for (int i = 1; i <= N; i++) {
        if (isPrime(i)) {
            printf("%d ", i);
        }
    }
    return 0;
}

// Output :
// Enter a Number : 30
// Primes form 1 - 30 
// 2 3 5 7 11 13 17 19 23 29 % 