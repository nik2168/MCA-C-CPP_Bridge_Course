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


// Print whole line by line

// #include <stdio.h>
// #include <stdlib.h>

// int main()
// {
//     char *buffer;
//     size_t bufsize = 32;
//     size_t characters;
//     FILE * a = NULL;
//     char string [80];

//     a = fopen("temp.txt", "r");
//     buffer = (char *)malloc(bufsize * sizeof(char));
//     if( buffer == NULL)
//     {
//         perror("Unable to allocate buffer");
//         exit(1);
//     }

//     printf("Type something: ");
//     characters = getline(&buffer,&bufsize, a);
//     printf("%zu characters were read.\n",characters);
//     printf("You typed: '%s'\n",buffer);

//     return(0);
// }