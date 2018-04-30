import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class interface_build {
	public void build() {
		//Creating the frame
		JFrame mainFrame = new JFrame("What to eat");
		mainFrame.setPreferredSize(new Dimension(400, 400));
				
		//What to do once frame closes 
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		//JButton button1 = new JButton("Click to Start!");
		//frame.add(button1);
		//button1.setSize(100, 100);
		//JPanel panel1 = new JPanel();
		//frame.getContentPane().add(panel1);
		
		JPanel panel = new JPanel();
		mainFrame.add(panel);
		JButton button1 = new JButton("Click to Start!");
		panel.add(button1);
		button1.addActionListener(new geterdone());
		
		//if (button1.action(evt, what)) {
			//ask where to eat
		//}
		
		//frame.setIconImage(new ImageIcon(imgURL).getImage());
		
		//Size the frame
		mainFrame.pack();
						
		//shows the frame
		mainFrame.setVisible(true);
	}
}
		//What happens ones the button is clicked on 
		class geterdone implements ActionListener {
			
			public void actionPerformed (ActionEvent x) {
				JFrame frame2 = new JFrame("Clicked");
				frame2.setVisible(true);
				frame2.setSize(200, 200);
				JLabel label = new JLabel("Type your top three places");
				JPanel panel2 = new JPanel();
				frame2.add(panel2);
				panel2.add(label);
				
			
				WhereToEat.main(null);
			}
		}
		
				
		
