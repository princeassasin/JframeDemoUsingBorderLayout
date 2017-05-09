package com.example.jframe.java;

import java.awt.*;
import java.util.Scanner;

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
	JButton reset, add, update, delet, red, blue, green, white, black;
	public  JframeDemo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter choice :");
		int choice = sc.nextInt();
		
		setTitle("JframeDemo Using Border, Grid, Gridbag and Box layouts");
		setVisible(true);
		setSize(300, 300);
		red = new JButton("Red");
		blue = new JButton("Blue");
		green = new JButton("Green");
		
		if(choice == 1){
			System.out.println("BorderLayout:");
			reset = new JButton("RESET");
			add = new JButton("ADD");
			update = new JButton("UPDATE");
			delet = new JButton("DELET");
			setLayout(new BorderLayout());
			add(reset, BorderLayout.EAST);
			add(add, BorderLayout.WEST);
			add(update, BorderLayout.NORTH);
			add(delet, BorderLayout.SOUTH);
		}else if(choice == 2)  {
			System.out.println("GridLayout: ");
			white = new JButton("White");
			black = new JButton("Black");
			setLayout(new GridLayout(2 ,3));
			add(red);
			add(blue);
			add(green);
			add(white);
			add(black);
		}
		else if (choice == 3) {
			
			setLayout(new GridBagLayout());
			GridBagConstraints c = new GridBagConstraints();
			c.gridx = 0;
			c.gridy = 0;
			add(red , c);
			c.gridx = 1;
			c.gridy = 1;
			add(blue , c);
			c.gridx = 2;
			c.gridy = 2;
			add(green , c);
		}
		else if(choice == 4){
			setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
			add(red);
			add(blue);
			add(green);
			
		}
		else{
			System.out.println("Enter the correct choice");
		}
		sc.close();
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JframeDemo jf = new JframeDemo();
		//jf.JBUtton();

	}

}
