package javaPackage;

 import java.util.HashSet;
 import java.util.Set;
 
public class ArrayMatching {
    public static void main(String[] args) {
        int[] array1 = {8, 3, 0, 4, 2, 6};
        int[] array2 = {7, 6, 3, 8, 5, 1, 4, 0, 9};

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i : array1) {
            set1.add(i);
        }
        for (int i : array2) {
            set2.add(i);
        }

        Set<Integer> matched = new HashSet<>(set1);
        matched.retainAll(set2);

        Set<Integer> unmatched1 = new HashSet<>(set1);
        unmatched1.removeAll(set2);

        Set<Integer> unmatched2 = new HashSet<>(set2);
        unmatched2.removeAll(set1);

        System.out.println("Matched elements: " + matched);
        System.out.println("Unmatched elements in array1: " + unmatched1);
        System.out.println("Unmatched elements in array2: " + unmatched2);
    }
}