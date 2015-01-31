import javax.swing.JFrame;

public class Community 
{
	public static void main(String[] args)
	{
		Forum myForum = new Forum();
		myForum.setTitle("Community Forum");
		myForum.setSize(1000, 1000);
		myForum.setLocationRelativeTo(null);
		myForum.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myForum.setVisible(true);
		myForum.setResizable(false);
	}
}
