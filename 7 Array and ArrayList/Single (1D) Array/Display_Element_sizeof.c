//WAP to Display Element of array using sizeof operator

#include<stdio.h>
#include<conio.h>
int main()
{
    int a[]={1,2,3,4,5},i,d;
    d = (sizeof(a)/sizeof(int));

    printf("Elements of array are : ");
    for(i=0;i<d;i++)
    {
        printf("\n%d",a[i]);
    }
    
    return 0;
}