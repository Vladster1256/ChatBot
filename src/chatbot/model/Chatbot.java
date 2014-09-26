package chatbot.model;

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
}
