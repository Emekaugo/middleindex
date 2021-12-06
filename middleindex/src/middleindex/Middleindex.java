/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package middleindex;

import java.util.Scanner;

public class Middleindex {


    
public static String MiddleIndex(int arr[], int n)
    
    {
        int i, j;
        int leftsum, rightsum;
 

        for (i = 0; i < n; ++i) {
 
            /* get left sum */
            leftsum = 0; 
            for (j = 0; j < i; j++)
                leftsum += arr[j];
 
            /* get right sum */
            rightsum = 0;
            for (j = i + 1; j < n; j++)
                rightsum += arr[j];
 
            /* if leftsum and rightsum are same,*/
            if (leftsum == rightsum)
            {
                System.out.println("Middle index : "+i);
                return "YES.";
            }
        }
 
        /* return -1 */
        return "NO. middle index unknown. ";
    }

public static void main(String[] args)
    {
        
        int sum = 0;
        int arr[] = { 5,6,8,11};
        int arr_size = arr.length;
        for(int i = 0; i < arr_size; i++)
        {
            sum = sum + arr[i];
        }
        System.out.println(MiddleIndex(arr, arr_size));
        System.out.println("Sum of all elements : "+sum);
        
        
        
    }

}
    
    
    
    
    
    
    
    
    

