package LinkedList;

public class List {


    public static void main(String[] args) {

        Node ten = new Node(10);
        Node twenty = new Node (20);
        Node thirty = new Node (30);
        Node forty = new Node (40);
        Node fifty = new Node (50);

        Node head = ten;
        ten.setNext(twenty);
        twenty.setNext(thirty);
        thirty.setNext(forty);
        forty.setNext(fifty);
        fifty.setNext(null);
    }
}
