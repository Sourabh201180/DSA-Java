//Wap to insert a element in the array

#include<stdio.h>
#include<conio.h>
int main()
{
    int a[10],i,n,elem,pos;
    printf("Enter the no. of Element u want in array : ");
    scanf("%d",&n);
    printf("Enter %d elements of an array :\n",n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    printf("Enter the element u want to insert : ");
    scanf("%d",&elem);
    printf("Enter the position of %d u want to insert at : ", elem);
    scanf("%d",&pos);
    for(i=n;i>=pos;i--)
    {
        a[i+1]=a[i];
    }
    a[pos] = elem;
    n++;
    printf("Array elements After insertion :\n");
    for(i=0;i<n;i++)
    {
        printf("\n%d",a[i]);
    }
    return 0;
}