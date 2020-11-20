package latihan1;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FormIdentitas1 extends JFrame {
	private JLabel label;
	private JTextField textField;
	private JButton button;

	public FormIdentitas1() {
		label = new JLabel("Nama:");

		textField = new JTextField();
		textField.setToolTipText("Nama");

		button = new JButton("Ok");

		GridLayout gridLayout = new GridLayout(3, 1);
		setLayout(gridLayout);
		add(label);
		add(textField);
		add(button);

		pack();
	}
}
