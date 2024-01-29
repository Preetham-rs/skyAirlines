package com.sky.user;

import java.util.Scanner;

public class UserDetailsDemo {

	public static void main(String[] args) {
		
		
		UserDetails obj = new UserDetails();
		
		String name,source,destination;
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter  name");
		name =sc.nextLine();
		System.out.println("Enter  source");
		source =sc.nextLine();
		System.out.println("Enter destination ");
		destination =sc.nextLine();
		sc.close();
		obj.setName(name);
		obj.setSource(source);
		obj.setDestination(destination);
		
		System.out.println("Dear " +name+","+"Welcome onboard with service from "+source+" to "+destination+". Thank you for choosing Sky Airlines. Enjoy your flight.");
	}

}
