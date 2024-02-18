// Wap to check whether the matrix is identical or not

#include<stdio.h>
#include<conio.h>

int main()
{
    int a[5][5],i,j,n,m,s=1;
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

    //////////////    Identical or not?   ///////////////
    for(i=0;i<n;i++) {
        for(j=0;j<m;j++) {
            if(i==j && a[i][j]!=1) {
                s=0;
                break;
            } else if(i!=j && a[i][j]!=0) {
                s=0;
                break;
            }
        }
    }
    if(s==1)
        printf("The given matrix is identical matrix .");
    else
        printf("The given matrix is Not identical matrix !");
    return 0;
}