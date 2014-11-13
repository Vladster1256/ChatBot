package chatbot.model;

import java.util.ArrayList;
import chatbot.model.ChatbotUser;

/**
 * The chatbot model class. Used for checking and manipulating Strings.
 * 
 * @author Vladster1256
 * @version 1.4 9/26/14
 */
public class Chatbot
{
	/**
	 * the list of user input for the chatbot
	 */
	private ArrayList<String> userInputList;

	private ArrayList<String> memeList;

	/**
	 * Creates a ChatBot Object with the supplied name and initializes the
	 * current number of chats to 0.
	 * 
	 * @param name
	 *            The supplied name for the Chatbot.
	 */
	private String name;

	/**
	 * This is for the chatCount
	 */
	private int chatCount;

	/**
	 * This initializes the ChatbotUser class to ask questions of the user
	 */
	private ChatbotUser myUser;

	/**
	 * This makes the Chatbot from this file equal with the chatbot app
	 * controller file
	 * 
	 * @param name
	 *            The new name for the Chatbot.
	 */
	public Chatbot(String name)
	{
		userInputList = new ArrayList<String>();
		memeList = new ArrayList<String>();
		this.name = name;
		chatCount = 0;
		fillTheMemeList();
		myUser = new ChatbotUser();
	}

	/**
	 * updates the chatcount per one every chat
	 */
	private void updateChatCount()
	{
		chatCount++;
	}

	/**
	 * This checks the for loop and returns true or false, every time.
	 * 
	 * @param input
	 *            is the user input and gets checked by memeChecker
	 * @return true or false every time
	 */
	private boolean memeChecker(String input)
	{
		boolean isAMeme = false;

		for (String currentMeme : memeList)
		{
			if (input != null && input.equalsIgnoreCase(currentMeme))
			{
				isAMeme = true;
			}

		}
		for (int loopCounter = 0; loopCounter < memeList.size(); loopCounter++)
		{
			if (input != null && input.equalsIgnoreCase(memeList.get(loopCounter)))
			{
				isAMeme = true;
			}
		}

		return isAMeme;
	}

	/**
	 * This checks our input for quit and returns okToQuit to the
	 * ChatbotAppController
	 * 
	 * @param input
	 *            analyzes our input
	 * @return returns our okToQuit
	 */
	public boolean quitChecker(String input)
	{
		boolean okToQuit = false;

		if (input != null && input.equalsIgnoreCase("quit"))
		{
			okToQuit = true;
		}
		return okToQuit;
	}

	/**
	 * This checks how long our input is and return true or false
	 * 
	 * @param input
	 *            analyzes the input
	 * @return our longTextChecker
	 */
	private boolean longTextChecker(String input)
	{
		boolean longTextChecker = false;
		if (input != null && input.length() >= 50)
		{
			longTextChecker = true;
		} else
		{
			longTextChecker = false;
		}
		return longTextChecker;
	}

	/**
	 * This checks if the phase contains the word awesome and returns true or
	 * false
	 * 
	 * @param input
	 *            if the user input matches awesome
	 * @return true or false to containingChecker
	 */
	private boolean containingChecker(String input)
	{
		boolean containingChecker = false;
		if (input != null && input.contains("awesome"))
		{
			containingChecker = true;
		} else
		{
			containingChecker = false;
		}
		return containingChecker;
	}

	/**
	 * This is a really important method. Add lots of lines and more and more
	 * more lines much wow!!
	 * 
	 * @returns name to the chatbot app controller
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * gives us chatcount
	 * 
	 * @return chatcount
	 */
	public int getChatCount()
	{
		return chatCount;
	}

	public int setChatCount(int chatCount)
	{
		return this.chatCount = chatCount;
	}

	/**
	 * 
	 * @return
	 */
	public ChatbotUser getMyUser()
	{
		return myUser;
	}

	/**
	 * 
	 * @param myUser
	 */
	public void setMyUser(ChatbotUser myUser)
	{
		this.myUser = myUser;
	}

	/**
	 * This sets the name for the chatbot
	 * 
	 * @param name
	 *            makes the name of the chatbot equal to this chatbot
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * These are memes that we put in the fillTheMemeList
	 */
	private void fillTheMemeList()
	{
		memeList.add("kitties");
		memeList.add("one does not simply");
		memeList.add("doge");
		memeList.add("why u no");
		memeList.add("what if");
		memeList.add("success");
		memeList.add("challenge accepted");
	}

