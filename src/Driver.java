//Java Libaries
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Driver 
{
	
	public static void main(String[] args) throws FileNotFoundException    //throws Exception
	{
		//Intial array
		BibleBook[] ar = new BibleBook[4];
		//Finding the file for input
		Scanner input = new Scanner(new File(System.getProperty("user.dir") + "/src/BookName.dat"));
		Scanner myObj = new Scanner(System.in);
		//Asking the user for a key word
		System.out.println("Type in your word you want to search with.");
		String Search = myObj.nextLine();
		//Collecting the bible books and estabishing variables
		BibleBook a = new BibleBook (input.nextLine());
		ArrayList Chapters = new ArrayList();
		String Summary = "";
		String Output = "No Results";
		//Puts the chapters into an array
		while(input.hasNext())
		{
			Chapters.add(input.nextLine());
			Summary = a.getsummary().toString();
		}
		/*
		Supposed to sort throughtout he summary and if the search word 
		is an the summary and only the search word, not just the characters,
		then store the bible book into output and break from the loop.
		*/
		for(int i = 0; i < Chapters.size(); i++)
		{
			if (a.getsummary() == Search);
            {
				
            	Output = Chapters.get(i).toString();
				 break;
            }
		}
		//Intial output for either words or one word.
		if (Output == "No Results")
		{
			System.out.print("No chapters contain: " + Search);
		}
		else
		{
			System.out.print("Your search containing: " + Search + " is: " + Output);
		}
		
	}
	
	
	
}	