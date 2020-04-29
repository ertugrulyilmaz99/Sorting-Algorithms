import java.util.Arrays;
import java.util.Random;
/** Ertuğrul Yılmaz, ID: 041701030, 08 December 2019 */
/**
 * This class includes three sorting algorithm Heap Sort, Java Sort, Selection Sort.
 * Compared that three different sorting algorithms for 10000, 40000 and 80000 array size.
 * Filled the arrays with random values 0 to 10000000.
 * Measured the times and calculated the averages for 10 try and for every algorithm for every size. 
 * @author Ertuğrul Yılmaz 
 */
public class ertugrul_yilmaz {
	
	/**
	 * Main for the program
	 */
	public static void main(String[] args) {
		
		//Declaring the upper limit of random
		int max=10000000;
		//Declaring the lower limit of random
		int min=0;
		//Declaring the size of array which we going to sort
		int arraysize;
		//Declare a variable which going hold start time
		long start;
		//Declare a variable which going hold finish time
		long finish;
		//Declare a variable which going hold sort period
		double elapsedTimeMilliSeconds;
		//Declare a variable which going average for a sort algorithm
		double average=0;
		//Declare a random variable
		Random random= new Random();
		
		//For Array Size 10000
		arraysize=10000;
		//Declaring array size of 10000
		Integer[]array=new Integer[arraysize];
		
		//Printing the array size		
		System.out.println("Array Size: "+arraysize);
		//Repeat the same sort algorithm for 10 times
		for(int i=0;i<10;i++) {
			//Initializing the array with random values 
			for(int j=0;j<arraysize;j++) {
				array[j]= (random.nextInt(max-min+1)+min);
			}
		//Hold the start time before sort
		start = System.nanoTime();
		//Sort the array
		heapSort(array);
		//Hold the start time after sort
		finish = System.nanoTime();
		//Calculate the period of time in milliseconds
		elapsedTimeMilliSeconds = (finish - start) / 1000000.0;
		//Hold the periods in average variable
		average = average+elapsedTimeMilliSeconds;
		//Print the period in millisecond for every sort
		System.out.printf("\n%2d%s%-5.2f%s",i+1,": ",elapsedTimeMilliSeconds," msec");
		}
		//Calculate the average for sort algorithm
		average = average/10;
		//Print the average in millisecond for sort algorithm
		System.out.printf("\n%-45s%s%-5.2f%s","Average Sort Time for Heap Sort",": ",average," msec");
		//Formatting
		System.out.println();
		//Set average to 0 for new sort algorithm
		average=0;
		//Repeat the same sort algorithm for 10 times	
		for(int i=0;i<10;i++) {
			//Initializing the array with random values 
			for(int j=0;j<arraysize;j++) {
				array[j]= (random.nextInt(max-min+1)+min);
			}
		//Hold the start time before sort
		start = System.nanoTime();
		//Sort the array
		Arrays.sort(array);
		//Hold the start time after sort
		finish = System.nanoTime();
		//Calculate the period of time in milliseconds
		elapsedTimeMilliSeconds = (finish - start) / 1000000.0;
		//Hold the periods in average variable
		average = average+elapsedTimeMilliSeconds;
		//Print the period in millisecond for every sort
		System.out.printf("\n%2d%s%-5.2f%s",i+1,": ",elapsedTimeMilliSeconds," msec");
		}
		//Calculate the average for sort algorithm
		average = average/10;
		//Print the average in millisecond for sort algorithm
		System.out.printf("\n%-45s%s%-5.2f%s","Average Sort Time for Java Array Sort",": ",average," msec");
		//Formatting
		System.out.println();
		//Set average to 0 for new sort algorithm
		average=0;	
		//Repeat the same sort algorithm for 10 times
		for(int i=0;i<10;i++) {
			//Initializing the array with random values 
			for(int j=0;j<arraysize;j++) {
				array[j]= (random.nextInt(max-min+1)+min);
			}
		//Hold the start time before sort
		start = System.nanoTime();
		//Sort the array
		selectionSort(array);
		//Hold the start time after sort
		finish = System.nanoTime();
		//Calculate the period of time in milliseconds
		elapsedTimeMilliSeconds = (finish - start) / 1000000.0;
		//Hold the periods in average variable
		average = average+elapsedTimeMilliSeconds;
		//Print the period in millisecond for every sort
		System.out.printf("\n%2d%s%-5.2f%s",i+1,": ",elapsedTimeMilliSeconds," msec");
		}
		//Calculate the average for sort algorithm
		average = average/10;
		//Print the average in millisecond for sort algorithm
		System.out.printf("\n%-45s%s%-5.2f%s","Average Sort Time for Selection Sort",": ",average," msec");
		//Formatting
		System.out.println();
		//Set average to 0 for new sort algorithm
		average=0;
		//Formatting
		System.out.println();
		//Formatting
		System.out.println();
		
		//For Array Size 40000
		arraysize=40000;
		//Declaring array size of 40000
		Integer[]array2=new Integer[arraysize];
		
		//Printing the array size		
		System.out.println("Array Size: "+arraysize);
		//Repeat the same sort algorithm for 10 times
		for(int i=0;i<10;i++) {
			//Initializing the array with random values 
			for(int j=0;j<arraysize;j++) {
				array2[j]= (random.nextInt(max-min+1)+min);
			}
		//Hold the start time before sort
		start = System.nanoTime();
		//Sort the array
		heapSort(array2);
		//Hold the start time after sort
		finish = System.nanoTime();
		//Calculate the period of time in milliseconds
		elapsedTimeMilliSeconds = (finish - start) / 1000000.0;
		//Hold the periods in average variable
		average = average+elapsedTimeMilliSeconds;
		//Print the period in millisecond for every sort
		System.out.printf("\n%2d%s%-5.2f%s",i+1,": ",elapsedTimeMilliSeconds," msec");
		}
		//Calculate the average for sort algorithm
		average = average/10;
		//Print the average in millisecond for sort algorithm
		System.out.printf("\n%-45s%s%-5.2f%s","Average Sort Time for Heap Sort",": ",average," msec");
		//Formatting
		System.out.println();
		//Set average to 0 for new sort algorithm
		average=0;
		//Repeat the same sort algorithm for 10 times
		for(int i=0;i<10;i++) {
			//Initializing the array with random values 
			for(int j=0;j<arraysize;j++) {
				array2[j]= (random.nextInt(max-min+1)+min);
			}
		//Hold the start time before sort
		start = System.nanoTime();
		//Sort the array
		Arrays.sort(array2);
		//Hold the start time after sort
		finish = System.nanoTime();
		//Calculate the period of time in milliseconds
		elapsedTimeMilliSeconds = (finish - start) / 1000000.0;
		//Hold the periods in average variable
		average = average+elapsedTimeMilliSeconds;
		//Print the period in millisecond for every sort
		System.out.printf("\n%2d%s%-5.2f%s",i+1,": ",elapsedTimeMilliSeconds," msec");
		}
		//Calculate the average for sort algorithm
		average = average/10;
		//Print the average in millisecond for sort algorithm
		System.out.printf("\n%-45s%s%-5.2f%s","Average Sort Time for Java Array Sort",": ",average," msec");
		//Formatting
		System.out.println();
		//Set average to 0 for new sort algorithm
		average=0;	
		//Repeat the same sort algorithm for 10 times
		for(int i=0;i<10;i++) {
			//Initializing the array with random values 
			for(int j=0;j<arraysize;j++) {
				array2[j]= (random.nextInt(max-min+1)+min);
			}
		//Hold the start time before sort
		start = System.nanoTime();
		//Sort the array
		selectionSort(array2);
		//Hold the start time after sort
		finish = System.nanoTime();
		//Calculate the period of time in milliseconds
		elapsedTimeMilliSeconds = (finish - start) / 1000000.0;
		//Hold the periods in average variable
		average = average+elapsedTimeMilliSeconds;
		//Print the period in millisecond for every sort
		System.out.printf("\n%2d%s%-5.2f%s",i+1,": ",elapsedTimeMilliSeconds," msec");
		}
		//Calculate the average for sort algorithm
		average = average/10;
		//Print the average in millisecond for sort algorithm
		System.out.printf("\n%-45s%s%-5.2f%s","Average Sort Time for Selection Sort",": ",average," msec");
		//Formatting
		System.out.println();
		//Set average to 0 for new sort algorithm
		average=0;
		//Formatting
		System.out.println();
		//Formatting
		System.out.println();
		
		//For Array Size 80000
		arraysize=80000;
		//Declaring array size of 80000
		Integer[]array3=new Integer[arraysize];
		
		//Printing the array size				
		System.out.println("Array Size: "+arraysize);
		//Repeat the same sort algorithm for 10 times		
		for(int i=0;i<10;i++) {
			//Initializing the array with random values
			for(int j=0;j<arraysize;j++) {
				array3[j]= (random.nextInt(max-min+1)+min);
			}
		//Hold the start time before sort
		start = System.nanoTime();
		//Sort the array
		heapSort(array3);
		//Hold the start time after sort
		finish = System.nanoTime();
		//Calculate the period of time in milliseconds
		elapsedTimeMilliSeconds = (finish - start) / 1000000.0;
		//Hold the periods in average variable
		average = average+elapsedTimeMilliSeconds;
		//Print the period in millisecond for every sort
		System.out.printf("\n%2d%s%-5.2f%s",i+1,": ",elapsedTimeMilliSeconds," msec");
		}
		//Calculate the average for sort algorithm
		average = average/10;
		//Print the average in millisecond for sort algorithm
		System.out.printf("\n%-45s%s%-5.2f%s","Average Sort Time for Heap Sort",": ",average," msec");
		//Formatting
		System.out.println();
		//Set average to 0 for new sort algorithm
		average=0;
		//Repeat the same sort algorithm for 10 times			
		for(int i=0;i<10;i++) {
			//Initializing the array with random values 
			for(int j=0;j<arraysize;j++) {
				array3[j]= (random.nextInt(max-min+1)+min);
			}
		//Hold the start time before sort
		start = System.nanoTime();
		//Sort the array
		Arrays.sort(array3);
		//Hold the start time after sort
		finish = System.nanoTime();
		//Calculate the period of time in milliseconds
		elapsedTimeMilliSeconds = (finish - start) / 1000000.0;
		//Hold the periods in average variable
		average = average+elapsedTimeMilliSeconds;
		//Print the period in millisecond for every sort
		System.out.printf("\n%2d%s%-5.2f%s",i+1,": ",elapsedTimeMilliSeconds," msec");
		}
		//Calculate the average for sort algorithm
		average = average/10;
		//Print the average in millisecond for sort algorithm
		System.out.printf("\n%-45s%s%-5.2f%s","Average Sort Time for Java Array Sort",": ",average," msec");
		//Formatting
		System.out.println();
		//Set average to 0 for new sort algorithm
		average=0;	
		//Repeat the same sort algorithm for 10 times			
		for(int i=0;i<10;i++) {
			//Initializing the array with random values 
			for(int j=0;j<arraysize;j++) {
				array3[j]= (random.nextInt(max-min+1)+min);
			}
		//Hold the start time before sort
		start = System.nanoTime();
		//Sort the array
		selectionSort(array3);
		//Hold the start time after sort
		finish = System.nanoTime();
		//Calculate the period of time in milliseconds
		elapsedTimeMilliSeconds = (finish - start) / 1000000.0;
		//Hold the periods in average variable
		average = average+elapsedTimeMilliSeconds;
		//Print the period in millisecond for every sort
		System.out.printf("\n%2d%s%-5.2f%s",i+1,": ",elapsedTimeMilliSeconds," msec");
		}
		//Calculate the average for sort algorithm
		average = average/10;
		//Print the average in millisecond for sort algorithm
		System.out.printf("\n%-45s%s%-5.2f%s","Average Sort Time for Selection Sort",": ",average," msec");
		//Formatting
		System.out.println();
		//Set average to 0 for new sort algorithm
		average=0;
		//Formatting
		System.out.println();
		//Formatting
		System.out.println();
		
		
	
	}
	
	/**
	 * Sorting the array by using Selection Sort.
	 * @param list The array we want to sort.
	 */
	public static void selectionSort(Integer[] list) {
		//Look the array
		for (int i = 0; i< list.length-1; i++) { 
			//Initialize the smallest index as current element
			int smallindex=i;
			//Look the indices after the current index
			for(int j = i+1;j<list.length;j++) {
				//Check the current is bigger or smaller than its next
				if(list[smallindex] > list[j]) {
					//Find the smallest index after current
					smallindex=j;
				}
				}
			//Store the smallest value
			int smallest=list[smallindex];
			//Change the indices
			list[smallindex]=list[i];
			//Put the smallest value to current index
			list[i]=smallest;
	}
		
	}

	/**
	 * Sorting the array by using Heap Sort.
	 * @param array The array we want to sort.
	 */
	public static void heapSort(Integer[]array){
		//Build the array as a heap  
		Heap tree = new Heap<Integer>(array);
		//Rebuild the heap  
		for(int i=array.length-1;i>=0;i--) {
			//Store the every root remove on array
			array[i]=(Integer)tree.remove();
		  }
	  }
}
