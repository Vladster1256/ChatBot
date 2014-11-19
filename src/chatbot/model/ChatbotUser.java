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
	private boolean likesDoritos;
	private boolean likesDEW;
	
	
	public ChatbotUser()
	{
		this.userName = "";
		this.age = -9999999;
		this.isMLG = false;
		this.hazSweg = false;
		this.amountOfDankness = -999999999;
		this.amountOfTriples = -0;
		this.amountOfNukesAchieved = 1;
		this.powerLevel = -9001;
		this.likesDoritos = false;
		this.likesDEW = false;
	}
	public boolean getLikesDoritos()
	{
		return likesDoritos;
	}
	public boolean getLikesDEW()
	{
		return likesDEW;
	}
	public void setLikesDoritos(boolean likesDoritos)
	{
		this.likesDoritos = likesDoritos;
	}
	public void setLikesDEW(boolean likesDEW)
	{
		this.likesDEW = likesDEW;
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
	public boolean getIsMLG()
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
	public double getAmountOfTriples()
	{
		return amountOfTriples;
	}
	public void setAmountOfTriples(double amountOfTriples)
	{
		this.amountOfTriples = amountOfTriples;
	}
	public int getAmountOfNukesAchieved()
	{
		return amountOfNukesAchieved;
	}
	public void setAmountOfNukesAchieved(int amountOfNukesAchieved)
	{
		this.amountOfNukesAchieved = amountOfNukesAchieved;
	}
	public int getPowerLevel()
	{
		return powerLevel;
	}
	public void setPowerLevel(int powerLevel)
	{
		this.powerLevel = powerLevel;
	}
}
