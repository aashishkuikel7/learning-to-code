package questions;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		Scanner name=new Scanner(System.in);
				System.out.println("enter your name: ");
		String student=name.nextLine();
		name.close();
		Scanner number=new Scanner(System.in);
		System.out.println("enter the idnumber: ");
		int roll=number.nextInt();
		number.close();
		Scanner nat=new Scanner(System.in);
		System.out.println("enter the nationality: ");
		String nationality=nat.next();
		nat.close();
		System.out.println(" The student name is " + student);
		System.out.println("the student id number is " + roll);
		System.out.println("The student nationality is " + nationality);
		
	
		

	}

}
