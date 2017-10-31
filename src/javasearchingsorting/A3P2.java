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
public class A3P2 {

    // Method that finds the smallest missing number in a sorted array
    public int smallestMissingNumber (int[] array){
         
        // Assigning a value to the variables
        int number; // Holds the missing number
        int i = 0; // Holds the position in the array
        
        // For loop that goes through the array and looks for the missing number
        for (number = 0; number < array.length; number++){ 
        
            // Number not found 
            if (number != array[i]){
                return number;
            }
            
            // Spot in array + 1
            i ++;

        }
        // Returning the value of the missing number
        return number;
    }
    
    public static void main(String[] args) {
        
    // Creating an object that runs methods
    A3P2 test = new A3P2();

    // Array of numbers
    int[] array = {0, 1, 2, 3, 7, 8, 9, 11, 12};
    
    // Calling the method smallestMissingNumber 
    int smallestMissingNumber = test.smallestMissingNumber(array);
    
    // Outputting the missing number
    System.out.println(smallestMissingNumber);
    }
    
}
