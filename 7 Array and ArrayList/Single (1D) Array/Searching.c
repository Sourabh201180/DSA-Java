//wap to search a particular element from an array

#include<conio.h>
#include<stdio.h>
int main()
{
    int a[10],i,n,elem;
    printf("Enter the no. of Element u want in array : ");
    scanf("%d",&n);
    printf("Enter %d elements of an array :\n",n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    printf("Enter the element u want to search : ");
    scanf("%d",&elem);
    for(i=0;i<n;i++)
    {
        if(a[i]==elem)
        {
            printf("Element %d found at %d position",elem,i);
            break;
        }
    }
    if(a[i]!=elem)
    printf("Element %d Not found!",elem);
    return 0;
}