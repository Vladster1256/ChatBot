package chatbot.view;

import javax.swing.JFrame;

import chatbot.controller.ChatbotAppController;
/**
 * GUI frame class for chatbot, allows the window to be visible and usable
 * @author vgar7399
 * @version 1.0
 */
public class ChatbotFrame extends JFrame
{
	private ChatbotPanel basePanel;
	public ChatbotFrame(ChatbotAppController baseController)
	{
		basePanel = new ChatbotPanel(baseController);
		setupFrame();
	}
	
	/**
	 * we setup frame here
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(600,400);
		this.setResizable(false);
		setVisible(true);
	}
}
