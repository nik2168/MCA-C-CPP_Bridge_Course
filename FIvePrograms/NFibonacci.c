#include<stdio.h>

void printFibonacci(unsigned int num){

int pre = 0;
int cur = 1;

for(int i = 1; i <= num; i++){

if(i > 2){
    printf("%d ", pre + cur);
    pre = cur;
    cur++;
}else if(i == 1) printf("%d ", pre);
else printf("%d ", cur);

}

}

int main (){

int number;

printf("Enter a number : ");
scanf("%d", &number);

printFibonacci(number);

    return 0;
}

Output:
Enter a number : 9
0 1 1 3 5 7 9 11 13