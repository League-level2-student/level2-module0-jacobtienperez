package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] yeet = {"69","ganandorf is a bad character","y","t", "u"};
		//2. print the third element in the array
	System.out.println(yeet[2]);
		//3. set the third element to a different value
		yeet[2] = "nerf bayonetta";
		//4. print the third element again
		System.out.println(yeet[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i < yeet.length; i++) {
			System.out.println(yeet[i]);
		}
		
		//6. make an array of 50 integers
		int x[] = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for(int i = 0; i<x.length; i++) {
			Random r = new Random();
			x[i] = r.nextInt(100);
			System.out.println(x[i]);
		}
		
		//8. without printing the entire array, print only the smallest number in the array
		int min = x[0];
		for(int i = 0; i < x.length; i++) {
			if(min>x[i]) {
				min=x[i];
				
			}
		
		}
		System.out.println(x[min]);
		//9 print the entire array to see if step 8 was correct
		int max = x[0];   
		
		for(int i = 0; i<x.length-1;i++ ) {
			for(int j = i + 1; j < x.length;j++) {
				if(x[i]>x[j]) {
					int temp = x[i];
					x[i] = x[j];
					x[j]=temp;
				}
			}
			
		}
	}
		//10. print the largest number in the array.
		}






