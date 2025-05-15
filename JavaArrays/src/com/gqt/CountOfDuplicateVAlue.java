package com.gqt;

public class CountOfDuplicateVAlue{

    public static void main(String[] args) {
        int[] a = {2, 4, 5, 2, 5, 7, 8, 8, 9};
        boolean[] visited = new boolean[a.length]; // default is false

        System.out.println("Duplicate values and their counts:");

        for (int i = 0; i < a.length; i++) {
            if (visited[i]) {
                continue; // Skip already counted elements
            }

            int count = 1;

            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                    visited[j] = true; // Mark as counted
                }
            }

            if (count > 1) {
                System.out.println(a[i] + " → " + count + " times");
            }
        }
    }
}
