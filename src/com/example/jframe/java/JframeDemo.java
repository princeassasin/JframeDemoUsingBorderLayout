package com.example.jframe.java;

import java.awt.*;

import javax.swing.*;

//import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class JframeDemo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 256608657451089369L;
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	//JFrame obj;
	JButton reset, add, update, delet;
	public  JframeDemo() {
		
		reset = new JButton("RESET");
		add = new JButton("ADD");
		update = new JButton("UPDATE");
		delet = new JButton("DELET");

		setTitle("JframeDemo Using BorderLayout");
		setVisible(true);
		setSize(300, 300);
		
		
		setLayout(new BorderLayout());
		add(reset, BorderLayout.EAST);
		add(add, BorderLayout.WEST);
		add(update, BorderLayout.NORTH);
		add(delet, BorderLayout.SOUTH);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JframeDemo jf = new JframeDemo();
		//jf.JBUtton();

	}

}
