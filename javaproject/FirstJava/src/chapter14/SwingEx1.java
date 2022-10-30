package chapter14;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEx1 {
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		JButton b = new JButton("버튼");
		b.setBounds(50, 50, 100, 20);
		
		
		
		f.add(b);
		f.setSize(200,150);
		f.setLayout(null);
		f.setVisible(true);
		
		
	}
	

}
