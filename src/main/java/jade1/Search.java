package jade1;

import java.util.Arrays;

public class Search {

    /**
     * Find the first occurrence of x in sorted array a.
     * @param x value to find
     * @param a array sorted in increasing order (a[0] <= a[1] <= ... <= a[n-1])
     * @return lowest i such that a[i]==x, or -1 if x not found in a.
     */
    public static int find(int x, int[] a) {
        return binarySearch(x, 0, a.length, a);
    }


    public static int binarySearch(int x, int first, int last, int[] a) {
        // TODO finish implementation of binary search method

        int mid = (last + first)/ 2;

        if (a[mid] == x) {
            return mid; // because x == a[mid], i.e. we found it!
        }
        else if ((last - first) == 1){
            return -1;
        }
        else if (x < a[mid]) {
            return binarySearch(x, first, mid, a);
        }else {
            return binarySearch(x, mid, last, a);
        }




    }

    public static void main(String[] args) {
        Search s = new Search();
        System.out.println(s.binarySearch(1, 0, 9, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));

    }

}

