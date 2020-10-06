public class BibleBook
{
	//Initial variables
	private String Bookname;
	private int numberOfChapters;
	private String summary;
	
	public BibleBook(String Bookname, int numberOfChapters, String summary)
	{
		//Initial objects
		this.Bookname = Bookname;
		this.numberOfChapters = numberOfChapters;
		this.summary = summary;
	}
	
	public BibleBook(String commaDelimited)
	{
		//Runs through objects and breaks them apart
		String[] parts = commaDelimited.split(":");
		this.Bookname = parts[0];
		this.numberOfChapters = Integer.parseInt(parts[1]);
		this.summary = parts[2];
	}
	
	public void display()
	{
		//Prints out array
		System.out.printf("Book Name: %s Number of chapters: %d Summary: %s \n", this.Bookname, this.numberOfChapters, this.summary);
	}
	//Returns Objects
	public String getBookname()
	{
		return this.Bookname;
	}

	public int getNumberOfChapters() 
	{
		return numberOfChapters;
	}

	public String getsummary() 
	{
		return this.summary;
	}
	
}