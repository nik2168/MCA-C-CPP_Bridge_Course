#include<stdio.h>

int main(){

int n [] = {1,2,3,4};

for(int i = 0; i < 4; i++){
    printf("%p \n", &n[i]);
}

    return 0;
}