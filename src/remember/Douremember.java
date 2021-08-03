package remember;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Douremember extends JFrame implements ActionListener{
	JButton b = new JButton("Press me");
	JCheckBox cb = new JCheckBox("Yes");
	JLabel l = new JLabel();
	Font f = new Font("Courier New", Font.CENTER_BASELINE, 20);
	JOptionPane p = new JOptionPane();
	
	public Douremember() {
	//Window
		setTitle("Test");
		setSize(1280,720);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
	
	//Labe
		l.setText("samfiohuadsfhjnhvujwsdnj");
		l.setFont(f);
		add(l);
	//CheckBox
		cb.setBorderPaintedFlat(true);		
		add(cb);
		
	//Buttons
		setLayout(new FlowLayout());
		b.addActionListener(this);
		b.setPreferredSize(new Dimension(200, 100));
		add(b);
		
	//set visible
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Douremember();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b) {
			p.showMessageDialog(null, "Alou!");
		}
		
	}
}
