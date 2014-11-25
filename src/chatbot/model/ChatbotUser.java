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
	/**
	 * this is getter for likesDoritos
	 * @return likes Doritos
	 */
	public boolean getLikesDoritos()
	{
		return likesDoritos;
	}
	
	/**
	 * this is getter for likesDEW
	 * @return likesDEW
	 */
	public boolean getLikesDEW()
	{
		return likesDEW;
	}
	
	/**
	 * This is setter for likesDoritos
	 * @param likesDoritos
	 */
	public void setLikesDoritos(boolean likesDoritos)
	{
		this.likesDoritos = likesDoritos;
	}
	
	/**
	 * this is setter for likesDEW
	 * @param likesDEW
	 */
	public void setLikesDEW(boolean likesDEW)
	{
		this.likesDEW = likesDEW;
	}
	
	/**
	 * This is getter for UserName
	 * @return userName
	 */
	public String getUserName()
	{
		return userName;
	}
	
	/**
	 * This is setter for Username
	 * @param userName
	 */
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	
	/**
	 * this is getter for age
	 * @return age
	 */
	public int getAge()
	{
		return age;
	}
	
	/**
	 * this is setter for age
	 * @param age
	 */
	public void setAge(int age)
	{
		this.age = age;
	}
	
	/**
	 * this is getter for isMLG
	 * @return isMLG
	 */
	public boolean getIsMLG()
	{
		return isMLG;
	}
	
	/**
	 * this is setter for isMLG
	 * @param isMLG
	 */
	public void setMLG(boolean isMLG)
	{
		this.isMLG = isMLG;
	}
	
	/**
	 * this is setter for hazSweg
	 * @return hazSweg
	 */
	public boolean isHazSweg()
	{
		return hazSweg;
	}
	
	/**
	 * this is setter for hazSweg
	 * @param hazSweg
	 */
	public void setHazSweg(boolean hazSweg)
	{
		this.hazSweg = hazSweg;
	}
	
	/**
	 * this is getter for amountOfDankness
	 * @return amountOfDankness
	 */
	public int getAmountOfDankness()
	{
		return amountOfDankness;
	}
	
	/**
	 * this is setter for amountOfDankness
	 * @param amountOfDankness
	 */
	public void setAmountOfDankness(int amountOfDankness)
	{
		this.amountOfDankness = amountOfDankness;
	}
	
	/**
	 * This is getter for AmountOfTriples
	 * @return amountOfTriples
	 */
	public double getAmountOfTriples()
	{
		return amountOfTriples;
	}
	
	/**
	 * setter for amountOfTriples
	 * @param amountOfTriples
	 */
	public void setAmountOfTriples(double amountOfTriples)
	{
		this.amountOfTriples = amountOfTriples;
	}
	
	/**
	 * this is getter for amountOfNukesAchieved
	 * @return amountOfNukesAchieved
	 */
	public int getAmountOfNukesAchieved()
	{
		return amountOfNukesAchieved;
	}
	
	/**
	 * this is setter for amountOfNukesAchieved
	 * @param amountOfNukesAchieved
	 */
	public void setAmountOfNukesAchieved(int amountOfNukesAchieved)
	{
		this.amountOfNukesAchieved = amountOfNukesAchieved;
	}
	
	/**
	 * this is getter for powerLevel
	 * @return powerLevel
	 */
	public int getPowerLevel()
	{
		return powerLevel;
	}
	
	/**
	 * this is setter for powerLevel
	 * @param powerLevel
	 */
	public void setPowerLevel(int powerLevel)
	{
		this.powerLevel = powerLevel;
	}
}
