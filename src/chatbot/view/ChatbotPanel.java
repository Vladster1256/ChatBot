package chatbot.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import chatbot.controller.ChatbotAppController;

public class ChatbotPanel extends JPanel
{	
	private ChatbotAppController baseController;
	
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	
	public ChatbotPanel(ChatbotAppController baseController)
	{
		this.baseController = baseController;
		firstButton = new JButton("click the button... it is so clickly :D");
		firstTextField = new JTextField(25);
		baseLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.magenta);
		this.setSize(600,400);
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(firstTextField);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.SOUTH, firstTextField, -33, SpringLayout.NORTH, firstButton);
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 0, SpringLayout.WEST, firstTextField);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstButton, -22, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 189, SpringLayout.WEST, this);
		
	}
	
	private void setupListeners()
	{
		
	}
}
