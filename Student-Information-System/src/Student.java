
public class Student
	{
		String first, last;
		double GPA;
		Course firstPeriod, secondPeriod, thirdPeriod;
		public Student (String f, String l, double g, Course q, Course w, Course e)
		{
			first=f;
			last=l;
			GPA=g;
			firstPeriod=q;
			secondPeriod=w;
			thirdPeriod=e;
		}
		public String getFirst()
			{
				return first;
			}
		public void setFirst(String first)
			{
				this.first = first;
			}
		public String getLast()
			{
				return last;
			}
		public void setLast(String last)
			{
				this.last = last;
			}
		public double getGPA()
			{
				return GPA;
			}
		public void setGPA(double gPA)
			{
				GPA = gPA;
			}
		public Course getFirstPeriod()
			{
				return firstPeriod;
			}
		public void setFirstPeriod(Course firstPeriod)
			{
				this.firstPeriod = firstPeriod;
			}
		public Course getSecondPeriod()
			{
				return secondPeriod;
			}
		public void setSecondPeriod(Course secondPeriod)
			{
				this.secondPeriod = secondPeriod;
			}
		public Course getThirdPeriod()
			{
				return thirdPeriod;
			}
		public void setThirdPeriod(Course thirdPeriod)
			{
				this.thirdPeriod = thirdPeriod;
			}
	}

