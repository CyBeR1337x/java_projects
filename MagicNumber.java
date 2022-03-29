import java.util.Scanner;
public class Q4 {
	
	public static boolean isInt(double N) {
		int x = (int) N;
		double temp = N - x;
		
		if(temp > 0) {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter A Value: " );
		int val = input.nextInt();
		
		int[] divisors = new int[15];
		int offset = 0;
		for (int i = (val-1); i >= 1; i--) {
			double res = (double)val / i;
			if (isInt(res))
				divisors[offset++] = i;
		}
		
		int sum = 0;
		for (int i = 0; i < divisors.length; i++) 
			sum += divisors[i];
		
		if (sum == val) 
			System.out.println(1);
		else 
			System.out.println(0);
		
		input.close();
		
	}

}
