package chatbot.model;

/**
 * The chatbot model class. Used for checking and manipulating Strings.
 * @author Vladster1256
 *@version 1.1 9/26/14
 */
public class Chatbot
{
	/**
	 * Creates a ChatBot Object with the supplied name and initializes the current number of chats to 0.
	 * @param name The supplied name for the Chatbot.
	 */
	private String name;
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
	 * This checks our input for sayonara and returns okToQuit to the ChatbotAppController
	 * @param input analizes our input
	 * @return returns our okToQuit
	 */
	public boolean quitChecker(String input)
	{
		boolean okToQuit = false;
		
		if(input.equalsIgnoreCase("sayonara"))
		{
			okToQuit=true;
		}
		return okToQuit;
	}
}
