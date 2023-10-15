package gun.genericProgramming;

import java.util.ArrayList;
import java.util.LinkedList;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(4,3);
        System.out.println(list1);

        LinkedList<Integer> list2 = new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            list2.add(i);
        }
        list2.pop();
        list2.push(2);
        System.out.println(list2);
    }
}
