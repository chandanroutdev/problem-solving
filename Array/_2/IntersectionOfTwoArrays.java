package Array._2;

import java.util.*;

class IntersectionOfTwoArrays {
    public static void intersection(int arr1[], int arr2[]) {
        Set<Integer> set1 = new HashSet<Integer>();
        for (int num : arr1) {
            set1.add(num);
        }
        Set<Integer> set2 = new HashSet<Integer>();
        for (int num : arr2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }
        System.out.println("Intersection of two array : ");
        for (int num : set2) {
            System.out.print(num + " ");
        }
    }

    public static void main(String args[]) {
        int arr1[] = { 2, 4, 1, 8, 3, 7, 9 };
        int arr2[] = { 5, 4, 3, 7, 1, 9, 7 };
        intersection(arr1, arr2);
    }
}

// credit: https://youtu.be/Wo7dbhMEw0o
// practice: https://leetcode.com/problems/intersection-of-two-arrays/