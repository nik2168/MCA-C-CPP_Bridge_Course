#include<stdio.h>




int main(){

struct StructureOnly
{
    /* data */
    int integer;
};

union UnionOnly
{
    /* data */
    int integer;
};


   struct StructureOnly first;
   first.integer = 34;

   printf("%d \n", first.integer);

   union UnionOnly second;
   second.integer = 35;
   printf("%d", second.integer);

    return 0;
}