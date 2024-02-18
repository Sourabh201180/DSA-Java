//Wap to sort the elements of an array

#include<stdio.h>
#include<conio.h>
int main()
{
    int a[10],i,j,n,temp;
    printf("Enter the no. of Element u want in array : ");
    scanf("%d",&n);
    printf("Enter %d elements of an array :\n",n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }

    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        { 
            if (a[i]>a[j])
            {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }

    printf("After sorting array elements are is : ");
    for(i=0;i<n;i++)
    {
        printf("\n%d",a[i]);
    }
    
    return 0;
}