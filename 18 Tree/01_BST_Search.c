#include<stdio.h>
#include<conio.h>

#define max 100

struct nodetree
{       
    int info;
    int left;
    int right;
};
struct nodetree node[max];

struct nodetree
{
    int info;
    struct nodetree *left,*right;
}tree;
struct nodetree *p;

int main()
{
    int x;
    struct tree *p;
    {
        p = root;
        while(p!=NULL && p->info!=x)
        {
            if(p->info > x)
                p = p->left;
            else
                p = p->right;
        }
        return p;
    }

    return 0;
}