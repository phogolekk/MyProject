package com.hitech;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {

		System.out.println("Welcome to Conversion service\n\n");

		System.out.println("Choose from below options\n");

		boolean exit = false;

		do {

			try {

				Scanner sc = new Scanner(System.in);
				System.out.println("1 convert from kelvin to celsius");
				System.out.println("2 convert from pounds to kilograms");
				System.out.println("3 convert from miles to kilometers");
				System.out.println("4 exit system");

				int n = sc.nextInt();

				Converter convert = new Converter();

				switch (n) {
				case 1:
					System.out.println("Enter Temperature in Kelvin : \n");
					double kelvin = sc.nextDouble();

					System.out.println(kelvin + " K equals  " + convert.kelvin_to_celsius(kelvin) + " Celsius\n");

					break;

				case 2:
					System.out.println("Enter Weight in pounds : \n");
					double pound = sc.nextDouble();

					System.out.println(pound + " lbs equals  " + convert.pound_to_kilogram(pound) + " Kilogram\n");

					break;

				case 3:
					System.out.println("Enter distance in miles : \n");
					double miles = sc.nextDouble();

					System.out.println(miles + " Miles equals  " + convert.miles_to_kilometer(miles) + " Kilometer\n");

					break;

				case 4:
					System.out.println("Service exited succesfully\n");
					exit = true;

					break;

				default:
					System.out.println("invalid option enetered\n");
					break;
				}

			} catch (Exception e) {

				System.out.println("You have enetered invalid input, please check below menu and try again!\n");
			}
		} while (!exit);

	}

}
