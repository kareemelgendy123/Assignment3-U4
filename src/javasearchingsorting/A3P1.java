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
public class A3P1 {
    
    // Method that swaps two numbers
    public void swap(int[] array, int p1, int p2){
        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }
     
    // Method that sorts an array using selection sort
    public void SelectionSort (int[] array){
        
        // For loop for the position of the first value in the array
        for(int position = 0; position < array.length; position ++){
            int lowestTerm = position;
             
            // Go through the rest of the array looking for a smaller number
            for (int i = position; i < array.length; i ++){
                
                // Have we found smaller? - Assign to the variable lowestTerm
                if (array[i]< array[lowestTerm]){
                    lowestTerm = i;
                }
            }
            
            // Swap numbers
            swap (array, lowestTerm, position);
        }
    }

    public static void main(String[] args) {
        
        // Creating an object that runs methods
        A3P1 test = new A3P1();
        
        // Making a random array of numbers
        int[] numbers = new int [10];
        
        // For loop to add random numbers to the array
        for (int i = 0; i < numbers.length; i++){
            // Make a random number using random number command
            numbers[i] = (int)(Math.random()*11);
        }
        
        // Outputting the numbers before they're sorted
        System.out.println("Before: ");
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        
        // Calling the Method
        test.SelectionSort(numbers);
        
        System.out.println();
        System.out.println("");
 
        // Outputting the sorted results
        System.out.println("After: ");
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
    
