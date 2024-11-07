#include<stdio.h>

#define X 50 // consonant global variable
static int a = 60;
// we can access one member of union at a time and it has size of the greatest member

// we can access any member in structure and size will be size of all the members sum ...

// we can only initialize one value at a time in union while can initialize all members at a time ...

void incrimental(int *a){
    (*a)++;
    printf("print from function \n %d", *a);
    return;
}

int main () {
   
    int a = 5;

 incrimental(&a);

 printf("from main function : \n %d", a);
// union test
// {
//     int sizef;
//     char demo;
// };

// struct test4
// {
//     int sze;
//     char cha;
// };


// union test a;
// a.sizef = 54;


// struct test4 b;
// b.sze = 8;
// b.cha = 'N';


// printf("%c \n", b.cha);
// printf("%d \n", b.sze);

    return 0;
}