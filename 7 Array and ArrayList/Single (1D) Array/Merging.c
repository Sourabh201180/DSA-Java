//Wap to merge two arrays

#include<stdio.h>
#include<conio.h>
int main()
{
    int a[10],b[10],c[20],i,j,n,m,s;
    printf("Enter the no. of Element u want in First(a) array : ");
    scanf("%d",&n);

    printf("Enter %d elements of an array :\n",n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }

    printf("Enter the no. of Element u want in Second(b) array : ");
    scanf("%d",&m);

    printf("Enter %d elements of an array :\n",n);
    for(i=0;i<m;i++)
    {
        scanf("%d",&b[i]);
    }
    
    printf("Array Elements after mergening are : ");
    for(i=0;i<n;i++)
    {
        c[i] = a[i];
    }
    s = n + m;
    for(i=0,j=n;i<m&&j<s;i++,j++)
    {
        c[j] = b[i];
    }
    
    for(i=0;i<s;i++)
    {
        printf("\n%d",c[i]);
    }
    return 0;
}