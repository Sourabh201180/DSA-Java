//WAP to Impliment DQueue

#include<stdio.h>
#include<conio.h>
#define max 5
int DQ[max];
int f = -1;
int r = -1;
void insert_right()
{
	int added_item;
	if((f==0&&r==max-1)||(f==r+1))
	{	
        printf("Queue is FULL\n");
		return;
    }
	if(f==-1)  /* if queue is initially empty */
	{	
        f = 0;
		r = 0;
    }
	else
	if(r==max-1)  /*right is at last position of queue */
		r = 0;
	else
		r = r+1;
	printf("Input the element for adding in queue : ");
	scanf("%d",&added_item);
	DQ[r] = added_item ;
}
void insert_left()
{	
	int added_item;
	if((f==0&&r==max-1)||(f==r+1))
	{
        printf("Queue Overflow \n");
		return;	 
    }
	if(f==-1)/*If queue is initially empty*/
	{	
		f = 0;
		r = 0;	 
	}
	else
	if(f==0)
		f = max-1;
	else
		f = f-1;
	printf("Input the element for adding in queue : ");
	scanf("%d",&added_item);
	DQ[f] = added_item ;	 
}
void delete_left()
{	
	if(f==-1)
	{	
		printf("Queue Underflow\n");
		return ;	
	}
	printf("Element deleted from queue is : %d\n",DQ[f]);
	if(f==r) /*Queue has only one element */
	{	
		f = -1;
		r = -1;	 
	}
	else
		if(f==max-1)
			f = 0;
		else
			f = f+1;
}
void delete_right()
{
	if(f==-1)
	{
		printf("Queue Underflow\n");
		return ;	 
	}
	printf("Element deleted from queue is : %d\n",DQ[r]);
	if(f==r) /*queue has only one element*/
	{	
		f = -1;
		r = -1;	 
	}
	else
		if(r==0)
			r = max-1;
		else
			r = r-1;	
}
void display_queue()
{	
	int front_pos=f,rear_pos=r;
	if(f==-1)
	{	
		printf("Queue is empty\n");
		return;	 
	}
	printf("Queue elements :\n");
	if(front_pos<=rear_pos)
	{	
		while(front_pos<=rear_pos)
		{	
			printf("%d ",DQ[front_pos]);
			front_pos++;	
		}	
	}
	else
	{	
		while(front_pos<=max-1)
		{	
			printf("%d ",DQ[front_pos]);
			front_pos++;	
		}
		front_pos = 0;
		while(front_pos<=rear_pos)
		{	
			printf("%d ",DQ[front_pos]);
			front_pos++;
		}
	}
	printf("\n");
}
void input_que()
{	
	int choice;
	do
	{	printf("1.Insert at right\n");
		printf("2.Delete from left\n");
		printf("3.Delete from right\n");
		printf("4.Display\n");
		printf("5.Quit\n");
		printf("Enter your choice : ");
		scanf("%d",&choice);
        switch(choice)
		{	
			case 1:
				insert_right();
				break;
			case 2:
				delete_left();
				break;
			case 3:
				delete_right();
				break;
			case 4:
				display_queue();
				break;
			case 5:
				break;
			default:
				printf("Wrong choice\n");
		}
	}
	while(choice!=5);
}
void output_que()
{	
    int choice;
	do
	{	printf("1.Insert at right\n");
		printf("2.Insert at left\n");
		printf("3.Delete from left\n");
		printf("4.Display\n");
		printf("5.Quit\n");
		printf("Enter your choice : ");
		scanf("%d",&choice);
		switch(choice)
		{
			case 1:
				insert_right();
				break;
			case 2:
				insert_left();
				break;
			case 3:
				delete_left();
				break;
			case 4:
				display_queue();
				break;
			case 5:
				break;
			default:
				printf("Wrong choice\n");
		}
	}
	while(choice!=5);
}
int main()
{	
	int choice;
	printf("1.Input restricted dequeue\n");
	printf("2.Output restricted dequeue\n");
	printf("Enter your choice : ");
	scanf("%d",&choice);
	switch(choice)
	{
	case 1 :
		input_que();
		break;
	case 2:
		output_que();
		break;
	default:
		printf("Wrong choice\n");
	}
    return 0;
}