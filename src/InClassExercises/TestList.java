package InClassExercises;

public class TestList {

    public static void main(String[] args) {
        Node one = new Node();
        one.data = 5;

        Node two = new Node();
        two.data = 10;

        Node three = new Node();
        three.data = 15;

        two.next = three;
        one.next = two;

        two = null;
        three = null;

        Node head;
        Node tail;

        head = one;
        one = null;

        tail = head;

        while (tail.next != null) {
            tail = tail.next;
        }

        System.out.println("Head has " + head.data);
        System.out.println("Tail has " + tail.data);

        printList(head);


//        System.out.println("One has " + one.data);
//        System.out.println("Two has " + one.next.data);
//        System.out.println("Three has " + one.next.next.data);
    }
    public static void printList(Node listHead){
        Node iterator = listHead;
        while(iterator != null){
            System.out.println("" + iterator.data);
            iterator = iterator.next;
        }
    }

}


class Node {
    public int data;
    public Node next;

}