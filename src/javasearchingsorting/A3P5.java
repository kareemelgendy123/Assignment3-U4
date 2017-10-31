package javasearchingsorting;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kareem
 */
public class A3P5 {
    
    // Method that swaps two numbers
    public void swap(String[] array, int p1, int p2){
        String temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }   

    // Insertion sort method that alphebetically organizes an array
    public void insertionSort(String[] array) {
        
        // For loop that goes through the array
        for (int i = 0; i < array.length - 1; i++) {
            // Holds position
            int position = i;
            
            // Comparing the words
            while (position >= 0 && array[position].compareTo(array[position + 1]) > 0) {
                // Swapping the words 
                swap(array, position, position + 1);
                // Going to the next word
                position--;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        // Creating an object to run methods
        A3P5 test = new A3P5();

        // Creating an aray
        String array[] = {"lizard", "hamster", "dog", "cat"};

        // The array before it's sorted
        System.out.println("Before:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        // Running the array through the insertionSort method
        test.insertionSort(array);

        System.out.println("");
        
        // The array after it's sorted
        System.out.println("After:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}