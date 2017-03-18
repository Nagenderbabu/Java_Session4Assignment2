import java.util.Scanner;


public class ArrayMain {

	@SuppressWarnings({ "resource",})
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initializing Array insert class
		ArrayInsert at=new ArrayInsert();
		// initializing array[] and image[] arrays
		int array[]=new int[5];
        int image[]=new int[5];
        // Crearing scanner object
		Scanner sc=new Scanner(System.in);
		// prints initial statement to sort an array
		System.out.println("enter the "+array.length +" "+"elements");
		// loop to sort array values  
		for(at.i=0;at.i<array.length;at.i++){
			array[at.i]=sc.nextInt();
			}
		// displays sorted array
		System.out.println(" Sorted array is: ");
		// loop to print values of array
		for(at.i=0;at.i<array.length;at.i++)
		{  
			// prints array[] element of index i
		   System.out.print(" "+array[at.i]+" ");
		   
		}
		System.out.println(" ");
		// statement asking user to enter value to be inserted into array
		System.out.println("Enter the value to be inserted into array");
		// input passed to at.value variable
		at.value=sc.nextInt();
		// statement asking user for index where to insert their values 
	    System.out.println("at index between 1 to 5 :");
	    // passing input to at.tempt variable
	    at.temp=sc.nextInt();
	    
	    // loop to insert user entered value into array
	    for(at.i=0;at.i<array.length;at.i++)
		{
	    	// passing array[] values to image[] for updated array
	    	image[at.i]=array[at.i];
	        // condition to check user defined index 
	    	if(at.temp-1==at.i)
		   {
	    		// inserting user defined value at the user defined index
			   image[at.temp-1]=at.value;
			}
	       }
	    //  to print updated array
	    System.out.println("the new updated array :");
	    // loop to display updated array after insertion 
	    for(at. i=0;at.i<array.length;at.i++)
		{  
			// prints array[] element of index i
		   System.out.print(" "+image[at.i]+" ");
		 }
	    System.out.println(" ");
	       System.out.println("value"+" "+at.value+" "+" inserted into array at "+at.temp+"  "+"index");
	    
	}

}
