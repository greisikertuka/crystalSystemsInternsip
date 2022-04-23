package Detyra1;

import java.util.Scanner;

public class U2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Jep nr  elementeve te Arrays se int:");
        int n = scn.nextInt();
        int[] v = new int[n];
        System.out.println("Jepni elementet:");
        for (int i = 0; i < n; i++) {
            v[i] = scn.nextInt();
        }
        mergeSort(v, v.length);
        System.out.println("Renditja pas Merge Sort:");
        for (int i = 0; i < n; i++) {
            System.out.println(v[i]);
        }

        scn.close();
    }

    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(
            int[] a, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}

