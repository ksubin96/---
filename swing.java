package quiz9;
import javax.swing.*;
import java.awt.*;

	class NorthPanel extends JPanel{
		public NorthPanel() {
			setLayout(new FlowLayout(FlowLayout.CENTER,6,6));
			JButton a = new JButton("Open");
			add(a);
			
			a = new JButton("Read");
			add(a);
			
			a = new JButton("Close");
			add(a);
		}
	}
	
	class CenterPanel extends JPanel{
		public CenterPanel() {
			setLayout(null);
			JLabel label = new JLabel("Hello");
			label.setLocation(80, 20);
			label.setSize(40,20);
			add(label);
			
			label = new JLabel("Java");
			label.setLocation(120, 40);
			label.setSize(40,20);
			add(label);
			
			label = new JLabel("Love");
			label.setLocation(160, 60);
			label.setSize(40,20);
			add(label);
		}
	}
public class swing extends JFrame{
	public swing() {
		setTitle("Quiz 9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout());
		
		NorthPanel n = new NorthPanel();
		c.add(n, BorderLayout.NORTH);
		
		CenterPanel ct = new CenterPanel();
		c.add(ct, BorderLayout.CENTER);
		
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new swing();

	}

}
