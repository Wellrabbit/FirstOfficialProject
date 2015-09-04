package input.controller;

import java.util.Scanner;

public class InputController
{
	private Scanner myInput;
	
	public InputController()
	{
		myInput = new Scanner(System.in);
	}
	
	public void start()
	{
		questions();
		questions();
	}
	private void questions()
	{
		System.out.println("Hey, You with bitch face what yo name?");
		String input;
		input = myInput.next();
		myInput.nextLine();
		System.out.println("your name is " + input + ", thats totally what I would expect from a bitch like you.");
		System.out.println("Now I need your Stripper Name HOE");
		String fullName = myInput.nextLine();
		System.out.println("Okay i can hire someone named " + fullName);
		System.out.println("I need your age for legal stuff");
		int myAge = myInput.nextInt();
		System.out.println("Wow Okay forget about the job your " + myAge);
	}
}
