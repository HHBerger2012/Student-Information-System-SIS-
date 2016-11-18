
import java.io.*;
import java.util.*;
public class SISRunner
	{
		public static Scanner file;
		public static ArrayList<Student> students=new ArrayList<Student>();
			
		public static void main(String[] args) throws FileNotFoundException
			{
				file=new Scanner(new File("studentInformation.txt"));
				fillList();
				students=Sort.sortByPeriod1();
				Sort.print();
				//Menu.doMain();
			}
	public static void fillList()
	{
		while (file.hasNext())
			{
				String info=file.nextLine();
				students.add(read(info));
			}
		for(int i=0; i<students.size(); i++)
			{
				students.get(i).setGPA(getGPA.newGPA());
			}
	}
	public static Student read(String str)
	{
		String[] places=new String[8];
		for (int i=0; i<7; i++)
			{
				places[i]=str.substring(0, str.indexOf(' '));
				str=str.substring(str.indexOf(' ')+1);
			}
		places[7]=str.substring(0);
		//GPA is going to be 0; We can create a method that reads the arraylist and calculates GPA to set it.
		return new Student(places[0], places[1], 0, places[2], places[4], places[6], places[3], places[5], places[7]);
		
	}

}
//Test