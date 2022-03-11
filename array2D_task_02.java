import java.util.Scanner;
public class task_02 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
    
		//Initialization Method
		int[][] array = {
				{1, 9, 5, 7, 6}, 
				{2, 5, 2, 1, 4},
				{4, 8, 5, 1, 2}, 
				{7, 9, 1, 2, 6}
				};
    
		//Input method...
		//int[][] array = new int[4][5];

		/*System.out.println("Enter Values: ");
		for (int i = 0; i < array.length; i++) {
			for (int  j = 0; j < array[i].length; j++) 
				array[i][j] = obj.nextInt();
		}*/
		
		System.out.println("Creating Array: ");
		
		for (int i = 0; i < array.length; i++) {
			for (int  j = 0; j < array[i].length; j++) { 
				System.out.print(array[i][j] + "  ");
			}
			System.out.println();
		}
		
		//Sum of array:
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int  j = 0; j < array[i].length; j++) 
				sum += array[i][j];
		}
		System.out.println("Sum of array is: " + sum);
    
    //Average
		double average = (double)sum/20;
		System.out.println("Average of array : " + average);
    
		//Max:
		System.out.println("Max of rows: ");
		for (int i = 0; i < array.length; i++) {
			int max = array[i][0];
			for (int j = 0; j < array[i].length; j++) {
				if (max < array[i][j])
					max = array[i][j];
			}
			System.out.println(i + ":" + max);
		}
		//Closes the Scanner...
		obj.close();
	}

}
