import java.util.Scanner;

public class naturalfor {

	public static void main(String[] args) {
		
		int number;
		System.out.println("Enter the limit:");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		for(int i=1;i<=number;i++)
		{
			System.out.println(i);
		}

	}

}
