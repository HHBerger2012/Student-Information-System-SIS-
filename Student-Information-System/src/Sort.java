import java.util.*;

public class Sort
	{
		public static void print()
		{
			for (Student s: SISRunner.students)
				{
					System.out.println(s.getFirst() + " " + s.getLast() + " " +s.getGPA()+ " " + s.getPeriod1() + " " + s.getGrade1() + " " + s.getPeriod2() + " " + s.getGrade2() + " " +s.getPeriod3() + " " + s.getGrade3());
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
					System.out.println(sorted.get(i).getFirst()+" "+sorted.get(i).getLast());
				}
			
			return sorted;
		}
		public static ArrayList<Student> sortByPeriod1()
		{
			Student[] test=new Student[SISRunner.students.size()];
			for (int i=0; i<test.length; i++)
				{
					test[i]=SISRunner.students.get(i);
				}
			Arrays.sort(test, Student.firstPeriodComparator);
			ArrayList<Student> sorted=new ArrayList<Student>();
			for (int i=0; i<test.length; i++)
				{
					sorted.add(test[i]);
					System.out.println(sorted.get(i).getFirst()+" "+sorted.get(i).getLast()+" - "+sorted.get(i).getPeriod1());
				}
			return sorted;
		}
		public static ArrayList<Student> sortByPeriod2()
		{
			Student[] test=new Student[SISRunner.students.size()];
			for (int i=0; i<test.length; i++)
				{
					test[i]=SISRunner.students.get(i);
				}
			Arrays.sort(test, Student.secondPeriodComparator);
			ArrayList<Student> sorted=new ArrayList<Student>();
			for (int i=0; i<test.length; i++)
				{
					sorted.add(test[i]);
					System.out.println(sorted.get(i).getFirst()+" "+sorted.get(i).getLast()+" - "+sorted.get(i).getPeriod2());

				}
			return sorted;
		}
		public static ArrayList<Student> sortByPeriod3()
		{
			Student[] test=new Student[SISRunner.students.size()];
			for (int i=0; i<test.length; i++)
				{
					test[i]=SISRunner.students.get(i);
				}
			Arrays.sort(test, Student.thirdPeriodComparator);
			ArrayList<Student> sorted=new ArrayList<Student>();
			for (int i=0; i<test.length; i++)
				{
					sorted.add(test[i]);
					System.out.println(sorted.get(i).getFirst()+" "+sorted.get(i).getLast()+" - "+sorted.get(i).getPeriod3());

				}
			return sorted;
		}
		public static ArrayList<Student> sortByGPA()
		{
			Student[] test=new Student[SISRunner.students.size()];
			for (int i=0; i<test.length; i++)
				{
					test[i]=SISRunner.students.get(i);
				}
			Arrays.sort(test, Student.gpaComparator);
			ArrayList<Student> sorted=new ArrayList<Student>();
			for (int i=0; i<test.length; i++)
				{
					sorted.add(test[i]);
					System.out.println(sorted.get(i).getFirst()+" "+sorted.get(i).getLast()+" - "+sorted.get(i).getGPA());
				}
			return sorted;
		}
	}
