

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		int number;
		System.out.println("Enter the number to be check:");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		if(number%2==0)
		{
			System.out.println("Its an even number");
		}
		else
		{
			System.out.println("Its an odd number");
		}
	}

}
