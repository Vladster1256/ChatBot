package chatbot.view;

import javax.swing.JOptionPane;

import chatbot.controller.ChatbotAppController;

public class ChatbotView
{
	private ChatbotAppController baseController;
	
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
