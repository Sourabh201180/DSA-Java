//WAP to impliment circular Queue

#include<stdio.h>
#include<conio.h>
#define max 5
int cq[max];
int f = 0;
int r = 0;
void insert(int item)
{
    if(r==max-1)
    {
        printf("Queue is FULL \n");
        return;
    }
    else
    {
        cq[r] = item;
        r = r+1;
    }
}
void del()
{
    if(f==r)
    {
        printf("Queue is Empty\n");
        return ;
    }
    else
    {
        printf("Element deleted from queue is : %d\n",cq[f]);
        f = f+1;
    }
}
void display()
{
    int f_pos=f,r_pos=r;
    if(f==r)
    {
        printf("Queue is empty\n");
        return;
    }
    printf("Queue elements :\n");
    if(f_pos<=r_pos)
        while(f_pos<=r_pos)
        {
            printf("%d ",cq[f_pos]);
            f_pos++;
        }
    else
    {
        while(f_pos<=max-1)
        {
            printf("\t%d",cq[f_pos]);
            f_pos++;
        }
        f_pos=0;
        while(f_pos<=r_pos)
        {
            printf("\t%d",cq[f_pos]);
            f_pos++;
        }
    }
    printf("\n");
}
int main()
{
int choice,item,i=0;
    while (i<1)
    {
        printf("\n1.Insert\n");
        printf("2.Delete\n");
        printf("3.Display\n");
        printf("4.Quit\n");
        printf("Enter your choice : ");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1 :
                printf("Input the element for insertion in queue : \n");
                scanf("%d", &item);
                insert(item);
                break;
            case 2 :
                del();
                break;
            case 3:
                display();
                break;
            case 4:
                i=1;
                printf("Wrong choice\n");
                break;
        }
    }
return 0;
}