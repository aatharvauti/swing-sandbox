package apps;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		// Chapter 1: Frames
		
//		new MyFrame();
		
		JFrame frame = new JFrame(); // create instance of JFrame

		frame.setTitle("JFrame title goes here :D"); // set title
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of app
		// .DO_NOTHING_ON_CLOSE will prevent the user from closing application (lmao)
		
		frame.setResizable(false); // prevent frame from being resized
//      frame.setSize(420,420); // sets x and y dimension of frame
		
		frame.setVisible(true); // make frame visible
		
		ImageIcon image = new ImageIcon("/home/syn4ck/code/swing/apps/src/apps/logo.png"); // create ImageIcon
//		ImageIcon image = new ImageIcon("/apps/src/apps/logo.png");
		frame.setIconImage(image.getImage()); // change icon of frame (or favicon if u web dev)
		
//		frame.getContentPane().setBackground(new Color(125,50,255)); // change background color
		
		// Chapter 2: Labels
		
		ImageIcon bruh = new ImageIcon("/home/syn4ck/code/swing/apps/src/apps/bruh.png"); // create ImageIcon
//		ImageIcon bruh = new ImageIcon("/apps/src/apps/bruh.png");
		Image bruh2 = bruh.getImage();
		
		Image bruh3 = bruh2.getScaledInstance(360, 360,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		bruh = new ImageIcon(bruh3);  // transform it back

		Border border = BorderFactory.createLineBorder(Color.black, 3);
		
		JLabel label = new JLabel(); // create new instance
		
		label.setText("Bruh"); // set text of the label
		label.setIcon(bruh); // set icon in the code

		label.setHorizontalTextPosition(JLabel.CENTER); // Position: Horizontal Center 
		label.setVerticalTextPosition(JLabel.BOTTOM); // Position: Vertical Center

		// For Global Alignment of Objects
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER); 
		
		// Other Options: LEFT, RIGHT
		
		label.setForeground(new Color(0x121212)); // set font color
		label.setFont(new Font("Liberation Sans", Font.BOLD, 30)); // set font
		
		label.setIconTextGap(25); // set gap of text to icon
		
		label.setBackground(new Color(125,50,255)); // set a bg color
		label.setOpaque(true); // display bg
		label.setBorder(border); // set border
		
		frame.add(label); // add label to the frame
		frame.pack(); // resize size of frame to fit contents
		
		// Chapter 3: Panels
		
//		JPanel redpanel = new JPanel(); // create a panel
//		
//		redpanel.setBackground(Color.red); // add bg color
//		redpanel.setBounds(0,0,250,250); // set bounds (x,y,x-d,y-d)
//		redpanel.add(label); // add "label" to the "panel" 
//		redpanel.setLayout(new BorderLayout()); // use layout manager, if not using bounds
//
//		frame.add(redpanel); //add "redpanel" to the "frame"
	
		// Chapter 4: Buttons
		
		
		
		
	}
}