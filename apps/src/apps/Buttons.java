package apps;

import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Buttons extends JFrame implements ActionListener{
	
	JButton button; // remember to declare globally
	JLabel label;

	Buttons(){

		ImageIcon icon = new ImageIcon("/home/syn4ck/code/swing/apps/src/apps/rocket.png"); // create ImageIcon
//		ImageIcon icon = new ImageIcon("/apps/src/apps/rocket.png");
		Image icon2 = icon.getImage();
		Image icon3 = icon2.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		icon = new ImageIcon(icon3);  // transform it back

		label = new JLabel();
		label.setText("YOU DESTROYED!");
		label.setBounds(190, 250, 150, 150);
		label.setVisible(false);
		
		button = new JButton();
		button.setBounds(100, 100, 300, 100); // position and size of the button

		button.setText("DESTROY!!!!!!!!");
		button.setFocusable(false); // get rid of annoying text border
		
		// customize
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.LEFT);
		button.setVerticalTextPosition(JButton.CENTER);
		button.setFont(new Font("Liberation Sans", Font.BOLD, 25));
		
		button.setBackground(new Color(1f,0f,0f,0f));
		button.setBorder(new RoundedBorder(50));
		
//		button.setEnabled(false); // disable the button
		
//		button.addActionListener(e -> System.out.println("YO!")); // shortcut to do commands on action
		button.addActionListener(this); // action listener to check for events
			
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.setResizable(false);
		
		this.add(button); // don't forget to add button to frame :D
		this.add(label);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) { // event listener e
		if(e.getSource()==button) { // if action has taken on button, do that shit 
			System.out.println("YO!"); // YO!
			label.setVisible(true); // show the label when clicked
//			button.setEnabled(false); // disable the button
		}	
	}
}
