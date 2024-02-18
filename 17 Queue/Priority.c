//WAP to impliment the Priority Queue

#include<stdio.h>
#include<conio.h>
#define max 5
int PQ[max];
int f = -1,r= -1;
int pri_que[max];
void insert_by_priority(int data)
{
    if(r>=max-1)
    {
        printf("\nQueue is FULL");
        return;
    }
    if((f==-1)&&(r==-1))
    {
        f++;
        r++;
        pri_que[r] = data;
        return;
    }    
    else
        check(data);
    r++;
}
void check(int data)
{
    int i,j;
    for(i=0;i<=r;i++)
    {
        if(data>=pri_que[i])
        {
            for(j=r+1;j>i;j--)
            {
                pri_que[j] = pri_que[j-1];
            }
            pri_que[i] = data;
            return;
        }
    }
    pri_que[i] = data;
}
void delete_by_priority(int data)
{
    int i;
    if((f==-1)&&(r==-1))
    {
        printf("\nQueue is empty no elements to delete");
        return;
    }
    for(i=0;i<=r;i++)
    {
        if(data==pri_que[i])
        {
            for( ;i<r;i++)
            {
                pri_que[i] = pri_que[i+1];
            }
            pri_que[i] = -99;
            r--;
            if(r==-1) 
                f = -1;
            return;
        }
    }
    printf("\n%d not found in queue to delete",data);
}
void display_pq()
{
    if((f==-1)&&(r==-1))
    {
        printf("\nQueue is empty");
        return;
    }
    for( ;f<=r;f++)
    {
        printf(" %d ",pri_que[f]);
    }
    f = 0;
}
int main()
{
    int n, choice;
    printf("\n1 - Insert an element into queue\n2 - Delete an element from queue\n3 - Display queue elements\n4 - Exit");
    while(1)
    {
        printf("\nEnter your choice : ");    
        scanf("%d",&choice);
        switch(choice)
        {
        case 1: 
            printf("\nEnter value u want to insert : ");
            scanf("%d",&n);
            insert_by_priority(n);
            break;
        case 2:
            printf("\nEnter value u want to delete : ");
            scanf("%d",&n);
            delete_by_priority(n);
            break;
        case 3: 
            display_pq();
            break;
        case 4: exit(0);
        default: printf("\nIncorrect choice! ");
        }
    }
    return 0;
}