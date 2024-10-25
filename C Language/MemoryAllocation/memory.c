#include<stdio.h>
#include<stdlib.h>

int main(){

    // // malloc or memory allocation will alocate memory of 2 * int size dynamically as a array
    // int * ptr = (int *) malloc(2*sizeof(int)); // 2 * 4 = 8bytes

    // for(int i = 0; i < 2; i++){
    //     ptr[i] += i + 1;
    // }

  
    // for(int i = 0; i < 2; i++){
    //     printf("%d ", ptr[i]);
    // }


    // calloc or continuos memory allocation
    //C calloc() method
// “calloc” or “contiguous allocation” method in C is used to dynamically allocate the specified number of blocks of memory of the specified type. it is very much similar to malloc() but has two different points and these are:
// It initializes each block with a default value ‘0’.
// It has two parameters or arguments as compare to malloc().
// Syntax of calloc() in C

// ptr = (cast-type*)calloc(n, element-size);
// here, n is the no. of elements and element-size is the size of each element

    int * t = (int *) calloc(2, sizeof(int));

    for(int i = 0; i < 5; i++){
        printf("%d ", t[i]);
    }

    return 0;
}