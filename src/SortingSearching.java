
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kareem
 */
public class SortingSearching {
    
    // Method that swaps two numbers
    public void swap(int[] array, int p1, int p2){
        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }
    
    // Method that arranges numbers using selection sort
    public void selectionSort(int[] array){
        for(int position = 0; position < array.length; position ++)
            // Go through the rest looking for a smaller number
            for (int i = position+1; i < array.length; i ++){
                // Have we found smaller?
                if (array[i]< array[position]){
                    // Swap numbers
                    swap (array, i, position);
                }
            }
    }
    
    // Method that arranges numbers using bubble sort
    public void bubbleSort(int[] array){
        // Keep track of end
        int last = array.length;
        // boolean to flag a swap
        boolean swap = true;
        
        // Continue if swap has been made
        while (swap){
            // Assume no swaps will be done 
            swap = false;
            // Look for swaps
            for (int i = 0; i < last - 1; i++){
                // Find the bigger value?
                if (array[i] > array[i+1]){
                    // Swap
                    swap(array, i, i+1);
                    // Set flag to true
                    swap = true;
                }
            }
            // Move the last position tracker
            last --;
        }
        
    }
        
        // Insertion sort
        public void insertionSort (int[] array){
            
            // Start going throuhg the array
            for (int i = 0; i < array.length - 1; i++){
                // Store position 
                int position = i;
                
                // Check values beside each other
                while (position >= 0 && array [position] > array[position + 1]){
                    // If out of place, swap it downwards
                    // until correct position is reached
                    swap (array, position, position + 1);
                    position --;
                }
            }

            
        }
        
        // Merge Sort 
        public void mergeSort(int[] array){
            // If we are at 1 item, done sorting
            if (array.length <= 1){
                return;
            }
            // Divide into 2 arrays
            int split = array.length / 2;
            // Create 2 arrays
            int[] front = Arrays.copyOfRange(array, 0, split);
            int[] back = Arrays.copyOfRange(array, split, array.length);
            
            // Recursively sort
            mergeSort(front);
            mergeSort(back);
            
            // Put numbers in the correct spot
            // Keeping track of where we are
            int fSpot = 0;
            int bSpot = 0;
            
            for (int i = 0; i < array.length; i++){
                // No more items in front array
                if (fSpot == front.length){
                    array[i] = back[bSpot];
                    bSpot ++;
                }else if(bSpot == back.length){
                    array[i] = front[fSpot];
                    fSpot ++;
                }else if(front[fSpot] < back[bSpot]){
                    // Put front item in 
                    array [i] = front[fSpot];
                    fSpot ++;
           
                }else{
                    // Put item back in 
                    array [i] = back[bSpot];
                    bSpot ++;
                }
            }
            
        }
        
        // Sequential search
        public int sequentialSearch(int[] array, int number){
            for (int i = 0; i < array.length; i++){
                // Did i find it?
                if (array[i] == number){
                    // Tell them where
                    return i;
                }
            }
            // Did not find it
            return -1;
        }
        
        // Binary search
        public int binarySearch(int[] array, int target){
        int min = 0;
        int max = array.length - 1;
        
        while(max >= min){
            int guess = (max+min)/2;
            
            // Find it?
            if(array[guess] == target){
                return guess;
                
            }else if(target > array[guess]){
                min = guess + 1;
                
            }else{
                max = guess - 1;
            }
        }
        // didn't find it
        return -1;
        
    }

    ////////////////////////////////////////////////////////////////////////////    
    
    public static void main(String[] args) {
        
        // Creating an object to run methods
        SortingSearching test = new SortingSearching();
        
        // Making a random array of numbers
        int[] numbers = new int [10];
        // For loop to add random numbers to the array
        for (int i = 0; i < numbers.length; i++){
            // Make a random number - using random number command
            numbers[i] = (int)(Math.random()*101);
        }
        
        // Printing the numbers before 
        System.out.println("Before: ");
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        
        System.out.println();
        
        // Sorting the numbers out
        test.mergeSort (numbers);

        // Printing the numbers after they are sorted
        System.out.println("After: ");
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        } 
       
    }
    
}