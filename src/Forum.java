/*******************************************************************************************************
 * Title:			Forum.java
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
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class Forum extends JFrame
{
	private static final long serialVersionUID = 1L;
	private JPanel inputPanel, picturePanel;
	private JButton postSuggestion, readSuggestion, commentSuggestion;
	private BufferedImage myPicture;
	private JLabel picLabel;
	private JFrame myFrame = null;
	private ArrayList<Suggestions> communityForum = new ArrayList<Suggestions>();
	
	public Forum()
	{
		super();
		setLayout(new BorderLayout());
		picturePane();
		inputPane();
		getContentPane().add(picturePanel, BorderLayout.NORTH);
		getContentPane().add(inputPanel, BorderLayout.CENTER);
	}
	
	private void picturePane()
	{
		picturePanel = new JPanel();
		
		try
		{
			myPicture = ImageIO.read(new File("socialgoodhacks2.jpg"));
		}
		catch(IOException e)
		{
			
		}
		
		picLabel = new JLabel(new ImageIcon(myPicture));
		picturePanel.add(picLabel);
	}
	
	private void inputPane()
	{
		inputPanel = new JPanel();
		
		postSuggestion = new JButton("Post Suggestion");
		readSuggestion = new JButton("Read Suggestions");
		commentSuggestion = new JButton("Comment on a Suggestion");
		
		inputPanel.add(postSuggestion);
		inputPanel.add(readSuggestion);
		inputPanel.add(commentSuggestion);
		
		ActionHandler Handler = new ActionHandler();
		
		postSuggestion.addActionListener(Handler);
		readSuggestion.addActionListener(Handler);
		commentSuggestion.addActionListener(Handler);
	}
	
	private class ActionHandler implements ActionListener
	{			
		private JComboBox suggestionList;
		
		public void actionPerformed(ActionEvent event)
		{
			if(event.getSource() == postSuggestion)
			{
				int messageType = JOptionPane.INFORMATION_MESSAGE;
			    String answer = JOptionPane.showInputDialog(myFrame, "What is your suggestion?", "Suggestion Box", messageType);			
				Suggestions mySuggestion = new Suggestions();
				mySuggestion.setSuggestion(answer);
				communityForum.add(mySuggestion);
			}
			
			if(event.getSource() == readSuggestion)
			{
				int x = communityForum.size();				
				String[] myArray = new String[x];
				
				for(int i = 0; i < x; i++)
				{
					myArray[i] = communityForum.get(i).getSuggestion();
				}
				
				suggestionList = new JComboBox(myArray);
				ActionHandler thishandler = new ActionHandler();
				suggestionList.addActionListener(thishandler);
				JOptionPane.showMessageDialog(null, suggestionList);
				int value = suggestionList.getSelectedIndex();
				int messageType = JOptionPane.INFORMATION_MESSAGE;
				
				String displayMessage = "\n";
				int myint = 1;
				if(value >= 0)
				{
					for(String s:communityForum.get(value).getComments())
					{
						displayMessage += "     " + myint + ") " + s + "\n";	
						myint++;
					}
					
					JOptionPane.showMessageDialog(null, "Suggestion: " + communityForum.get(value).getSuggestion() + "\nComments:" + displayMessage);
				}
			}
			
			if(event.getSource() == commentSuggestion)
			{
				int x = communityForum.size();				
				String[] myArray = new String[x];
				
				for(int i = 0; i < x; i++)
				{
					myArray[i] = communityForum.get(i).getSuggestion();
				}
				
				suggestionList = new JComboBox(myArray);
				ActionHandler thishandler = new ActionHandler();
				suggestionList.addActionListener(thishandler);
				JOptionPane.showMessageDialog(null, suggestionList);
				int value = suggestionList.getSelectedIndex();
				int messageType = JOptionPane.INFORMATION_MESSAGE;

				if(value >= 0)
				{
				    String answer = JOptionPane.showInputDialog(myFrame, "What is your comment?", "Comment Box", messageType);			
					communityForum.get(value).setComments(answer);
				}
			}
		}
	}
}
