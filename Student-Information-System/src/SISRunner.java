import java.io.*;
import java.util.*;
public class SISRunner
	{
		public static Scanner file;
		public static ArrayList<Student> students=new ArrayList<Student>();
		public static void main(String[] args) throws FileNotFoundException
			{
				file=new Scanner(new File("studentInformation (1).txt"));

			}
	public static void fillList()
	{
		while (file.hasNext())
			{
				String info=file.nextLine();
				
				students.add(new Student(null, null, 0, null, null, null, null, null, null));
			}
	}
	public static int findSpaces(String str)
	{
		for (int i=0; i<str.length(); i++)
			{
				
			}
		return 0;
	}
}//