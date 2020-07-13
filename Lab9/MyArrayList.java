import java.util.*;
import java.util.Comparator;

/**
 * This class implements multiple sort algorithms to be used with ints, chars, and Stings.
 * Bubble sort, Selection sort, and Insertion sorts are implemented here
 * 
 * @author (your name) 
 * @version (CSSSKL 143)
 */
 
public class MyArrayList {

    protected int[] IntList;
    protected char[] CharList;
    protected String[] StringList;

    // constructor will build all 3 arrays here
    public MyArrayList() {
        this.IntList = new int[10];
        this.CharList = new char[10];
        this.StringList = new String[5];

        // fill all 3 arrays with data
        for (int i = 0; i < IntList.length; i++) {
            IntList[i] = (int) (Math.random() * 52);
        }

        // Populate char array
        for (int i = 0; i < CharList.length; i++) {

            Random random = new Random();
            CharList[i] = (char) (random.nextInt(26) + 'a');
        }

        // Populate String array
        StringList[0] = "joe";
        StringList[1] = "mark";
        StringList[2] = "abbey";
        StringList[3] = "tony";
        StringList[4] = "kevin";
    }

    public int compareTo(MyArrayList other) {
        // your code here
        System.out.println("compareTo() is returning -1, array[0] < other[0]");


        // your code here
        System.out.println("compareTo() is returning 1, array[0] > other[0]");



        System.out.println("compareTo() is returning 0, array[0] != other[0] ");
        // return a value here
        return 0;

    }


    public void swap(int[] data, int idx1, int idx2) {
        int temp = data[idx1];
        data[idx1] = data[idx2];
        data[idx2] = temp;
    }

    public void swap(char[] data, int idx1, int idx2) {
        char temp = data[idx1];
        data[idx1] = data[idx2];
        data[idx2] = temp;
    }

    public void swap(String[] data, int idx1, int idx2) {
        String temp = data[idx1];
        data[idx1] = data[idx2];
        data[idx2] = temp;
    }

    public void intBubbleSort() {
        int n = IntList.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (IntList[j] > IntList[j + 1]) {
                    // swap arr[j+1] and arr[i]
                    swap(IntList, j, j+1);
                }
            }
        }
        // Implement your sort, call a helper swap method
    }


    public void CharBubbleSort() {
        int n = CharList.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (CharList[j] > CharList[j + 1]) {
                    // swap arr[j+1] and arr[i]
                    swap(CharList, j, j+1);
                }
            }
        }
        // Implement your sort, call a helper swap method

    }

    public void stringBubbleSort() {
        int n = StringList.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (StringList[j].length() > StringList[j + 1].length()) {
                    // swap arr[j+1] and arr[i]
                    swap(StringList, j, j+1);
                }
            }
        }
        // Implement your sort, call a helper swap method
    }

/*
    public void swapInts(int[] intList, int j) {
       // code for swapping ints
    }

    public void swapChars(char[] charList, int j) {
        // code for swapping chars
    }

    public void swapStrings(String[] stringList, int j) {
        // code for swapping Strings
    }*/

    //selection sort for ints
    public void selectionSort() {
        int n = IntList.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (IntList[j] < IntList[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = IntList[min_idx];
            IntList[min_idx] = IntList[i];
            IntList[i] = temp;
        }
        // Implement your sort, call swapSelection(int[] intList, int i, int nextMin)
    }

    //selection sort for Strings
    public void stringSelectionSort() {
        int n = StringList.length;

        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (StringList[j].length() < StringList[min_idx].length())
                    min_idx = j;
            String temp = StringList[min_idx];
            StringList[min_idx] = StringList[i];
            StringList[i] = temp;
        }

        // Implement your sort, call swapSelectionStrings(String[] StringList, int i)
        // and findSmallest(IntList, i, IntList.length) from your method
    }

   /* public void swapSelection(int[] intList, int i, int nextMin) {
        // Your code here to swap int values
    }

    public void swapSelectionStrings(String[] StringList, int i) {
         // Your code here to swap values
    }

    */

    public int findSmallest(int[] arr, int begin, int end) {
        //returns the index of the smallest element
        int minIndex = begin;       //hint
        for(int i = begin; i < end ; i++) {
            if(arr[begin - 1] < arr[begin]) {
                minIndex = begin;
            } else
                minIndex = begin - 1;
        }
        return minIndex;
    }

    //Insertion Sort
    public void insertionSort() {
        int n = IntList.length;
        for (int i = 1; i < n; ++i) {
            int key = IntList[i];
            int j = i - 1;
            while (j >= 0 && IntList[j] > key) {
                IntList[j + 1] = IntList[j];
                j = j - 1;
            }
            IntList[j + 1] = key;
        }
    }
} 

    

