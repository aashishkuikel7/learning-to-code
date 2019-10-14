package questions;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius of circle: ");
		double r=sc.nextDouble();
		System.out.println("enter length of the cylinder: ");
		double l=sc.nextDouble();
		sc.close();
		double volume=Math.PI*r*r*l;
		System.out.println("the volumes of cylinder is " + volume);
	}
	

}
