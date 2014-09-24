package chatbot.controller;

import javax.swing.JOptionPane;

import chatbot.view.ChatbotView;

public class ChatbotAppController
{
	private ChatbotView applicationView;
	
	public ChatbotAppController()
	{
		applicationView = new ChatbotView(this);
	}
	
	public void start()
	{
		String result = applicationView.showChatbot("Steve");
		
		if(result.equalsIgnoreCase("exit"))
		{
			quit();
		}
	}
	
	private void quit()
	{
		JOptionPane.showMessageDialog(null, "GOOD BYE!!!!!!!!");
		System.exit(0);
	}
}
