package csc380;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Welcome to the delivery service program.");
		String a1 = JOptionPane.showInputDialog(null,"Enter an address:");
		Map m = new Map();
		m.addPoint(a1);
	}

	public void printDeliverySchedule()
	{
		int orders = 0;

		System.out.println("Delivery Schedule:");
		if(orders == 1)
		{
			System.out.println("Address one: ");
		}

		else if(orders == 2)
		{
			System.out.println("Address one: ");
			System.out.println("Address two: ");
		}

		else if(orders == 3)
		{
			System.out.println("Address one: ");
			System.out.println("Address two: ");
			System.out.println("Address three: ");
		}
	}

}
