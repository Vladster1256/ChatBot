package chatbot.model;

public class ChatbotUser
{
	private String userName;
	private int age;
	private boolean isMLG;
	private boolean hazSweg;
	private int amountOfDankness;
	private double amountOfTriples;
	private int amountOfNukesAchieved;
	private int powerLevel;
	
	public ChatbotUser()
	{
		this.userName = "";
		this.age = -9999999;
		this.isMLG = false;
		this.hazSweg = false;
		this.amountOfDankness = 0;
		this.amountOfTriples = -0;
		this.amountOfNukesAchieved = 1;
		this.powerLevel = -9001;
	}
	public String getUserName()
	{
		return userName;
	}
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public boolean isMLG()
	{
		return isMLG;
	}
	public void setMLG(boolean isMLG)
	{
		this.isMLG = isMLG;
	}
	public boolean isHazSweg()
	{
		return hazSweg;
	}
	public void setHazSweg(boolean hazSweg)
	{
		this.hazSweg = hazSweg;
	}
	public int getAmountOfDankness()
	{
		return amountOfDankness;
	}
	public void setAmountOfDankness(int amountOfDankness)
	{
		this.amountOfDankness = amountOfDankness;
	}
	
}