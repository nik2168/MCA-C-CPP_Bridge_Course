#include<stdio.h>

int main(){

int sum(int, int);

int a = 3;
int b = 3;

int r = sum(a, b);

printf("result is %d", r);

    return 0;
}

int sum (int a, int b){
   return a + b;
} 