package csc380;

public class Order {
	
	Item [] items;
	String name, address, telephoneNumber;
	
	public Order(int numItems, Item itemA, Item itemB, Item itemC)
	{
		items = new Item[numItems];
		items[0] = itemA;
		items[1] = itemB;
		items[2] = itemC;
	}
	
	public Item getItem()
	{
		Item returningItem;
		
		returningItem = items[0];
		
		return returningItem;
	}
	
	public String getName()
	{
		return name;
	}

	public String getAddress()
	{
		return address;
	}
	
	public String getTelephoneNumber()
	{
		return telephoneNumber;
	}
}
