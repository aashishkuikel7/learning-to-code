package questions;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length ");
		int l=sc.nextInt();
		System.out.println("enter the breadth ");
		int b=sc.nextInt();
		System.out.println("enter the height ");
		int h=sc.nextInt();
		sc.close();
		int P=l+b+h;
		System.out.println("the perimeter of triangle is " + P);

	}

}
