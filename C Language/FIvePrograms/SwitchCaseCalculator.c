#include<stdio.h>
#include<float.h>


int main(){


    char operator;
printf("Enter your operator (+, -, *, /) : ");
scanf("%c", &operator);

double a, b;
printf("Enter your operants : ");
scanf("%lf %lf", &a, &b);



switch (operator)
{

case '+':
printf("Output : %lf", a + b);
    break;

case '-':
printf("Output : %lf", a - b);
    break;

case '*':
printf("Output : %lf", a * b);
    break;
    
case '/':
printf("Output : %lf", a/b);
    break;

default:
    printf("Error! Incorrect Operator Value\n");
    break;
}


    return 0;
}

// Output:
// Enter your operator (+, -, *, /) : *
// Enter your operants : 3 3
// Output : 9.000000% 