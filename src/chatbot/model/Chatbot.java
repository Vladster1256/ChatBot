package chatbot.model;

/**
 * The chatbot model class. Used for checking and manipulating Strings.
 * @author Vladster1256
 *@version 1.1 9/26/14
 */
public class Chatbot
{

	private String name;
	private int chatCount;
	
	/**
	 * Creates a ChatBot Object with the supplied name and initializes the current number of chats to 0.
	 * @param name The supplied name for the Chatbot.
	 */
	public Chatbot(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getChatCount()
	{
		return chatCount;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	private void updateChatCount()
	{
		chatCount++;
	}
	
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
