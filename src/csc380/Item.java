package csc380;

public class Item {
	
	String foodName;
	int prepTime;
	
	public Item(String foodName, int prepTime)
	{
		foodName = this.foodName;
		prepTime = this.prepTime;
	}
	
	public String getFoodName()
	{
		return foodName;
	}
	
	public int getPrepTime()
	{
		return prepTime;
	}

}
