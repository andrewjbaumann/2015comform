/*******************************************************************************************************
 * Title:			Suggestions.java
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

public class Suggestions 
{
	private String suggestion;
	public ArrayList<String> comments;
	
	public Suggestions()
	{
		suggestion = "";
		comments = new ArrayList<String> ();
	}
	
	public String getSuggestion() 
	{
		return suggestion;
	}
	
	public void setSuggestion(String suggestion) 
	{
		this.suggestion = suggestion;
	}
	
	public ArrayList<String> getComments() 
	{
		return comments;
	}
	
	public void setComments(String answer) 
	{
		this.comments.add(answer);
	}
}
