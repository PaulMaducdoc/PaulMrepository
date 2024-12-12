import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class GUI extends JFrame implements ActionListener {
	public GUI() {
		buildWindow();
	}
	JTextField textfield = new JTextField();
	static JTextArea textarea = new JTextArea();
	private void buildWindow() {
		setTitle("Save King Darius");
		setLayout(new BorderLayout()); // Sets 3x3 grid layout
		
		JPanel frame = new JPanel(new GridLayout(3,1));
		JLabel label = new JLabel("What would you like to do?");
		JButton button = new JButton("Execute");
		frame.add(label);
		frame.add(textfield);
		frame.add(button);
		add(textarea,BorderLayout.CENTER);
		add(frame,BorderLayout.SOUTH);
		
		button.addActionListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500); // Sets window's size
		setLocationRelativeTo(null); // Centers window
		setVisible(true); // Make window visible
	}
	public void actionPerformed(ActionEvent ae) {
		JButton b = (JButton) ae.getSource();
		String s = textfield.getText();
		Game.processCommand(s);
		
	}
	
	

}
