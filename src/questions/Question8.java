package questions;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		float temperature;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter temperature in farenheit");
		temperature=in.nextInt();
		in.close();
		temperature=((temperature-32)*5)/9;
		System.out.println("temperatue in celsius is= " + temperature);
        		

	}

}
