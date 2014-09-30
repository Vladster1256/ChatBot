package chatbot.controller;

import javax.swing.JOptionPane;

import chatbot.model.Chatbot;
import chatbot.view.ChatbotView;

public class ChatbotAppController
{
	private ChatbotView applicationView;
	private Chatbot mySillyChatbot;
	
	
	public ChatbotAppController()
	{
		applicationView = new ChatbotView(this);
		mySillyChatbot = new Chatbot("Steve");
	}
	
	/**
	 * This initialized the start 
	 */
	public void start()
	{
		String result = applicationView.showChatbot("Steve");
		
		while(!mySillyChatbot.quitChecker(result))
		{
			result = mySillyChatbot.processText(result);
			result = applicationView.showChatbot(result);
		}
		
		quit();
	}
	
	/**
	 * This quits the application and calls a last window
	 */
	private void quit()
	{
		JOptionPane.showMessageDialog(null, "GOOD BYE!!!!!!!!");
		System.exit(0);
	}
}
