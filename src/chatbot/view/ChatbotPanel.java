package chatbot.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import chatbot.controller.ChatbotAppController;
import chatbot.model.Chatbot;
import chatbot.model.ChatbotUser;

/**
 * This is the class for our GUI panel, that sticks in the frame
 * 
 * @author vgar7399
 * @version 1.0
 */
public class ChatbotPanel extends JPanel
{
	/**
	 * This is the string spam, that contains tons of smiley faces.
	 */
	private String spam;
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
	 * JTextArea with name of chatArea
	 */
	private JTextArea chatArea;
	/**
	 * JScroll Pane wih name of chatPane
	 */
	private JScrollPane chatPane;
	private JButton loadChat;
	
	

	/**
	 * This is the constructor for the chatbotpanel, we are declaring all of our
	 * variables and objects in this.
	 * 
	 * @param baseController
	 *            from the ChatbotAppController
	 */
	public ChatbotPanel(ChatbotAppController baseController)
	{
		this.baseController = baseController;
		firstButton = new JButton("Click Here to Send Message");
		firstTextField = new JTextField(25);
		baseLayout = new SpringLayout();
		baseLayout.putConstraint(SpringLayout.SOUTH, firstTextField, -18, SpringLayout.NORTH, firstButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstButton, 0, SpringLayout.EAST, firstTextField);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 191, SpringLayout.WEST, this);
		chatArea = new JTextArea(5, 20);
		chatPane = new JScrollPane(chatArea);
		baseLayout.putConstraint(SpringLayout.NORTH, chatPane, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, chatPane, 277, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, chatPane, 590, SpringLayout.WEST, this);
		spam = new String(" :) :) :) :) :) :) :) :) :) :) :) :) :) :) :) :) :) :) :) :) :) :) :) :) :) :) :) ");
		

		setupPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}

	/**
	 * We setup Pane containing the linewrap and wrapstyleword
	 */
	private void setupPane()
	{
		chatArea.setAutoscrolls(true);
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
		chatArea.setEditable(false);
	}

	/**
	 * This is the panel parameters for the panel
	 */
	private void setupPanel()
	{
		this.setBackground(Color.blue);
		this.setSize(600, 400);
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(firstTextField);
		this.add(chatPane);
		
		
		JButton saveChat = new JButton("Save Chat");
		baseLayout.putConstraint(SpringLayout.NORTH, saveChat, 0, SpringLayout.NORTH, firstTextField);
		baseLayout.putConstraint(SpringLayout.WEST, saveChat, 44, SpringLayout.WEST, this);
		add(saveChat);
		
		loadChat = new JButton("Load Chat");
		baseLayout.putConstraint(SpringLayout.SOUTH, loadChat, 0, SpringLayout.SOUTH, firstButton);
		baseLayout.putConstraint(SpringLayout.EAST, loadChat, 0, SpringLayout.EAST, saveChat);
		add(loadChat);

	}

	/**
	 * This is the layout for the content on the panel
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, chatPane, 20, SpringLayout.WEST, this);
	}

	/**
	 * We set up listener for first button
	 */
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String currentInput = firstTextField.getText();
				String result = baseController.getChatbotDialog(currentInput);
				showTextMessage("User Says:" + currentInput);
				showTextMessage(baseController.getMySillyChatbot().getName() + " Says: " + result);
				firstTextField.setText("");
				firstTextField.requestFocus(true);
				
			}

		});
		
//		loadButton.addActionListener(new ActionListener()
//		{
//			public void actionPerformed(ActionEvent click)
//			{
//				String savedChat = baseController.readTextFromFile();
//				if(savedChat.length()<1)
//				{
//					chatArea.setText("no text in file");
//				}
//				else
//				{
//					chatArea.saveText(chatArea,true);
//				}
//			}
//				
//		});
//		
//		saveChat.addActionListener(new ActionListener()
//		{
//			public void actionPerformed(ActionEvent click)
//			{
//				String savedChat = baseController.writeTextToFile();
//				if(chatArea.length()<1)
//				{
//					chatArea.setText("no text in chat area :()");
//				}
//				else
//				{
//					
//				}
//			}
//		});
//		
	}

	/**
	 * Sends user input on a new line in the chat dialog
	 * @param userInput is the input from user
	 */
	public void showTextMessage(String userInput)
	{
		chatArea.append("\n" + userInput);

	}
}
