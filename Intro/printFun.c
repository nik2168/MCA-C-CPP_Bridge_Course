#include<stdio.h>


void sum () {
    printf("Printing from function ! \n");
}


int main(){

    // compile with  ->   gcc printFn.c
    // run with ./a.out file
    // or on direct run it won't make any a.out file, even it will make a normal without 
    // extension file like in cpp


// input 
int temp;

scanf("%d", &temp);   // %d input specifier and & point towrds that memoery block !
printf("The temp number is %d \n", temp);
    
    int f = 4;    // output stuff
    printf("The number is %d \n", f); // d for integer

 float a = 10.4;
 printf("The number is %f \n", a); // f for float

double v = 10.2938752983;
printf("The double is %lf \n", v);

 char c = '3';
 printf("The char is %c \n", c);

 int z = (int) 4.4543; // we must use (int) to define the conversion of other data type
 printf("The integer z is %d \n", z);
 
sum();


// also we got same integers format here ...

int q = 32;

int * ptr = &q;

int v = *ptr;
int x;

printf("here is the output .. %p \n" , *ptr); // %p to print pointers

// array's first index always point to its first index variable location in the memory
// hence int *p = &arr == &arr[0];

// String are not a data type here 
char string [] = "hello "; // %s will the format specifier for string ...

    return 0;
}

