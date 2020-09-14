//Author: Constance Noble

import java.util.Scanner;

public class SphereVolume {

	public static void main(String[] args) {
		
		double diam;
		
		System.out.println("The purpose of this program is to calculate the volume of a sphere.");
		System.out.println("-------------------------------------------------------------------");
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the diameter of the sphere: ");
		
		diam = keyboard.nextDouble();
		
		double rad = diam/2.0;
		double vol = 4.0/3.0 * Math.PI * Math.pow(rad, 3);
		
		System.out.println();
		System.out.printf("The volume of the sphere is %.4f",vol);
		

	}

}
