//WAP to Impliment Binary Search

#include<stdio.h>
#include<conio.h>

#define max 5
int main()
{
    int a[max],i,n,f,l,mid,search;

    printf("Enter the no. of elements u want in an array : ");
    scanf("%d",&n);

    printf("\nEnter the Elements of array :\n");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }

    printf("\nEnter element to be searched : ");
    scanf("%d",&search);

    f = 0;
    l = max - 1;
    mid = (f + l) / 2;

    while(f<=l)
    {
        if(a[mid]<search)
        {
            f = mid + 1;
        }
        else if(a[mid]==search)
        {
            printf("%d found at location %d",search,mid+1);
            break;
        }
        else
        {
            l = mid - 1;
        }
        mid = (f + l)/2;
    }

    if(f>l)
        printf("Not Found ! %d is not present in the list",search);
        
    return 0;
}