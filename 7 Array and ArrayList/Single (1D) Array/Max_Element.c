//WAP to find the max. Element of an array

#include<stdio.h>
#include<conio.h>
int main()
{
    int a[10],i,n,max=0;
    printf("Enter the no. of elements u want in your array : ");
    scanf("%d",&n);
    printf("Enter %d elements of array :\n",n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++)
    {
        if(a[i]>max)
        max=a[i];
        else
        max=a[0];
    }
    printf("The max Element of the array is : %d",max);
    return 0;
}