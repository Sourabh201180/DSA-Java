//WAP to Reverse the elements of the array

#include<stdio.h>
#include<conio.h>

int main()
{
    int a[]={1,2,3,4,5},i,d;
    d = (sizeof(a)/sizeof(int));
    printf("The elements of array in revrse order are : ");
    for(i=d-1;i>=0;i--)
    {
        printf("\n%d",a[i]);
    }
    return 0;
}