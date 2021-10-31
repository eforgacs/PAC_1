package Labs.linked_lists;

import java.util.ArrayList;
import java.util.List;

public class LLHomeworkFunctions {

    public static void main(String[] args) {
        ListNode<Integer> list1;
        ListNode<Integer> one;
        ListNode<Integer> two;
        ListNode<Integer> three = new ListNode<>(5, null);

        two = new ListNode<>(4, three);
        one = new ListNode<>(2, two);
        list1 = one;

        one = null;
        two = null;
        three = null;


        ListNode<Integer> list2;
        // ListNode<Integer> one2;


        one = new ListNode<>(2, two);

        two = new ListNode<>(5, one);
        one.setNext(two);

        list2 = one;

        one = null;
        two = null;


        ListNode<Integer> list3;
        ListNode<Integer> four = new ListNode<>(1, null);

        three = new ListNode<>(5, four);
        two = new ListNode<>(4, three);
        one = new ListNode<>(2, two);

        list3 = one;

        one = null;
        two = null;
        three = null;
        four = null;


        ListNode<Integer> list4;

        three = new ListNode<>(5, null);

        two = new ListNode<>(4, three);
        one = new ListNode<>(2, two);
        list4 = one;

        one = null;
        two = null;
        three = null;

        System.out.println("--------------- Equality of Linked Lists ---------------");

        System.out.println("List 1: ");
        if (terminates(list1))
            printList(list1);

        System.out.println("List 2: ");
        if (terminates(list2))
            printList(list2);
        else
            System.out.println("2->4->5->... Points back to the previous node.");

        System.out.println("List 3: ");
        if (terminates(list3))
            printList(list3);

        System.out.println("List 4: ");
        if (terminates(list4))
            printList(list4);

        System.out.println("Does list 1 equal list 2? ");
        System.out.println(equalLists(list1, list2));

        System.out.println("Does list 1 equal list 3? ");
        System.out.println(equalLists(list1, list3));

        System.out.println("Does list 1 equal list 4? ");
        System.out.println(equalLists(list1, list4));

        System.out.println("--------------- Checking if a list is recursive ---------------");

        System.out.println("Does List1 terminate? " + terminates(list1));
        System.out.println("Does List2 terminate? " + terminates(list2));
        System.out.println("Does List3 terminate? " + terminates(list3));
        System.out.println("Does List4 terminate? " + terminates(list4));


        System.out.println("--------------- Implementing a Max-Stack ---------------");

        Max<Integer> maximizer = new Max<>(0);

        SlowMaxStack<Integer> slowStack = new SlowMaxStack<>(maximizer);
        FastMaxStack<Integer> fastStack = new FastMaxStack<>();

        System.out.println("Both stacks are empty.");

        System.out.println("Pushing element");
        slowStack.push(3);
        fastStack.push(3);

        System.out.println("Stack from bottom to top: 3 ");
        System.out.println("Maximum so far with SlowMaxStack: " + slowStack.getMaxSoFar());
        System.out.println("Maximum so far with FastMaxStack: " + fastStack.getMaxSoFar());

        System.out.println("Pushing element");
        slowStack.push(5);
        fastStack.push(5);

        System.out.println("Stack from bottom to top: 3 5");
        System.out.println("Maximum so far with SlowMaxStack: " + slowStack.getMaxSoFar());
        System.out.println("Maximum so far with FastMaxStack: " + fastStack.getMaxSoFar());

        Integer valuePoppedSl = slowStack.pop();
        Integer valuePoppedFt = fastStack.pop();

        System.out.println("The value " + valuePoppedSl + " has been popped off of the slowStack");
        System.out.println("The value " + valuePoppedFt + " has been popped off of the fastStack");

        System.out.println("Current Stack: 3 ");

        System.out.println("Pushing element");
        slowStack.push(1);
        fastStack.push(1);

        System.out.println("Stack from bottom to top: 3 1");
        System.out.println("Maximum so far with SlowMaxStack: " + slowStack.getMaxSoFar());
        System.out.println("Maximum so far with FastMaxStack: " + fastStack.getMaxSoFar());

        System.out.println("Pushing element");
        slowStack.push(4);
        fastStack.push(4);

        System.out.println("Stack from bottom to top: 3 1 4");
        System.out.println("Maximum so far with SlowMaxStack: " + slowStack.getMaxSoFar());
        System.out.println("Maximum so far with FastMaxStack: " + fastStack.getMaxSoFar());

        System.out.println("Pushing element");
        slowStack.push(2);
        fastStack.push(2);


        System.out.println("Stack from bottom to top: 3 1 4 2");
        System.out.println("Maximum so far with SlowMaxStack: " + slowStack.getMaxSoFar());
        System.out.println("Maximum so far with FastMaxStack: " + fastStack.getMaxSoFar());

        valuePoppedSl = slowStack.pop();
        valuePoppedFt = fastStack.pop();

        System.out.println("The value " + valuePoppedSl + " has been popped off of the slowStack");
        System.out.println("The value " + valuePoppedFt + " has been popped off of the fastStack");

        System.out.println("Stack from bottom to top: 3 1 4");
        System.out.println("Maximum so far with SlowMaxStack: " + slowStack.getMaxSoFar());
        System.out.println("Maximum so far with FastMaxStack: " + fastStack.getMaxSoFar());

        valuePoppedSl = slowStack.pop();
        valuePoppedFt = fastStack.pop();

        System.out.println("The value " + valuePoppedSl + " has been popped off of the slowStack");
        System.out.println("The value " + valuePoppedFt + " has been popped off of the fastStack");

        System.out.println("Stack from bottom to top: 3 1");
        System.out.println("Maximum so far with SlowMaxStack: " + slowStack.getMaxSoFar());
        System.out.println("Maximum so far with FastMaxStack: " + fastStack.getMaxSoFar());

        // More testing:
        //        Max<Integer> maximizer = new Max<>(0);
    //
    //        SlowMaxStack<Integer> slowStack = new SlowMaxStack<>(maximizer);
    //        FastMaxStack<Integer> fastStack = new FastMaxStack<>();
    //        for (int i = 0; i <= 9; i++) {
    //            slowStack.push(5);
    //            fastStack.push(5);
    //        }
    //        slowStack.push(10);
    //        fastStack.push(10);

    //        do {
    //            System.out.println(slowStack.getMaxSoFar());
    //            System.out.println(fastStack.getMaxSoFar());
    //            slowStack.pop();
    //            fastStack.pop();
    //        } while (!slowStack.isEmpty());

        System.out.println("--------------- End of the program ---------------");
        System.exit(0);
    }

