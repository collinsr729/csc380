package csc380;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Welcome to the delivery service program.");
		String a1 = JOptionPane.showInputDialog(null,"Enter an address:");	
		Map m = new Map();
		m.addPoint(a1);
	}
}
