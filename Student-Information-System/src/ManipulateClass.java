import java.util.Scanner;

public class ManipulateClass
	{
		public static void manipulateClassAction()
		{
			System.out.println("Would you like to switch a class or change a grade?");
			System.out.println("(1) Switch Class");
			System.out.println("(2) Change Grade");
			Scanner sc = new Scanner (System.in);
			int choice1 = sc.nextInt();
			switch (choice1)
			{
				case 1:
						{
							switchClass();
							break;
						}
				case 2:
						{
							changeGrade();
							break;
						}
				default:
						{
							System.out.println("That is not an option");
							manipulateClassAction();
							break;
						}
			}
		}
		public static void switchClass()
		{
			System.out.println("Whose class would you like to switch?");
			int z=0;
			for (Student s:SISRunner.students)
				{
					z++;
					System.out.println(z+ " " + s.getFirst());
				}
		}
		public static void changeGrade()
		{
			System.out.println("Whose grade would you like to change?");
			int z=0;
			for (Student s:SISRunner.students)
				{
					z++;
					System.out.println(z+ " " + s.getFirst());
				}
			Scanner sc = new Scanner (System.in);
			int ch = sc.nextInt();
			System.out.println("What grade of "+SISRunner.students.get(ch-1).getFirst()+"'s would you like to change?");
			System.out.println("(1) Period 1: "+SISRunner.students.get(ch-1).getGrade1());
			System.out.println("(2) Period 2: "+SISRunner.students.get(ch-1).getGrade2());
			System.out.println("(3) Period 3: "+SISRunner.students.get(ch-1).getGrade3());	
			System.out.println();
			Scanner sc2 = new Scanner (System.in);
			int classc = sc2.nextInt();
			switch (classc)
			{
				case 1:
						{
							System.out.println("What would you like to switch it to?");
							Scanner sc3 = new Scanner (System.in);
							String g = sc3.nextLine();
							SISRunner.students.get(ch-1).setGrade1(g);
							break;
						}
				case 2:
						{
							Scanner sc4 = new Scanner (System.in);
							String g = sc4.nextLine();
							SISRunner.students.get(ch-1).setGrade2(g);
							break;
						}
				case 3:
						{
							Scanner sc5 = new Scanner (System.in);
							String g = sc5.nextLine();
							SISRunner.students.get(ch-1).setGrade3(g);
							break;
						}
				default:
						{
							System.out.println("That is not an option");
							changeGrade();
							break;
						}
			}

			System.out.println("Here are the new grades");
			System.out.println("Period 1: "+SISRunner.students.get(ch-1).getGrade1());
			System.out.println("Period 2: "+SISRunner.students.get(ch-1).getGrade2());
			System.out.println("Period 3: "+SISRunner.students.get(ch-1).getGrade3());	
		}
	}
