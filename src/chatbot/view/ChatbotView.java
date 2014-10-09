package chatbot.view;

import javax.swing.JOptionPane;

import chatbot.controller.ChatbotAppController;

/**
 * This is where our chatbot will show up, all of the input is analized by the chatbot, chatbotAppController, and sent to here for GUI
 * @author Vladster1256
 * @version 1.0
 */
public class ChatbotView
{
	/**
	 * sets ChatbotAppController as the baseController
	 */
	private ChatbotAppController baseController;
	
	/**
	 * makes the basecontroller = to the basecontroller we need
	 * @param baseController is what our ChatBotAppController is
	 */
	public ChatbotView(ChatbotAppController baseController)
	{
		this.baseController = baseController;
	}
	
	/**
	 * Shows a String from the Chatbot wit the availability of user input.
	 * @param currentInput The supplied String
	 * @return The users types response.
	 */
	public String showChatbotDialog(String currentInput)
	{
		String result = "";
		
		result = JOptionPane.showInputDialog(null, baseController.getMySillyChatbot().getName() + " says: " + currentInput);
		return result;
	}
	
	/**
	 * Show a String from the Chatbot as a popup window
	 * @param currentInput The string from the Chatbot.
	 */
	 public void showChatbotMessage(String currentInput)
	 {
		 JOptionPane.showMessageDialog(null, baseController.getMySillyChatbot().getName() + " says: " + currentInput); 
	 }
	
}
