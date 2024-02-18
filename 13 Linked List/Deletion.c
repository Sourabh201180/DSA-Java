#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

struct Node
{
    int data;
    struct Node *next;
};

void traversal(struct Node *ptr)
{
    while(ptr!=NULL)
    {
        printf("Element : %d\n",ptr->data);
        ptr = ptr->next;
    }
};

//Case1: Deleting the first element from the linked list
struct Node *deleteFirst(struct Node *head)
{
    struct Node *ptr = head;
    head = head->next;
    free(ptr);
    return head;
}

//Case2: Deleting the element at the given index from the linked list
struct Node *deleteAtIndex(struct Node *head, int index)
{
    struct Node *p = head;
    struct Node *q = head->next;
    for(int i=0; i<index-1; i++)
    {
        p = p->next;
        q = q->next;
    }
    p->next = q->next;
    free(q);
    return head;
}

//Case3: Deleting the last element from the linked list
struct Node *deleteLast(struct Node *head)
{
    struct Node *p = head;
    struct Node *q = head->next;
    while(q->next!=NULL)
    {
        p = p->next;
        q = q->next;
    }
    p->next = NULL;
    free(q);
    return head;
}

//Case4: Deleting the element with a given value from the linked list
struct Node *deleteAfterNode(struct Node *head, int value)
{
    struct Node *p = head;
    struct Node *q = head->next;
    while(q->data!=value && q->next!=NULL)
    {
        p = p->next;
        q = q->next;
    }
    if(q->data == value)
    {
        p->next = q->next;
        free(q);
    }
    return head;
}

int main()
{
    struct Node *head;
    struct Node *second;
    struct Node *third;
    struct Node *fourth;

    //Allocate memory for nodes in the linked list in heap
    head = (struct Node *)malloc(sizeof(struct Node));
    second = (struct Node *)malloc(sizeof(struct Node));
    third = (struct Node *)malloc(sizeof(struct Node));
    fourth = (struct Node *)malloc(sizeof(struct Node));

    //Link first and second nodes
    head->data = 4;
    head->next = second;

    //Link second and third nodes
    second->data = 3;
    second->next = third;

    //Terminate the list at the third node
    third->data = 8;
    third->next = fourth;

    //Terminate the list at the third node
    fourth->data = 1;
    fourth->next = NULL;

    printf("Linked List before Deletion : \n");
    traversal(head);
    
    //head = deleteFirst(head); //For Deleting First element from the linked list
    //head = deleteAtIndex(head, 2); //For Deleting the element at the given index from the linked list
    //head = deleteLast(head); //For Deleting the element at the given index from the linked list
    head = deleteAfterNode(head, 4); //For Deleting the element with a given value from the linked list
    
    printf("Linked List after Deletion : \n");
    traversal(head);

    return 0;
}