package chatbot.model;

import java.util.ArrayList;

/**
 * The chatbot model class. Used for checking and manipulating Strings.
 * @author Vladster1256
 *@version 1.1 9/26/14
 */
public class Chatbot
{
	private ArrayList <String> memeList;
	
	/**
	 * Creates a ChatBot Object with the supplied name and initializes the current number of chats to 0.
	 * @param name The supplied name for the Chatbot.
	 */
	private String name;
	
	/**
	 * This is for the chatCount
	 */
	private int chatCount;
	
	/**
	 * This makes the Chatbot from this file equal with the chatbot app controller file
	 * @param name The new name for the Chatbot.
	 */
	public Chatbot(String name)
	{
		this.name = name;
	}
	
	/**
	 * This is a really important method. Add lots of lines
	 * and more
	 * and more
	 * more lines
	 * much wow!!
	 * @returns name to the chatbot app controller
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * gives us chatcount
	 * @return chatcount
	 */
	public int getChatCount()
	{
		return chatCount;
	}
	
	/**
	 *This sets the name for the chatbot
	 * @param name makes the name of the chatbot equal to this chatbot
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * updates the chatcount per one every chat
	 */
	private void updateChatCount()
	{
		chatCount++;
	}
	
	/**
	 * This checks our input for quit and returns okToQuit to the ChatbotAppController
	 * @param input analyzes our input
	 * @return returns our okToQuit
	 */
	public boolean quitChecker(String input)
	{
		boolean okToQuit = false;
		
		if(input != null && input.equalsIgnoreCase("quit"))
		{
			okToQuit=true;
		}
		return okToQuit;
	}
	
	/**
	 * This checks how long our input is and return true or false
	 * @param input analyzes the input
	 * @return our longTextChecker
	 */
	private boolean longTextChecker(String input)
	{
		boolean longTextChecker = false;
		if(input !=null && input.length()>=50)
		{
			 longTextChecker = true;
		}
		else
		{
			longTextChecker = false;
		}
		return longTextChecker;
	}
	
	public String processText(String current)
	{	
		if (longTextChecker(current))
		{
			return "Wow long thang";
		}
		else
		{
			return current;
		}
		
	}
	
}
