package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class JFMainWindow extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFMainWindow frame = new JFMainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFMainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 823, 537);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(551, 224, 47, 47);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("New button");
		button.setBounds(551, 282, 47, 47);
		contentPane.add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.setBounds(551, 338, 47, 47);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("New button");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(551, 166, 47, 47);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("New button");
		button_3.setBounds(551, 396, 47, 47);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("New button");
		button_4.setBounds(494, 166, 47, 47);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("New button");
		button_5.setBounds(494, 224, 47, 47);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("New button");
		button_6.setBounds(494, 282, 47, 47);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("New button");
		button_7.setBounds(494, 338, 47, 47);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("New button");
		button_8.setBounds(494, 396, 47, 47);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("New button");
		button_9.setBounds(437, 396, 47, 47);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("New button");
		button_10.setBounds(437, 338, 47, 47);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("New button");
		button_11.setBounds(437, 282, 47, 47);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("New button");
		button_12.setBounds(437, 224, 47, 47);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("New button");
		button_13.setBounds(437, 166, 47, 47);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("New button");
		button_14.setBounds(551, 69, 47, 47);
		contentPane.add(button_14);
		
		JButton button_15 = new JButton("New button");
		button_15.setBounds(551, 11, 47, 47);
		contentPane.add(button_15);
		
		JButton button_16 = new JButton("New button");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_16.setBounds(494, 69, 47, 47);
		contentPane.add(button_16);
		
		JButton button_17 = new JButton("New button");
		button_17.setBounds(494, 11, 47, 47);
		contentPane.add(button_17);
		
		JButton button_18 = new JButton("New button");
		button_18.setBounds(437, 69, 47, 47);
		contentPane.add(button_18);
		
		JButton button_19 = new JButton("New button");
		button_19.setBounds(437, 11, 47, 47);
		contentPane.add(button_19);
		
		JButton button_20 = new JButton("New button");
		button_20.setBounds(363, 69, 47, 47);
		contentPane.add(button_20);
		
		JButton button_21 = new JButton("New button");
		button_21.setBounds(363, 11, 47, 47);
		contentPane.add(button_21);
		
		JButton button_22 = new JButton("New button");
		button_22.setBounds(303, 69, 47, 47);
		contentPane.add(button_22);
		
		JButton button_23 = new JButton("New button");
		button_23.setBounds(303, 11, 47, 47);
		contentPane.add(button_23);
		
		JButton button_24 = new JButton("New button");
		button_24.setBounds(241, 11, 47, 47);
		contentPane.add(button_24);
		
		JButton button_25 = new JButton("New button");
		button_25.setBounds(187, 166, 47, 47);
		contentPane.add(button_25);
		
		textField = new JTextField();
		textField.setBounds(676, 161, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(676, 237, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton button_26 = new JButton("New button");
		button_26.setBounds(246, 69, 47, 47);
		contentPane.add(button_26);
		
		JButton button_27 = new JButton("New button");
		button_27.setBounds(127, 166, 47, 47);
		contentPane.add(button_27);
		
		JButton button_28 = new JButton("New button");
		button_28.setBounds(127, 224, 47, 47);
		contentPane.add(button_28);
		
		JButton button_29 = new JButton("New button");
		button_29.setBounds(187, 224, 47, 47);
		contentPane.add(button_29);
		
		JButton button_30 = new JButton("New button");
		button_30.setBounds(187, 282, 47, 47);
		contentPane.add(button_30);
		
		JButton button_31 = new JButton("New button");
		button_31.setBounds(127, 282, 47, 47);
		contentPane.add(button_31);
	}
}
