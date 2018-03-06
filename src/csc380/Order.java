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
	
	public Item getItem(int whichItem)
	{
		Item returningItem;
		
		returningItem = items[whichItem];
		
		return returningItem;
	}
	
	public void setName(String customerName)
	{
		name = customerName;
	}
	
	public String getName()
	{
		return name;
	}

	public void setAddress(String destAddress)
	{
		address = destAddress;
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
