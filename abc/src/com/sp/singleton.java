package com.sp;

public class singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int[] a = {4, 5, 9, 10, 14, 11};

		        // Calculate the sum of elements in the array
		        int sum = 0;
		        for (int i = 0; i < a.length; i++) {
		            sum += a[i];
		        }

		        // Check if the sum is present in the array
		        boolean isSumPresent = false;
		        for (int i = 0; i < a.length; i++) {
		            if (a[i] == sum) {
		                isSumPresent = true;
		                break;
		            }
		        }

		        // Print the result
		        if (isSumPresent) {
		            System.out.println("The sum " + sum + " is present in the array.");
		        } else {
		            System.out.println("The sum " + sum + " is not present in the array.");
		        }
		    }
	
	}


