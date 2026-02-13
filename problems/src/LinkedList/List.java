package LinkedList;

public class List {

    private static Node head = null;
    private static Node ten = new Node(10);
    private static Node twenty = new Node (20);
    private static Node thirty = new Node (30);
    private static Node forty = new Node (40);
    private static Node fifty = new Node (50);

    public static Node createList()
    {
        head = ten;
        ten.setNext(twenty);
        twenty.setNext(thirty);
        thirty.setNext(forty);
        forty.setNext(fifty);
        fifty.setNext(null);
        return head;
    }

    public static void printList(Node head)
    {
        Node current = head;
        while(current.getNext()!=null)
        {
            System.out.print(current.getData()+"->");
            current = current.getNext();
        }

        System.out.print(current.getData());

    }
    public static void main(String[] args) {

        Node head = createList();
        printList(head);



    }
}
