//Wap to print the second max. Element of an array

#include<stdio.h>
#include<conio.h>
int main()
{
    int a[10], i, n, max1 = 0, max2 = 0;

    printf("Enter the no. of elements u want in your array : ");
    scanf("%d",&n);

    printf("Enter %d elements of array :\n",n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    
    for(i=0;i<n;i++)
    {
        if(a[i]>max1)
        {
            max2=max1;
            max1=a[i];
        } else if(a[i]>max2)
        {
            max2=a[i];
        }
    }

    printf("The first largest element is %d",max1);
    printf("\nThe Second largest element is %d",max2);
    
    return 0;
}