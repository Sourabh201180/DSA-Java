//WAP to input the elements of an array from the user (Dynamic Array)

#include<stdio.h>
#include<conio.h>

int main()
{
    int a[10], i, n;

    printf("Enter the no. of elements u want in an array : ");
    scanf("%d", &n);

    printf("\nEnter the Elements of array :\n");
    for(i=0; i<n; i++)
    {
        scanf("%d", &a[i]);
    }

    return 0;
}