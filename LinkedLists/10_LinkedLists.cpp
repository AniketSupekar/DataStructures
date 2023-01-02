#include<iostream>
using namespace std;

class node
{
    public:
    int data;
    node* next;

    node(int val) // Constructor
    {
        data=val;
        next=NULL;
    }
};

void insertATHead(node* &head, int val)
{
    node* n= new node(val);
    n->next=head;
    head=n;
}

void insertAtTail( node* &head, int val) // We are taking this head by reference not by value bcz we have to modify inked list.
{
    
    node* n= new node(val); // we got new node (n) data field contains val and next field contains NULL

    // In the case we not having node in linklist
    if ( head==NULL )
    {
        head=n; // Here n wil be first node head will be pointer on n
        return;
    }

    // Now to have to triverse to last node
    // SO we have to make iterator ( pointer )
    node* temp=head;
    while (temp->next!=NULL)
    {
        temp=temp->next;
    }
    temp->next=n;
}

void display(node* head) // We are taking head by value not by reference bcz we are not modifying linked list.
{
    node* temp=head;
    while(temp!=NULL)
    {
        cout<<temp->data<<"->";
        temp=temp->next;
    }
    cout<<"NULL"<<endl;
}

bool search(node* head,int key)
{
    node* temp=head;
    while(temp!=NULL)
    {
        if(temp->data==key)
        {
            return true;
        }
        temp=temp->next; // Here we are moving temp forward else while loop never gonna stop.
    }
}

int main()
{
    node* head = NULL; // Our linked list in empty
    insertAtTail(head,1);
    insertAtTail(head,2);
    insertAtTail(head,3);
    display(head);

    insertATHead(head,4);
    display(head);

    cout<<search(head,5);
    cout<<endl;
    cout<<search(head,3);


    return 0;

}