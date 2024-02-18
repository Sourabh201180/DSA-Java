//Wap to traverse the elements of an array

#include<stdio.h>
#include<conio.h>
int main()
{
    int a[10],i,n;
    printf("Enter the no. of elements you want in your array : ");
    scanf("%d",&n);
    printf("Enter %d elements of an array :\n",n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    printf("Elements of array(Traversed) are : ");
    for(i=0;i<n;i++)
    {
        printf("\n%d",a[i]);
    }
    return 0;
}