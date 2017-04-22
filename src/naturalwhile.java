import java.util.Scanner;

public class naturalwhile {

	public static void main(String[] args) {
		
		int number, i=1;
		System.out.println("Enter the limit:");
		Scanner sc=new Scanner (System.in);
		number=sc.nextInt();
		while(i<=number)
		{
			System.out.println(i);
			i++;
		}

	}

}
