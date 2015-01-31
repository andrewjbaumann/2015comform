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
	private JButton postSuggestion, readSuggestion, commentSuggestion;
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
		try
		{
			myPicture = ImageIO.read(new File("socialgoodhacks.png"));
		}
		catch(IOException e)
		{
			
		}
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));
		add(picLabel);
		
		postSuggestion = new JButton("Post Suggestion");
		readSuggestion = new JButton("Read Suggestions");
		commentSuggestion = new JButton("Comment on a suggestion");
		
		inputPanel.add(postSuggestion);
		inputPanel.add(readSuggestion);
		inputPanel.add(commentSuggestion);
	}
	
}
