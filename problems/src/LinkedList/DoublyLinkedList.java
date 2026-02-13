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

    public static void main(String[] args) {

        createDoublyLinkedList();
        printList();


    }


}