    /**
     * @param <T>
     * @param list1
     * @param list2
     * @return true if the lists are equal.  Assume both lists terminate.
     */
    public static <T extends Comparable<? super T>> boolean equalLists(ListNode<T> list1, ListNode<T> list2) {


        while (list1 != null && list2 != null) {

            T value1 = list1.getValue();
            T value2 = list2.getValue();

            if (value1.compareTo(value2) != 0) {
                return false;
            }

            list1 = list1.getNext();
            list2 = list2.getNext();
        }


        return list1 == null && list2 == null;
    }

    /**
     * @param <T>
     * @param list list to check for loop
     * @return true if the list eventually terminates, and false if the list points back at one of its
     * previous nodes.
     */
    public static <T> boolean terminates(ListNode<T> list) {

        List<ListNode<T>> seenNodes = new ArrayList<>();


        while (list != null) {

            if (!seenNodes.contains(list))
                seenNodes.add(list);
            else
                return false;

            list = list.getNext();
        }

        return true;
    }


    public static <T> void printList(ListNode<T> n) {

        while (n != null) {
            System.out.print(n.getValue() + "->");
            n = n.getNext();
        }
        System.out.println("NULL");
    }


}


class Max<T extends Comparable<? super T>> implements Maximizer<T> {

    T globalMin;

    Max(T globalMin) {
        this.globalMin = globalMin;
    }

    @Override
    public T getMax(T t1, T t2) {
        if (t1.compareTo(t2) >= 0)
            return t1;
        else
            return t2;
    }

    @Override
    public T getGlobalMin() {
        return this.globalMin;
    }


}