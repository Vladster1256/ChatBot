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
		memeList = new ArrayList<String>();
		this.name = name;
		chatCount = 0;
		fillTheMemeList();
	}
	
	/**
	 * updates the chatcount per one every chat
	 */
	private void updateChatCount()
	{
		chatCount++;
	}
	
	private boolean memeChecker(String input)
	{
		boolean isAMeme = false;
			
		for (String currentMeme : memeList)
		{
			if(input.equalsIgnoreCase(currentMeme))
			{
				isAMeme = true;
			}
			
		}
		for (int loopCounter = 0; loopCounter < memeList.size(); loopCounter++)
		{
			if(input.equalsIgnoreCase(memeList.get(loopCounter)))
			{
				isAMeme = true;
			}
		}
		
		return isAMeme;
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
	
	/**
	 * This checks if the phase contains the word awesome and returns true or false
	 * @param input if the user input matches awesome
	 * @return true or false to containingChecker
	 */
	private boolean containingChecker(String input)
	{
		boolean containingChecker = false;
		if(input !=null && input.contains("awesome"))
		{
			containingChecker = true;
		}
		else
		{
			containingChecker = false;
		}
		return containingChecker;
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
	
	private void fillTheMemeList()
	{
		memeList.add("kitties");
		memeList.add("one does not simply");
		memeList.add("doge");
		memeList.add("why u no");
		memeList.add("what if");
		memeList.add("success");
		memeList.add("challenge accepted");
	}
	
	/**
	 * Processes input from the user against the checker methods. Returns the next output for the view
	 * @param current The supplied text.
	 * @return The processed text based on checker or other methods.
	 */
	public String processText(String current)
	{	
		String result = "";
		if (longTextChecker(current))
		{
			result =  "Wow long what a long message to me, Thanks :|";
		}	
		
		else if (memeChecker(current))
		{
			result  +=  "wow, " + current + " is a meme, wahoo!";
		}
		else if (containingChecker(current))
		{
			result = "Did that phrase contain awesome?";
		}
		else
		{
			result += current;
		}
		return result;
	}
	
}
