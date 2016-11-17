
import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
public class Sort
	{
		protected static ArrayList<Student> students=SISRunner.students;
		
		public static void sortLastName()
		{
			for(int i=0; i<students.size(); i++)
				{
					for(int j=0; j<students.size(); j++)
						{
							Comparator x=((Student)(students.get(i)));
							if(x.compare(students.get(i), students.get(j))<0)
								{
									
								}
						}
				}
		}
	}
