package view;


import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.Table;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class JFMainWindow2 extends JFrame {
	
	/**
	 * Serial
	 */
	private static final long serialVersionUID = 2681019410594906059L;
	private JPanel contentPane;
	private JPanelDraw panel;

	public JFMainWindow2(ActionListener listener, ArrayList<Table> tables_list) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 988, 584);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanelDraw(tables_list);
		panel.setBorder(new LineBorder(Color.RED, 2, true));
		panel.setBackground(Color.WHITE);
		panel.setBounds(200, 11, 762, 523);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("Iniciar simulaci\u00F3n");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnNewButton.addActionListener(listener);
		btnNewButton.setActionCommand("start");
		btnNewButton.setBounds(10, 84, 180, 57);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("KFC");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(53, 30, 79, 43);
		contentPane.add(lblNewLabel);
	}
	
	public void sendDataTablesToPanelToDraw(ArrayList<Table> tables_list){
		this.panel.setTableList(tables_list);
		this.getContentPane().repaint();
		this.getContentPane().revalidate();
	}
}
