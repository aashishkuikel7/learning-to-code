package questions;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int number=sc.nextInt();
		System.out.println("enter anothernumber: ");
		int anothernumber=sc.nextInt();
		sc.close();
		int sum=number+anothernumber;
		System.out.println("sum of the two number is: "+sum);
				
		
	}

}
