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
		setTitle("KFC Simulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 868, 581);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanelDraw(tables_list);
		panel.setBorder(new LineBorder(Color.RED, 2, true));
		panel.setBackground(Color.WHITE);
		panel.setBounds(200, 11, 638, 523);
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
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 44));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 30, 180, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mesa libre");
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 210, 180, 23);
		lblNewLabel_1.setForeground(new Color(200, 204, 204));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblClienteOrdenando = new JLabel("Cliente ordenando");
		lblClienteOrdenando.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		lblClienteOrdenando.setHorizontalAlignment(SwingConstants.CENTER);
		lblClienteOrdenando.setBounds(10, 244, 180, 23);
		lblClienteOrdenando.setForeground(new Color(90, 123, 255));
		contentPane.add(lblClienteOrdenando);
		
		JLabel lblEsperandoPorComida = new JLabel("Esperando por comida");
		lblEsperandoPorComida.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		lblEsperandoPorComida.setHorizontalAlignment(SwingConstants.CENTER);
		lblEsperandoPorComida.setBounds(10, 278, 180, 23);
		lblEsperandoPorComida.setForeground(new Color(255, 224, 95));
		contentPane.add(lblEsperandoPorComida);
		
		JLabel lblComiendo = new JLabel("Cliente comiendo");
		lblComiendo.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		lblComiendo.setHorizontalAlignment(SwingConstants.CENTER);
		lblComiendo.setBounds(10, 312, 180, 23);
		lblComiendo.setForeground(new Color(16, 220, 96));
		contentPane.add(lblComiendo);
	}
	
	public void sendDataTablesToPanelToDraw(ArrayList<Table> tables_list){
		this.panel.setTableList(tables_list);
		this.getContentPane().repaint();
		this.getContentPane().revalidate();
	}
}
