package LinkedList;

public class List {

    private static Node head = null;
    private static Node ten = new Node(10);
    private static Node twenty = new Node (20);
    private static Node thirty = new Node (30);
    private static Node forty = new Node (40);
    private static Node fifty = new Node (50);

    public static void createStaticList()
    {
        head = ten;
        ten.setNext(twenty);
        twenty.setNext(thirty);
        thirty.setNext(forty);
        forty.setNext(fifty);
        fifty.setNext(null);
    }

    public static void printList()
    {
        Node current = head;
        while(current.getNext()!=null)
        {
            System.out.print(current.getData()+"->");
            current = current.getNext();
        }

        System.out.print(current.getData());
        System.out.println();

    }

    public static void insertNodeAtFront(int data)
    {
        Node newNode = new Node(data);
        newNode.setNext(null);

        if(head == null)
        {
            head = newNode;
        }
        else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    public static void insertNodeInMiddle(int data, int position)
    {
        Node current = head;
        Node newNode = new Node(data);
        newNode.setNext(null);

        for(int i=1; i<position-1; i++)
        {
            current = current.getNext();
        }

        newNode.setNext(current.getNext());
        current.setNext(newNode);

    }

    public static void insertNodeAtEnd(int data)
    {
        Node current = head;
        Node newNode = new Node(data);
        newNode.setNext(null);

        while(current.getNext()!=null)
        {
            current=current.getNext();
        }

        current.setNext(newNode);
    }

    public static void deleteNodeAtFront()
    {
        if(head!=null)
        {
            System.out.println("Deleting data : "+head.getData());
            head = head.getNext();

        }
    }


    public static void main(String[] args) {

        createStaticList();
        printList();
        insertNodeAtFront(5);
        printList();
        insertNodeInMiddle(25,4);
        insertNodeInMiddle(45,7);
        printList();
        insertNodeAtEnd(60);
        printList();
        insertNodeAtEnd(100);
        printList();
        deleteNodeAtFront();
        printList();
    }
}
