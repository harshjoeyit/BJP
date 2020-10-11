
import java.lang.*;
import java.util.*;

class Solution {
      public static void main(String[] args) {
            HashMap<Integer, String> hmap = new HashMap<Integer, String>();
            hmap.put(3, "Mango");
            hmap.put(2, "Orange");
            hmap.put(2, "Custord");
            hmap.put(1, "Zeith");

            for (Map.Entry e : hmap.entrySet()) {
                  System.out.println(e.getKey() + " " + e.getValue());
            }

            TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();

            HashSet<String> set = new HashSet<String>();
            set.add("Ravi");
            set.add("Vijay");
            set.add("Ravi");
            set.add("Ajay");

            for (String s : set) {
                  System.out.println(s);
            }

            System.out.println(set.contains("Ajay"));

            TreeSet<String> tset = new TreeSet<String>();

            Queue<Integer> q = new LinkedList<Integer>();
            q.add(10);
            q.add(34);

            while (q.size() > 0) {
                  System.out.println(q.peek());
                  q.remove();
            }

            Stack<Integer> st = new Stack<>();
            st.push(19);
            st.push(23);

            while (st.size() > 0) {
                  System.out.println(st.peek());
                  st.pop();
            }

            int arr[][] = new int[3][3];

            arr[0][0] = 1;
            arr[0][1] = 2;
            arr[0][2] = 3;
            arr[1][0] = 4;
            arr[1][1] = 5;
            arr[1][2] = 6;
            arr[2][0] = 7;
            arr[2][1] = 8;
            arr[2][2] = 9;

            for (int i = 0; i < 3; i++) {
                  for (int j = 0; j < 3; j++) {
                        System.out.print(arr[i][j] + " ");
                  }
            }
      }
}