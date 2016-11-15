import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Menu
	{
		private static final long serialVersionUID=1L;
		static JFrame frame=new JFrame();
		public static void doMain()
			{
				int mainChoice;
				Object[] options = {"Add or Delete Student", "Change Student's Grade/Schedule", "Sort Students"};
				ImageIcon icon =  new ImageIcon("mn.jpg");
				mainChoice = JOptionPane.showOptionDialog(null, 
					"",
					"Student Information System",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE, 
					icon,
					options, 
					options[1]);
					switch(mainChoice)
					{
					case 0:
						{
						doAddDeleteMenu();
						JOptionPane.showMessageDialog(frame, "");
						break;
						}
					case 1:
						{
						doChangeMenu();
						JOptionPane.showMessageDialog(frame, "");
						break;
						}
					case 2:
						{
						doSortMenu();
						JOptionPane.showMessageDialog(frame, "");	
						break;
						}
					}
			}
		public static void doAddDeleteMenu()
		{
			int addDeleteChoice;
			Object[] options = {"Add a Student", "Delete a Student"};
			ImageIcon icon =  new ImageIcon("32.jpg");
			addDeleteChoice = JOptionPane.showOptionDialog(null, 
				"Add or Delete Menu",
				"Student Information System",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, 
				icon,
				options, 
				options[1]);
				switch(addDeleteChoice)
				{
				case 0:
					{
					JOptionPane.showMessageDialog(frame, "");
					break;
					}
				case 1:
					{
					JOptionPane.showMessageDialog(frame, "");
					break;
					}
				}
		}
		public static void doChangeMenu()
		{
			int changeChoice;
			Object[] options = {"Change Grade", "Switch Classes"};
			ImageIcon icon =  new ImageIcon("32.jpg");
			changeChoice = JOptionPane.showOptionDialog(null, 
				"Change Menu",
				"Student Information System",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, 
				icon,
				options, 
				options[1]);
				switch(changeChoice)
				{
				case 0:
					{
					JOptionPane.showMessageDialog(frame, "");
					break;
					}
				case 1:
					{
					JOptionPane.showMessageDialog(frame, "");
					break;
					}
				}
		}
		public static void doSortMenu()
		{
			int sortChoice;
			Object[] options = {"Sort by Last Name", "Sort by GPA", "Sort by Class"};
			ImageIcon icon =  new ImageIcon("32.jpg");
			sortChoice = JOptionPane.showOptionDialog(null, 
				"Main Menu",
				"Student Information System",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, 
				icon,
				options, 
				options[1]);
				switch(sortChoice)
				{
				case 0:
					{
					JOptionPane.showMessageDialog(frame, "");
					break;
					}
				case 1:
					{
					JOptionPane.showMessageDialog(frame, "");
					break;
					}
				case 2:
					{
					JOptionPane.showMessageDialog(frame, "");	
					break;
					}
				}
		}
	}
