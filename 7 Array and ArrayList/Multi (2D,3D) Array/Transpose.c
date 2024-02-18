//Wap to find the transpose of a matrix

#include<stdio.h>
#include<conio.h>
int main()
{
    int a[5][5],b[5][5],i,j,n,m;
    printf("Enter the no of element u want in your array(row) : ");
    scanf("%d",&n);
    printf("Enter the no of element u want in your array(column) : ");
    scanf("%d",&m);
    printf("Enter %d*%d the elements of 2D array :\n",n,m);
    for(i=0;i<n;i++)
    {
        for(j=0;j<m;j++)
        {
            printf("a[%d][%d] = ",i,j);
            scanf("%d",&a[i][j]);
        }
    }
    printf("Element of array are :\n");
    for(i=0;i<n;i++)
    {
        for(j=0;j<m;j++)
        {
            printf("\t%d",a[i][j]);
        }
        printf("\n");
    }
    
    //transpose
    printf("The Transpose of a matrix is : \n");
    for(i=0;i<n;i++)
    {
        for(j=0;j<m;j++)
        {
            b[i][j] = a[j][i];
            printf("\t%d", b[i][j]);
        }
        printf("\n");
    }
    return 0;
}