//Wap to update an array

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
    printf("Enter the element u want to update : ");
    scanf("%d",&elem);
    printf("Enter the position of %d u want to update at : ",elem);
    scanf("%d",&pos);
    a[pos] = elem;
    printf("Array Element after updation : ");
    for(i=0;i<n;i++)
    {
        printf("\n%d",a[i]);
    }
    return 0;
}