package latihan2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FormIdentitas2 extends JFrame implements ActionListener {

	private JLabel label;
	private JTextField textField;
	private JButton button;

	public FormIdentitas2() {
		label = new JLabel("Nama:");

		textField = new JTextField();
		textField.setToolTipText("Nama");

		button = new JButton("Ok");
		button.addActionListener(this);

		GridLayout gridLayout = new GridLayout(3, 1);
		setLayout(gridLayout);
		add(label);
		add(textField);
		add(button);

		pack();
	}

	public void actionPerformed(ActionEvent e) {
		String nama = textField.getText();
		JOptionPane.showMessageDialog(this, "Nama Anda: " + nama);
	}

}
