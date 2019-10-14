package questions;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter principle ");
		int p=sc.nextInt();
		System.out.println("enter time: ");
		int t=sc.nextInt();
		System.out.println("enter rate: ");
		int r=sc.nextInt();
		sc.close();
		int simpleinterest= p*t*r/100;
				System.out.println("simple interest is: "+ simpleinterest);
				
		
				

	}

}
