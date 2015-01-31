import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.awt.Graphics;
import javax.imageio.ImageIO;


public class Forum extends JFrame
{
	private JPanel inputPanel;
	/*post a suggestion to the forum, read through people's suggestions, 
	  and comment suggestions */
	private JButton postSuggestion, readSuggestion, commentSuggestion;
	
	//adds a logo image 
	private BufferedImage myPicture;

	public Forum()
	{
		super();
		setLayout(new BorderLayout());
		inputPane();
		getContentPane().add(inputPanel, BorderLayout.CENTER);
	}
	
	private void inputPane()
	{
		inputPanel = new JPanel();
		//"socialgoodhacks" picture
		try
		{
			myPicture = ImageIO.read(new File("socialgoodhacks.png"));
		}
		catch(IOException e)
		{
			
		}
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));
		add(picLabel);
		
		//man progrma screen buttons
		postSuggestion = new JButton("Post Suggestion");
		readSuggestion = new JButton("Read Suggestions");
		commentSuggestion = new JButton("Comment on a suggestion");
		
		inputPanel.add(postSuggestion);
		inputPanel.add(readSuggestion);
		inputPanel.add(commentSuggestion);
	}
	
}
