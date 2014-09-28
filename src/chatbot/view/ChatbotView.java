package chatbot.view;

import javax.swing.JOptionPane;

import chatbot.controller.ChatbotAppController;
import chatbot.model.Chatbot;

public class ChatbotView
{
	private static final String Chatbot = null;
	private ChatbotAppController baseController;
	
	public ChatbotView(ChatbotAppController baseController)
	{
		this.baseController = baseController;
	}
	public String showChatbot(String currentInput)
	{
		String result = "";
		
		JOptionPane.showMessageDialog(null, "Hello, " + currentInput);
		result = JOptionPane.showInputDialog(null, "are you done?");
		return result;
	}
	
	public ChatbotView(mySillyChatbot Chatbot)
	{	
	if(longTextChecker.result=true)
		{
			JOptionPane.showMessageDialog(null, "Wow that is a long message");
		}	
	}
}
