import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Sort
	{
		private static final long serialVersionUID=1L;
		static JFrame frame=new JFrame();
		public static void print()
		{
			for (Student s: SISRunner.students)
				{
					System.out.println(s.getFirst() + " " + s.getLast() + " " +s.getGPA()+ " " + s.getPeriod1() + " " + s.getGrade1() + " " + s.getPeriod2() + " " + s.getGrade2() + " " +s.getPeriod3() + " " + s.getGrade3());
				}
		}
		public static ArrayList<Student> sortByLast()
		{
			System.out.println();
			Student[] test=new Student[SISRunner.students.size()];
			for (int i=0; i<test.length; i++)
				{
					test[i]=SISRunner.students.get(i);
				}
			Arrays.sort(test, Student.lastNameComparator);
			ArrayList<Student> sorted=new ArrayList<Student>();
			for (int i=0; i<test.length; i++)
				{
					ManipulateStudent.delay();
					sorted.add(test[i]);
					System.out.println(sorted.get(i).getFirst()+" "+sorted.get(i).getLast());
				}
			end2();
			return sorted;
		}
		public static ArrayList<Student> sortByPeriod1()
		{
			System.out.println();
			Student[] test=new Student[SISRunner.students.size()];
			for (int i=0; i<test.length; i++)
				{
					test[i]=SISRunner.students.get(i);
				}
			Arrays.sort(test, Student.firstPeriodComparator);
			ArrayList<Student> sorted=new ArrayList<Student>();
			for (int i=0; i<test.length; i++)
				{
					ManipulateStudent.delay();
					sorted.add(test[i]);
					System.out.println(sorted.get(i).getFirst()+" "+sorted.get(i).getLast()+" - "+sorted.get(i).getPeriod1());
				}
			end2();
			return sorted;
		}
		public static ArrayList<Student> sortByPeriod2()
		{
			System.out.println();
			Student[] test=new Student[SISRunner.students.size()];
			for (int i=0; i<test.length; i++)
				{
					test[i]=SISRunner.students.get(i);
				}
			Arrays.sort(test, Student.secondPeriodComparator);
			ArrayList<Student> sorted=new ArrayList<Student>();
			for (int i=0; i<test.length; i++)
				{
					ManipulateStudent.delay();
					sorted.add(test[i]);
					System.out.println(sorted.get(i).getFirst()+" "+sorted.get(i).getLast()+" - "+sorted.get(i).getPeriod2());
				}
			end2();
			return sorted;
		}
		public static ArrayList<Student> sortByPeriod3()
		{
			System.out.println();
			Student[] test=new Student[SISRunner.students.size()];
			for (int i=0; i<test.length; i++)
				{
					test[i]=SISRunner.students.get(i);
				}
			Arrays.sort(test, Student.thirdPeriodComparator);
			ArrayList<Student> sorted=new ArrayList<Student>();
			for (int i=0; i<test.length; i++)
				{
					ManipulateStudent.delay();
					sorted.add(test[i]);
					System.out.println(sorted.get(i).getFirst()+" "+sorted.get(i).getLast()+" - "+sorted.get(i).getPeriod3());
				}
			end2();
			return sorted;
		}
		public static ArrayList<Student> sortByGPA()
		{
			System.out.println();
			Student[] test=new Student[SISRunner.students.size()];
			for (int i=0; i<test.length; i++)
				{
					test[i]=SISRunner.students.get(i);
				}
			Arrays.sort(test, Student.gpaComparator);
			ArrayList<Student> sorted=new ArrayList<Student>();
			for (int i=0; i<test.length; i++)
				{
					ManipulateStudent.delay();
					sorted.add(test[i]);
					System.out.printf(sorted.get(i).getFirst()+" "+sorted.get(i).getLast()+" "+"%.2f",sorted.get(i).getGPA());
					System.out.println();
				}
			end2();
			return sorted;
		}
		public static void end2()
			{
				try{Thread.sleep(1000);}catch(InterruptedException e){e.printStackTrace();}
				int mainChoice;
				Object[] options = {"Yes", "No"};
				ImageIcon icon =  new ImageIcon("mn.jpg");
				mainChoice = JOptionPane.showOptionDialog(null, 
					"",
					"Would You Like To Do Anything Else?",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE, 
					icon,
					options, 
					options[1]);
					switch(mainChoice)
					{
					case 0:
						{
						Menu.doMain();
						break;
						}
					case 1:
						{
							JOptionPane.showMessageDialog(frame, "Goodbye");
						break;
						}
					}
			}
	}

