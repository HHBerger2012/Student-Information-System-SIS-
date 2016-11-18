import java.util.*;

public class Sort
	{
		public static void print()
		{
			for (Student s: SISRunner.students)
				{
					System.out.println(s.getLast());
				}
		}
		public static ArrayList<Student> sortByLast()
		{
			Student[] test=new Student[SISRunner.students.size()];
			for (int i=0; i<test.length; i++)
				{
					test[i]=SISRunner.students.get(i);
				}
			Arrays.sort(test, Student.lastNameComparator);
			ArrayList<Student> sorted=new ArrayList<Student>();
			for (int i=0; i<test.length; i++)
				{
					sorted.add(test[i]);
				}
			return sorted;
		}
	}
