package LinkedList;

public class DoublyLinkedList {

    private static DNode head = null;
    private static DNode first = new DNode(10);
    private static DNode second = new DNode(20);
    private static DNode third = new DNode(30);
    private static DNode fourth = new DNode(40);
    private static DNode fifth = new DNode(50);

    public static void createDoublyLinkedList()
    {
        head = first;
        first.setNext(second);

        second.setPrev(first);
        second.setNext(third);

        third.setPrev(second);
        third.setNext(fourth);

        fourth.setPrev(third);
        fourth.setNext(fifth);

        fifth.setPrev(fourth);
    }

    public static void printList()
    {
        if(head == null)
        {
            return;
        }
        else
        {
            DNode current = head;

            System.out.println("Forward traversal");
            while(current.getNext()!=null)
            {
                System.out.print(current.getData()+"->");
                current=current.getNext();
            }
            System.out.print(current.getData());
            System.out.println();


            System.out.println("Backward traversal");
            while(current.getPrev()!=null)
            {
                System.out.print(current.getData()+"->");
                current=current.getPrev();
            }
            System.out.print(current.getData());
            System.out.println();
        }
    }

    public static void insertionAtFront(int data)
    {
        DNode newNode = new DNode(data);

        if (head == null)
        {
            head = newNode;
        }
        else
        {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }
    }

    public static void insertionAtEnd(int data)
    {
        DNode newNode = new DNode(data);

        DNode current = head;

        if(head==null)
        {
            head=newNode;
        }
        else
        {
            while(current.getNext()!=null)
            {
                current = current.getNext();
            }

            current.setNext(newNode);
            newNode.setPrev(current);
        }
    }

    public static void insertionInMiddle(int data, int position)
    {
        DNode newNode = new DNode(data);

        DNode current = head;

        if(head==null)
        {
            head = newNode;
        }
        else if(head!=null && position == 1)
        {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }
        else if(head!=null && head.getNext()!=null && position >= 2)
        {
            for(int i=1;i<position-1;i++)
            {
                current=current.getNext();
            }

            newNode.setNext(current.getNext());
            newNode.setPrev(current);
            current.setNext(newNode);
            newNode.getNext().setPrev(newNode);
        }
    }

    public static void deletionAtFront()
    {

        if (head != null && head.getNext() == null)
        {
            head = null;
        }
        else if(head != null && head.getNext()!=null)
        {

            head=head.getNext();
            head.setPrev(null);
        }

    }

    public static void deletionAtEnd()
    {
        DNode current = head;

        if(head!=null && head.getNext()==null)
        {
            head=null;
        }
        else if(head!=null && head.getNext() != null)
        {
            while(current.getNext()!=null)
            {
                current = current.getNext();
            }

            current.getPrev().setNext(null);
            current.setPrev(null);
        }
    }

    public static void deletionInMiddle(int position)
    {
        if(head == null)
        {
            return;
        }
        else if(head!=null && head.getNext()==null && position == 1)
        {
            head = null;
        }
        else if(head!=null && head.getNext()!=null && position ==1)
        {
            head = head.getNext();
            head.getPrev().setNext(null);
            head.setPrev(null);
        }
        else if(head!=null && head.getNext()!=null && position>=2)
        {
            DNode current = head;
            for(int i=1; i<position-1;i++)
            {
                current = current.getNext();
            }
            System.out.println("Deleting data : "+current.getNext().getData());

            DNode temp = current.getNext();
            current.getNext().getNext().setPrev(current);
            current.setNext(current.getNext().getNext());

            temp.setNext(null);
            temp.setPrev(null);

        }
    }

    public static void main(String[] args) {

        createDoublyLinkedList();
        printList();
        insertionAtFront(5);
        insertionAtFront(0);
        printList();
        insertionAtEnd(60);
        insertionAtEnd(70);
        printList();
        insertionInMiddle(3,2);
        insertionInMiddle(36,7);
        printList();
        deletionAtFront();
        printList();
        deletionAtEnd();
        printList();
        deletionInMiddle(2);
        printList();
        deletionInMiddle(5);
        printList();
    }


}
