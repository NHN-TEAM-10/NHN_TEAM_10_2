package gun.genericProgramming;

import java.util.stream.Collectors.*;

import java.util.*;
import java.util.stream.Collectors;

public class test<T, S> {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(4, 3);
        System.out.println(list1);

        LinkedList<Integer> list2 = new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            list2.add(i);
        }
        list2.pop();
        list2.push(2);
        list2.push(3);
        list2.push(5);
        System.out.println(list2);

        ListIterator<Integer> iter = list2.listIterator();
        while (iter.hasNext()) {
            int i = iter.next();
            System.out.print(i + " ");
        }
        System.out.println();
        TreeSet<Integer> set = new TreeSet<>();
        set.addAll(list2);

        System.out.println(set);

        PriorityQueue pq = new PriorityQueue<>();
        pq.addAll(list2);
        while (!pq.isEmpty()) {
            System.out.print(pq.remove() + " ");
        }
        System.out.println();

        Map<String, String> directory = new TreeMap<>();
        directory.put("Alice", "25");
        directory.put("Bob", "30");
        directory.put("Carol", "28");

        int aliceAge = Integer.parseInt(directory.get("Alice"));

        System.out.println(aliceAge);

        Set<String> keys = directory.keySet();
        for (String key : keys) {
            int value = Integer.parseInt(directory.get(key));
            System.out.println(key + ": " + value);
        }
        HashMap<String, String> hashMap = new HashMap<>();

        HashMap<String, Double> symbolTable = new HashMap<>();

        //TreeMap<String, TreeSet<Integer>> index = new TreeMap<>();
        TreeMap<String, TreeSet<Integer>> index = new TreeMap<>((a, b) -> a.compareToIgnoreCase(b));
        int listSum = list1.stream().mapToInt(Integer::intValue).sum();
        System.out.println(listSum);

        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape");
//        List<String> answer = words.stream().filter(w -> w.length() > 5).toList();
//        List<String> answer = words.stream().filter(w -> w.length() > 5).collect(Collectors.toList());
//        System.out.println(answer);
        List<Integer> numbers = Arrays.asList(3, 7, 1, 8, 4, 9, 11, 2, 6, 5);
        List<Integer> newNumbers = numbers.stream().filter(n ->n%2==0).collect(Collectors.toList());
        System.out.println("sort");
        int q = newNumbers.stream().mapToInt(n -> n*n).boxed().sorted((a, b) -> b - a).findFirst().get();
        System.out.println(q);
    }

}
