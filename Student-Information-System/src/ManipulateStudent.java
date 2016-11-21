import java.util.Scanner;

import javax.sound.midi.Synthesizer;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class ManipulateStudent
	{
		private static final long serialVersionUID=1L;
		static JFrame frame=new JFrame();
		public static void delay()
		{
			try
				{
					Thread.sleep(60);
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}
		}
		public static void addStudent()
			{
				System.out.println();
				System.out.println("Here are the current Students");
				System.out.println();
				int i=0;
				for (Student s:SISRunner.students)
					{
						delay();
						i++;
						System.out.println(i+ " " + s.getFirst()+" "+s.getLast());
					}
				System.out.println();
				System.out.println("What is the student's first name?");
				Scanner sc2 = new Scanner (System.in);
				String firstName = sc2.nextLine();
				System.out.println("What is the student's last name?");
				Scanner sc3 = new Scanner (System.in);
				String lastName = sc3.nextLine();
				System.out.println("What is the student's first period class?");
				Scanner sc4 = new Scanner (System.in);
				String firstPeriod = sc4.nextLine();
				System.out.println("What is the student's second period class?");
				Scanner sc5 = new Scanner (System.in);
				String secondPeriod = sc5.nextLine();
				System.out.println("What is the student's third period class?");
				Scanner sc6 = new Scanner (System.in);
				String thirdPeriod = sc6.nextLine();
				SISRunner.students.add(new Student(firstName,lastName,0.0,firstPeriod,secondPeriod,thirdPeriod,"","",""));
				System.out.println();
				delay();
				System.out.println("You have successfully added "+SISRunner.students.get(SISRunner.students.size()-1).getFirst()+" "+SISRunner.students.get(SISRunner.students.size()-1).getLast());
				System.out.println("Period 1: "+SISRunner.students.get(SISRunner.students.size()-1).getPeriod1());
				System.out.println("Period 2: "+SISRunner.students.get(SISRunner.students.size()-1).getPeriod2());
				System.out.println("Period 3: "+SISRunner.students.get(SISRunner.students.size()-1).getPeriod3());
				System.out.println();
				try{Thread.sleep(600);}catch(InterruptedException e){e.printStackTrace();}
				System.out.println("Here are the new students now");
				int m=0;
				for (Student s:SISRunner.students)
					{
						delay();
						m++;
						System.out.println(m+ " " + s.getFirst()+" "+s.getLast());
					}
				end1();
			}
		public static void deleteStudent()
		{
			System.out.println();
			System.out.println("Here are all of the students");
			System.out.println();
			int i=0;
			for (Student s:SISRunner.students)
				{
					delay();
					i++;
					System.out.println(i+ " " + s.getFirst()+" "+s.getLast());
				}
			System.out.println("Who would you like to delete?");
			Scanner sc7 = new Scanner (System.in);
			int deletion = sc7.nextInt();
			SISRunner.students.remove(deletion-1);
			System.out.println();
			System.out.println("Are you sure?");
			System.out.println("(1) Yes");
			System.out.println("(2) No");
			Scanner userInput = new Scanner(System.in);
			int choice5 = userInput.nextInt();
			if (choice5==1)
				{
					System.out.println("Successfully Deleted Student");
					System.out.println();
					System.out.println("Here is the new list of students");
					System.out.println();
					try{Thread.sleep(600);}catch(InterruptedException e){e.printStackTrace();}
					int a=0;
					for (Student s:SISRunner.students)
						{
							delay();
							a++;
							System.out.println(a+ " " + s.getFirst()+" "+s.getLast());
						}
					end1();
				}
			else if (choice5==2)
				{
					System.out.println("Would you still like to delete a Student?");
					System.out.println("(1) Yes");
					System.out.println("(2) No");
					Scanner userInput2 = new Scanner(System.in);
					int choice6 = userInput2.nextInt();
					if (choice6==1)
						{
							deleteStudent();
						}
					else 
						{
							end1();
						}		
				}
			else
				{
					System.out.println("That is not an option");
					deleteStudent();
				}
		}
		public static void end1()
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
