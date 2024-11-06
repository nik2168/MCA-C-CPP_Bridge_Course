#include<stdio.h>

int main(){

// int n [] = {1,2,3,4};

// for(int i = 0; i < 4; i++){
//     printf("%p \n", &n[i]);
// }

int *p;
int (*ptr) [4];
int arr [4] = {1,2,3,34};
p = arr;
ptr = &arr;

printf("p = %p, ptr = %p", p, ptr);

p++;
ptr++;

printf("p = %p, ptr = %p", p, ptr);


    return 0;
}