	/**
	 * Processes input from the user against the checker methods. Returns the
	 * next output for the view
	 * 
	 * @param current
	 *            The supplied text.
	 * @return The processed text based on checker or other methods.
	 */
	public String processText(String current)
	{
		String result = "";

		if (getChatCount() < 7)
		{
			// prompt user for their person information
			// you will need ifs or a switch
			if (current != null)
			{
				if (getChatCount() == 0)
				{
					result = "Chatbot is still initializing, please repeat your last answer again";
				} else if (getChatCount() == 1)

				{
					myUser.setUserName(current);
					result = "JK, i was messing me with you. I got that your name is " + myUser.getUserName() + ". I will remember that, now how old are you " + myUser.getUserName();
				} else if (getChatCount() == 2)
				{
					
					if (Integer.parseInt(current) > 122)
					{
						myUser.setAge(Integer.parseInt(current));
						result = "Ok, " + myUser.getUserName() + ", are you the oldest living being in the world? Now, do you haz sweg?";
					} else
					{
						myUser.setAge(Integer.parseInt(current));
						result = "Ok, " + myUser.getUserName() + " is " + myUser.getAge() + ". Do you haz sweg?";
					}
					}
				} else if (getChatCount() == 3)
				{

					if (current.equalsIgnoreCase("yes"))
					{
						result = "NO, only Spooderman can haz sweg, how much dank are you? (default dankness level is set at" + myUser.getAmountOfDankness() + ")";
						myUser.setHazSweg(true);
					} else if (current.equalsIgnoreCase("yep"))
					{
						result = "NO, only Spooderman can haz sweg, how much dank are you? (default dankness level is set at" + myUser.getAmountOfDankness() + ")";
						myUser.setHazSweg(true);
					} else
					{
						result = "Only Spooderman can haz sweg, good thing you knew that, how much dank are you? (default dankness level is set at" + myUser.getAmountOfDankness() + ")";
						myUser.setHazSweg(false);
					}
				} else if (getChatCount() == 4)
				{
					if (Long.parseLong(current) > 2147483647)
					{
						result = myUser.getUserName() + "The dankness level you have entered is larger than 2147483648, your dankness level is " + myUser.getAmountOfDankness();
					} else
					{
						myUser.setAmountOfDankness(Integer.parseInt(current));
						result = myUser.getUserName() + " now has a dank level of " + myUser.getAmountOfDankness() + ". That is pretty dank. How many triples did you achieve throughout your life? (enter a decimal value)";
					}
				} else if (getChatCount() == 5)
				{
					myUser.setAmountOfTriples(Double.parseDouble(current));
					result = "asdf";
				}
				updateChatCount();
			}

		} 
	else
		{
			if (current != null & getChatCount() >= 7)
			{

				int randomPosition = (int) (Math.random() * 6);
				if (current != null)
				{
					if (randomPosition == 0)
					{
						if (longTextChecker(current))
						{
							result = "Wow long what a long message to me, Thanks :| " + current;
						} else
						{
							result = "Do you think you could make the phrase a little shorter?";
						}
					} else if (randomPosition == 1)
					{
						if (containingChecker(current))
						{
							result = "Did that phrase contain awesome?";
						} else
						{
							result = "The last phrase did not contain awesome, you are not awesome anymore";
						}
					} else if (randomPosition == 2)
					{
						if (memeChecker(current))
						{
							result += "wow, " + current + " is a meme, wahoo!";
						} else
						{
							result += "You didn't list a meme i like";
						}
					} else if (randomPosition == 3)
					{
						// Talk about the user here :D

					} 
					else if (randomPosition == 4)
					{
						userInputList.add(current);
						result = "Thank you for the comment";
					}
					else
					{
						if (userInputChecker(current))
						{

						} else
						{

						}
					}
				}
			} else
			{
				result = "Did you try close me out? oh no you didn't!!!!!!!!!!!!";
			}
			updateChatCount();

		}
		return result;
	}

	private boolean userInputChecker(String userInput)
	{
		boolean matchesInput = false;

		for (int loopCount = 0; loopCount < userInputList.size(); loopCount++)
		{
			if (userInput.equalsIgnoreCase(userInputList.get(loopCount)))
			{
				matchesInput = true;
				userInputList.remove(loopCount);
				loopCount--;
			} else
			{

			}
		}
		return matchesInput;
	}
}
