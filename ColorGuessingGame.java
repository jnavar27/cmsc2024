package JNavarro_Assignment1_Complete;
import java.util.Scanner;
import java.util.Random;
public class ColorGuessingGame {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		String name, description, dueDate, guess = null, color = null;
		int count = 1, num, correctAnswers = 0;
		
		System.out.print("Enter your name: ");
		name = keyboard.nextLine();
		
		System.out.print("Describe yourself: ");
		description = keyboard.nextLine();
		
		System.out.print("Due Date: ");
		dueDate = keyboard.nextLine();
		
		System.out.println("CMSC203 Assignment1: Test your ESP skills!");
		
		do
		{
			Random rand = new Random();
			num = rand.nextInt(7) + 1;
			System.out.println("Round " + count + "\n");
			switch(num)
			{
				case 1:
				{
					color = "Red";
					System.out.println("I am thinking of a color.");
					System.out.println("Is it Red, Green, Blue, Orange, Yellow, Black, or White?");
					System.out.println("Enter your guess: ");
					guess = keyboard.nextLine();
					while(!guess.toLowerCase().equals("red") && !guess.toLowerCase().equals("green") && !guess.toLowerCase().equals("blue") && !guess.toLowerCase().equals("orange") && !guess.toLowerCase().equals("yellow") && !guess.toLowerCase().equals("black") && !guess.toLowerCase().equals("white"))
					{
						System.out.println("You entered incorrect color. Is it Red, Green, Blue, Orange, Yellow, Black, or White?");
						System.out.println("Enter your guess: ");
						guess = keyboard.nextLine();
					}
					break;
				}
				case 2:
				{
					color = "Green";
						System.out.println("I am thinking of a color.");
						System.out.println("Is it Red, Green, Blue, Orange, Yellow, Black, or White?");
						System.out.println("Enter your guess: ");
						guess = keyboard.nextLine();
					while(!guess.toLowerCase().equals("red") && !guess.toLowerCase().equals("green") && !guess.toLowerCase().equals("blue") && !guess.toLowerCase().equals("orange") && !guess.toLowerCase().equals("yellow") && !guess.toLowerCase().equals("black") && !guess.toLowerCase().equals("white"))
					{
						System.out.println("You entered incorrect color. Is it Red, Green, Blue, Orange, Yellow, Black, or White?");
						System.out.println("Enter your guess: ");
						guess = keyboard.nextLine();
					}
					break;
				}
				case 3:
				{
					color = "Blue";
						System.out.println("I am thinking of a color.");
						System.out.println("Is it Red, Green, Blue, Orange, Yellow, Black, or White?");
						System.out.println("Enter your guess: ");
					guess = keyboard.nextLine();
					while(!guess.toLowerCase().equals("red") && !guess.toLowerCase().equals("green") && !guess.toLowerCase().equals("blue") && !guess.toLowerCase().equals("orange") && !guess.toLowerCase().equals("yellow") && !guess.toLowerCase().equals("black") && !guess.toLowerCase().equals("white"))
					{
						System.out.println("You entered incorrect color. Is it Red, Green, Blue, Orange, Yellow, Black, or White?");
						System.out.println("Enter your guess: ");
						guess = keyboard.nextLine();
					}
					break;
				}
				case 4:
				{
					color = "Orange";
					System.out.println("I am thinking of a color.");
					System.out.println("Is it Red, Green, Blue, Orange, Yellow, Black, or White?");
					System.out.println("Enter your guess: ");
					guess = keyboard.nextLine();
					while(!guess.toLowerCase().equals("red") && !guess.toLowerCase().equals("green") && !guess.toLowerCase().equals("blue") && !guess.toLowerCase().equals("orange") && !guess.toLowerCase().equals("yellow") && !guess.toLowerCase().equals("black") && !guess.toLowerCase().equals("white"))
					{
						System.out.println("You entered incorrect color. Is it Red, Green, Blue, Orange, Yellow, Black, or White?");
						System.out.println("Enter your guess: ");
						guess = keyboard.nextLine();
					}
					break;
				}
				case 5:
				{
					color = "Yellow";
					System.out.println("I am thinking of a color.");
					System.out.println("Is it Red, Green, Blue, Orange, Yellow, Black, or White?");
					System.out.println("Enter your guess: ");
					guess = keyboard.nextLine();
					while(!guess.toLowerCase().equals("red") && !guess.toLowerCase().equals("green") && !guess.toLowerCase().equals("blue") && !guess.toLowerCase().equals("orange") && !guess.toLowerCase().equals("yellow") && !guess.toLowerCase().equals("black") && !guess.toLowerCase().equals("white"))
					{
						System.out.println("You entered incorrect color. Is it Red, Green, Blue, Orange, Yellow, Black, or White?");
						System.out.println("Enter your guess: ");
						guess = keyboard.nextLine();
					}
					break;
				}
				case 6:
				{
					color = "Black";
					System.out.println("I am thinking of a color.");
					System.out.println("Is it Red, Green, Blue, Orange, Yellow, Black, or White?");
					System.out.println("Enter your guess: ");
					guess = keyboard.nextLine();
					while(!guess.toLowerCase().equals("red") && !guess.toLowerCase().equals("green") && !guess.toLowerCase().equals("blue") && !guess.toLowerCase().equals("orange") && !guess.toLowerCase().equals("yellow") && !guess.toLowerCase().equals("black") && !guess.toLowerCase().equals("white"))
					{
						System.out.println("You entered incorrect color. Is it Red, Green, Blue, Orange, Yellow, Black, or White?");
						System.out.println("Enter your guess: ");
						guess = keyboard.nextLine();
					}
					break;
				}
				case 7:
				{
					color = "White";
					System.out.println("I am thinking of a color.");
					System.out.println("Is it Red, Green, Blue, Orange, Yellow, Black, or White?");
					System.out.println("Enter your guess: ");
					guess = keyboard.nextLine();
					while(!guess.toLowerCase().equals("red") && !guess.toLowerCase().equals("green") && !guess.toLowerCase().equals("blue") && !guess.toLowerCase().equals("orange") && !guess.toLowerCase().equals("yellow") && !guess.toLowerCase().equals("black") && !guess.toLowerCase().equals("white"))
					{
						System.out.println("You entered incorrect color. Is it Red, Green, Blue, Orange, Yellow, Black, or White?");
						System.out.println("Enter your guess: ");
						guess = keyboard.nextLine();
					}
					break;
				}
				default:
				{
					System.out.print("this not supposed to appear...");
				}
			}
			
			System.out.println("\nI was thinking of " + color + ".\n");
			if (guess.equalsIgnoreCase(color))
			{
				correctAnswers++;
			}
			count++;
		}while (count <= 11);
		
		System.out.println("\nGame Over");
		System.out.println("\n\nYou guessed " + correctAnswers + " out of 11 colors correctly.");
		System.out.println("Student Name: "+ name);
		System.out.println("User Description: " + description + ".");
		System.out.print("Due Date: " + dueDate);
		keyboard.close();
	}
}