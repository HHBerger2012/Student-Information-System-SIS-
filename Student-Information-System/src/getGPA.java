
public class getGPA
	{
		static double g1;
		static double g2;
		static double g3;
		static double newGPA;
		public static void getNewGPA()
			{			
				for (int i=0;i<SISRunner.students.size();i++)
					{
				if (SISRunner.students.get(i).getGrade1().equals("A")||SISRunner.students.get(i).getGrade1().equals("A-")||SISRunner.students.get(i).getGrade1().equals("A+"))
					{
						g1=4.0;
					}
				if (SISRunner.students.get(i).getGrade1().equals("B")||SISRunner.students.get(i).getGrade1().equals("B-")||SISRunner.students.get(i).getGrade1().equals("B+"))
					{
						g1=3.0;
					}
				if (SISRunner.students.get(i).getGrade1().equals("C")||SISRunner.students.get(i).getGrade1().equals("C-")||SISRunner.students.get(i).getGrade1().equals("C+"))
					{
						g1=2.0;
					}
				if (SISRunner.students.get(i).getGrade1().equals("D")||SISRunner.students.get(i).getGrade1().equals("D-")||SISRunner.students.get(i).getGrade1().equals("D+"))
					{
						g1=1.0;
					}
				if (SISRunner.students.get(i).getGrade1().equals("F")||SISRunner.students.get(i).getGrade1().equals("F-")||SISRunner.students.get(i).getGrade1().equals("F+"))
					{
						g1=0.0;
					}
			if (SISRunner.students.get(i).getGrade2().equals("A")||SISRunner.students.get(i).getGrade2().equals("A-")||SISRunner.students.get(i).getGrade2().equals("A+"))
				{
					g2=4.0;
				}
			if (SISRunner.students.get(i).getGrade2().equals("B")||SISRunner.students.get(i).getGrade2().equals("B-")||SISRunner.students.get(i).getGrade2().equals("B+"))
				{
					g2=3.0;
				}
			if (SISRunner.students.get(i).getGrade2().equals("C")||SISRunner.students.get(i).getGrade2().equals("C-")||SISRunner.students.get(i).getGrade2().equals("C+"))
				{
					g2=2.0;
				}
			if (SISRunner.students.get(i).getGrade2().equals("D")||SISRunner.students.get(i).getGrade2().equals("D-")||SISRunner.students.get(i).getGrade2().equals("D+"))
				{
					g2=1.0;
				}
			if (SISRunner.students.get(i).getGrade2().equals("F")||SISRunner.students.get(i).getGrade2().equals("F-")||SISRunner.students.get(i).getGrade2().equals("F+"))
				{
					g2=0.0;
				}
				if (SISRunner.students.get(i).getGrade3().equals("A")||SISRunner.students.get(i).getGrade3().equals("A-")||SISRunner.students.get(i).getGrade3().equals("A+"))
					{
						g3=4.0;
					}
				if (SISRunner.students.get(i).getGrade3().equals("B")||SISRunner.students.get(i).getGrade3().equals("B-")||SISRunner.students.get(i).getGrade3().equals("B+"))
					{
						g3=3.0;
					}
				if (SISRunner.students.get(i).getGrade3().equals("C")||SISRunner.students.get(i).getGrade3().equals("C-")||SISRunner.students.get(i).getGrade3().equals("C+"))
					{
						g3=2.0;
					}
				if (SISRunner.students.get(i).getGrade3().equals("D")||SISRunner.students.get(i).getGrade3().equals("D-")||SISRunner.students.get(i).getGrade3().equals("D+"))
					{
						g3=1.0;
					}
				if (SISRunner.students.get(i).getGrade3().equals("F")||SISRunner.students.get(i).getGrade3().equals("F-")||SISRunner.students.get(i).getGrade3().equals("F+"))
					{
						g3=0.0;
					}			
			newGPA=(((g1+g2+g3)/3)*100)/100;
			SISRunner.students.get(i).setGPA(newGPA);
					}
				
				//When we want to print out GPA's, use the ling below to round it correctly
				
//			for (Student s: SISRunner.students)
//				{
//					System.out.printf(s.getFirst()+" "+"%.2f",s.getGPA());
//					System.out.println();
//				}
	}
	}
