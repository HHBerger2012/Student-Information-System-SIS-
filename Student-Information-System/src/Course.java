
public class Course
	{
		int period;
		String className;
		char grade;
		public Course(int p, String cn, char g)
		{
			period=p;
			className=cn;
			grade=g;
		}
		public int getPeriod()
			{
				return period;
			}
		public void setPeriod(int period)
			{
				this.period = period;
			}
		public String getClassName()
			{
				return className;
			}
		public void setClassName(String className)
			{
				this.className = className;
			}
		public char getGrade()
			{
				return grade;
			}
		public void setGrade(char grade)
			{
				this.grade = grade;
			}
	}
