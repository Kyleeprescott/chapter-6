package Chapterwork;
import java.util.Scanner;
public class GuessingMyNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int guess = 0;
		int num = (int)(Math.random()*100);
		guess = input.nextInt();
		int attempts = 0;
		attempts++;
		
		
		while (guess!=num) {
			
			if (guess<num) {
				System.out.println("Guess Higher");
		
			}
			else {
				System.out.println("Guess Lower");
			}
			guess = input.nextInt();
			attempts++;
		}
		System.out.println("You Got It");
		System.out.println("It took you "+attempts+"attempts");
		
		guess = 0;
		num = (int)(Math.random()*100);
		do {
			if (guess<num) {
				System.out.println("Guess Higher");
			}
			else {
				System.out.println("Guess Lower");
			}
			guess = input.nextInt();
			attempts++;
		}
		while (guess!=num);
		System.out.println("You Got It");
		System.out.println("It took you "+attempts+"attempts");
		for (guess = 0; guess!=num; guess = input.nextInt()) {
			if (guess<num) {
				System.out.println("Guess Higher");
			}
			else {
				System.out.println("Guess Lower");
			}
			guess = input.nextInt();
			attempts++;
			System.out.println("You Got It");
			System.out.println("It took you "+attempts+"attempts");
		}
		
		
	}
	

}
