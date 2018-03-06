package csc380;

public class Order {
	
	Item [] items;
	String name, address, telephoneNumber;
	
	public Order(int numItems, Item itemOne)
	{
		items = new Item[numItems];
		items[0] = itemOne;
	}
	
	public Order(int numItems, Item itemOne, Item itemTwo)
	{
		items = new Item[numItems];
		items[0] = itemOne;
		items[1] = itemTwo;
	}
	
	public Order(int numItems, Item itemOne, Item itemTwo, Item itemThree)
	{
		items = new Item[numItems];
		items[0] = itemOne;
		items[1] = itemTwo;
		items[2] = itemThree;
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
