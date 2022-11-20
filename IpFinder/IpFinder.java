package IpFinder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class IpFinder extends JFrame implements ActionListener {

	JLabel l;
	JTextField tf;
	JButton b;
	IpFinder(){
		super("Ip Finder in this Section");
		l=new JLabel("Enter your Address /URL");
		l.setBounds(50, 70, 150, 20);
		tf = new JTextField();
		tf.setBounds(50, 100, 200, 20);
		b=new JButton("Find");
		b.setBounds(50, 150, 80, 30);
		b.addActionListener(this);
		add(l);
		add(tf);
		add(b);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		String url =tf.getText();
		try {
			InetAddress ia=InetAddress.getByName(url);
			String ip=ia.getHostAddress();
			JOptionPane.showMessageDialog(this, ip);
		}
		catch (UnknownHostException e1) {

			JOptionPane.showMessageDialog(this, e1.toString());
		}
	}
	
	public static void main(String a[]) {
		new IpFinder();
	}
}
