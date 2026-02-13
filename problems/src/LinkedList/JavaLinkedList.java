package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class JavaLinkedList {
    private static LinkedList<Integer> ll = new LinkedList<>();

    public static void createList()
    {
        for(int i=0;i<=100;i+=10)
        {
            ll.add(i);
        }

    }

    public static void insertInList(int position, int data)
    {
        ll.add(position,data);
    }

    public static void iterateList()
    {
        Iterator<Integer> it = ll.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        System.out.println();
    }

    public static void iterateReverseList()
    {
        Iterator<Integer> it = ll.descendingIterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        System.out.println();
    }

    public static boolean presentInList(int element)
    {
        return ll.contains(element);
    }

    public static void main(String[] args) {

        createList();
        iterateList();
        insertInList(1,5);
        insertInList(3,15);
        insertInList(ll.toArray().length,1000);
        iterateList();
        System.out.println(presentInList(45));
        System.out.println(presentInList(80));
        iterateReverseList();


    }
}
