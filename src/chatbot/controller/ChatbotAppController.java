package chatbot.controller;

import javax.swing.JOptionPane;

import chatbot.model.Chatbot;
import chatbot.view.ChatbotView;

/**
 * Runs the Chatbot Project. Owns the model and associated views.
 * @author Vladster1256
 * @version 1.2 10/2/14
 */
public class ChatbotAppController
{
	private ChatbotView applicationView;
	private Chatbot mySillyChatbot;
	private String startMessage;
	private String quitMessage;
	
	
	public ChatbotAppController()
	{
		applicationView = new ChatbotView(this);
		mySillyChatbot = new Chatbot("Steve");
		startMessage = "Welcome to TEH awesome " + mySillyChatbot.getName() +" chatbot. What is your name?";
		quitMessage = "goodbye cruel user :(";
	}
	
	public Chatbot getMySillyChatbot()
	{
		return mySillyChatbot;
	}
	/**
	 * This initialized the start 
	 */
	public void start()
	{
		String result = applicationView.showChatbotDialog(startMessage);
		
		while(!mySillyChatbot.quitChecker(result))
		{
			result = mySillyChatbot.processText(result);
			result = applicationView.showChatbotDialog(result);
		}
		
		quit();
	}
	
	/**
	 * This quits the application and calls a last window
	 */
	private void quit()
	{
		applicationView.showChatbotMessage(quitMessage);
		System.exit(0);
	}
}
