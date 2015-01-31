/*******************************************************************************************************
 * Title:			Community.java
 * Author:			Tony Zheng, Andrew Baumann, Grace Liang, Katherine Sullivan 
 * Special thanks: 	Devon
 * Created On:		January 31, 2015
 * Description:		A small scale pseudo community forum where users can post suggestions about 
 * 					improving the community and getting people more involved by posting comments on how 
 * 					they can achieve it.
 * Build with:		Eclipse or using the following commands
 * 					To compile: javac Community.java Forum.java Suggestions.java
 * 					To run: 	java Community.java
 *******************************************************************************************************/
import javax.swing.JFrame;

public class Community 
{
	public static void main(String[] args)
	{
		Forum myForum = new Forum();
		myForum.setTitle("Community Forum");
		myForum.setSize(750, 550);
		myForum.setLocationRelativeTo(null);
		myForum.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myForum.setVisible(true);
		myForum.setResizable(false);
	}
}
