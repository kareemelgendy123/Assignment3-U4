package javasearchingsorting;

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

public class A3P4 {
    
    // Method that searches through an array and returns how many times a number occurs
    public int[] countingSort(int[] array){

        // The array that holds all the numbers
        int[] smallArray = new int[101];
        
        // The position in the array
        int position = 0;
        
        // Going through each of the numbers in the array
        for (int i = 0; i < smallArray.length; i++){
            
            // Adding the number of times a number is seen in the array
            for (int j = 0; j < smallArray[i]; j++){
                
                // Adding the amount in the array position
                array[position] = i;
                position ++;
            }
        }
        // Returning the array
        return array;
    } 
    
    public static void main(String[] args) {
        
        // Creating an object that runs methods
        A3P4 test = new A3P4();
        
        // Array with 100 spots
        int[] array = new int[101];
        
        // The new array that has all the numbers
        int[] newArray = new int[array.length];
        
        // For loop that adds the numbers from 0 to 100 to an array
        for (int i = 0; i < array.length; i++){
            int j = (int)(Math.random()*101);
            newArray[j] ++;
        }

        // Running the array through the countingSort method
        test.countingSort(newArray);
        
        // Printing the array
        System.out.println(Arrays.toString(newArray));
    }
    
}
