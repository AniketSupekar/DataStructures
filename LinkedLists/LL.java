class LL 
{
    Node head;
    private int size;

    LL() //Constructor to count size
    {
        this.size = 0;
    }

    class Node 
    {
        String data;
        Node next;

        Node (String data)
        {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data)
    {
        Node newNode= new Node(data);
        if ( head == null )
        {
            newNode= head;
            return;
        }

        Node temp= head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next = newNode;
    }

    public void deleteFirst()
    {
        if ( head==null )
        {
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast()
    {
        if ( head==null )
        {
            System.out.println("The list is empty");   
            return;
        }

        size--;

        if ( head.next == null) // This is corner case when head.next is null
        {
            head = null;
            return;
        }

        Node SecondLast = head;
        Node last = head.next;
        while(last.next!=null)
        {
            last = last.next;
            SecondLast = SecondLast.next;
        }

        SecondLast.next=null;
    }

    public void display()
    {
        if ( head == null)
        {
            System.out.println("The list is empty !");
        }

        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }

    public int getSize()
    {
        return size;
    }

    public static void main(String args[])
    {
        practice list = new practice();
        list.addFirst("is");
        list.addFirst("This");
        list.addLast("list");
        list.display();

        list.deleteFirst();
        list.display();
       
        System.out.println(list.getSize());

    }
}