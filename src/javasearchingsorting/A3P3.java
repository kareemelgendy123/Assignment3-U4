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
public class A3P3 {
    
    // Method that counts number of ones in a binary array
    public int countOnes(int[] array){
        
        // Assigning a value to the variable count
        int count = 0; // Holds the number of ones found in the array
        
        // For loop that goes through the array
        for (int position = 0; position < array.length; position ++){

            // Is there a 1 in this position?
            if (array[position] == 1){
                // Add one to the counter
                count ++;
            }
        }
        // Returning the number of ones in the binary array
        return count;
    }
    
    public static void main(String[] args) {
       
        // Creating an object that runs methods
        A3P3 test = new A3P3();

        // Array of binary numbers
        int[] array = {0, 1, 1, 0, 0, 1, 0, 1, 0, 1};
    
        // Calling the method countOnes 
        int countOnes = test.countOnes(array);
    
        // Outputting the amount of ones in the binary array
        System.out.println(countOnes);

    }
    
}
