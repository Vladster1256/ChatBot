package chatbot.controller;

import javax.swing.JOptionPane;

import chatbot.model.Chatbot;
import chatbot.view.ChatbotFrame;
import chatbot.view.ChatbotPanel;
import chatbot.view.ChatbotView;

/**
 * Runs the Chatbot Project. Owns the model and associated views.
 * @author Vladster1256
 * @version 1.2 10/2/14
 */
public class ChatbotAppController
{
	/**
	 * The instance of the app view, view of this app
	 */
	private ChatbotView applicationView;
	private Chatbot mySillyChatbot;
	private String startMessage;
	private String quitMessage;
	private String userName;
	
	/**
	 * Reference to the GUI JFrame object for the application
	 */
	private ChatbotFrame appFrame;
	
	/**
	 * This instantiates objects with the values
	 */
	public ChatbotAppController()
	{
		applicationView = new ChatbotView(this);
		appFrame = new ChatbotFrame(this);
		mySillyChatbot = new Chatbot("Steve");
		startMessage = "Welcome to TEH awesome " + mySillyChatbot.getName() +" chatbot. What is your name?";
		quitMessage = "goodbye cruel user :(";
		userName = "";
	}
	
	/**
	 * this sends MySillyChatbot to the chatbot class
	 * @return mySillychatbot
	 */
	public Chatbot getMySillyChatbot()
	{
		return mySillyChatbot;
	}
	/**
	 * This initialized the start, a loop
	 */
	public void start()
	{

		((ChatbotPanel) appFrame.getContentPane()).showTextMessage(startMessage);
		
//		ChatbotPanel textPanel = (ChatbotPanel) appFrame.getContentPane();
//		textPannel.showTextMessage(startMessage);
		
	}
	
	/**
	 * this is the getter for chatbot dialog, which checks for the word "quit"
	 * @param input is user input
	 * @return result
	 */
	public String getChatbotDialog(String input)
	{
		String result = "";
		
		if(mySillyChatbot.quitChecker(input))
		{
			quit();
		}
		
		result = mySillyChatbot.processText(input);
	
		
		return result;
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
