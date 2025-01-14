package sortingsearchphamanth;

import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger; 

/*
* @author Anthony Pham
*/

public class SortingSearchPhamAnth {

    // @param args for command line argument
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }



    // function used to read and print the file
    private static ArrayList<String> readUsers() {
        File fileOfUsers = new File("users.txt");
        ArrayList<String> users = new ArrayList<>();

        try {
            Scanner input = new Scanner(fileOfUsers);
            while(input.hasNextLine()) {
                users.add(input.nextLine());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SortingSeachPhamAnth.class.getName()).log(Level.SEVERE, null, ex);
        }

        return users;
    }

    // Selection Sort: A sorting method.
    // Runtime is O(n^2) time
    // @param list of users
    // returns the list organized
    private static ArrayList<String> selectionSort(ArrayList<String> list) {

        for(int i = 0; i < list.size()-1; i++) {
            int min = i;
            for(int j = i+1; j < list.size(); j++) {
                if(list.get(i).compareTo(list.get(j)) > 0) min = j; 
            }

            String temp = list.get(i);
            list.set(i) = list.get(j);
            list.set(j) = temp;
        }
        return list;
    } 

    private static ArrayList<String> insertionSort(ArrayList<String> list) {
        return null; 
    }

    private static ArrayList<String> bubbleSort(ArrayList<String> list) {
        return null;
    }

    private static ArrayList<String> mergeSort(ArrayList<String> list) {
        return null;
    }

    private static ArrayList<String> quickSort(ArrayList<String> list) {
        return null;
    }


    // Binary Search. Function used to search for a user in a list of users. 
    // running time of O(logn)
    // @param user we're searching for
    // @param list of users
    // return index of user if found, else -1
    private static int binarySearch(String user, ArrayList<String> list) {
        int start = 0;
        int end = list.size();

        while(start < end) {
            int mid = (end + start) / 2;
            if(list.get(mid).compareTo(user) == 0) return int;
            else if(list.get(mid).compareTo(user) < 0) start = mid+1;
            else if(list.get(mid.compareTo(user) > 0)) end = mid-1;
        }
        return -1; 
    }
}


