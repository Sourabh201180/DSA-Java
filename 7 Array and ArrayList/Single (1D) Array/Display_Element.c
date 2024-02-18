// WAP to Display Element Of an Array

#include<stdio.h>
#include<conio.h>

int main()
{
    int a[5] = {1,2,3,4,5}, i;

    printf("\nThe Elements of array are : ");
    for(i=0; i<5; i++)
    {
        printf("\n%d", a[i]);
    }

    return 0;
}