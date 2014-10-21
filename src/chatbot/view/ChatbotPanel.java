package chatbot.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import chatbot.controller.ChatbotAppController;

/**
 * This is the class for our GUI panel, that sticks in the frame
 * @author vgar7399
 * @version 1.0
 */
public class ChatbotPanel extends JPanel
{	
	/**
	 * This calls the ChatbotAppController baseController in declaration section
	 */
	private ChatbotAppController baseController;
	
	/**
	 * Button with name of firstButton
	 */
	private JButton firstButton;
	/**
	 * JTextField with name of firstTextField
	 */
	private JTextField firstTextField;
	/**
	 * SpringLayout with name of baseLayout
	 */
	private SpringLayout baseLayout;
	/**
	 * 
	 */
	private JTextArea chatArea;
	/**
	 * JScroll Pane wih name of chatPane
	 */
	private JScrollPane chatPane;
	
	/**
	 * This is the constructor for the chatbotpanel
	 * @param baseController from the ChatbotAppController
	 */
	public ChatbotPanel(ChatbotAppController baseController)
	{
		this.baseController = baseController;
		firstButton = new JButton("click the button... it is so clickly :D");
		firstTextField = new JTextField(25);
		baseLayout = new SpringLayout();
		chatArea = new JTextArea(5,20);
		chatPane = new JScrollPane(chatArea);
		
		
		setupPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPane()
	{
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
	}
	
	/**
	 * This is the panel parameters for the panel
	 */
	private void setupPanel()
	{
		this.setBackground(Color.magenta);
		this.setSize(600,400);
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(firstTextField);
		this.add(chatPane);
		
	}
	
	/**
	 * This is the layout for the content on the panel
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.SOUTH, firstTextField, -33, SpringLayout.NORTH, firstButton);
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 0, SpringLayout.WEST, firstTextField);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstButton, -22, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 189, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, chatPane, 50, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatPane, 20, SpringLayout.WEST, this);
	}
	
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				firstTextField.setText(firstTextField.getText()+ " :)");
			}
			
		});
	}
}
