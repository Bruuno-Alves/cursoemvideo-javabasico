package classes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaIdade extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaIdade frame = new TelaIdade();
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
	public TelaIdade() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 499, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ano de Nascimento");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 38, 138, 20);
		contentPane.add(lblNewLabel);
		
		final JLabel lblIdade = new JLabel("0");
		lblIdade.setForeground(Color.RED);
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIdade.setBounds(97, 156, 56, 15);
		contentPane.add(lblIdade);
		
		final JSpinner txtAN = new JSpinner();
		txtAN.setModel(new SpinnerNumberModel(1900, 1900, 2022, 1));
		txtAN.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtAN.setBounds(158, 40, 77, 20);
		contentPane.add(txtAN);
		
		JButton btnCalc = new JButton("Calcular");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int an = Integer.parseInt(txtAN.getValue().toString());
				int id = 2021 - an;
				lblIdade.setText(Integer.toString(id));
				
			}
		});
		btnCalc.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnCalc.setIcon(new ImageIcon("C:\\Users\\bruno\\Documents\\Curso Programa\u00E7\u00E3o\\Java Basico\\Eclipse\\06-IdadeSwing\\src\\imagens\\icon_64x64_0613bc37486b71a7598879ff3a6b2000.png"));
		btnCalc.setBounds(20, 69, 181, 73);
		contentPane.add(btnCalc);
		
		JLabel lblNewLabel_1 = new JLabel("Sua Idade");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 153, 77, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\bruno\\Documents\\Curso Programa\u00E7\u00E3o\\Java Basico\\Eclipse\\06-IdadeSwing\\src\\imagens\\images.jpg"));
		lblNewLabel_3.setBounds(245, 38, 225, 225);
		contentPane.add(lblNewLabel_3);
		
	}
}
