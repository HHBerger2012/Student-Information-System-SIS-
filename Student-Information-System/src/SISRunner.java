
import java.io.*;
import java.util.*;
public class SISRunner
	{
		public static Scanner file;
		public static ArrayList<Student> students=new ArrayList<Student>();
			
		public static void main(String[] args) throws FileNotFoundException
			{
				file=new Scanner(new File("studentInformation (1).txt"));
				Menu.doMain();
			}
	public static void fillList()
	{
		while (file.hasNext())
			{
				String info=file.nextLine();
				String first=info.substring(0, indexOf(' '));
				students.add(new Student(null, null, 0, null, null, null, null, null, null));
			}
	}

}