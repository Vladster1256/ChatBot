package chatbot.model;

import java.util.ArrayList;
import java.util.Random;

import chatbot.model.ChatbotUser;

/**
 * The chatbot model class. Used for checking and manipulating Strings.
 * 
 * @author Vladster1256
 * @version 2.0 9/26/14
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
	 * Checker for keyboard mashing
	 * @param userInput The user text
	 * @return isMashing
	 */
	private boolean mashChecker(String userInput)
	{
		boolean isMashing = false;
		if(userInput.indexOf("asdf")> -1)
		{
			isMashing = true;
		}
		return isMashing;
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

		if(current.equalsIgnoreCase("help") & chatCount > 0)
		{
			result = "help: help menu. \n quit: quit the app. \n Favorite MEMES: kitties, one does not simply, doge, why u no, what if, success, challenge accepted";
		}
		else
		{
		if (getChatCount() < 10 && current != null)
		{
			// prompt user for their person information
			// you will need ifs or a switch
			if (current != null)
			{
				if (getChatCount() == 0)
				{
					if (current.equalsIgnoreCase("Skip"))
					{
						chatCount = 8;
						result = "You have skipped the intro questions, chatbot doesn't know anything about you, you should start chatbot over again to have chatbot know you better";
					} else
					{
						result = "Chatbot is still initializing, please repeat your last answer again. Say HELP at anytime for help";
					}
				} else if (getChatCount() == 1)

				{
					myUser.setUserName(current);
					result = "JK, i was messing with you. I got that your name is " + myUser.getUserName() + ". I will remember that, now how old are you " + myUser.getUserName() + "?";
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
				} else if (getChatCount() == 3)
				{
					if (current.equalsIgnoreCase("yes") || current.equalsIgnoreCase("yep"))
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
						result = myUser.getUserName() + " The dankness level you have entered is larger than 2147483647, your dankness level is " + myUser.getAmountOfDankness() + ". How many triples did you achieve throughout your life? (enter a decimal value)";
					} else
					{
						myUser.setAmountOfDankness(Integer.parseInt(current));
						result = myUser.getUserName() + " now has a dank level of " + myUser.getAmountOfDankness() + ". That is pretty dank. How many triples did you achieve throughout your life? (enter a decimal value)";
					}
				} else if (getChatCount() == 5)
				{
					myUser.setAmountOfTriples(Double.parseDouble(current));
					result = myUser.getUserName() + " only got " + myUser.getAmountOfTriples() + " triples. That is pretty dank. How many nukes did you get throught your life? ";
				} else if (getChatCount() == 6)
				{
					myUser.setAmountOfNukesAchieved(Integer.parseInt(current));
					result = myUser.getUserName() + " has gotten " + myUser.getAmountOfNukesAchieved() + ". That is pretty dank. What is your power level " + myUser.getUserName();
				} else if (getChatCount() == 7)
				{
					myUser.setPowerLevel(Integer.parseInt(current));
					if (myUser.getPowerLevel() > 9000)
					{
						result = "ITS OVER 9000!!!!!";
					} else
					{
						result = "you are too lame as your power level isn't over 9000. Do you like Doritos?";
					}
				}
				else if(getChatCount() == 8)
				{
					if (current.equalsIgnoreCase("yes") || current.equalsIgnoreCase("yep") )
					{
						myUser.setLikesDoritos(true);
						result = "You have MLG Dankness, illuminati confirms this message. Do you like DEW?";
					} else 
					{
						myUser.setLikesDoritos(false);
						result = "You stink, illuminati will 360 noskope you. Get Ready to get REKT. Do you like DEW?";
					}
				}
				else if(getChatCount() == 9)
				{
					result = myUser.getUserName() + ", do you like DEW?";

					if (current.equalsIgnoreCase("yes") || current.equalsIgnoreCase("yep") )
					{
						myUser.setLikesDEW(true);
						result = "You have MLG Dankness, illuminati confirms this message";
					} else 
					{
						myUser.setLikesDEW(false);
						result = "You stink, illuminati will 360 noskope you. Get Ready to get REKT";
					}
				}
				updateChatCount();
			}
			return result;

		} else
		{
			if (current != null & getChatCount() >= 10)
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
						userInputList.add(current);
						result = "Thank you for the comment";
					} else if (randomPosition == 4)
					{
						if(mashChecker(current))
						{
							result = mashingDetected(current);
						}
						else
						{
							result = noMashingDetected(current);
						}
					}
					else
					{
						if (userInputChecker(current))
						{
						    //result = "Here is what " + myUser.getUserName()+" has said before: " + ArrayList<userInputList[new Random().nextInt(userInputList)]>;
							result = "I got something previous";
						} else
						{
							result = "I didn't quite add anything to my list of things you wrote to me yet";
						}
					}
				}
				return result;
			} else
			{
				result = "Did you try close me out? oh no you didn't!!!!!!!!!!!!";
				chatCount--;
			}
			updateChatCount();
		}
		

	}
		return result;
	}
	
	/**
	 * This is the mashing detected method that returns a result when chatbot detects mashing
	 * @param input is user input
	 * @return mashed
	 */
	private String mashingDetected(String input)
	{
		String mashed = "";
		
		mashed = input.substring(input.length()/2);
		mashed += input.substring(input.length()/2);
		mashed += input.substring(input.length()/2);
		mashed += input.substring(input.length()/2);
		mashed += input.substring(input.length()/2);
		mashed += input.substring(input.length()/2);
		mashed += input.substring(input.length()/2);
		mashed += input.substring(input.length()/2);
		mashed += input.substring(input.length()/2);
		mashed += input.substring(input.length()/2);
		mashed += input.substring(input.length()/2);
		mashed += input.substring(input.length()/2);
		
		return mashed;
	}
	
	/**
	 * This is the no mashing detected method
	 * @param input is user input
	 * @return noMashing
	 */
	private String noMashingDetected(String input)
	{
		String noMashing = "Thank you for not mashing your keyboard with: ";
		if(input.length() > 1)
		{
			noMashing += input.substring(input.length()/3, input.length()/2);
		}
		
		
		
		return noMashing;
	}

	/**
	 * This is user input checker which allows us to to add things to a list
	 * @param userInput is input
	 * @return matchesInput
	 */
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
