import java.util.Scanner;
public class ManipulateStudent
	{
		
		public static void chooseAction()
		{
			System.out.println("Would you like to add or delete a student?");
			System.out.println("(1) Add");
			System.out.println("(2) Delete");
			Scanner sc = new Scanner (System.in);
			int choice = sc.nextInt();
			switch (choice)
			{
				case 1:
						{
							addStudent();
							break;
						}
				case 2:
						{
							deleteStudent();
							break;
						}
				default:
						{
							System.out.println("That is not an option");
							chooseAction();
							break;
						}
			}
		}
		public static void addStudent()
			{
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
				System.out.println("Here are the new students now");
				int m=0;
				for (Student s:SISRunner.students)
					{
						m++;
						System.out.println(m+ " " + s.getFirst()+s.getLast());
					}
			}
		public static void deleteStudent()
		{
			int i=0;
			for (Student s:SISRunner.students)
				{
					i++;
					System.out.println(i+ " " + s.getFirst()+s.getLast());
				}
			System.out.println("Who would you like to delete?");
			Scanner sc7 = new Scanner (System.in);
			int deletion = sc7.nextInt();
			SISRunner.students.remove(deletion-1);
			int a=0;
			for (Student s:SISRunner.students)
				{
					a++;
					System.out.println(a+ " " + s.getFirst()+s.getLast());
				}
			
		}
	}
