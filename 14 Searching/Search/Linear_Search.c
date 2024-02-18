//WAP to Impliment Linear Search

#include<stdio.h>
#include<conio.h>
#define max 5
int main()
{
    int a[max],i,n,loc=0,search;
    printf("Enter the no. of elements u want in an array : ");
    scanf("%d",&n);
    printf("\nEnter the Elements of array :\n");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    printf("\nEnter element to be searched : ");
    scanf("%d",&search);
    for(i=0;i<n;i++)
    {
        if(a[i]==search)
        {
            loc=i+1;
            break;
        }
    }
    if(loc>0)
        printf("Search Successfull, Item found at %d position",loc);
    else
        printf("Search unsuccessfull, Item not Found !");
    return 0;
}