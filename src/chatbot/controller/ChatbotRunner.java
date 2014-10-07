package chatbot.controller;

/**
 * The runner for chatbot
 * @author Vladster1256
 * @version 10/7/14
 */
public class ChatbotRunner
{
	
	/**
	 * Starting point for all java programs
	 * @param args unused!
	 */
	public static void main(String[] args)
	{
		ChatbotAppController appController = new ChatbotAppController();
		appController.start();
		
	}

}
