
import java.util.*;

class Test {
      public static void main(String[] args) {

            /* 
                  List (interface)
                   |
                ArrayList (class)
            */

            List<Integer> list = new ArrayList<>();
            list.add(4);
            list.add(2);
            list.add(8);
            System.out.println(list);

            List<Integer> list2 = new ArrayList<>(list);
            list2.addAll(list);            
            list2.set(2, -1);
            System.out.println(list2);

            ListIterator<Integer> it = listIterator();
            System.out.println(it.nextIndex());

            // .... 
            
            // iList also provides a richer iterator, called a ListIterator,
            //  which allows you to traverse the list in either direction, 
            // modify the list during iteration, and obtain the current position
            //  of the iterator.

            // sort — sorts a List using a merge sort algorithm, which provides a fast, stable sort
      }
}