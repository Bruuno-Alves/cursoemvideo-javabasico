package com.cursoemvideo.parimpar;

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

public class TelaParImpar extends JFrame {

	private JPanel contentPane;
	private JTextField txtValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaParImpar frame = new TelaParImpar();
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
	public TelaParImpar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 179, 139);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Valor");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtValor = new JTextField();
		txtValor.setBounds(56, 8, 86, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		final JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(56, 73, 68, 14);
		contentPane.add(lblResultado);
		lblResultado.setVisible(false);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int valor = Integer.parseInt(txtValor.getText());
				
				lblResultado.setVisible(true);
				
				if (valor % 2 == 0) {
					lblResultado.setText("PAR");
				} else {
					lblResultado.setText("IMPAR");
				}
				
			}
		});
		btnVerificar.setBounds(35, 39, 89, 23);
		contentPane.add(btnVerificar);
	}
}
