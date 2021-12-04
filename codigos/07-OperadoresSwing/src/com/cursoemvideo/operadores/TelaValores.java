package com.cursoemvideo.operadores;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaValores extends JFrame {

	private JPanel contentPane;
	private JTextField txtNum;
	private JTextField txtDen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaValores frame = new TelaValores();
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
	public TelaValores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 229, 184);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Numerador");
		lblNewLabel.setBounds(10, 11, 63, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Denominador");
		lblNewLabel_1.setBounds(10, 36, 63, 14);
		contentPane.add(lblNewLabel_1);
		
		txtNum = new JTextField();
		txtNum.setBounds(100, 8, 86, 20);
		contentPane.add(txtNum);
		txtNum.setColumns(10);
		
		txtDen = new JTextField();
		txtDen.setBounds(100, 33, 86, 20);
		contentPane.add(txtDen);
		txtDen.setColumns(10);
		
		final JLabel lblDiv = new JLabel("0");
		lblDiv.setBounds(124, 95, 62, 14);
		contentPane.add(lblDiv);
		
		final JLabel lblRes = new JLabel("0");
		lblRes.setBounds(124, 120, 62, 14);
		contentPane.add(lblRes);
		
		JButton btnDividir = new JButton("Calcular");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num = Integer.parseInt(txtNum.getText());
				int den = Integer.parseInt(txtDen.getText());
				
				float div = num / den;
				float raiz = (float) Math.sqrt(num);
				
				lblDiv.setText(Float.toString(div));
				lblRes.setText(Float.toString(raiz));
				
				
			}
		});
		btnDividir.setBounds(39, 61, 89, 23);
		contentPane.add(btnDividir);
		
		JLabel lblNewLabel_2 = new JLabel("Divis\u00E3o");
		lblNewLabel_2.setBounds(10, 95, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Raiz Quadrada");
		lblNewLabel_3.setBounds(10, 120, 86, 14);
		contentPane.add(lblNewLabel_3);
		
		
	}

}
