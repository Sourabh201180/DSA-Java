//WAP to print the sum of Elements of an array

#include<stdio.h>
#include<conio.h>
void main()
{
    int a[10],i,n,s=0;
    printf("Enter the no. of elements u want in your array : ");
    scanf("%d",&n);
    printf("Enter %d elements in the array :\n",n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
        s=s+a[i];
    }
    printf("The sum of Elements of the array is : %d",s);
}