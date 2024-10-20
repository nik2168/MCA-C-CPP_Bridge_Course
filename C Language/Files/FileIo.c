#include<stdio.h>

int main() {

FILE * a = NULL;  // file pointer
char string [72] = "This one is added now";

// reading a file
// a = fopen("temp.txt", "r");  // open the file from local repo
// fscanf(a, "%s", string); // read the file
// printf("The content is %s", string);

// write in a file
// a = fopen("temp.txt", "w");  // open the file from local repo
// fprintf(a, "%s", string); // write in the file
// printf("The content is %s", string);


// append in a file
a = fopen("temp.txt", "a");  // open the file from local repo
fprintf(a, "%s", string); // write in the file
printf("The content is %s", string);

fclose(a);

    return 0;
}