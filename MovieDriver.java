package MovieDriver;
import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) 
	{
		String answer;
		do
		{
			String input;
			int num;
			Scanner keyboard = new Scanner(System.in);
			Movie movie = new Movie();
			
			System.out.println("Enter the name of a movie");
			input = keyboard.nextLine();
			movie.setTitle(input);
			
			System.out.println("Enter the rating of the movie");
			input = keyboard.nextLine();
			movie.setRating(input);
			
			System.out.println("Enter the number of tickets sold for this movie");
			num = keyboard.nextInt();
			keyboard.nextLine();
			movie.setSoldTickets(num);
			
			System.out.println(movie.toString());
			
			System.out.println("Do you want to enter another?(y or n)");
			answer = keyboard.nextLine();
			
		}while(answer.equalsIgnoreCase("y"));

	}
}