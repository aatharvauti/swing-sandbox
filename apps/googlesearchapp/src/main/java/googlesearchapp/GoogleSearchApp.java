package googlesearchapp;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//import javax.swing.text.Document;
//import javax.swing.text.Element;

import org.jsoup.Jsoup;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GoogleSearchApp {
	
	
	private JFrame frame;
	public static JTextField apiText;

// Launch the application.

	public static void main(String[] args) {		
			GoogleSearchApp window = new GoogleSearchApp();
			window.frame.setVisible(true);
	}

 //Create the application.
	
	public GoogleSearchApp() {
		initialize();
	}

	public static void result() throws IOException {
		// TODO Auto-generated method stub
		//get keyword 
//		Scanner scan=new Scanner(System.in);
//	    System.out.println("Enter a keyowrd");
		String keyword = apiText.getText();
		//search on google
		String url="https://www.google.com/search"+"?q="+keyword+"&num=10";
		
		 Document doc= Jsoup.connect(url).get();
		 String html=doc.html();
         Files.write(Paths.get("C:\\Users\\Rekha Sakpal\\Desktop\\File.html"), html.getBytes());
         Elements links = doc.select("cite");
         for(Element link :links)
         {
        	
        	 String text =link.text();
        	 if(text.contains(">")) 
        	     {
        		 text=text.replaceAll(">", "/");
            	 }
        	 System.out.println(text); 
         }
	}
	
//Initialize the contents of the frame.
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Keywords");
		lblNewLabel.setBounds(184, 12, 130, 15);
		frame.getContentPane().add(lblNewLabel);
		
		apiText = new JTextField();
		apiText.setBounds(145, 75, 114, 19);
		frame.getContentPane().add(apiText);
		apiText.setColumns(10);
		
		JButton btn1 = new JButton("Search");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					result();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	
		});

		btn1.setBounds(225, 190, 175, 25);
		frame.getContentPane().add(btn1);
		
	}
}
