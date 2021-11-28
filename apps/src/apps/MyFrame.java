package apps;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	MyFrame() {

		this.setTitle("JFrame title goes here :D"); // set title
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of app
		// .DO_NOTHING_ON_CLOSE will prevent the user from closing application (lmao)
		
		this.setResizable(false); // prevent this from being resized
        this.setSize(420,420); // sets x and y dimension of this
		
        this.setVisible(true); // make this visible
		
		ImageIcon image = new ImageIcon("logo.png"); // create ImageIcon
		this.setIconImage(image.getImage()); // change icon of this (or favicon if u web dev)
		
		this.getContentPane().setBackground(new Color(125,50,255)); // change background color

	}

}
