//Wap to find the multiplication of two matrix

#include<stdio.h>
#include<conio.h>
int main()
{abcdejoyti
    int a[5][5],b[5][5],multi[5][5],i,j,k,n,m;
    //1st matrix
    printf("Enter the no of element u want in your array(row) : ");
    scanf("%d",&n);
    printf("Enter the no of element u want in your array(column) : ");
    scanf("%d",&m);
    printf("Enter %d*%d the elements of 2D (1st) array :\n",n,m);
    for(i=0;i<n;i++)
    {
        for(j=0;j<m;j++)
        {
            printf("a[%d][%d] = ",i,j);
            scanf("%d",&a[i][j]);
        }
    }
    //2nd matrix
    printf("Enter %d*%d the elements of 2D (2nd) array :\n",n,m);
    for(i=0;i<n;i++)
    {
        for(j=0;j<m;j++)
        {
            printf("a[%d][%d] = ",i,j);
            scanf("%d",&b[i][j]);
        }
    }
    //display elements
    printf("\nElement of (1st) array are :\n");
    for(i=0;i<n;i++)
    {
        for(j=0;j<m;j++)
        {
            printf("\t%d",a[i][j]);
        }
        printf("\n");
    }
    printf("Element of (2nd) array are :\n");
    for(i=0;i<n;i++)
    {
        for(j=0;j<m;j++)
        {
            printf("\t%d",b[i][j]);
        }
        printf("\n");
    }

    ///////////////////          Multiplication
    for(i=0;i<n;i++)
    {
        for(j=0;j<m;j++)
        {
            multi[i][j] = 0;
            for(k=0;k<n;k++)
            {
                multi[i][j] = multi[i][j] + a[i][k]*b[k][j];
            }
        }
    }
    printf("\nThe Multiplication of two matrix is :\n");
    for(i=0;i<n;i++)
    {
        for(j=0;j<m;j++)
        {
            printf("\t%d",multi[i][j]);
        }
        printf("\n");
    }
    return 0;   
}