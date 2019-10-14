package questions;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius of circle: ");
		double r=sc.nextInt();
		sc.close();
		double area= Math.PI * r * r;
		System.out.println("area of circle is " + area);
		
				
	}

}
